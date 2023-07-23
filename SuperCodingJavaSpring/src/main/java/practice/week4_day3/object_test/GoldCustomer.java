package practice.week4_day3.object_test;

public class GoldCustomer extends Customer {

    private double discountRatio;

    @Override
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        price -= price * discountRatio;
        return price;
    }

    GoldCustomer(String name){
        super(name);
        this.customerID = "Customer" + Customer.serialNums++; //명시 - customer와 공유
        this.customerGrade = "GOLD";
        this.discountRatio = 0.03;
        this.bonusPointRatio = 0.03;
    }

    //toString() 재정의
    //여기서 재정의하지 않으면 Customer의 toString()이 적용되어 discountRatio가 출력되지 않음.
    @Override
    public String toString() {
        return "GoldCustomer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusPointRatio +
                ", discountRatio=" + discountRatio +
                '}';
    }
}
