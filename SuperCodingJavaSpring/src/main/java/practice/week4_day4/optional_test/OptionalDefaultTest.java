package practice.week4_day4.optional_test;

import java.util.Optional;

public class OptionalDefaultTest {

    public static void main(String[] args) {
        String str = "abc";
        Optional<String> stringOptional = Optional.ofNullable(str);

        //람다식
        //기본 값 정의 ("")
        //예외 생기면 기본 값으로 설정하고
        //아니면 length() 실행
        int length = stringOptional.orElseGet(()->"").length();

        //예외 발생하면 stringOptional이 ""이므로 길이는 0
        System.out.println(length);
    }
}
