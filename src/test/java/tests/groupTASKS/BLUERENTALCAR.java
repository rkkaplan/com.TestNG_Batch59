package tests.groupTASKS;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import pages.BRC_Page;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.time.Duration;
import java.util.*;

public class BLUERENTALCAR {
    BRC_Page brcPage = new BRC_Page();

    @Test
    public void test01() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("brcUrl"));

        Set<String> carBrands = new LinkedHashSet<>();
        while (true) {
            for (WebElement e : brcPage.carBrandsList
            ) {
                carBrands.add(e.getText());
            }
            if (brcPage.buttonDownVehicles.isEnabled()) {
                clickDown();
            } else {
                Driver.getDriver().navigate().refresh();
                break;
            }
        }
        System.out.println("carBrands = " + carBrands);
        System.out.println("carBrands.size() = " + carBrands.size());//14
        int index = new Random().nextInt(carBrands.size());
        String selectedCarName = new ArrayList(carBrands).get(index).toString().trim(); // for example: Kia Rio
        System.out.println(index);
        System.out.println(selectedCarName);
        ReusableMethods.waitFor(2);

        while (true) {
            List<WebElement> selectedCarList = Driver.getDriver().findElements(By.xpath("//li[text()='" + selectedCarName + "']"));
            if (selectedCarList.size() > 0) {

//                JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
//                jse.executeScript("arguments[0].click();", selectedCarList.get(0));
                ReusableMethods.clickWithJS(selectedCarList.get(0));

                System.out.println("clicked in if");
                break;
            } else {
                while (Driver.getDriver().findElements(By.xpath("//li[text()='" + selectedCarName + "']")).size() == 0) {
                    clickDown();
                    ReusableMethods.waitFor(1);
                    if (Driver.getDriver().findElements(By.xpath("//li[text()='" + selectedCarName + "']")).size() > 0) {
//                        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
//                        jse.executeScript("arguments[0].click();", selectedCarList.get(0));
                        ReusableMethods.clickWithJS(Driver.getDriver().findElements(By.xpath("//li[text()='" + selectedCarName + "']")).get(0));
                        System.out.println("clicked in while loop");
                        break;
                    }
                }

            }

        }


    }//test

    public void clickDown() {

        try {
            brcPage.buttonDownVehicles.click();
        } catch (Exception e) {
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();", brcPage.buttonDownVehicles);
        }

    }

    public void clickUp() {
        try {
            brcPage.buttonUpVehicles.click();
        } catch (Exception e) {
            JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();
            jse.executeScript("arguments[0].click();", brcPage.buttonUpVehicles);
        }

    }
}//class

