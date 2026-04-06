package ch04.Sample.license;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100;
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String holder) {
        String expiryDate = calcExpiryDate(baseDate, 5);
        return new LicenseCard(holder, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }

    private String calcExpiryDate(String issuedDate, int years) {
        String[] parts = issuedDate.split("-");
        int year = Integer.parseInt(parts[0]) + years;
        return year + "-" + parts[1] + "-" + parts[2];
    }
}