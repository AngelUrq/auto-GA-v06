package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class CalzadoHombrePage extends BasePage {
    @FindBy(xpath = "//div[@class='gl-product-card__details-main']//span[contains(text(),'$2,')]")
    private WebElement priceTennis;

    @FindBy(xpath = "//div[@class='gl-product-card__details-main']//span[contains(text(),'$2,199')]")
    private WebElement selectTennis;

    public CalzadoHombrePage() {
        super();
    }

    public void getPrice(){
        Events.getText(priceTennis);
    }
    public SingleTennisPage clickSelectTennis(){
        SingleTennisPage singleTennisPage=new SingleTennisPage();
        Events.click(selectTennis);
        return singleTennisPage;
    }

}
