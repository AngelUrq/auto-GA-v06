package test_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.adidas.HomeAdidas;

public class AdidasPageStepdefs {

    private HomeAdidas homeAdidas;

    @Given("^Home Page is loaded$")
    public void homePageIsLoaded() {
        homeAdidas = LoadPage.loadHomeAdidasPage();
    }

    @Then("^Hover over 'Hombre' Bar link$")
    public void hoverOverHombreBarLink() {
        homeAdidas.hoverOverHombre();
    }

    @Then("^Click 'Futbol' link$")
    public void clickFutbolLink() {
        homeAdidas.clickFutbol();
    }
}
