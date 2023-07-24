package practice.week4_day4.exception_test;

public class TryCatchFinallyTest {

    public static void main(String[] args) {

        System.out.println("메인 메소드가 실행됩니다.");

        try{
            Integer myInt = 10;
            Integer data = 100 / myInt;

            System.out.println("data: "+data);
        } catch (ArithmeticException e){
            System.out.println("myInt는 0이 될 수 없습니다.");
            e.printStackTrace();
        } finally {
            System.out.println("여기는 무조건 실행되는 finally 영역입니다."); //정상 종료일 때도 비정상 종료일 때도 출력O, 중간에 return 될 때도 출력O
        }

        System.out.println("메인 메소드가 종료됩니다."); //비정상 종료일 때는 출력X

    }
}
