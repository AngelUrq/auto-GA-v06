package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class AccountManager extends BasePage {

    private static final String EXAMPLE_ACCOUNT_NAME = "My new account";

    @FindBy(id = "accountNameInput")
    private WebElement accountNameInput;

    @FindBy(id = "addAccountButton")
    private WebElement addAccountButton;

    public AccountManager() {
        super();
    }

    public void createAccount() {
        Events.fillField(accountNameInput, EXAMPLE_ACCOUNT_NAME);

        waitForSeconds(2);

        Events.click(addAccountButton);

        waitForSeconds(2);
    }

    public void selectAccount() {
        WebElement newAccountButton = webDriver.findElement(By.id(EXAMPLE_ACCOUNT_NAME));

        Events.click(newAccountButton);

        waitForSeconds(2);
    }

}
