package practice.week5_day1.method_reference_test;

import practice.week5_day1.annotation_test.MyAnnotation;

import java.io.Serializable;

@MyAnnotation(name = "클래스(ElementType.TYPE)")
public class Customer implements Serializable {

    //직렬화 고유 번호
    private final long serialVersionUID = 1L;

    //속성
    static int serialNums = 1;

    protected String customerID;
    protected String name;
    protected String customerGrade;
    protected int bonusPoint;
    protected double bonusPointRatio;

    //행위
    @MyAnnotation(name = "가격 계산")
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

    public Customer(String customerID, String name){
        this(name);
        this.customerID = customerID;
    }

    public void printMyInfo(){
        System.out.printf("Customer(customerId=%s, name=%s, grade=%s, bonusPoint=%d, bonusPointRatio=%f",
                this.customerID, this.name, this.customerGrade, this.bonusPoint, this.bonusPointRatio);
    }

    public int getBonusPoint() {
        return bonusPoint;
    }

    //toString() 재정의
    @Override
    public String toString() {
        return "Customer{" +
                "customerID='" + customerID + '\'' +
                ", name='" + name + '\'' +
                ", customerGrade='" + customerGrade + '\'' +
                ", bonusPoint=" + bonusPoint +
                ", bonusPointRatio=" + bonusPointRatio +
                '}';
    }


    //equals() 재정의 - ID가 같으면 같은 객체로 판단
    @Override
    @MyAnnotation(name = "Equal")
    public boolean equals(Object obj){
        if(obj==null){
            return false;
        }

        if(obj instanceof Customer){
            Customer customer = (Customer) obj;
            return customer.customerID == this.customerID;
        }

        return false;
    }
}
