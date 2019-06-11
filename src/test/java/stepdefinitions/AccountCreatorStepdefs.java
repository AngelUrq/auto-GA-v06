package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.wallet.AccountManager;

public class AccountCreatorStepdefs {

    private AccountManager accountCreator;

    @Given("^Account creator is loaded$")
    public void walletIsLoaded() {
        accountCreator = LoadPage.loadWalletMainPage();
    }

    @And("^account name input is filled$")
    public void accountNameInputIsFilled() {
        accountCreator.fillField();
    }

    @And("^fill \"([^\"]*)\" account name input$")
    public void fillAccountNameInput(String accountName) {
        accountCreator.fillField(accountName);
    }

    @Then("^click create button$")
    public void clickCreateButton() {
        accountCreator.clickAddAccountButton();
    }

}
