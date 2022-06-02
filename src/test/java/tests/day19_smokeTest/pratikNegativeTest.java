package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BRC_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class pratikNegativeTest {
    BRC_Page brc = new BRC_Page();
    // Bir test method olustur negativeLoginTest()

    @Test
    public void wrongEmailTest() {
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
// login butonuna bas
        brc.firstLoginButton.click();
// test data user email: fasgasgasg ,
        brc.emailInput.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
// test data password : 12345
        brc.passwordInput.sendKeys(ConfigReader.getProperty("brcValidPassword"));
// login butonuna tiklayin
        brc.secondtLoginButton.click();
// Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brc.secondtLoginButton.isDisplayed());
// Bu class'da 2 test metodu daha olusturun
// biri yanlis kullanici
// digeri de yanlis sifre ve kullanici adi
        Driver.closeDriver();
    }

    @Test
    public void wrongPasswordWrongEmailTest() {
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
// login butonuna bas
        brc.firstLoginButton.click();
// test data user email: fasfustomer@bluerentalcars.com ,
        brc.emailInput.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
// test data password : 54323
        brc.passwordInput.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
// login butonuna tiklayin
        brc.secondtLoginButton.click();
// Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brc.secondtLoginButton.isDisplayed());

        Driver.closeDriver();
    }

}
// Bir test method olustur negativeLoginTest()
// https://www.bluerentalcars.com/ adresine git
// login butonuna bas
// test data user email: customer@bluerentalcars.com ,
// test data password : 12345
// login butonuna tiklayin
// Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
// Bu class'da 2 test metodu daha olusturun
// biri yanlis kullanici
// digeri de yanlis sifre ve kullanici adi