package test_definitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.wallet.*;

public class WalletStepdefs {

    public final static String EXAMPLE_ACCOUNT_NAME = "My new account";

    private AccountManager accountManager;
    private AdidasMainPage adidasMainPage;
    private CalzadoHombrePage calzadoHombrePage;
    private SingleTennisPage singleTennisPage;
    private TennisCart tennisCart;


    @Given("^Account manager is loaded$")
    public void accountManagerIsLoaded() {
        adidasMainPage = LoadPage.loadAdidasMainPage();
    }

    @And("^fill \"([^\"]*)\" 'Account name' input on 'Account Manager'$")
    public void fillAccountNameInputOnAccountManager(String accountName) {
        accountManager.fillAccountNameField(accountName);
    }

    @Then("^click 'Add' button on 'Account Manager'$")
    public void clickAddButtonOnAccountManager() {
        accountManager.clickAddAccountButton();
    }

    @And("^new account is created$")
    public void newAccountIsCreated() {
        accountManager.createAccount(EXAMPLE_ACCOUNT_NAME);
    }

    @Then("^check if \"([^\"]*)\" button is visible on 'Account Manager'$")
    public void checkIfButtonIsVisibleOnAccountManager(String accountName) {
        boolean check = accountManager.checkIfNewAccountButtonIsVisible(accountName);

        Assert.assertTrue(check);
    }

    @Then("^click 'General' account button on 'Account Manager'$")
    public void clickGeneralAccountButtonOnAccountManager() {
        accountManager.clickGeneralAccountButton();
    }

    @Given("^Account creator is loaded$")
    public void accountCreatorIsLoaded() {
        adidasMainPage=LoadPage.loadAdidasMainPage();
    }

    @And("^fill 'Account name' input with first account$")
    public void fillAccountNameInputWithFirstAccount() {
        accountManager.fillAccountNameField("First Account");
    }

    @And("^click 'Add' button for first account$")
    public void clickAddButtonForFirstAccount() {
        accountManager.clickAddAccountButton();
    }

    @And("^fill 'Account name' input with second account$")
    public void fillAccountNameInputWithSecondAccount() {
        accountManager.fillAccountNameField("Second Account");
    }

    @And("^click 'Add' button for second account$")
    public void clickAddButtonForSecondAccount() {
        accountManager.clickAddAccountButton();
    }

    @Then("^select first account$")
    public void selectFirstAccount() {
        accountManager.selectAccount("First Account");
    }

    @And("^click 'Income' button$")
    public void clickIncomeButton() {
        accountManager.clickIncomeButton();
    }

    @And("^fill 'Enter Name' input$")
    public void fillEnterNameInput() {
        accountManager.fillName("Salario Junio");
    }

    @And("^fill 'Category' field$")
    public void fillCategoryField() {
        accountManager.selectSalaryIncome();
    }

    @And("^fill 'Enter Amount' input$")
    public void fillEnterAmountInput() {
        accountManager.fillAmount("1000");
    }

    @And("^fill 'mm/dd/yyyy' input$")
    public void fillMmDdYyyyInput() {
        accountManager.fillDate("01/02/2019");
    }

    @Then("^click 'Register Transaction' button$")
    public void clickRegisterTransactionButton() {
        accountManager.registerTransaction();
    }

    @Then("^click 'Exit' Button$")
    public void clickExitButton() {
        accountManager.clickExitButton();
    }

    @And("^Then select first account again$")
    public void thenSelectFirstAccountAgain() {
        accountManager.selectAccount("First Account");
    }

    @And("^click 'Transfer' button$")
    public void clickTransferButton() {
        accountManager.clickTransferButton();
    }

    @And("^select 'Second Account' option$")
    public void selectSecondAccountOption() {
        accountManager.selectAccountDestination();
    }

    @And("^fill \"([^\"]*)\" on field amount$")
    public void fillOnFieldAmount(String amount) throws Throwable {
        accountManager.clearFieldAmount();
        accountManager.fillAmountTransfer(amount);
    }

    @Then("^click 'Transfer' button on transfer page$")
    public void clickTransferButtonOnTransferPage() {
        accountManager.clickTransferTransactionButton();
    }

    @And("^click 'Report' button$")
    public void clickReportButton() {
        accountManager.clickReportButton();
    }

    @And("^select 'By date' option$")
    public void selectByDateOption() {
        accountManager.selectDateReport();
    }

    @And("^fill 'mm/dd/yyyy' start date input$")
    public void fillMmDdYyyyStartDateInput() {
        accountManager.fillStartDateReport("01/01/2019");
    }

    @And("^fill 'mm/dd/yyyy' end date input$")
    public void fillMmDdYyyyEndDateInput() {
        accountManager.fillEndDateReport("12/01/2019");
    }

    @Then("^click 'Show Report' button$")
    public void clickShowReportButton() {
        accountManager.clickShowReportButton();
    }

    @And("^select 'By category' option$")
    public void selectByCategoryOption() {
        accountManager.selectCategoryReport();
    }

    @And("^fill \"([^\"]*)\" start date input$")
    public void fillStartDateInput(String arg0) throws Throwable {
        accountManager.fillStartDateReport(arg0);
    }

    @And("^fill \"([^\"]*)\" end date input$")
    public void fillEndDateInput(String arg0) throws Throwable {
        accountManager.fillEndDateReport(arg0);
    }

    @And("^Mouseover 'HOMBRE' option$")
    public void mouseoverHOMBREOption() {
        adidasMainPage.hoverHombre();
    }

    @And("^Click 'Futbol' option$")
    public void clickFutbolOption() {
        calzadoHombrePage=adidasMainPage.clickOptionFutbol();
    }

    @And("^Get price of the first item$")
    public void getPriceOfTheFirstItem() {
        calzadoHombrePage.getPrice();
    }

    @And("^Click on first item$")
    public void clickOnFirstItem() {
        singleTennisPage=calzadoHombrePage.clickSelectTennis();
    }

    @And("^Click on 'ELIGE TU TALLA' button$")
    public void clickOnELIGETUTALLAButton() {
        singleTennisPage.clickButtonSelectSize();
    }

    @And("^Click on size required option$")
    public void clickOnSizeRequiredOption() {
        singleTennisPage.clickChooseSize();
    }

    @And("^Click on 'ANADIR AL CARRITO' button$")
    public void clickOnANADIRALCARRITOButton() {
        singleTennisPage.clickButtonAddToCart();
    }

    @And("^Quantity on Cart icon is 'One'$")
    public void quantityOnCartIconIsOne() {
        singleTennisPage.checkQuantity();
    }

    @And("^Click on 'VER CARRITO' button$")
    public void clickOnVERCARRITOButton() {
        tennisCart=singleTennisPage.clickCartLink();
    }

    @And("^Title of product is 'CALZADO DE FÚTBOL NEMEZIZ'$")
    public void titleOfProductIsCALZADODEFÚTBOLNEMEZIZ() {
        tennisCart.checkIfTitleIsVisible("CALZADO DE FÚTBOL NEMEZIZ 19.3 TERRENO FIRME");
    }

    @And("^Quantity of item is 'One'$")
    public void quantityOfItemIsOne() {
        tennisCart.checkQuantity("1");
    }

    @And("^Partial price is '(\\d+)\\.(\\d+)'$")
    public void partialPriceIs(int arg0, int arg1) {
        tennisCart.checkPartialPrice(arg0+"."+arg1);
    }

    @Then("^Total price is '(\\d+)\\.(\\d+)'$")
    public void totalPriceIs(int arg0, int arg1) {
        tennisCart.checkTotalPrice(arg0+"."+arg1);
    }
}
