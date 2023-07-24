package practice.week4_day4.optional_test;

import java.util.Optional;

public class OptionalThrowTest {

    public static void main(String[] args) {
        String str = null;
        Optional<String> stringOptional = Optional.ofNullable(str);

        //람다식
        //사용자 정의 예외 던지기
        //예외 생기면 사용자 정의 예외 던지고
        //아니면 length() 실행
        int length = stringOptional.orElseThrow(() -> {throw new CustomException("CustomException이 발생했습니다.");}).length();

        System.out.println(length);
    }
}
