package day16_notations;

import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C07_SoftAssert extends TestBase {
    @Test
    public void test01() {
        // 1. “http://zero.webappsecurity.com/” Adresine gidin
        driver.get("http://zero.webappsecurity.com/");
        // 2. Sign in butonuna basin
        driver.findElement(By.xpath("//button[@id='signin_button']")).click();
        // 3. Login kutusuna “username” yazin
        WebElement logIn = driver.findElement(By.xpath("//input[@id='user_login']"));
        Actions actions = new Actions(driver);
        actions.click(logIn).sendKeys("username" + Keys.TAB + "password").perform();

        // 4. Password kutusuna “password” yazin
        // 5. Sign in tusuna basin
        actions.sendKeys(Keys.ENTER).perform();

        // 6. Online banking menusu icinde Pay Bills sayfasina gidin
        driver.navigate().back();
        driver.findElement(By.xpath("(//*[text()='Online Banking'])[1]")).click();
        driver.findElement(By.xpath("//span[@id='pay_bills_link']")).click();
        // 7. “Purchase Foreign Currency” tusuna basin
        driver.findElement(By.xpath("//*[text()='Purchase Foreign Currency']")).click();

        // 8. “Currency” drop down menusunden Eurozone’u secin
        WebElement ddm = driver.findElement(By.xpath("//select[@name='currency']"));
        Select select = new Select(ddm);
        select.selectByVisibleText("Eurozone (euro)");
        // 9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
        SoftAssert softAssert = new SoftAssert();
        String selectedOption = select.getFirstSelectedOption().getText();
        String expectedOption = "Eurozone (Euro)";
        softAssert.assertEquals(selectedOption,expectedOption, " secilen ooption uygun degil");
        // 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        /*
            "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)",
            "Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)",
            "Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)",
            "Thailand (baht)"

         */
        List<WebElement> optionList = select.getOptions();
        String [] actualOptionListArr = new String[optionList.size()];


        for (int i = 0; i < optionList.size() ; i++) {
            actualOptionListArr[i] = optionList.get(i).getText();

        }
        Arrays.sort(actualOptionListArr);


        String expectedList = "\"Select One\",\"Australia (dollar)\",\"Canada (dollar)\",\"Switzerland (franc)\",\"China (yuan)\",\"Denmark (krone)\",\"Eurozone (euro)\",\"Great Britain (pound)\",\"Hong Kong (dollar)\",\"Japan (yen)\",\"Mexico (peso)\",\"Norway (krone)\",\"New Zealand (dollar)\",\"Sweden (krona)\",\"Singapore (dollar)\",\"Thailand (baht)\"";
        expectedList = expectedList.replaceAll("\"","");
        String [] expectedOptionListArr = expectedList.split(",");
        Arrays.sort(expectedOptionListArr);

        System.out.println(Arrays.toString(actualOptionListArr));
        System.out.println("************************");
        System.out.println(Arrays.toString(expectedOptionListArr));

        softAssert.assertEquals(actualOptionListArr,expectedOptionListArr, "listeler aynı değil");
        softAssert.assertAll();








    }
}
// 1. “http://zero.webappsecurity.com/” Adresine gidin
// 2. Sign in butonuna basin
// 3. Login kutusuna “username” yazin
// 4. Password kutusuna “password” yazin
// 5. Sign in tusuna basin
// 6. Online banking menusu icinde Pay Bills sayfasina gidin
// 7. “Purchase Foreign Currency” tusuna basin
// 8. “Currency” drop down menusunden Eurozone’u secin
// 9. soft assert kullanarak "Eurozone (Euro)" secildigini test edin
// 10. soft assert kullanarak DropDown listesinin su secenekleri oldugunu test edin
        /*
            "Select One", "Australia (dollar)", "Canada (dollar)","Switzerland (franc)","China (yuan)",
            "Denmark (krone)","Eurozone (euro)","Great Britain (pound)","Hong Kong (dollar)","Japan (yen)",
            "Mexico (peso)","Norway (krone)","New Zealand (dollar)","Sweden (krona)","Singapore (dollar)",
            "Thailand (baht)"

         */
