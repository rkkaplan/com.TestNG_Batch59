package tests.ElifHocaPractice_TestNG.day03;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.CapitalOfCountriesPage;
import utilities.Driver;

public class P5_DragAndDrop {
    @Test
    public void test01() throws InterruptedException {
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        // Fill in capitals by country.

        CapitalOfCountriesPage coc = new CapitalOfCountriesPage();
        Actions actions = new Actions(Driver.getDriver());

        actions.dragAndDrop(coc.romeButton, coc.italyButton).perform();
        Thread.sleep(2000);

        actions.dragAndDrop(coc.madridButton, coc.spainButton).perform();
        Thread.sleep(2000);

        actions.dragAndDrop(coc.osloButton, coc.norwayButton).perform();
        Thread.sleep(2000);

        actions.dragAndDrop(coc.stockholmButton, coc.swedenButton).perform();
        Thread.sleep(2000);

        actions.dragAndDrop(coc.washingtonButton, coc.usaButton).perform();
        Thread.sleep(2000);

        actions.dragAndDrop(coc.copenhagenButton, coc.denmarkButton).perform();
        Thread.sleep(2000);

        actions.dragAndDrop(coc.seoulButton, coc.southKoreaButton).perform();
        Thread.sleep(2000);

        Driver.closeDriver();
    }
}
/*
// Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.
 */
