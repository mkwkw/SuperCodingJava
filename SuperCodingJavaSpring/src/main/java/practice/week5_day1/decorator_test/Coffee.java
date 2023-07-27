package practice.week5_day1.decorator_test;

public class Coffee implements Beverage{

    @Override
    public String getDescription() {
        return "Coffee";
    }

    @Override
    public double cost() {
        return 4.0;
    }
}
