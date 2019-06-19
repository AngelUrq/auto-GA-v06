package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class ModalProductPage extends BasePage {

    @FindBy(xpath = "//*[@data-auto-id=\"add-to-bag-product-info-qty\"]")
    private WebElement productQuantity;

    @FindBy(xpath = "//*[@data-auto-id=\"view-bag-desktop\"]")
    private WebElement cartPageButton;

    public String getProductQuantity(){
        return Events.getText(productQuantity);
    }

    public void clickToCartPage(){
        Events.click(cartPageButton);
    }

}
