package practice.week5_day1.strategy_test;

public class StrategyTest {
    public static void main(String[] args) {

        DiscountCalculator calculator = new DiscountCalculator();

        //전략에 따라 setDiscountStrategy로 calculator에 각각 전략 할당

        // 신규 가입자 할인
        calculator.setDiscountStrategy(new NewCustomerDiscountStrategy());
        double discount1 = calculator.calculateDiscount(10000);

        System.out.println("신규 가입자 할인 금액: " + discount1);
        // .... 어떤 상황 벌어지고

        //
        calculator.setDiscountStrategy(new SeasonDiscountStrategy());
        double discount2 = calculator.calculateDiscount(10000);

        System.out.println("시즌 할인 가입자 할인 금액: " + discount2);

        // .. 어떤 상황
        calculator.setDiscountStrategy(new ReferenceFriendDiscountStrategy());
        double discount3 = calculator.calculateDiscount(10000);

        System.out.println("친구 할인 가입자 할인 금액: " + discount3);
    }
}
