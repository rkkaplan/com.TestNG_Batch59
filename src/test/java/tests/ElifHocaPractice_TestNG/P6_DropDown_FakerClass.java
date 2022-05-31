package tests.ElifHocaPractice_TestNG;

import com.github.javafaker.Faker;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.TwitterPage;
import utilities.Driver;

public class P6_DropDown_FakerClass {
    @Test
    public void test01() throws InterruptedException {
        //  twitter a faker class kullanarak mail ile kayit olmaya calisiniz
        Driver.getDriver().get("https:www.twitter.com");
        TwitterPage twitter = new TwitterPage();
        //  actions class kullanmayin twitteri deneyen instagram i denesin
        twitter.signUpButton.click();
        Thread.sleep(2000);
        Faker faker = new Faker();
        twitter.useEMail.click();
        Thread.sleep(2000);
        twitter.nameInput.sendKeys(faker.name().firstName() + Keys.TAB +
                faker.internet().safeEmailAddress() + Keys.TAB + Keys.TAB +
                "Haziran" + Keys.TAB + "5" + Keys.TAB + "1982" );
        Thread.sleep(2000);
        twitter.forwardButton.click();
        Thread.sleep(2000);
        twitter.forwardButton.click();
        Thread.sleep(2000);
        twitter.enrollButton.click();
    }
}
/*
//twitter a faker class kullanarak mail ile kayit olmaya calisiniz
//actions class kullanmayin twitteri deneyen instagram i denesin
 */

