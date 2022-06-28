package tests.ElifHocaPractice_TestNG.day03;

import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import pages.TwitterPage;
import utilities.Driver;

import java.util.List;

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
                faker.internet().safeEmailAddress());
        Select select1 = new Select(twitter.ddmMonth);
        Select select2 = new Select(twitter.ddmDay);
        Select select3 = new Select(twitter.ddmYear);
        select1.selectByIndex(faker.number().numberBetween(1,13));
        select2.selectByIndex(faker.number().numberBetween(1,29));
        select3.selectByIndex(faker.number().numberBetween(1,120));

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

