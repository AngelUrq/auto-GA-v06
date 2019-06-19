package uitesting.upb.org.managepage.adidas;

import gherkin.lexer.El;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class CartPage extends BasePage {

    @FindBy(xpath = "//*[@class=\"name\" and @href=\"https://www.adidas.mx/calzado-de-futbol-nemeziz-19.3-terreno-firme/F99997_660.html?forceSelSize=F99997_660\"]")
    private WebElement productText;

    @FindBy(xpath = "//*[@class=\"totalprice\"]")
    private WebElement productPrice;

    public String getSelectedProduct(){
        return Events.getText(productText);
    }

    public String getSelectedProductPrice(){
        return Events.getText(productPrice);
    }


}
