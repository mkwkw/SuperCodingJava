package practice.week5_day1.decorator_test;

public class Sugar extends BeverageDecorator{
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" plus sugar";
    }

    @Override
    public double cost() {
        return super.cost()+0.3;
    }
}
