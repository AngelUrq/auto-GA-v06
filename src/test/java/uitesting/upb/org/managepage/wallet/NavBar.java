package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class NavBar extends BasePage {

    @FindBy(id = "settings")
    private WebElement accountSettingsButton;

    @FindBy(id = "exit")
    private WebElement homeButton;

    @FindBy(id = "account-main-menu")
    private  WebElement personalWalletButton;

    public AccountSettings clickAccountSettings() {
        Events.click(accountSettingsButton);
        return new AccountSettings();
    }

    public boolean navBarIsVisible() {
        return Events.isVisibleWebElement(accountSettingsButton);
    }

    public void clickHomeButton(){
        Events.click(homeButton);
    }

    public AccountMainMenu clickPersonalWalletButton(){
        Events.click(personalWalletButton);
        return new AccountMainMenu();
    }

    public WebElement isSettingsButtonVisible(){

        try{
            return DriverManager.getInstance().getWebDriver().findElement(By.id("settings"));

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            return null;
        }


    }


}
