package automation.project.webdrivermanager;

import org.openqa.selenium.WebDriver;
import automation.project.managefile.PropertyAccessor;

/**
 * @autor Marcelo Garay
 */
public class DriverManager {

    private WebDriver webDriver;

    private static DriverManager ourInstance = new DriverManager();

    public static DriverManager getInstance() {
        return ourInstance;
    }

    private DriverManager() {
        webDriver = DriverFactory.getWebDriver(BrowserType.valueOf(PropertyAccessor.getInstance().getBrowser()));
    }

    public WebDriver getWebDriver(){
        return webDriver;
    }
}
