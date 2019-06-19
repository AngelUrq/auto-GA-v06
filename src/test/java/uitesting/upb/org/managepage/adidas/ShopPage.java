package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ShopPage extends BasePage {

    public static String price = "";

    private WebElement firstShoes;

    public ShopPage() {
        super();
    }

    public void lookForPrice() {
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        firstShoes = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(@href,'/calzado-de-futbol-nemeziz-19.3-terreno-firme/F99997.html')]")));

        WebElement priceSpan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div/div[3]/div/div[2]/div/div/div[2]/div[2]/div[2]/div/div/div/div[2]/a/div[2]/div[2]/span")));
        price = priceSpan.getText() + ".00";
    }

    public ShoesPage clickFirstShoes() {
        Events.click(firstShoes);

        return new ShoesPage();
    }

}
