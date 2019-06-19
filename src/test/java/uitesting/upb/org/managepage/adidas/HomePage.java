package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'HOMBRE')]")
    private WebElement hombre;

    public HomePage() {
        super();
    }

    public void hoverHombre(){
        Events.hover(hombre);
    }

    public ShopPage clickFutbolButton() {
        WebElement futbolButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Fútbol')]")));

        Events.click(futbolButton);

        return new ShopPage();
    }

}
