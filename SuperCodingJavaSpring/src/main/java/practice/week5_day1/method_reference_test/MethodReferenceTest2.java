package practice.week5_day1.method_reference_test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class MethodReferenceTest2 {

    public static void main(String[] args) {
        //Instance 메소드 참조
        Customer customer1 = new Customer("이순신");
        Customer customer2 = new Customer("아이유");

        Supplier<String> ex1 = customer1::toString;
        Supplier<String> ex2 = customer2::toString;

        System.out.println(ex1.get()); //이순신 Customer의 toString
        System.out.println(ex2.get()); //아이유 Customer의 toString

        //임의 객체 메소드 호출
        List<Customer> customerList = Arrays.asList(
                new Customer("이순신"),
                new Customer("아이유"),
                new Customer("카리나"),
                new Customer("유재석")
        );

        customerList.forEach(Customer::printMyInfo);
    }

}
