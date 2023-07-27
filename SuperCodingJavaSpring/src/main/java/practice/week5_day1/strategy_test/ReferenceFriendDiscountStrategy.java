package practice.week5_day1.strategy_test;

public class ReferenceFriendDiscountStrategy implements DiscountStrategy{

    @Override
    public double calculateDiscount(double amount) {
        return amount * 0.15;
    }
}
