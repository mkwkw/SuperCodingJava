package hw.week4_day3.object_test;

import hw.week4_day3.object_test.Customer;

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
