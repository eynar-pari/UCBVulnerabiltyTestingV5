package browser;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class ChromeProxy {

    public WebDriver create(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/chrome/chromedriver.exe");

        Proxy proxy = new Proxy();
        proxy.setHttpProxy("localhost:9090");
        proxy.setSslProxy("localhost:9090");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--ignore-certificate-errors") ;
        chromeOptions.setProxy(proxy);

        WebDriver chrome = new ChromeDriver(chromeOptions);
        chrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        return chrome;
    }

}
