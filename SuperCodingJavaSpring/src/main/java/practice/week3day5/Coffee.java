package practice.week3day5;

//아메리카노 커피는 물 500ml와 원두 30g으로 만들어진다.
//아메리카노 커피는 테이크 아웃용으로 포장된다.
public class Coffee {

    //속성
    private String coffeeName;
    private long waterQuantity;
    private long coffeeBeanQuantity;
    private boolean isWrappedUp;

    //행위
    void beWrappedUp(){
        this.isWrappedUp = true;
    }

    //생성자
    Coffee(String coffeeName, long waterQuantity, long coffeeBeanQuantity){
        this.coffeeName = coffeeName;
        this.waterQuantity = waterQuantity;
        this.coffeeBeanQuantity = coffeeBeanQuantity;
        isWrappedUp = false; //기본값
    }

    public String getCoffeeName(){
        return this.coffeeName;
    }

    public boolean isWrappedUp(){
        return isWrappedUp;
    }
}
