package uitesting.upb.org.manageevents;

import cucumber.api.java.cs.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import uitesting.upb.org.webdrivermanager.DriverManager;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

/**
 * @autor Marcelo Garay
 */
public class Events {

    public static void click(WebElement webElement){
        webElement.click();
    }

    public static void click(By by){
        DriverManager.getInstance().getWebDriver().findElement(by).click();
    }

    public static void fillField(WebElement searchTextField, String text) {
        searchTextField.sendKeys(text);
    }

    public static boolean isVisibleWebElement(WebElement webElement) {
        return webElement.isDisplayed();
    }
    public static void clearFieldText(WebElement webElement){
        webElement.clear();
    }
    public static void hover(WebElement webElement){
        Actions builder=new Actions(DriverManager.getInstance().getWebDriver());
        builder.moveToElement(webElement).build().perform();
    }
    public static void getText(WebElement webElement){
        webElement.getText();
    }

}
