package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class ShoesPage extends BasePage {

    private WebElement tallaButton;
    private WebElement carritoButton;

    public ShoesPage() {
        super();

        tallaButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@data-auto-id, 'label')]")));
        carritoButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@data-auto-id,'add-to-bag')]")));
    }

    public void selectTalla(String talla) {
        Events.click(tallaButton);

        WebElement mx85Button = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(text(),'"+ talla +"')]")));
        Events.click(mx85Button);
    }

    public void clickCarritoButton() {
        Events.click(carritoButton);
    }

    public boolean cantidadEquals(String cantidad) {
        WebElement cantidadSpan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@data-auto-id, 'add-to-bag-product-info-qty')]")));
        return cantidadSpan.getText().equals(cantidad);
    }

    public void clickVerElCarritoButton() {
        WebElement verElCarritoButton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@data-auto-id, 'view-bag-desktop')]")));
        Events.click(verElCarritoButton);
    }

    public boolean titleIsDisplayed() {
        WebElement title = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(), 'Calzado de Fútbol Nemeziz 19.3 Terreno Firme')]")));
        return Events.isVisibleWebElement(title);
    }

    public boolean quantityEqual(String cantidad) {
        WebElement quantitySpan = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@class, 'ffSelectButton')]//span")));
        return quantitySpan.getText().equals(cantidad);
    }

    public boolean totalDelProductoIsEqualToShoesPrice() {
        WebElement totalDelProductoDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-ci-test-id, 'orderTotalProductsDeliveryValue')]")));
        return totalDelProductoDiv.getText().equals(ShopPage.price);
    }

    public boolean totalIsEqualToShoesPrice() {
        WebElement totalDelProductoDiv = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@data-ci-test-id, 'orderTotalCartValue')]")));
        return totalDelProductoDiv.getText().equals(ShopPage.price);
    }
}
