package practice.week5_day1.method_reference_test;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReferenceTest1 {

    public static void main(String[] args) {

        //static 메소드
        //람다식
        Consumer<String> ex = (str) -> Printer.printSomething(str);
        //메소드 레퍼런스
        Consumer<String> ex1 = Printer::printSomething;

        ex.accept("lambda 식 사용");
        ex1.accept("MethodReference 사용");

        //생성자 호출
        //람다식
        Supplier<Customer> ex3 = () -> new Customer();
        //메소드 레퍼런스
        Supplier<Customer> ex4 = Customer::new;

        System.out.println(ex3.get());
        System.out.println(ex3.get());

        //Function<T, R> -> T가 들어가서 R형태로 나오게 하는 역할
        Function<String, Customer> ex5 = (str) -> new Customer(str);
        Function<String, Customer> ex6 = Customer::new;

        System.out.println("name 들어간 생성자 "+ex5.apply("이순신"));
        System.out.println("name 들어간 생성자 "+ex6.apply("아이유"));
    }

}