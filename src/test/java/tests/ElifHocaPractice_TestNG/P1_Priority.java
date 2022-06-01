package tests.ElifHocaPractice_TestNG;

import org.testng.annotations.Test;

public class P1_Priority {

    // ●TestNG (default ) olarak @Test methodları ni alfabetik sıraya gore run eder ..(Yukardan asagi degil)
    // ●priority annotation Testlere öncelik vermek icin kullanilir, Kucuk olan Numara daha once calisir.
    // priority:  TestNG testlerinde, testler konsola alfabetik sira ile yazdirilir.
    // priority-> default sifirdir..

    // enabled = false  methodu : Testi gormezden gelmek icin @Test in yanina    '(enabled = false)' fonksiyonunu kullaniriz.


    @Test (priority = 3000)
    public void b() {
        System.out.println("b");
    }

    @Test  (priority=2001, enabled = false)
    public void a() {
        System.out.println("a");
    }

    @Test (priority = 2000)
    public void c() {
        System.out.println("c");
    }
}
/*
      ●TestNG (default ) olarak @Test methodları ni alfabetik sıraya gore run eder ..(Yukardan asagi degil)
      ●priority annotation Testlere öncelik vermek icin kullanilir, Kucuk olan Numara daha once calisir.
      priority:  TestNG testlerinde, testler konsola alfabetik sira ile yazdirilir.
      priority-> default sifirdir..

      enabled = false  methodu : Testi gormezden gelmek icin @Test in yanina    '(enabled = false)' fonksiyonunu kullaniriz.
     */
