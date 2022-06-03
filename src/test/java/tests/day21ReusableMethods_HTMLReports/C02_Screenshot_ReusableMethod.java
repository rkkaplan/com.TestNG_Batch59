package tests.day21ReusableMethods_HTMLReports;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import javax.swing.*;
import java.io.IOException;

public class C02_Screenshot_ReusableMethod {
    @Test
    public void test01() throws IOException {
        //amazon'a gidelim ve fotografini cekelim
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        ReusableMethods.getScreenshot("amazon");
    }
}
