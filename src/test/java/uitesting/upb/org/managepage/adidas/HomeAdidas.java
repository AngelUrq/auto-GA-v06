package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.webdrivermanager.DriverManager;


public class HomeAdidas extends BasePage {


    @FindBy(xpath = "//*[@class=\"label\" and @manual_cm_sp=\"header-_-HOMBRE\"]")
    private WebElement futbolNavBar;

    @FindBy(xpath = "//*[@manual_cm_sp=\"header-_-hombre-_-tenis-_-fútbol\" and @href=\"/calzado_de_futbol-hombre\"]")
    private WebElement futbolButtonLink;


    public void hoverOverHombre( ) {
        Events.Hover(DriverManager.getInstance().getWebDriver(), futbolNavBar);
    }

    public void clickFutbol(){
        Events.click(futbolButtonLink);
    }



}

