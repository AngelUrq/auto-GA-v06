package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class TennisCart extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Calzado de Fútbol Nemeziz')]")
    private WebElement title;

    @FindBy(xpath = "//a[@class='ffSelectButton']//span[contains(text(),'1')]")
    private WebElement quantityCart;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalProductsDeliveryValue']")
    private WebElement partialPrice;

    @FindBy(xpath = "//div[@data-ci-test-id='orderTotalCartValue']")
    private WebElement totalPrice;

    public TennisCart() {
        super();
    }

    public void checkIfTitleIsVisible(String tennisTitle) {
        String titleText= Events.getText(title);
        Assert.assertEquals(tennisTitle,titleText);
    }
    public void checkQuantity(String quantity){
        String quantityText=Events.getText(quantityCart);
        Assert.assertEquals(quantity,quantityText);
    }
    public void checkPartialPrice(String pricePartial){
        String pricePartialText=Events.getText(partialPrice);
        Assert.assertEquals(pricePartial,pricePartialText);
    }
    public void checkTotalPrice(String priceTotal){
        String priceTotalText=Events.getText(totalPrice);
        Assert.assertEquals(priceTotal,priceTotalText);
    }
}
