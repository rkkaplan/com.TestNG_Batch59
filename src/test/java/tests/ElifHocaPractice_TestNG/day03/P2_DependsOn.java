package tests.ElifHocaPractice_TestNG.day03;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class P2_DependsOn {
    // birbirine bagimli testler olusturun..
    //    .beforClass olusturup setUp ayarlarini yapin..
    //      birbirine bagimli testler olusturarak;
    //          ilk once facebook a gidin
    @Test
    public void facebookTest(){
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        System.out.println("facebook");
    }


    //          sonra facebook a bagimli olarak google a gidin,

    @Test (dependsOnMethods = "facebookTest")
    public void googleTest() {
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));
        System.out.println("google");
    }

    //          daha sonra google a bagimli olarak amazon a gidin

    @Test (dependsOnMethods = "googleTest")
    public void amazonTest() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        System.out.println("amazon");
    Driver.closeDriver();
    }


    //    driver i kapatin



}
/*
    birbirine bagimli testler olusturun..
    .beforClass olusturup setUp ayarlarini yapin..
      birbirine bagimli testler olusturarak;
          ilk once facebook a gidin
          sonra facebook a bagimli olarak google a gidin,
          daha sonra google a bagimli olarak amazon a gidin
    driver i kapatin

 */
