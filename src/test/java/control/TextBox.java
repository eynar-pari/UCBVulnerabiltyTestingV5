package control;

import org.openqa.selenium.By;

public class TextBox extends ControlSelenium{
    public TextBox(By locator) {
        super(locator);
    }
    public void setText(String value){
        this.findControl();
        this.control.sendKeys(value);
    }
}
