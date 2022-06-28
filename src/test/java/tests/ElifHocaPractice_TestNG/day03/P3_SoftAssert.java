package tests.ElifHocaPractice_TestNG.day03;

import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.SauceDemoPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Collections;

public class P3_SoftAssert {
    //* Navigate to  https://www.saucedemo.com/
    @Test
    public  void  sauceDemoSoftAssert() throws InterruptedException {
        Driver.getDriver().get("https://www.saucedemo.com/");
        // * Enter the user name  as standard_user
        SauceDemoPage saucedemo = new SauceDemoPage();
        saucedemo.usernameInput.sendKeys("standard_user");
        // * Enter the password as   secret_sauce
        saucedemo.passwordInput.sendKeys("secret_sauce");
        // * Click on login button
        saucedemo.loginButton.click();
        // *     T1 : Choose price low to high with soft Assert
        Select select = new Select(saucedemo.productSortDDM);
        Thread.sleep(3000);
        select.selectByVisibleText("Price (low to high)");
        Thread.sleep(2000);

        String expectedExpression = "Price (low to high)";
        String actualExpression = select.getFirstSelectedOption().getText();
        //String actualExpression2 = Driver.getDriver().findElement(By.className("active_option")).getText();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualExpression,expectedExpression);
        //softAssert.assertEquals(actualExpression2,expectedExpression);
        softAssert.assertAll();

    }

    @Test
    public void sauceDemoHardAssert() throws InterruptedException {
        //T2 : Verify item prices are sorted from low to high with hard Assert

        Driver.getDriver().get("https://www.saucedemo.com/");
        SauceDemoPage saucedemo = new SauceDemoPage();
        saucedemo.usernameInput.sendKeys("standard_user");
        saucedemo.passwordInput.sendKeys("secret_sauce");
        saucedemo.loginButton.click();

        Select select = new Select(saucedemo.productSortDDM);
        Thread.sleep(3000);
        select.selectByVisibleText("Price (low to high)");
        Thread.sleep(2000);

        ArrayList<Double> pricesDouble = new ArrayList<>();
        for (WebElement each: saucedemo.pricesofProducts){
            //String fiyatStr = each.getText().replaceAll("$", "");
            String priceStr = each.getText().replaceAll("^\\D", "");
            pricesDouble.add(Double.parseDouble(priceStr));
        }

        ArrayList<Double> checkList = new ArrayList<>(pricesDouble);
        Collections.sort(checkList);
        Assert.assertEquals(checkList,pricesDouble);




    }
}
/*
 * Navigate to  https://www.saucedemo.com/
 * Enter the user name  as standard_user
 * Enter the password as   secret_sauce
 * Click on login button
 *     T1 : Choose price low to high with soft Assert
 *     T2 : Verify item prices are sorted from low to high with hard Assert
 */
