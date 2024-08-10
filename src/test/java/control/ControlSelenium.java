package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import session.Session;

public class ControlSelenium {

    protected WebElement control;
    protected By locator;

    public  ControlSelenium(By locator){
        this.locator = locator;
    }

    public void findControl(){
        control = Session.getSession().getBrowser().findElement(locator);
    }

    public void click(){
        this.findControl();
        this.control.click();
    };

    public boolean isControlDisplayed(){
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch (Exception e) {
            return false;
        }
    }





}
