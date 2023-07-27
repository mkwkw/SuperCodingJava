package practice.week5_day1.decorator_test;

public class Cream extends BeverageDecorator{
    public Cream(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" plus cream";
    }

    @Override
    public double cost() {
        return super.cost()+0.6;
    }
}
