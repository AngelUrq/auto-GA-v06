package test_definitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.wallet.AccountManager;
import uitesting.upb.org.managepage.wallet.ReportPage;
import uitesting.upb.org.managepage.wallet.TransferPage;

public class WalletStepdefs {

    public final static String EXAMPLE_ACCOUNT_NAME = "My new account";

    private AccountManager accountManager;
    private ReportPage reportPage;
    private TransferPage transferPage;

    @Given("^Account manager is loaded$")
    public void accountManagerIsLoaded() {
        accountManager = LoadPage.loadAccountManager();
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
        accountManager=LoadPage.loadAccountManager();
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
        transferPage=accountManager.clickTransferButton();
    }

    @And("^select 'Second Account' option$")
    public void selectSecondAccountOption() {
        transferPage.selectAccountDestination();
    }

    @And("^fill \"([^\"]*)\" on field amount$")
    public void fillOnFieldAmount(String amount) throws Throwable {
        transferPage.clearFieldAmount();
        transferPage.fillAmountTransfer(amount);
    }

    @And("^Transfer button is visible$")
    public void transferButtonIsVisible() {
        Assert.assertTrue(transferPage.transferButtonIsVisible());
    }

    @Then("^click 'Transfer' button on transfer page$")
    public void clickTransferButtonOnTransferPage() {
        transferPage.clickTransferTransactionButton();
    }

    @And("^click 'Report' button$")
    public void clickReportButton() {
        reportPage=accountManager.clickReportButton();
    }

    @And("^ReporType ComboBox is visible$")
    public void reportypeComboBoxIsVisible() {
        Assert.assertTrue(reportPage.reportTypeComboBoxIsVisible());
    }

    @And("^select 'By date' option$")
    public void selectByDateOption() {
        reportPage.selectDateReport();
    }

    @And("^fill 'mm/dd/yyyy' start date input$")
    public void fillMmDdYyyyStartDateInput() {
        reportPage.fillStartDateReport("01/01/2019");
    }

    @And("^fill 'mm/dd/yyyy' end date input$")
    public void fillMmDdYyyyEndDateInput() {
        reportPage.fillEndDateReport("12/01/2019");
    }

    @And("^StartDate field is visible$")
    public void startdateFieldIsVisible() {
        Assert.assertTrue(reportPage.startDateFieldIsVisible());
    }

    @And("^EndtDate field is visible$")
    public void endtdateFieldIsVisible() {
        Assert.assertTrue(reportPage.endDateFieldIsVisible());
    }

    @And("^Report button is visible$")
    public void reportButtonIsVisible() {
        Assert.assertTrue(reportPage.reportButtonIsVisible());
    }

    @And("^ReporType ComboBox is not visible$")
    public void reportypeComboBoxIsNotVisible() {
        Assert.assertFalse(reportPage.reportTypeComboBoxIsVisible());
    }

    @Then("^click 'Show Report' button$")
    public void clickShowReportButton() {
        reportPage.clickShowReportButton();
    }

    @And("^select 'By category' option$")
    public void selectByCategoryOption() {
        reportPage.selectCategoryReport();
    }

    @And("^fill \"([^\"]*)\" start date input$")
    public void fillStartDateInput(String arg0) throws Throwable {
        reportPage.fillStartDateReport(arg0);
    }

    @And("^fill \"([^\"]*)\" end date input$")
    public void fillEndDateInput(String arg0) throws Throwable {
        reportPage.fillEndDateReport(arg0);
    }
}
