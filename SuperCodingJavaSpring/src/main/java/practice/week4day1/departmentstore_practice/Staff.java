package practice.week4day1.departmentstore_practice;

import practice.week4day1.departmentstore_practice.Customer;

public class Staff {

    private int salesAmount;

    public int helpPayment(Customer customer, int price){
        return customer.calculatePrice(price);
    }

    public void addSalesAmount(int cash){
        this.salesAmount += cash;
    }

    public void printMySalesAmount(){
        System.out.printf("오늘의 매상: "+this.salesAmount);
    }

    public void setSalesAmount(int salesAmount){
        this.salesAmount = salesAmount;
    }
}
