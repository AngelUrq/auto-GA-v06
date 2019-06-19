package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccessor;
import uitesting.upb.org.managepage.wallet.AccountManager;
import uitesting.upb.org.managepage.wallet.AdidasMainPage;
import uitesting.upb.org.webdrivermanager.DriverManager;

public class LoadPage {

    public static AdidasMainPage loadAdidasMainPage(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccessor.getInstance().getBaseURL());
        return new AdidasMainPage();
    }

}
