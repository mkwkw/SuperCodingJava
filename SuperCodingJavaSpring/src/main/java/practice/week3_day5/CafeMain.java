package practice.week3_day5;

public class CafeMain {

    public static void main(String[] args) {

        //미리 초기화
        Customer customer = new Customer();
        customer.setCashAmount(50000);

        Cashier cashier = new Cashier();
        cashier.setSalesAmount(1000000);

        Barista barista = new Barista();

        //로직 시작
        String coffeeName = "아메리카노";
        boolean isTakeOut = true;

        customer.askCoffee(coffeeName);

        long price = cashier.checkCoffeePrice(coffeeName);
        cashier.replyCoffeePrice(coffeeName, price);

        long cash = customer.withDrawCash(price);
        customer.orderCoffee(coffeeName, isTakeOut);

        cashier.addAmount(cash);
        cashier.sayOrder(coffeeName);

        barista.noticeOrder(coffeeName);
        Coffee coffee = barista.makeUpCoffee(coffeeName, 500, 30);
        barista.sayCoffeeReady(coffee);

        Coffee coffeeCompleted = cashier.wrapUpCoffee(coffee);
        cashier.sayCoffeeReady(coffee);

        customer.drinkCoffee(coffeeCompleted);
        customer.upgradeMyFeeling();
        customer.showMyFeeling();
        customer.showCashAmount();

    }
}
