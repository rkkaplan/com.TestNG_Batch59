package tests.day22_crossBrowser;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C03_DataProvider {
    @DataProvider
    public static Object[][] AranacakKelimeler() {
        Object [][] arananKelimeArrayi = {{"Nutella"},{"Java"},{"cigdem"},{"Netherlands"}};

        return arananKelimeArrayi;
    }

    @Test
    public void test01() {
        AmazonPage amazonPage = new AmazonPage();
        //amazona git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // nutella arat
        amazonPage.searchBoxElement.sendKeys("Nutella" + Keys.ENTER);
        // sonuclarin nutella icerdigini test et
        String expectedWord = "Nutella";
        String actualResultText = amazonPage.searchResultsElement.getText();
        Assert.assertTrue(actualResultText.contains(expectedWord));
        Driver.closeDriver();
    }

    @Test (dataProvider = "AranacakKelimeler")
    //arayacagimiz kelimeleri bir liste gibi tutup
    // bana yollayacak bir veri saglayicisi olusturacagiz
    public void dataProviderTest(String arananKelime) {
        AmazonPage amazonPage = new AmazonPage();
        //amazona git
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        // Nutella, Java, Cigdem ve Netherland icin arama yapalim
        amazonPage.searchBoxElement.sendKeys(arananKelime + Keys.ENTER);

        //sonuclarin aradigimiz kelime icerdigini test edelim
        String expectedWord = arananKelime;
        String actualResultText = amazonPage.searchResultsElement.getText();
        Assert.assertTrue(actualResultText.contains(expectedWord));


        //sayfayi kapatalim
        Driver.closeDriver();

    }

}
