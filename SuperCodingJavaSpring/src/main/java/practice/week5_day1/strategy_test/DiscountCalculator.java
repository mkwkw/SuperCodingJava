package practice.week5_day1.strategy_test;

public class DiscountCalculator {
    private DiscountStrategy discountStrategy;

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    //인터페이스의 메소드 이름과 같게 작성
    public double calculateDiscount(double amount) {
        if (discountStrategy != null) {
            return discountStrategy.calculateDiscount(amount);
        }
        else {
            return 0; // 할인 없음
        }
    }
}
