package tests.canHocaTASKS;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.ReactShoppingPage;
import utilities.ConfigReader;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class May29 {


    @Test
    public void test01() throws InterruptedException {
        // 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("reactUrl"));
        // 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
// (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
        ReactShoppingPage reactShopping = new ReactShoppingPage();
        List<WebElement> allList = reactShopping.allElements;
        System.out.println("Sitede " + allList.size() + " urun var");
        for (int i = 0; i <allList.size() ; i++) {
            System.out.println((i+1) + ".urun: " +  allList.get(i).getText());
        }



// 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
        List<String> allProductsList = new ArrayList<>();
        for (WebElement e:allList
             ) {
            allProductsList.add(e.getText());
        }

// 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
// (Her ürün 1 defadan fazla eklenemez!)


        List<Integer> selectedIndexList = new ArrayList<>();
        double totalPrice = 0;

      for (int i = 0 ; i<5; i++){
          Faker faker = new Faker();
          int randomIndex = faker.random().nextInt(allList.size());
          if (!selectedIndexList.contains(randomIndex)){
              selectedIndexList.add(randomIndex);
              reactShopping.allAddToCartButtonsList.get(randomIndex).click(); // 5 oge sectik ve sepete ekledik
              Thread.sleep(1000);
              totalPrice+= Double.parseDouble(reactShopping.pricesOfPages.get(randomIndex).getText().substring(1));
              System.out.println(totalPrice);
              reactShopping.quitFromAddToCartListButton.click();//burada x buttonuna click yapacagiz
              Thread.sleep(1000);
          } else {
              i--; //
          }
        }//FOR
        reactShopping.openCartButton.click(); //sepettekiler listesinin yazdirilabilmesi icin 'acilir pencere' acik hale getirildi

        System.out.println("List of Cart: ");

        for (int i = 0; i <reactShopping.listOfCart.size() ; i++) {
            System.out.println( (i+1) + ": " + reactShopping.listOfCart.get(i).getText());
        };


// 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın




// 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
// 7.Checkout'a tıklayın
    }//TEST


}
// 1."https://react-shopping-cart-67954.firebaseapp.com/" adresine gidin
// 2.Web sitesindeki tüm öğeleri listeleyin ve yazdirin
// (sitede 16 urun var, 1.urun : 2.urun :.....seklinde yazdirin )
// 3.Stringlerden olusan bir ArrayList oluşturun ve Ürün Adlarını ArrayList'e yerleştirin
// 4.Siteden Rastgele 5 öğe seçin, sepete ekleyin ve sectiginiz öğelerin adlarını yazdırın
// (Her ürün 1 defadan fazla eklenemez!)
// 5.Her bir öğenin fiyatını toplayın ve sonucunuzu web sitesiyle karşılaştırın
// 6.Sonuçlar eşleşiyorsa  konsola test pass yazirin
// 7.Checkout'a tıklayın
