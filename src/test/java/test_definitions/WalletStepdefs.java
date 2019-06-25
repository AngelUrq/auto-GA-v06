package test_definitions;

import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import uitesting.upb.org.handlecucumber.StringListTransformer;
import uitesting.upb.org.handlewebsite.LoadPage;
import uitesting.upb.org.managepage.wallet.*;

import java.util.List;

public class WalletStepdefs {

    private final static String EXAMPLE_ACCOUNT_NAME = "My new account";

    private AccountManager accountManager;
    private AccountCreator accountCreator;
    private NavBar navBar;
    private AccountSettings accountSettings;

    private ReportsPage reportsPage;
    private ReportTable reportTable;

    private AccountMainMenu accountMainMenu;

    private IncomeExpensesView incomeExpensesView;

    private GeneralReports generalReports;
    private TransferPage transferPage;
    private ReportPage reportPage;

    private int lengthOfAccountListBefore;

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
        boolean check = accountManager.newAccountButtonIsVisible(accountName);

        Assert.assertTrue(check);
    }

    @And("^click 'General' account button on 'Account Manager'$")
    public void clickGeneralAccountButtonOnAccountManager() {
        generalReports = accountManager.clickGeneralAccountButton();
    }

    @Then("^title is visible on 'General Reports'$")
    public void titleIsVisibleOnGeneralReports() {
        Assert.assertTrue(generalReports.titleIsVisible());
    }

    @And("^click 'Income' button$")
    public void clickIncomeButton() {
        incomeExpensesView = accountMainMenu.clickIncomeButton();
    }

    @And("^click 'Income' button on 'Account Main Menu'$")
    public void clickIncomeButtonOnAccountMainMenu() {
        incomeExpensesView = accountMainMenu.clickIncomeButton();
    }

    @And("^click 'Expenses' button on 'Account Main Menu'$")
    public void clickExpensesButtonOnAccountMainMenu() {
        incomeExpensesView = accountMainMenu.clickExpensesButton();
    }

    @Given("^Browser is loaded$")
    public void browserIsLoaded() {
        accountManager = LoadPage.loadAccountManager();
        accountCreator = LoadPage.loadAccountCreator();
    }

    @Then("^Fill \"([^\"]*)\" text field in 'Account Creator' page$")
    public void fillTextFieldInAccountCreatorPage(String accountName)  {
        accountCreator.writeInAccountTextField(accountName);

    }

    @And("^Click 'Add' button in 'Account Creator' page$")
    public void clickAddButtonInAccountCreator() {
        accountCreator.clickAddAccountButton();
    }

    @And("^Click 'Mateo' button in 'Account Creator' page$")
    public void clickMateoButtonInAccountCreator() {
        navBar = accountCreator.clickAccountMateoButton();
        accountMainMenu = new AccountMainMenu();
    }

    @When("^'Navbar' is loaded in 'Nav Bar' page$")
    public void navbarIsLoaded() {
        boolean isVisible = navBar.navBarIsVisible();
        Assert.assertTrue(isVisible);
    }

    @Then("^Click 'Account Settings' button in 'NavBar' page$")
    public void clickAccountSettingsButtonInNavBar() {
        accountSettings = navBar.clickAccountSettings();
    }

    @When("^'Account Settings' window is loaded$")
    public void accountSettingsWindowIsLoaded() {
        boolean isVisible = accountSettings.windowIsVisible();

        Assert.assertTrue(isVisible);
    }

    @Then("^Fill 'Account Name' text field with \"([^\"]*)\" in 'Account Settings' page$")
    public void fillAccountNameTextFieldWithInAccountSettingsPage(@Transform(StringListTransformer.class) String[] names)  {
        accountSettings.clearChangeAccountNameTextField();
       for(int i = 0 ; i < names.length; i++){
           accountSettings.writeInChangeAccountNameTextField(names[i]);
       }

    }

    @Then("^Click 'Delete' button in Account Settings$")
    public void clickDeleteButtonInAccountSettings() {
        accountSettings.clickDeleteAccountButton();
    }

    @Then("^Fil 'Account Name' text field with \"([^\"]*)\" in 'Account Settings' page$")
    public void fillAccountNameTextFieldWithInAccountSettings(String nuevoNombre) {
        accountSettings.clearChangeAccountNameTextField();
        accountSettings.writeInChangeAccountNameTextField(nuevoNombre);
    }

    @And("^Click 'Change name' button in 'Account Settings' page$")
    public void clickChangeNameButtonInAccountSettings() {
        accountSettings.clickChangeNameButton();
    }

    @Then("^'Add' button is visible on 'Account Creator'$")
    public void addButtonIsVisibleOnAccountCreator() {
        Assert.assertTrue(accountManager.addAccountButtonIsVisible());
    }

    @And("^'Account name' input is visible on 'Account Creator'$")
    public void accountNameInputIsVisibleOnAccountCreator() {
        Assert.assertTrue(accountManager.accountNameInputIsVisible());
    }

    @And("^click \"([^\"]*)\" button on 'Account Manager'$")
    public void clickButtonOnAccountManager(String accountName) {
        accountMainMenu = accountManager.selectAccount(accountName);
    }

    @Then("^fill \"([^\"]*)\" in 'Enter Name' input on 'Income Expenses View'$")
    public void fillInEnterNameInputOnIncomeExpensesView(String expenseName) {
        incomeExpensesView.fillFieldName(expenseName);
    }

    @And("^select 'Category' field on 'Income Expenses View'$")
    public void selectCategoryFieldOnIncomeExpensesView() {
        incomeExpensesView.selectOthersCategory();
    }

    @And("^fill \"([^\"]*)\" 'Enter amount' input on 'Income Expenses View'$")
    public void fillEnterAmountInputOnIncomeExpensesView(String amount) {
        incomeExpensesView.fillAmountInput(amount);
    }

    @And("^fill \"([^\"]*)\" 'Date' input on 'Income Expenses View'$")
    public void fillDateInputOnIncomeExpensesView(String date) {
        incomeExpensesView.fillDateInput(date);
    }

    @Then("^click 'Register Transaction' button on 'Income Expenses View'$")
    public void clickRegisterTransactionButtonOnIncomeExpensesView() {
        incomeExpensesView.clickTransactionButton();
    }

    @Then("^'Transaction error' is visible$")
    public void transactionErrorIsVisible() {
        Assert.assertTrue(incomeExpensesView.transactionErrorIsVisible());
    }

    @Then("^'Enter amount' input is empty$")
    public void enterAmountInputIsEmpty() {
        Assert.assertTrue(incomeExpensesView.amountInputIsEmpty());
    }

    @And("^fill \"([^\"]*)\" 'Enter new amount' input on 'Income Expenses View'$")
    public void fillEnterNewAmountInputOnIncomeExpensesView(String amount) {
        incomeExpensesView.fillNewAmountInput(amount);
    }

    @Then("^'Enter new amount' input is zero$")
    public void enterNewAmountInputIsZero() {
        Assert.assertTrue(incomeExpensesView.newAmountIsZero());
    }

    @Then("^go back home in 'Expenses'$")
    public void goBackHomeInExpenses() {
        incomeExpensesView.clickMainMenu();
    }

    @Then("^select expense registered on 'Expense View'$")
    public void selectExpenseRegisteredOnExpenseView() {
        incomeExpensesView.selectCreatedExpense();
    }

    @Then("^Click 'Mateo' button in 'Account Creator' page to load Account Main Menu$")
    public void clickMateoButtonInAccountCreatorPageToLoadAccountMainMenu() {
        accountMainMenu = accountCreator.clickAccountMButton();
    }

    @When("^'Account Main Menu' Page is loaded$")
    public void accountMainMenuPageIsLoaded() {
        Assert.assertTrue(accountMainMenu.mainMenuisLoaded());
    }

    @Then("^Click 'Report' button in 'Account Main Menu' Page$")
    public void clickReportButtonInAccountMainMenuPage() {
        reportPage = accountMainMenu.clickReportButton();
    }

    @And("^Click 'Report Type' Selector in 'Report' Page$")
    public void clickReportTypeSelectorInReportPage() {
        reportsPage.clickTypeSelector();
    }

    @And("^Click 'By category' Type in 'Report Type Selector' in 'Report' Page$")
    public void clickByCategoryTypeInReportTypeSelectorInReportPage() {
        reportsPage.clickCategoryType();
    }

    @Then("^Click 'Show Report' Button in 'Report' Page$")
    public void clickShowReportButtonInReportPage() {
        reportTable =  reportsPage.clickShowReportButton();
    }

    @And("^Click 'Mateo' delete button in 'Report' table in 'Report' page$")
    public void clickMateoElementInReportTableInReportPage() {
        reportTable.clickDeleteIncomeMateo();
    }

    @And("^Click 'Celular' delete button in 'Report' table in 'Report' page$")
    public void clickCelularElementInReportTableInReportPage() {
        reportTable.clickDeleteExpenseCelular();
    }

    @Then("^Text field 'Account Name' should be empty in  'Account Creator' Page$")
    public void textFieldAccountNameShouldBeClear() {
        Assert.assertTrue(accountCreator.isAccountNameTextFieldEmpty());
    }

    @And("^List 'Account List' length should not change in 'Account Creator Page'$")
    public void listAccountListShouldHaveTheSameLength() {
        Assert.assertEquals(lengthOfAccountListBefore,accountCreator.getAccountListLength());
    }

    @Then("^Get length of 'Account List' List in 'Account Creator' Page$")
    public void getLengthOfAccountListListInAccountCreatorPage() {
          lengthOfAccountListBefore = accountCreator.getAccountListLength();
    }

    @And("^Click 'Home Page' button in 'NavBar' page$")
    public void clickHomePageButtonInNavBarPage() {
        navBar.clickHomeButton();
    }

    @Then("^'Income' button is visible on 'Account Main Menu'$")
    public void incomeButtonIsVisibleOnAccountMainMenu() {
        Assert.assertTrue(accountMainMenu.incomeButtonIsVisible());
    }

    @And("^'Expenses' button is visible on 'Account Main Menu'$")
    public void expensesButtonIsVisibleOnAccountMainMenu() {
        Assert.assertTrue(accountMainMenu.expensesButtonIsVisible());
    }

    @And("^'Transfer' button is visible on 'Account Main Menu'$")
    public void transferButtonIsVisibleOnAccountMainMenu() {
        Assert.assertTrue(accountMainMenu.transferButtonIsVisible());
    }

    @And("^'Report' button is visible on 'Account Main Menu'$")
    public void reportButtonIsVisibleOnAccountMainMenu() {
        Assert.assertTrue(accountMainMenu.reportButtonIsVisible());
    }

    //TransferFeature

    @And("^go back home in 'Income'$")
    public void goBackHomeInIncome() {
        incomeExpensesView.clickMainMenu();
    }

    @And("^fill \"([^\"]*)\" 'Enter Name' input on 'Income View'$")
    public void fillEnterNameInputOnIncomeView(String nameIncome) throws Throwable {
        incomeExpensesView.fillFieldName(nameIncome);
    }

    @And("^click 'Transfer' button on 'Account Main Menu'$")
    public void clickTransferButtonOnAccountMainMenu() {
        transferPage = accountMainMenu.clickTransferButton();
    }

    @And("^select 'Second Account' option$")
    public void selectSecondAccountOption() {
        transferPage.selectAccountDestination();
    }

    @And("^fill \"([^\"]*)\" on field amount$")
    public void fillOnFieldAmount(String transferAmount) throws Throwable {
        transferPage.clearFieldAmount();
        transferPage.fillAmountTransfer(transferAmount);
    }

    @And("^Transfer button is visible$")
    public void transferButtonIsVisible() {
        transferPage.transferButtonIsVisible();
    }

    @Then("^click 'Transfer' button on transfer page$")
    public void clickTransferButtonOnTransferPage() {
        transferPage.clickTransferTransactionButton();
    }

    //Report Feature

    @And("^select 'By date' option$")
    public void selectByDateOption() {
        reportPage.selectDateReport();
    }

    @And("^StartDate field is visible$")
    public void startdateFieldIsVisible() {
        reportPage.startDateFieldIsVisible();
    }

    @And("^EndtDate field is visible$")
    public void endtdateFieldIsVisible() {
        reportPage.endDateFieldIsVisible();
    }

    @And("^fill \"([^\"]*)\" start date input$")
    public void fillStartDateInput(String startDate) throws Throwable {
        reportPage.fillStartDateReport(startDate);
    }

    @And("^fill \"([^\"]*)\" end date input$")
    public void fillEndDateInput(String endDate) throws Throwable {
        reportPage.fillEndDateReport(endDate);
    }

    @And("^Report button is visible$")
    public void reportButtonIsVisible() {
        reportPage.reportButtonIsVisible();
    }

    @Then("^click 'Show Report' button$")
    public void clickShowReportButton() {
        reportPage.clickShowReportButton();
    }

    @And("^select 'By category' option$")
    public void selectByCategoryOption() {
        reportPage.selectCategoryReport();
    }

    @When("^'Navbar' is loaded in 'Income' page$")
    public void navbarIsLoadedInIncomePage() {
        navBar = new NavBar();
    }

    @Then("^Click 'Personal Wallet' Button in 'NavBar' Page$")
    public void clickPersonalWalletButtonInNavBarPage() {
       accountMainMenu = navBar.clickPersonalWalletButton();
    }


    @Then("^Click 'General Account' button in 'Account Creator' page$")
    public void clickGeneralAccountButtonInAccountCreatorPage() {
        navBar = accountCreator.clickAccountGeneralButton();
    }

    @Then("^Verify button 'Account Settings' is not visible in 'NavBar' Page$")
    public void verifyButtonAccountSettingsIsNotVisibleInNavBarPage() {
        Assert.assertTrue(navBar.isSettingsButtonVisible());
    }

    @Then("^Click 'Account Settings' button in 'Reports Navbar' Page$")
    public void clickAccountSettingsButtonInReportsNavbarPage() {
        NavBar nav = new NavBar();
        accountSettings = nav.clickAccountSettings();
    }

    @Then("^Verify the name \"([^\"]*)\" wasn't added to an account in 'Account Creator' Page$")
    public void verifyTheNameWasnTAddedToAnAccountInAccountCreatorPage(String name) {
        accountCreator = new AccountCreator();
        Assert.assertNull(accountCreator.accountButtonExists(name));
    }

    @Then("^fill \"([^\"]*)\" name input on 'Expenses View'$")
    public void fillNameInputOnExpensesView(String arg0)  {
        incomeExpensesView.fillNewExpenseName(arg0);
    }

    @Then("^select 'Expenses' different Expense category on 'Expenses View'$")
    public void selectExpensesDifferentExpenseCategoryOnExpensesView() {
        incomeExpensesView.clickExpenseCategoryButton();
    }

    @And("^fill 'mm/dd/yyyy' new date input on 'Expenses View'$")
    public void fillMmDdYyyyNewDateInputOnExpensesView() {
        incomeExpensesView.fillNewExpenseDateInput("11/02/2019");
    }

    @And("^fill new \"([^\"]*)\" amount modify expense on 'Expenses View'$")
    public void fillNewAmountModifyExpenseOnExpensesView(String modifyExpense) {
        incomeExpensesView.fillNewAmountInput(modifyExpense);
    }

    @And("^click 'Register Changes' button on 'Expenses View'$")
    public void clickRegisterChangesButtonOnExpensesView() {
        incomeExpensesView.clickRegisterModify();
    }

    @Then("^select income registered on 'Income View'$")
    public void selectIncomeRegisteredOnIncomeView() {
        incomeExpensesView.selectCreatedIncome();
    }

    @Then("^fill \"([^\"]*)\" name input on 'Income View'$")
    public void fillNameInputOnIncomeView(String arg0) throws Throwable {
        incomeExpensesView.fillNewIncomeName(arg0);
    }

    @Then("^select 'Others' different Income category on 'Income View'$")
    public void selectOthersDifferentIncomeCategoryOnIncomeView() {
        incomeExpensesView.clickIncomeCategoryButton();
    }

    @And("^fill new \"([^\"]*)\" amount modify income on 'Income View'$")
    public void fillNewAmountModifyIncomeOnIncomeView(String arg0) throws Throwable {
        incomeExpensesView.fillNewAmountInput(arg0);
    }

    @And("^click 'Register Changes' button on 'Income View'$")
    public void clickRegisterChangesButtonOnIncomeView() {
        incomeExpensesView.clickRegisterModify();
    }

    @And("^check 'error message' display$")
    public void checkErrorMessageDisplay() {
        Assert.assertTrue(incomeExpensesView.modifyErrorIsVisible());
    }
}
