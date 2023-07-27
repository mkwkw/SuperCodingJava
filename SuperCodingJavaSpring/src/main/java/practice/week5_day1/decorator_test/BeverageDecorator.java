package practice.week5_day1.decorator_test;

public abstract class BeverageDecorator implements Beverage{
    //어쨌든 음료의 정보를 리턴하는 방향으로 작성
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage) {this.beverage = beverage;}

    @Override
    public String getDescription() {
        return beverage.getDescription();
    }

    @Override
    public double cost() {
        return beverage.cost();
    }
}
