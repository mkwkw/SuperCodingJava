package practice.week4_day3.object_test;

public class ObjectTest {

    public static void main(String[] args) {

        //toString() 재정의 구현
        Customer customer = new Customer("민철");
        GoldCustomer goldCustomer = new GoldCustomer("골드");
        System.out.println(customer.toString());
        System.out.println(goldCustomer.toString());

        //equals() 재정의 구현 - ID가 같으면 같은 객체로 판단
        Customer customer1 = new Customer("ID1", "민철");
        Customer customer2 = customer1;
        Customer customer3 = new Customer("ID1", "민철");

        System.out.println(customer1);
        System.out.println(customer3);

        System.out.println(customer1.equals(customer2));
        System.out.println(customer1.equals(customer3));
    }
}
