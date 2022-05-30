package tests.day17_pom;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HotelMyCamp;
import utilities.Driver;

public class Practice_HotelMyCamp {
    //1) Bir Class olustur: PositiveTest
    //2) Bir test method olustur positiveLoginTest()

    @Test
    public void positiveLoginTest() {

        HotelMyCamp hotelMyCamp = new HotelMyCamp();

        // https://www.hotelmycamp.com/   adresine git
        Driver.getDriver().get("https://www.hotelmycamp.com/");
        //login butonuna bas
        hotelMyCamp.logOnButton.click();
        //test data username: manager
        hotelMyCamp.logOnButton.click();

        hotelMyCamp.usernameInput.sendKeys("manager");
        //test data password : Manager1!
        hotelMyCamp.passwordInput.click();

        hotelMyCamp.passwordInput.sendKeys("Manager1!");
        hotelMyCamp.logInButtonSubmit.click();
        //Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
        Assert.assertTrue(hotelMyCamp.entryStatement.isDisplayed());

        Driver.closeDriver();



    }



}
 /*
1) Bir Class olustur: PositiveTest
2) Bir test method olustur positiveLoginTest()
https://www.hotelmycamp.com/   adresine git
login butonuna bas
test data username: manager
test data password : Manager 1
Degerleri girildiginde sayfaya basarili sekilde girilebildigini test et
     */