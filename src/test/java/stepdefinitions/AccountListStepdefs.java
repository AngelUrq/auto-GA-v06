package stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import automation.project.handlewebsite.LoadPage;
import automation.project.managepage.wallet.AccountManager;

public class AccountListStepdefs {

    private AccountManager accountList;

    @Given("^AccountList is loaded$")
    public void walletIsLoaded() {
        accountList = LoadPage.loadWalletMainPage();
    }

    @Then("^click General button$")
    public void clickGeneralButton() {
        accountList.clickGeneralAccountButton();
    }

    @And("^new account is created$")
    public void newAccountIsCreated() {
        accountList.createAccount();
    }

    @Then("^check if the account button is visible$")
    public void checkIfTheAccountButtonIsVisible() {
        boolean check = accountList.checkIfNewAccountButtonIsVisible();

        Assert.assertEquals(check, true);
    }

}
