package tests.day17_pom;

import org.testng.annotations.Test;
import utilities.Driver;

public class C01_YeniDriverIlkClass {
    @Test
    public void test01() {
        Driver.getDriver().get("https://www.amazon.com");
        /*
        bugune kadar TestBase class'ina extend ederek kullandigimiz driver yerine bundan sonra
        Driver class'indan kullanacagimiz getDriver static methodunu kullanaccagiz .
         Driver.getDriver()       in
         driver                   out
         */

        Driver.closeDriver();
        Driver.getDriver().get("https://www.bestbuy.com");
        Driver.getDriver().get("https://www.facebook.com");

        Driver.closeDriver();
    }
}
