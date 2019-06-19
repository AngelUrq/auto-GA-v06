package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AdidasMainPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'HOMBRE')]")
    private WebElement tabHombre;

    @FindBy(xpath = "//a[contains(text(),'Fútbol')]")
    private WebElement optionFutbol;

    public AdidasMainPage() {
        super();
    }

    public void hoverHombre() {
        Events.hover(tabHombre);
    }
    public CalzadoHombrePage clickOptionFutbol(){
        CalzadoHombrePage calzadoHombrePage=new CalzadoHombrePage();
        Events.click(optionFutbol);
        return calzadoHombrePage;
    }

}
