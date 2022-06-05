package tests.groupTASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

public class GenelTekrar285 {
    @Test
    public void test01() {
        //1."http://webdriveruniversity.com/" adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/");
        String firstPageWindowHandle = Driver.getDriver().getWindowHandle();
        ReusableMethods.waitFor(2);
//2."Login Portal" a kadar asagi inin
        WebElement loginPortal = Driver.getDriver().findElement(By.xpath("//a[@id='login-portal']"));
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
        jse.executeScript("arguments[0].scrollIntoView(true);",loginPortal);
//3."Login Portal" a tiklayin
        loginPortal.click();
//4.Diger window'a gecin

        ReusableMethods.switchToWindow("WebDriver | Login Portal");
//5."username" ve "password" kutularina deger yazdirin
        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Username']"));
        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@placeholder='Password']"));
        WebElement loginButton = Driver.getDriver().findElement(By.xpath("//button[@id='login-button']"));
        username.sendKeys("username");
        password.sendKeys("password");


//6."login" butonuna basin
        loginButton.click();
//7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
        String expectedWord = "validation failed";
        String actualWord = Driver.getDriver().switchTo().alert().getText();
        Assert.assertEquals(actualWord,expectedWord);
//8.Ok diyerek Popup'i kapatin
        Driver.getDriver().switchTo().alert().accept();
//9.Ilk sayfaya geri donun
        Driver.getDriver().switchTo().window(firstPageWindowHandle);
//10.Ilk sayfaya donuldugunu test edin
        String firstPageWindowhandle2 = Driver.getDriver().getWindowHandle();
        Assert.assertEquals(firstPageWindowhandle2,firstPageWindowHandle);


    }
}
//1."http://webdriveruniversity.com/" adresine gidin
//2."Login Portal" a kadar asagi inin
//3."Login Portal" a tiklayin
//4.Diger window'a gecin
//5."username" ve "password" kutularina deger yazdirin
//6."login" butonuna basin
//7.Popup'ta cikan yazinin "validation failed" oldugunu test edin
//8.Ok diyerek Popup'i kapatin
//9.Ilk sayfaya geri donun
//10.Ilk sayfaya donuldugunu test edin
