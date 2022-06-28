package tests.ElifHocaPractice_TestNG.day04;

import org.testng.annotations.Test;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseReport;

public class P7_WebTableTest extends TestBaseReport {
    @Test
    public void test01() {
        //go to url : https://en.wikipedia.org/wiki/Dell
        Driver.getDriver().get("https://en.wikipedia.org/wiki/Dell");
        ReusableMethods.waitFor(2);
        //   go to table which name is 'List of companies acquired by Dell Inc.'

        //   print row 4 of the table on console
        //   also print on console the 2nd and 3rd elements (middle 2 elements) in line 5
        //   ( 2nd and 3rd elements : November 2, Cloud integration leader)
        //     Verify that Compellent appears in the first cell of line 6
        //
        //   url'ye gidin: https://en.wikipedia.org/wiki/Dell
        //    'List of companies acquired by Dell Inc.' isimli tabloya gidin,
        //    tablonun 4. satırını konsolda yazdırın
        //    ayrıca 5. satırdaki 2. ve 3. öğeleri (ortadaki 2 öğe) konsola yazdırın
        //    ( 2nd and 3rd ogeler : November 2, Cloud integration leader)
        //    6. satirin ilk hucresinde Compellent yazisinin goruntulendigini dogrulayin

    }
}
 /*
   go to url : https://en.wikipedia.org/wiki/Dell
   go to table which name is 'List of companies acquired by Dell Inc.'
   print row 4 of the table on console
   also print on console the 2nd and 3rd elements (middle 2 elements) in line 5
   ( 2nd and 3rd elements : November 2, Cloud integration leader)
     Verify that Compellent appears in the first cell of line 6

   url'ye gidin: https://en.wikipedia.org/wiki/Dell
    'List of companies acquired by Dell Inc.' isimli tabloya gidin,
    tablonun 4. satırını konsolda yazdırın
    ayrıca 5. satırdaki 2. ve 3. öğeleri (ortadaki 2 öğe) konsola yazdırın
    ( 2nd and 3rd ogeler : November 2, Cloud integration leader)
    6. satirin ilk hucresinde Compellent yazisinin goruntulendigini dogrulayin

    */
