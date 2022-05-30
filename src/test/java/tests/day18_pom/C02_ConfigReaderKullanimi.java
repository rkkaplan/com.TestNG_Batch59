package tests.day18_pom;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {
    @Test
    public void test01() {
        FacebookPage facebookPage = new FacebookPage();
        // Facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        //kullanici mail kutusuna yanlis kullanici ismi yazdirin
        facebookPage.userMail.sendKeys(ConfigReader.getProperty("facebookWrongUsername"));
        //kulanici sifre kutusuna yanlis kullanici sifresi yazdirin
        facebookPage.password.sendKeys(ConfigReader.getProperty("facebookWrongPassword"));
        // login butonun basin
        facebookPage.loginButton.click();
        //giris yapilamadigini test edin
        Assert.assertTrue(facebookPage.girilemediYaziElementi.isDisplayed());
        //sayfayi kapatin
        Driver.closeDriver();

    }
}
// Facebook anasayfaya gidin
//kullanici mail kutusuna rasgele bir isim yazdirin
//kulanici sifre kutusuna rasgele bir sifre yazdirin
// login butonun basin
//giris yapilamadigini test edin
//sayfayi kapatin
