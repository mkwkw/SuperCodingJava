package practice.week4_day5.lambda_test;

public class LambdaTest2 {

    MultipleNum multipleNum = new MultipleNum() {
        @Override
        public int calculate(int num) {
            return num*2;
        }
    };

    StringNum stringNum = new StringNum() {
        @Override
        public void printString(String str, int cnt) {
            for(int i=0; i<cnt; i++){
                System.out.print(str);
            }
        }
    };

}
