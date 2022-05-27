package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Driver {
    /*
    pom'da Driver icin TestBase Classina extend etmek yerine driver classindan
    static methodlar kullanarak driver olusturup, ilgili ayarlarin yapilmasi  ve en sonda
    driver2in kapatilmasi tercih edilmistir
     */

    static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){

            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        }



        return driver;
    }

    public static void closeDriver(){
        if (driver!=null){

            driver.close();  // -----> "driver'a bir deger atanmissa"    demektir
            driver=null;
        }


    }
}
