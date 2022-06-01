package tests.day19_smokeTest;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BRC_Page;
import utilities.ConfigReader;
import utilities.Driver;

public class PositiveLoginTest {
    BRC_Page brc = new BRC_Page();
    @Test
    public void test01() {

        // Bir test method olustur positiveLoginTest()
        // https://www.bluerentalcars.com/ adresine git

        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));
        // login butonuna bas
        brc.firstLoginButton.click();
        // test data user email: customer@bluerentalcars.com ,
        brc.emailInput.sendKeys(ConfigReader.getProperty("brcValidEmail"));
        // test data password : 12345
        brc.passwordInput.sendKeys(ConfigReader.getProperty("brcValidPassword"));
        // login butonuna tiklayin
        brc.secondtLoginButton.click();
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        System.out.println(brc.userProfileName.getText());
        String actualUsername = brc.userProfileName.getText();
        String expectedUsername = ConfigReader.getProperty("brcValidUsername");
        Assert.assertEquals(actualUsername,expectedUsername);


        Driver.closeDriver();

    }
}
/*
        // Bir test method olustur positiveLoginTest()
        // https://www.bluerentalcars.com/ adresine git
        // login butonuna bas
        // test data user email: customer@bluerentalcars.com ,
        // test data password : 12345
        // login butonuna tiklayin
        // Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
 */
