package uitesting.upb.org.managepage.wallet;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import uitesting.upb.org.manageevents.Events;
import uitesting.upb.org.managepage.BasePage;

public class TransferPage extends BasePage {

    @FindBy(xpath = "//select[@id='destinationAccount']//option[contains(text(),'Second Account')]")
    private WebElement optionAccountDestination;

    @FindBy(id = "btn-transfer")
    private WebElement transferTransactionButton;

    @FindBy(id = "amount")
    private WebElement fieldAmountTransfer;

    public TransferPage() {
        super();
    }
    public void selectAccountDestination(){
        Events.click(optionAccountDestination);
    }
    public void clickTransferTransactionButton(){
        Events.click(transferTransactionButton);
    }
    public void fillAmountTransfer(String amount){
        Events.fillField(fieldAmountTransfer,amount);
    }
    public void clearFieldAmount(){
        Events.clearFieldText(fieldAmountTransfer);
    }
    public boolean transferButtonIsVisible(){
        return Events.isVisibleWebElement(transferTransactionButton);
    }



}
