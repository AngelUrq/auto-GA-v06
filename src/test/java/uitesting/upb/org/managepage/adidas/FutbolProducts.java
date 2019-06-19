package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.webdrivermanager.DriverManager;


public class FutbolProducts extends BasePage {


    @FindBy(xpath = "//*/span[@class=\"gl-price__value\" and contains(.,\"$2,199\")]")
    private WebElement priceText;

    @FindBy(xpath = "//*[@class=\"gl-product-card__image performance-item\" and @title=\"Calzado de Fútbol Nemeziz 19.3 Terreno Firme\"]")
    private WebElement productButton;


    public String getProductPrice(){
        return Events.getText(priceText);
    }

    public void clickProducto(){
        Events.click(productButton);
    }


}
