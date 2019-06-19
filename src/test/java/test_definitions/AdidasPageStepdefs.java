package test_definitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.adidas.*;

public class AdidasPageStepdefs {

    private HomeAdidas homeAdidas;
    private FutbolProducts futbolProducts;
    private ShoeProductPage shoeProductPage;
    private ModalProductPage modalProductPage;
    private CartPage cartPage;

    public String price;
    public String quantity;
    public String productName;
    public String precioCart;


    @Given("^Home Page is loaded$")
    public void homePageIsLoaded() {
        homeAdidas = LoadPage.loadHomeAdidasPage();
    }

    @Then("^Hover over 'Hombre' Bar link$")
    public void hoverOverHombreBarLink() {
        homeAdidas.hoverOverHombre();
    }

    @Then("^Click 'Futbol' link$")
    public void clickFutbolLink() throws InterruptedException {
        homeAdidas.clickFutbol();
        Thread.sleep(5000);
        futbolProducts = new FutbolProducts();
    }

    @Then("^Get 'Product Value' string$")
    public void getProductValueString() {
         price = futbolProducts.getProductPrice();
        System.out.println("PRICE: " + price);
    }

    @Then("^click 'Product' button$")
    public void clickProductButton() throws InterruptedException {
        futbolProducts.clickProducto();
        Thread.sleep(5000);
        shoeProductPage = new ShoeProductPage();
    }

    @Then("^click 'Select' button$")
    public void clickSelectButton() {
        shoeProductPage.clickSelectButton();
    }

    @Then("^click 'Size' button$")
    public void clickSizeButton() {
        shoeProductPage.clickSizeButton();
    }

    @Then("^click 'Add to Cart' button$")
    public void clickAddToCartButton() {
        shoeProductPage.clickAddCartButton();
        modalProductPage = new ModalProductPage();
    }

    @Then("^check 'Product' quantity$")
    public void checkProductQuantity() {
        quantity = modalProductPage.getProductQuantity();
        System.out.println(quantity);
    }

    @Then("^click 'See Cart' button on 'Modal Product'$")
    public void clickSeeCartButtonOnModalProduct() {
        modalProductPage.clickToCartPage();
        cartPage = new CartPage();
    }

    @Then("^check 'Product' selected is registered on 'Cart Page'$")
    public void checkProductSelectedIsRegisteredOnCartPage() {
        productName = cartPage.getSelectedProduct();
        System.out.println(productName);
    }

    @Then("^check 'Product price' is equal to selected on 'Cart Page'$")
    public void checkProductPriceIsEqualToSelectedOnCartPage() {
        precioCart = cartPage.getSelectedProductPrice();

        Assert.assertEquals(price.concat(".00"),precioCart);

    }
}
