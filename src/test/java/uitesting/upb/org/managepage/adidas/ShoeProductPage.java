package uitesting.upb.org.managepage.adidas;

import org.openqa.selenium.WebElement;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.webdrivermanager.DriverManager;


public class ShoeProductPage extends BasePage {

    @FindBy(xpath = "//*[@class=\"gl-dropdown__select label dropdown-select\" and @title=\"Elige tu talla\"]")
    private WebElement selectButton;

    @FindBy(xpath = "//*[@class=\"gl-menu__element\" and @title=\"MX 8.5\"]")
    private WebElement sizeButton;

    @FindBy(xpath = "//*[@class=\"gl-cta gl-cta--primary gl-cta--full-width btn-bag\" and @aria-label=\"Añadir al carrito\"]")
    private WebElement cartAdd;

    public void clickSelectButton(){
        Events.click(selectButton);
    }

    public void clickSizeButton(){
        Events.click(sizeButton);
    }

    public void clickAddCartButton(){
        Events.click(cartAdd);
    }
}
