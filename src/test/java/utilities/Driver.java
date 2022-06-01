package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;

public class Driver {
    /*
    pom'da Driver icin TestBase Classina extend etmek yerine driver classindan
    static methodlar kullanarak driver olusturup, ilgili ayarlarin yapilmasi  ve en sonda
    driver'in kapatilmasi tercih edilmistir

    POM'de Driver Class'indaki getDriver() 'nin obje olusturularak kullanilmasini engellemek icin
    Singleton Pattern kullanimi benimsenmistir.


    Singleton Pattern: tekli kullanim, bir classin farkli classlardan  obje olusturularak kullanimini
    engellemek icin kullanilir

    Bunu saglamak icin yapmamiz gereken sey oldukca basittir
    Obje olusturmak icin kullanilan constructor i private yaptigimiz zaman baska class'lardan
    driver classindan obje olusturulmasi mumkun olamaz




     */

    private Driver(){

    }

    static WebDriver driver;

    public static WebDriver getDriver(){
        if (driver==null){
            switch (ConfigReader.getProperty("browser")){

                case "safari" :
                    WebDriverManager.safaridriver().setup();
                    driver=new SafariDriver();
                    break;
                case "firefox" :
                    WebDriverManager.firefoxdriver().setup();
                    driver=new FirefoxDriver();
                    break;
                case "edge" :
                    WebDriverManager.edgedriver().setup();
                    driver=new EdgeDriver();
                    break;
                case "internetExplorer" :
                    WebDriverManager.iedriver().setup();
                    driver=new InternetExplorerDriver();
                    break;
                case "headless-chrome" :
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver=new ChromeDriver();



            }


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
