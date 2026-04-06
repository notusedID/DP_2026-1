package ch04.Sample;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;
import ch04.Sample.idcard.IDCardFactory;
import ch04.Sample.license.LicenseCardFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== [3-1] IDCard 테스트 ===");
        Factory factory1 = new IDCardFactory("2026-01-15");
        Product card1 = factory1.create("Kim Youngjin");
        Product card2 = factory1.create("Son Heungmin");
        card1.use();
        card2.use();

        System.out.println();

        System.out.println("=== [3-2] LicenseCard 테스트 ===");
        Factory factory2 = new LicenseCardFactory("2026-03-20");
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use();
        license2.use();
    }
}