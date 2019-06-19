package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import java.awt.*;

public class SingleTennisPage extends BasePage {

    @FindBy(xpath = "//select[@data-auto-id='product-size-dropdown']")
    private WebElement selectSize;

    @FindBy(xpath = "//option[contains(text(),'8.5')]")
    private WebElement size;

    @FindBy(xpath = "//button[@data-auto-id='add-to-bag']")
    private WebElement addToCart;

    @FindBy(xpath = "//span[@data-auto-id='cart-count']")
    private WebElement cartQuantity;

    @FindBy(xpath = "//a[@data-auto-id='view-bag-desktop']")
    private WebElement cartLink;


    public SingleTennisPage() {
        super();
    }

    public void clickButtonSelectSize() {
        Events.click(selectSize);
    }
    public void clickChooseSize(){
        Events.click(size);
    }
    public void clickButtonAddToCart(){
        Events.click(addToCart);
    }
    public void checkQuantity(){
        String quantity = Events.getText(cartQuantity);
        System.out.println(quantity);
    }
    public TennisCart clickCartLink(){
        TennisCart tennisCart=new TennisCart();
        Events.click(cartLink);
        return tennisCart;
    }

}
