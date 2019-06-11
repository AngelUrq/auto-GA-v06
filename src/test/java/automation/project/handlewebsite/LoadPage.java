package automation.project.handlewebsite;

import automation.project.webdrivermanager.DriverManager;
import automation.project.managefile.PropertyAccessor;
import automation.project.managepage.wallet.AccountManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {

    public static AccountManager loadWalletMainPage(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getBaseURL());
        return new AccountManager();
    }

    public static void main(String[] args) {
        AccountManager accountManager = loadWalletMainPage();

        accountManager.createAccount();
        accountManager.selectAccount();
    }

}
