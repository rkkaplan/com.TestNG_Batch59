package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BRC_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class NegativeLoginTest {
    BRC_Page brc = new BRC_Page();
    @Test
    public void wrongPassword() {

        // WRONG PASSWORD
        // Bir test method olustur wrongPassword()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        // login butonuna bas
        brc.firstLoginButton.click();
        // test data user email: customer@bluerentalcars.com ,
        brc.emailInput.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        // test data password : 54321
        brc.passwordInput.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        // login butonuna tiklayin
        brc.secondtLoginButton.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brc.secondtLoginButton.isDisplayed());
        Driver.closeDriver();


    }
    @Test
    public void wrongEmail() {
        // WRONG EMAIL
        // Bir test method olustur wrongEmail()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        // login butonuna bas
        brc.firstLoginButton.click();
        // test data user email: asfasgajdfgja
        brc.emailInput.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
        // test data password : 12345
        brc.passwordInput.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        // login butonuna tiklayin
        brc.secondtLoginButton.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brc.secondtLoginButton.isDisplayed());


    }
    @Test
    public void bothWrongEmailWrongPassword() {

        // bothWrongEmailWrongPassword
        // Bir test method olustur bothWrongEmailWrongPassword()
        // https://www.bluerentalcars.com/ adresine git
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        // login butonuna bas
        brc.firstLoginButton.click();
        // test data user email: vljasşljgşascom ,
        brc.emailInput.sendKeys(ConfigReader.getProperty("brcWrongEmail"));
        // test data password : 54321
        brc.passwordInput.sendKeys(ConfigReader.getProperty("brcWrongPassword"));
        // login butonuna tiklayin
        brc.secondtLoginButton.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilemedigini test et
        Assert.assertTrue(brc.secondtLoginButton.isDisplayed());


    }

}

