package practice.week4_day1.departmentstore_practice;

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
}
