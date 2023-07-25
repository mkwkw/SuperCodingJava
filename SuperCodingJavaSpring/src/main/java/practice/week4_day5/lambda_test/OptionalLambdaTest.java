package practice.week4_day5.lambda_test;

import java.util.Optional;
import java.util.function.Supplier;

public class OptionalLambdaTest {

    public static void main(String[] args) {
        String str = "abc";

        Optional<String> stringOptional = Optional.ofNullable(str);
        String str2 = stringOptional.orElseGet(()->"default")
                .toUpperCase(); //DEFAULT
        System.out.println(str2);
    }
}
