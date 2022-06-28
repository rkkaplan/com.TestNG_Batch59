package tests.canHocaTASKS;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.internal.ConfigurationGroupMethods;
import pages.InstagramPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseReport;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class instagramTest_VasifAmrahov extends TestBaseReport {

    @DataProvider
    public static Object[][] validEmailPassword() {
        Object[][] emailPassword = {{"testngkontrol1@hotmail.com", "studentsession1"},
                {"batchselenium@hotmail.com", "studentsession2"}};

        return emailPassword;
    }

    @Test (dataProvider = "validEmailPassword")
    public void testInsta(String validEmail, String validPassword) throws IOException, InterruptedException{
        InstagramPage instagram = new InstagramPage();
        extentTest =
                extentReports.
                        createTest("Positive Login Test", "Valid Email ve Password ile giris yapilabilmeli");

        //instagram anasayfasina giris yap
        Driver.getDriver().get(ConfigReader.getProperty("instagramUrl"));
        extentTest.info("Instagram anasayfaya gidildi");

        //dogru username ve dogru password bilgileri gir
        instagram.usernameInput.sendKeys(ConfigReader.getProperty("instagramValidEmail"));
        extentTest.info("Valid Email girildi");
        instagram.passwordInput.sendKeys(ConfigReader.getProperty("instagramValidPassword"));
        extentTest.info("Valid Password girildi");

        //eger login butonu tiklanilabilir olursa tikla
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(instagram.girisYapButton));
        instagram.girisYapButton.click();
        extentTest.info("login butonu tiklanabilir oldugunda tiklandi");

        //"Save Your Login Info?" yazisinda "Not Now" butonuna tikla
        wait.until(ExpectedConditions.elementToBeClickable(instagram.simdiDegil));
        instagram.simdiDegil.click();
        extentTest.info("Giris Bilgilerin Kaydedilsin mi? yazisinda Simdi Degil'e tiklandi");

        //"Turn on Notifications" yazisinda "Not Now" butonuna tikla
        wait.until(ExpectedConditions.elementToBeClickable(instagram.simdiDegil));
        instagram.simdiDegil.click();
        extentTest.info("Bildirimleri Ac yazisinda Simdi Degil'e tiklandi");

        //giris yapildigini fotografli sekilde dogrula ve rapor belirt
        instagram.profileDDM.click();
        extentTest.info("Profil Dropdow Menusu acildi");
        instagram.profileOption.click();
        extentTest.info("DropDown menusunde Profil secenegi tiklandi");

        String date = LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyyHHmmss"));
        TakesScreenshot ts = (TakesScreenshot) Driver.getDriver();
        File asilResim = new File("target/instagram/screenshot" + date+ ".jpeg");
        File geciciResim = ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(geciciResim, asilResim );
        extentTest.info("Giris yapildigini dogrulayan fotograf instagram dosyasina eklendi");



        //sayfayi kapat

    }
}

//instagram anasayfasina giris yap
//dogru username ve dogru password bilgileri gir
//eger login butonu tiklanilabilir olursa tikla
//"Save Your Login Info?" yazisinda "Not Now" butonuna tikla
//"Turn on Notifications" yazisinda "Not Now" butonuna tikla
//giris yapildigini fotografli sekilde dogrula ve rapor belirt
//sayfayi kapat
