package practice.week4_day5.lambda_test;

public class LambdaTest1 {

    public static void main(String[] args) {
        MultipleNum multipleNum1 = (x)->x*2;
        MultipleNum multipleNum2 = (i)->i*3;
        MultipleNum multipleNum3 = (x)->{return x*4;};
        MultipleNum multipleNum4 = (int x)->{return x*10;};

        System.out.println(multipleNum1.calculate(5));
        System.out.println(multipleNum2.calculate(5));
        System.out.println(multipleNum3.calculate(5));
        System.out.println(multipleNum4.calculate(5));

        StringNum stringNum1 = (x,y) -> System.out.println(x);
        StringNum stringNum2 = (x,y) -> {
            for(int i=0; i<y; i++){
                System.out.print(x);
            }
        };

        stringNum1.printString("hi",5);
        stringNum2.printString("hi ", 5);
    }
}
