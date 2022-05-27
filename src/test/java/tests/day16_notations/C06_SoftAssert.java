package day16_notations;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C06_SoftAssert extends TestBase {
    @Test
    public void test01() {
        /*
Soft Assertion baslangic ve bitis satirlari arasindaki tum assertionlari yapip
bitis satirina geldiginde bize buldugu tum hatalari rapor eder

 */
// SoftAssert"un baslangici obje olusturmadir
        SoftAssert softAssert = new SoftAssert();

        //1- amazon anasayfaya git
        driver.get("https://www.amazon.com");
        //2- title'in amazon icerdigini test edin
        String expectedTitle = "amazon";
        String actualTitle = driver.getTitle();
        softAssert.assertTrue(actualTitle.contains(expectedTitle), "title amazon icermiyor");
        //3- arama kutusunun erisilebilir oldugunu test edin
        WebElement aramaKutusu = driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(aramaKutusu.isEnabled(), "arama kutusuna erisilemiyor");
        //4- arama Kutusuna nutella yazip aratin
        aramaKutusu.sendKeys("Nutella" + Keys.ENTER);
        //5- arama yapildigini test edin
        WebElement sonucYaziElementi = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(sonucYaziElementi.isDisplayed(),"arama yapilamadi");
        //6- arama sonucunun nutella icerdigini test edin
        softAssert.assertTrue(sonucYaziElementi.getText().contains("Kutella"), "sonuc yazisi kutella icermiyor");

        //softAssert e bitis satirini soylemek icin assertAll() kullanilir
        //verification denirse------- softassert objesi-------denmezse Assert

        softAssert.assertAll();

        /*
Softassert un hata bulsa bile calısmaya devam etme ozelligi asserall a kadardır.
eger assertAll da failed rapor edilirse calısma durur ve claassın kalan kısmı calıstırılmaz
Yani assertAll HardAssert deki herbir assert gibidir.
Hatayi yakalarsa calısma durur.
 */

    }
}
