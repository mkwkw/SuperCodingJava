package practice.week5_day1.strategy_test;

public class SeasonDiscountStrategy implements DiscountStrategy {
    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.1;
    }
}
