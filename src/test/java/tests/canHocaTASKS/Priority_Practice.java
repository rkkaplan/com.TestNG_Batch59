package tests.canHocaTASKS;

import org.testng.annotations.Test;

public class Priority_Practice {
    @Test (dependsOnMethods = "C")
    public void A() {
        System.out.println("A");

    }

    @Test
    public void B() {
        System.out.println("B");
    }

    @Test
    public void C() {
        System.out.println("C");
    }

    @Test
    public void D() {
        System.out.println("D");
    }
}
