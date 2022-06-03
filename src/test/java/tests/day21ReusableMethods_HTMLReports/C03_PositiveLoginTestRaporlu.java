package tests.day21ReusableMethods_HTMLReports;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BRC_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

public class C03_PositiveLoginTestRaporlu  extends TestBaseReport {
    BRC_Page brc = new BRC_Page();

    @Test
    public void test01() {
        extentTest = extentReports.createTest("Positive Login","Gecerli username ve password ile login yapabilmeli");
        // Bir test method olustur positiveLoginTest()
        // https://www.bluerentalcars.com/ adresine git

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        extentTest.info("Brc Anasayfaya gidildi");
        // login butonuna bas
        brc.firstLoginButton.click();
        extentTest.info("Login Butonuna tiklandi");
        // test data user email: customer@bluerentalcars.com ,
        brc.emailInput.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        extentTest.info("gecerli email yazildi");
        // test data password : 12345
        brc.passwordInput.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        extentTest.info("gecerli password yazildi.");
        // login butonuna tiklayin
        brc.secondtLoginButton.click();
        extentTest.info("login butonuna tiklandi");
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        System.out.println(brc.userProfileName.getText());
        String actualUsername = brc.userProfileName.getText();
        String expectedUsername = ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername, expectedUsername);
        extentTest.pass("kullanici basarili sekilde giris yapti. ");


        Driver.closeDriver();


    }
}
