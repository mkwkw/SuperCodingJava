package practice.week4_day5.lambda_test;

import java.util.Locale;

public class LambdaUseTest {

    public static void main(String[] args) {
        MultipleNum multipleNum = (num) -> num*10;
        MultipleNum multipleNum1 = (num) -> num*20;

        printNum(multipleNum);
        printNum((x)->x*100); //실무에서 주로 쓰이는 형태

        //람다와 제너릭 함께 사용
        GenericLambda<String> genericLambda1 = (str)->str.toUpperCase();
        GenericLambda<Integer> genericLambda2 = (num)->num*2;
        GenericLambda<Boolean> genericLambda3 = (myBool)->myBool&true;

        System.out.println(genericLambda1.calculate("abc"));
        System.out.println(genericLambda2.calculate(100));
        System.out.println(genericLambda3.calculate(true));
    }

    static void printNum(MultipleNum multipleNum){
        int result = multipleNum.calculate(5);
        System.out.println(result);
    }
}
