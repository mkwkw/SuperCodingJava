package practice.week3_day5;

public class Barista {

    //속성
    //행위
    public void noticeOrder(String coffeeName){
        System.out.println("바리스타: 커피주문 확인했습니다 커피: "+coffeeName);
    }

    public Coffee makeUpCoffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        return new Coffee(coffeeName, waterQuantity, coffeeBeanQuantity);
    }

    public void sayCoffeeReady(Coffee coffee){
        System.out.println("바리스타: 커피제작이 완료되었습니다. 커피: "+coffee.getCoffeeName());
    }
}
