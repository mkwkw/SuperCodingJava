package practice.week3_day5;

public class Customer {

    //속성
    private long cashAmount;
    private String myFeeling;

    //행위
    public void askCoffee(String coffeeName){
        System.out.println("손님: 커피 "+coffeeName+" 얼마인가요?");
    }

    public long withDrawCash(long amount){
        this.cashAmount -= amount;
        return amount;
    }

    public void orderCoffee(String coffeeName, boolean isWrappedUp){
        System.out.println("손님: 커피 "+coffeeName+"을 주문할게요"+
                            "단, 포장여부는 "+isWrappedUp+"으로 부탁드려요");
    }

    public void drinkCoffee(Coffee coffee){
        System.out.println("손님: 나는 커피 "+coffee.getCoffeeName()+"을 마신다.");
    }

    public void upgradeMyFeeling(){
        this.myFeeling = "기분 좋아짐";
    }

    public void showMyFeeling(){
        System.out.println("손님: 나의 기분은 "+this.myFeeling);
    }

    public void setCashAmount(long cashAmount) {
        this.cashAmount = cashAmount;
    }

    public void showCashAmount() {
        System.out.println("잔액은 "+this.cashAmount+"입니다.");
    }
}
