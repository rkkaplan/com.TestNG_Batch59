package tests.pr39;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.TradylinnPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US010_Tradylinn {
    TradylinnPage tradylinnPage = new TradylinnPage();
    @Test
    public void tC0001() {
        //1) Vendor goes to tradylinn.com
        Driver.getDriver().get(ConfigReader.getProperty("tradylinnUrl"));
        //2) Vendor clicks "Hesabım" if "GirisYap" button is not displayed
        if (!tradylinnPage.girisYapButton.isDisplayed()){
            tradylinnPage.hesabimButton.click();
            //3-) Vendor switchs to 9th step
        }else {
            //4) Vendor clicks "Giriş Yap" if "GirisYap" button is displayed
            tradylinnPage.girisYapButton.click();
            //5) Vendor enters email
            tradylinnPage.usernameInput.clear();
            tradylinnPage.usernameInput.sendKeys(ConfigReader.getProperty("trValidEmail"));
            //6) Vendor enters password
            tradylinnPage.passwordInput.clear();
            tradylinnPage.passwordInput.sendKeys(ConfigReader.getProperty("trValidPassword"));
            //7) Vendor clicks "Giriş Yap" button
            tradylinnPage.girisYapSubmitButton.click();
            //8) Vendor clicks "Hesabım"
            ReusableMethods.waitFor(15);
            tradylinnPage.hesabimButton.click();
        }

        //9) Vendor clicks "Store Manager"
        tradylinnPage.storeManagerButton.click();
        //10) Vendor clicks "Ürün%s"
        tradylinnPage.urunButton.click();
        //11) Vendor clicks "Yeni Ekle"
        tradylinnPage.yeniEkleButton.click();
        //12) Vendor clicks "Attributes" tab
        ReusableMethods.clickWithJS(tradylinnPage.attributes);
        tradylinnPage.attributes.click();
        //13) Vendor clicks "color radio button"  to associate the colour attribute with the product
        //14 )  Vendor selects as many colors as he/she wants via the color dropdown menu.
        //15) Vendor clicks " Visible on the product page" radio button to associate this attribute with the product if it is not selected

    }
}
