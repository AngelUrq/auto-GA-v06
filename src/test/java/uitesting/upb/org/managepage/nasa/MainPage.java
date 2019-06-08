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

    public void navigateToEarthImagery() {
        for(int i = 0; i < 2; i++){
            clickNasaAPIListingButton();
            waitForSeconds(2);
        }

        clickEarthButton();
        waitForSeconds(2);

        clickImageryButton();
        waitForSeconds(2);
    }

    private void clickNasaAPIListingButton() {
        Events.click(nasaAPIListingButton);
    }

    private void clickEarthButton(){
        WebElement earthButton = webDriver.findElement(By.id("tocify-header8"));
        Events.click(earthButton);
    }

    private void clickImageryButton() {
        WebElement imageryButton = webDriver.findElement(By.xpath("//a[contains(text(),'Imagery')]"));
        Events.click(imageryButton);

        JOptionPane.showMessageDialog(null, "URL: " + webDriver.getCurrentUrl());
    }

}
