package tests.day21ReusableMethods_HTMLReports;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;

import java.util.Set;

public class C01_WindowHandleReusableMethod {
    @Test
    public void test01() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        String firstPageWindowHandle = Driver.getDriver().getWindowHandle();
        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        Set<String> windowHandleSet = Driver.getDriver().getWindowHandles();
        String secondPageWindowHandle = "";
        for (String e: windowHandleSet
             ) {
            if (!e.equals(firstPageWindowHandle)){
                secondPageWindowHandle = e;
            }
        }
        Driver.getDriver().switchTo().window(secondPageWindowHandle);
        System.out.println(Driver.getDriver().getTitle());
        //acilan yeni TAB'in title'inin "New Window" oldugunu test edin
        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);

    }//test01

    @Test
    public void test02() {
        //● https://the-internet.herokuapp.com/windows adresine gidin.
        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");
        //● Click Here butonuna basın.
        Driver.getDriver().findElement(By.linkText("Click Here")).click();
        //acilan yeni TAB'in title'inin "New Window" oldugunu test edin
        ReusableMethods.switchToWindow("New Window");
        String expectedTitle = "New Window";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
        Driver.closeDriver();

    }
}
