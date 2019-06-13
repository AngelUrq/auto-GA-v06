package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountManager extends BasePage {

    @FindBy(id = "addAccountButton")
    private WebElement addAccountButton;

    @FindBy(id = "general")
    private WebElement generalAccountButton;

    @FindBy(id = "accountNameInput")
    private WebElement accountNameInput;

    @FindBy(id = "Income")
    private WebElement incomeButton;

    @FindBy(id = "Expenses")
    private WebElement expenseButton;

    @FindBy(id = "name")
    private WebElement fieldName;

    @FindBy(xpath = "//select[@id='category']//option[contains(text(),'Salary')]")
    private WebElement optionIncome;

    @FindBy(xpath = "//select[@id='category']//option[contains(text(),'Expenses')]")
    private WebElement optionExpense;

    @FindBy(id = "amount")
    private WebElement fieldAmount;

    @FindBy(id = "dateSpace")
    private WebElement fieldDate;

    @FindBy(id = "buttonTransaction")
    private WebElement transactionButton;

    @FindBy(id = "exit")
    private WebElement exitButton;

    @FindBy(id = "Transfer")
    private WebElement transferButton;

    @FindBy(xpath = "//select[@id='destinationAccount']//option[contains(text(),'Second Account')]")
    private WebElement optionAccountDestination;

    @FindBy(id = "amount")
    private WebElement fieldAmountTransfer;

    @FindBy(id = "btn-transfer")
    private WebElement transferTransactionButton;

    @FindBy(id = "Report")
    private WebElement reportButton;

    @FindBy(xpath = "//select[@id='reportType']//option[@value='date']")
    private WebElement optionDate;

    @FindBy(xpath = "//select[@id='reportType']//option[@value='category']")
    private WebElement optionCategory;

    @FindBy(xpath = "//input[@id='startDate']")
    private WebElement fieldStartDate;

    @FindBy(xpath = "//input[@id='endDate']")
    private WebElement fieldEndDate;

    @FindBy(id = "showReport")
    private WebElement showReportButton;


    public AccountManager() {
        super();
    }

    public void createAccount(String accountName) {
        fillAccountNameField(accountName);
        clickAddAccountButton();
    }
    public void createAccount() {
        clickAddAccountButton();
    }
    public void fillAccountNameField(String accountName) {
        Events.fillField(accountNameInput, accountName);
    }
    public void clickAddAccountButton() {
        Events.click(addAccountButton);
    }
    public void clickGeneralAccountButton() {
        Events.click(generalAccountButton);
    }
    public void selectAccount(String accountName) {
        WebElement newAccountButton = webDriver.findElement(By.id(accountName));
        Events.click(newAccountButton);
    }
    public boolean checkIfNewAccountButtonIsVisible(String accountName) {
        WebElement newAccountButton = webDriver.findElement(By.id(accountName));
        return Events.isVisibleWebElement(newAccountButton);
    }
    public void clickIncomeButton(){
        Events.click(incomeButton);
    }
    public void fillName(String nameTransfer){
        Events.fillField(fieldName,nameTransfer);
    }
    public void selectSalaryIncome(){
        Events.click(optionIncome);
    }
    public void fillAmount(String bs){
        Events.fillField(fieldAmount,bs);
    }
    public void fillDate(String date){
        Events.fillField(fieldDate,date);
    }
    public void registerTransaction(){
        Events.click(transactionButton);
    }
    public void clickExitButton(){
        Events.click(exitButton);
    }
    public void clickTransferButton(){
        Events.click(transferButton);
    }
    public void selectAccountDestination(){
        Events.click(optionAccountDestination);
    }
    public void fillAmountTransfer(String amount){
        Events.fillField(fieldAmountTransfer,amount);
    }
    public void clearFieldAmount(){
        Events.clearFieldText(fieldAmountTransfer);
    }
    public void clickTransferTransactionButton(){
        Events.click(transferTransactionButton);
    }
    //Report
    public void clickReportButton(){
        Events.click(reportButton);
    }
    public void selectDateReport(){
        Events.click(optionDate);
    }
    public void selectCategoryReport(){
        Events.click(optionCategory);
    }
    public void fillStartDateReport(String startDate){
        Events.fillField(fieldName,startDate);
    }
    public void fillEndDateReport(String endDate){
        Events.fillField(fieldName,endDate);
    }
    public void clickShowReportButton(){
        Events.click(showReportButton);
    }



}
