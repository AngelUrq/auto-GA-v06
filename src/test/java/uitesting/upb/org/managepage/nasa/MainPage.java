package uitesting.upb.org.managepage.nasa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import javax.swing.*;

public class MainPage extends BasePage {

    @FindBy(id = "tocify-header1")
    private WebElement nasaAPIListingButton;

    public MainPage() {
        super();
    }

    public NasaApiListing navigateToNasaApiListing() {
        clickNasaAPIListingButton();
        waitForSeconds(2);

        clickNasaAPIListingButton();
        waitForSeconds(2);

        return new NasaApiListing();
    }

    private void clickNasaAPIListingButton() {
        Events.click(nasaAPIListingButton);
    }

}
