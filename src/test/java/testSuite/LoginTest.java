package testSuite;

import browser.ChromeProxy;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import page.LoginSection;
import page.MainPage;
import page.MenuSection;
import session.Session;


public class LoginTest {

    MenuSection menuSection = new MenuSection();
    LoginSection loginSection = new LoginSection();
    MainPage mainPage = new MainPage();

    @BeforeEach
    public void openBrowser(){
        Session.getSession().getBrowser().get("https://todo.ly/");
    }

    @Order(1)
    @Test
    public void loginTest() throws InterruptedException {
        mainPage.loginButton.click();
        loginSection.emailTxtBox.setText("owasp@owasp2025.com");
        loginSection.passwordTxtBox.setText("12345");
        loginSection.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed());
    }

    @AfterEach
    public void closeBrowser(){
        Session.getSession().closeSession();

    }
}
