package practice.week5_day1.method_reference_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample1 {

    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("C001", "이순신"));
        customers.add(new Customer("C002", "아이유"));
        customers.add(new Customer("C003", "카리나"));
        customers.add(new Customer("C004", "윈터"));

        // Q) StringUtils의 isLongName static 메소드를 이용하여 긴 이름의 손님들 이름을 출력
        List<String> customerNames = Arrays.asList(
                "이순신",
                "민지",
                "오해원",
                "아이유"
        );

        customers.stream()
                .map(customer -> customer.name) //이름 추출
                .filter(StringUtils::isLongName)
                .forEach(System.out::println);

        System.out.println();

        customerNames.stream()
                .filter(StringUtils::isLongName)
                .forEach(System.out::println);

        // Q) 손님들 이름을 가지고 손님 리스트를 만들어라.
        List<Customer> customerList = customerNames.stream()
                                                    .map(Customer::new) //객체 생성
                                                    .collect(Collectors.toList()); //객체 리스트 생성
        System.out.println(customerList);
    }
}
