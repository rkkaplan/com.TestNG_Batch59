package tests.canHocaTASKS;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TutorialsNinjaPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class June05_TutorialsNinja {
    @Test
    public void test01() {
        TutorialsNinjaPage tutorialsNinjaPage = new TutorialsNinjaPage();

        //   ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
        Driver.getDriver().get(ConfigReader.getProperty("tutorialsNinjaUrl"));
        ReusableMethods.waitFor(1);

        //    ~ click on Phones & PDAs
        tutorialsNinjaPage.phonesPDAsButton.click();
        ReusableMethods.waitFor(1);

        //    ~ get the brandName of phones
        List<String > brandNamesListDisplayed = new ArrayList<>();

        for (WebElement e: tutorialsNinjaPage.brandNamesOfPhones
             ) {
            brandNamesListDisplayed.add(e.getText());
        }
        System.out.println("Brandnames of Phones: " + brandNamesListDisplayed);

        //    ~ click on 'add to cart' button for all elements
        for (WebElement e : tutorialsNinjaPage.addToCartButtons
             ) {
            e.click();
            ReusableMethods.waitFor(2);
        }

        //    ~ click on black total added cart button
        tutorialsNinjaPage.blackButtonCartTotal.click();

        //    ~ get the names of list from the cart
        List<String> brandNamesOfCartList = new ArrayList<>();
        for (WebElement e: tutorialsNinjaPage.listOfCarts
             ) {
            brandNamesOfCartList.add(e.getText());
        }
        System.out.println("brandNamesOfCartList = " + brandNamesOfCartList);

        //    ~ compare the names from displaying list and cart list
        Collections.sort(brandNamesListDisplayed);
        Collections.sort(brandNamesOfCartList);
        Assert.assertEquals(brandNamesListDisplayed,brandNamesOfCartList,"the products of the two lists are not the same");
    }
}
/*
    ~ Navigate to http://tutorialsninja.com/demo/index.php?route=common/home
    ~ click on Phones & PDAs
    ~ get the brandName of phones
    ~ click on add to button for all elements
    ~ click on black total added cart button
    ~ get the names of list from the cart
    ~ compare the names from displaying list and cart list
*/