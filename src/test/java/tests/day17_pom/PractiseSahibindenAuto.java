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

import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

public class PractiseSahibindenAuto {
    @Test
    public void test01() throws InterruptedException {
        SahibindenPage sahibindenPage = new SahibindenPage();
        Driver.getDriver().get("https://www.sahibinden.com");
        Thread.sleep(2000);
        sahibindenPage.cookiesButtonElement.click();
        Thread.sleep(2000);
        sahibindenPage.automobil.click();
        Thread.sleep(4000);

        List<String> carCategories =new ArrayList<>();

        /*
        @FindBy (xpath ="//ul[@class='categoryList jspScrollable']//h2")
        public List<WebElement> carCategory;
         */

        for (WebElement each: sahibindenPage.carCategory
             ) {
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].scrollIntoView(true);",each);
            System.out.println(each.getText());
            carCategories.add(each.getText());
        }
        System.out.println(carCategories.size());

        String expectedWord = "Honda";
        Assert.assertTrue(carCategories.contains(expectedWord), "doesn't contain");




    }
}
