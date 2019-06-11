package automation.project.managepage.wallet;

import automation.project.manageevents.Events;
import automation.project.managepage.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountManager extends BasePage {

    private static final String EXAMPLE_ACCOUNT_NAME = "My new account";

    @FindBy(id = "accountNameInput")
    private WebElement accountNameInput;

    @FindBy(id = "addAccountButton")
    private WebElement addAccountButton;

    @FindBy(id = "general")
    private WebElement generalAccountButton;

    public AccountManager() {
        super();
    }

    public void createAccount() {
        fillField();
        clickAddAccountButton();
    }

    public void fillField(){
        Events.fillField(accountNameInput, EXAMPLE_ACCOUNT_NAME);

        waitForSeconds(2);
    }

    public void fillField(String accountName) {
        Events.fillField(accountNameInput, accountName);

        waitForSeconds(2);
    }

    public void clickAddAccountButton() {
        Events.click(addAccountButton);

        waitForSeconds(2);
    }

    public void clickGeneralAccountButton() {
        Events.click(generalAccountButton);

        waitForSeconds(2);
    }

    public void selectAccount() {
        WebElement newAccountButton = webDriver.findElement(By.id(EXAMPLE_ACCOUNT_NAME));

        Events.click(newAccountButton);

        waitForSeconds(2);
    }

    public boolean checkIfNewAccountButtonIsVisible() {
        WebElement newAccountButton = webDriver.findElement(By.id(EXAMPLE_ACCOUNT_NAME));

        return Events.isVisibleWebElement(newAccountButton);
    }

}
