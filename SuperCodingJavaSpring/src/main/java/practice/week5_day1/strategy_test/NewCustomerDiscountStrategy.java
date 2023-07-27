package practice.week5_day1.strategy_test;

public class NewCustomerDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.2; // 20% 할인
    }
}
