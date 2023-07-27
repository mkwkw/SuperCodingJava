package practice.week5_day1.decorator_test;

public class Milk extends BeverageDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" plus Milk";
    }

    @Override
    public double cost() {
        return super.cost()+0.5;
    }
}
