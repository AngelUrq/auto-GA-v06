package uitesting.upb.org.handlewebsite;

import uitesting.upb.org.managefile.PropertyAccesor;
import uitesting.upb.org.managepage.nasa.MainPage;
import uitesting.upb.org.webdrivermanager.DriverManager;

/**
 * @autor Marcelo Garay
 */
public class LoadPage {

    public static MainPage loadNasaMainPage(){
        DriverManager.getInstance().getWebDriver().navigate().to(PropertyAccesor.getInstance().getBaseURL());
        return new MainPage();
    }

    public static void main(String[] args) {
        loadNasaMainPage().navigateToEarthImagery();
    }

}
