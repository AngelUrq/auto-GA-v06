package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.google.home.Home;
import uitesting.upb.org.managepage.wallet.AccountManager;
import uitesting.upb.org.webdrivermanager.DriverManager;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {

    public static AccountManager loadWalletMainPage(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new AccountManager();
    }

    public static void main(String[] args) {
        AccountManager accountManager = loadWalletMainPage();

        accountManager.createAccount();
        accountManager.selectAccount();
    }

}
