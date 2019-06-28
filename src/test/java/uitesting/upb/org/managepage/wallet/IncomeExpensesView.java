package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class IncomeExpensesView extends BasePage {

    @FindBy(id = "name")
    private WebElement fieldName;

    @FindBy(id = "new-category")
    private WebElement newCategorySelectField;

    @FindBy(id = "category")
    private WebElement incomeCategotySelectField;

    @FindBy(id = "categoryRegister")
    private WebElement nweCategotyRegisterField;

    @FindBy(xpath = "//select[@id='category']//option[contains(text(),'Others')]")
    private WebElement othersCategoryOption;

    @FindBy(xpath = "//select[@id='old-name']//option[contains(text(),'Nombre Income')]")
    private WebElement registeredExpenseOption;

    @FindBy(xpath = "//select[@id='old-name']//option[contains(text(),'Salario Junio')]")
    private WebElement registeredIncomeOption;

    @FindBy(id = "amount")
    private WebElement fieldAmount;

    @FindBy(id = "new-amount")
    private WebElement fieldModifiedAmount;

    @FindBy(id = "new-name")
    private WebElement fieldNewExpenseName;

    @FindBy(id = "new-name")
    private WebElement fieldNewIncomeName;

    @FindBy(id = "dateSpace")
    private WebElement fieldDate;

    @FindBy(id = "new-date")
    private WebElement fieldNewExpenseDate;

    @FindBy(id = "buttonTransaction")
    private WebElement transactionButton;

    @FindBy(id = "buttonChange")
    private WebElement expenseModifyButton;

    @FindBy(id = "buttonCategory")
    private WebElement buttonNewCategory;

    @FindBy(id = "account-main-menu")
    private WebElement accountmainmenu;

    public IncomeExpensesView() {
        super();
    }

    public void fillFieldName(String name) {
        Events.fillField(fieldName, name);
    }

    public void selectOthersCategory() {
        Events.click(othersCategoryOption);
    }

    public void selectCreatedExpense() {
        Events.click(registeredExpenseOption);
    }

    public void selectCreatedIncome() {
        Events.click(registeredIncomeOption);
    }

    public void fillAmountInput(String amount) {
        Events.fillField(fieldAmount, amount);
    }

    public void fillNewAmountInput(String amount) {
        Events.fillField(fieldModifiedAmount, amount);
    }

    public void fillDateInput(String date) {
        Events.fillField(fieldDate, date);
    }

    public void fillNewExpenseDateInput(String date) {
        Events.fillField(fieldNewExpenseDate, date);
    }

    public void clickTransactionButton() {
        Events.click(transactionButton);
    }

    public boolean transactionErrorIsVisible() {
        WebElement transactionError =  webDriver.findElement(By.id("transactionFail"));

        return Events.isVisibleWebElement(transactionError);
    }

    public boolean modifyErrorIsVisible() {
        WebElement modifyError =  webDriver.findElement(By.id("changeFail"));

        return Events.isVisibleWebElement(modifyError);
    }

    public boolean completeIncomeTransactionIsVisible() {
        WebElement modifyError =  webDriver.findElement(By.id("transactionSuccess"));
        return Events.isVisibleWebElement(modifyError);}

    public boolean createdCategoryMessageIsVisible() {
        WebElement modifyError =  webDriver.findElement(By.id("categorySuccess"));
        return Events.isVisibleWebElement(modifyError);}

    public boolean amountInputIsEmpty() {
        return fieldAmount.getAttribute("value").isEmpty();
    }

    public boolean newAmountIsZero() {
        return fieldModifiedAmount.getAttribute("value").equals("0");
    }

    public void clickMainMenu() {
        Events.click(accountmainmenu);
    }

    public void clickExpenseCategoryButton() {
        Events.selectByText(newCategorySelectField, "Expenses");   }

    public void clickIncomeCategoryButton() {
        Events.selectByText(newCategorySelectField, "Others");   }

    public void clickIncomeRegisterCategoryButton() {
        Events.selectByText(incomeCategotySelectField, "Salary");   }


    public void fillNewExpenseName(String newExpenseName){
        Events.fillField(fieldNewExpenseName, newExpenseName);
    }

    public void fillNewIncomeName(String newIncomeName){
        Events.fillField(fieldNewIncomeName, newIncomeName);
    }

    public void clickRegisterModify() {
        Events.click(expenseModifyButton); }

    public void clickRegisterCategoryButton() {
        Events.click(buttonNewCategory); }

    public void fillNewCategoryName(String newCategory){
        Events.fillField(nweCategotyRegisterField, newCategory);
    }

    public void clearAmountFieldIncome(){
        Events.clearField(fieldModifiedAmount);
    }

}
