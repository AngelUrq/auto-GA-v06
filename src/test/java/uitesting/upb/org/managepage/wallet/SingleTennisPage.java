package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.managepage.BasePage;

public class SingleTennisPage extends BasePage {

    @FindBy(xpath = "//div[@class='gl-product-card__details-main']//span[contains(text(),'$2,')]")
    private WebElement selectSize;


    public SingleTennisPage() {
        super();
    }
}
