package practice.week4day1;

public class Customer {

    //속성
    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusPointRatio;

    //행위
    public int calculatePrice(int price) {
        this.bonusPoint += price * bonusPointRatio;
        return price;
    }

    Customer(){

    }
    public Customer(String name) {
        this.name = name;
        this.customerID = "Customer"+serialNums++;
        this.customerGrade = "SILVER";
        this.bonusPointRatio = 0.01;
        this.bonusPoint = 0;
    }

    public void printMyInfo(){
        System.out.printf("Customer(customerId=%s, name=%s, grade=%s, bonusPoint=%d, bonusPointRatio=%f",
                this.customerID, this.name, this.customerGrade, this.bonusPoint, this.bonusPointRatio);
    }
}
