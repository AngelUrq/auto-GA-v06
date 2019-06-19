package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.webdrivermanager.DriverManager;


public class HomeAdidas extends BasePage {

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/a")
    private WebElement futbolButton;

    @FindBy(xpath = "//*[@id=\"app\"]/div/div/div[1]/div/div[3]/div/div[1]/div[1]/div/div/div/div/div/div/div/div/div[1]/div[2]/ul/li[2]/a")
    private WebElement futbolButtonLink;

    public void hoverOverHombre( ) {
        Events.Hover(DriverManager.getInstance().getWebDriver(), futbolButton);
    }

    public void clickFutbol(){
        Events.click(futbolButtonLink);
    }
}

