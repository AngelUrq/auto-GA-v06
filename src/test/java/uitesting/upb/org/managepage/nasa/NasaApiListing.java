package uitesting.upb.org.managepage.nasa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

import javax.swing.*;

public class NasaApiListing extends BasePage {

    @FindBy(id = "tocify-header8")
    private WebElement earthButton;

    @FindBy(xpath = "//a[contains(text(),'Imagery')]")
    private WebElement imageryButton;

    @FindBy(xpath = "//code[contains(text(),'GET https://api.nasa.gov/planetary/earth/imagery')]")
    private WebElement codeElement;

    public NasaApiListing() {
        super();
    }

    public void navigateToEarthImagery() {
        Events.click(earthButton);
        waitForSeconds(2);

        Events.click(imageryButton);
        waitForSeconds(2);

        System.out.println(codeElement.getText());
        JOptionPane.showMessageDialog(null, codeElement.getText());
    }

}
