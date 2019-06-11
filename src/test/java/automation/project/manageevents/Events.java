package automation.project.manageevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import automation.project.webdrivermanager.DriverManager;

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

}
