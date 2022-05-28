package tests.day17_pom;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.SahibindenPage;
import utilities.Driver;

import java.util.List;
import java.util.WeakHashMap;

public class Practise {
    @Test
    public void test01() throws InterruptedException {
        SahibindenPage sahibindenPage = new SahibindenPage();
        Driver.getDriver().get("https://www.sahibinden.com");
        sahibindenPage.cookiesButtonElement.click();
        sahibindenPage.automobil.click();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        WebElement honda = sahibindenPage.honda;
        WebElement volvo = sahibindenPage.volvo;


        jse.executeScript("arguments[0].scrollIntoView(true);", volvo);

        System.out.println(sahibindenPage.carCategory.getText());
        //jse.executeScript("arguments[0].click();",honda);






       // String expectedWord = "Honda";
       // Assert.assertTrue(carCategoryList.contains(expectedWord), "doesn't contain");



        sahibindenPage.honda.click();


    }
}
