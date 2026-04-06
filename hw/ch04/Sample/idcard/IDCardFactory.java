package ch04.Sample.idcard;

import ch04.Sample.framework.Factory;
import ch04.Sample.framework.Product;

public class IDCardFactory extends Factory {
    private int serialCounter = 1;
    private String baseDate;

    public IDCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serialCounter++, baseDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}