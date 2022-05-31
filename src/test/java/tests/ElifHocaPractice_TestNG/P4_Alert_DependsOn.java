package tests.ElifHocaPractice_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UniversityPage;
import utilities.Driver;

public class P4_Alert_DependsOn {
    UniversityPage university = new UniversityPage();


    @Test
    public void test01() {
        // // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin

        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");
//     // 2. CLICK ME of JavaScript Alert e tıklayın
        university.jsAlert.click();

//     // 3. pop up text i alın
        Driver.getDriver().switchTo().alert().getText();
//     // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
        String actualTextAlert = Driver.getDriver().switchTo().alert().getText();
        String expectedTextAlert = "I am an alert box!";
        Assert.assertEquals(actualTextAlert,expectedTextAlert);

//     // 5. pop up i kabul edin
        Driver.getDriver().switchTo().alert().accept();

//     // Yine ayni classda baska test methodu olusturun


    }
    @Test (dependsOnMethods = "test01")
    public void test02() {
        //     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/Popup-Alerts/index.html");
//     // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
        university.confirmAlert.click();

//     // 3.  pop up text i alın
        Driver.getDriver().switchTo().alert().getText();
// 4. Mesajın "Press a button!" olduğunu doğrulayın
        String actualTextAlert2 = Driver.getDriver().switchTo().alert().getText();
        String expectedTextAlert2 = "Press a button!";
        Assert.assertEquals(actualTextAlert2,expectedTextAlert2);
// 5. Açılır pencereyi kapat

// 6. pop up i iptal edin,
        Driver.getDriver().switchTo().alert().dismiss();

// 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
        Assert.assertTrue(university.confirmAlertText.isDisplayed());

// 8. alert1'e göre dependsOnMethods kullanın

        Driver.closeDriver();
    }
}
/*
     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     // 2. CLICK ME of JavaScript Alert e tıklayın
     // 3. pop up text i alın
     // 4. Mesajın "I am an alert box!"  olduğunu doğrulayın.
     // 5. pop up i kabul edin

     // Yine ayni class da baska test methodu olusturun
     // 1. "http://webdriveruniversity.com/Popup-Alerts/index.html" adresine gidin
     // 2.  CLICK ME of JavaScript Confirm Box i  TIKLAYIN
     // 3.  pop up text i alın
     // 4. Mesajın "Press a button!" olduğunu doğrulayın
     // 5. Açılır pencereyi kapat
     // 6. pop up i iptal edin,
     // 7. "You pressed Cancel!" yazisinin goruntulendigini dogrulayin
     // 8. alert1'e göre dependsOnMethods kullanın
 */



