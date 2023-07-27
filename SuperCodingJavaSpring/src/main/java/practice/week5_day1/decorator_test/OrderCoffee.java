package practice.week5_day1.decorator_test;

public class OrderCoffee {
    public static void main(String[] args) {

        Beverage coffee = new Coffee();
        System.out.println(coffee.getDescription()+ ": $"+ coffee.cost());

        //Milk 추가
        Beverage coffeeWithMilk = new Milk(coffee);
        System.out.println(coffeeWithMilk.getDescription()+ ": $"+coffeeWithMilk.cost());

        //Sugar 추가
        Beverage coffeeWithMilkAndSugar = new Sugar(coffeeWithMilk);
        System.out.println(coffeeWithMilkAndSugar.getDescription()+": $"+coffeeWithMilkAndSugar.cost());

        //Cream 추가
        Beverage coffeeWithMilkAndSugarAndCream = new Cream(coffeeWithMilkAndSugar);
        System.out.println(coffeeWithMilkAndSugarAndCream.getDescription()+": $"+coffeeWithMilkAndSugarAndCream.cost());

        //생성자&생성자자
       Beverage coffeeWithCreamWithMilk = new Milk(new Cream(new Coffee()));
        System.out.println(coffeeWithCreamWithMilk.getDescription()+": $"+coffeeWithCreamWithMilk.cost());

    }
}
