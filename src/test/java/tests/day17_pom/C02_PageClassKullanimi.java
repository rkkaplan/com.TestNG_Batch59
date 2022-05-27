package tests.day17_pom;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageClassKullanimi {
    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();

        // 1- amazon'a gidelim
        Driver.getDriver().get("https://www.amazon.com");

        // 2- nutella aratalim
        amazonPage.searchBoxElement.sendKeys("Nutella" + Keys.ENTER);


        // 3- sonuc yazisinin Nutella icerdigini test edelim
        String actualResult =amazonPage.searchResultsElement.getText();
        String expectedWord = "Nutella";

        Assert.assertTrue(actualResult.contains(expectedWord));

        Driver.closeDriver();
    }
}
