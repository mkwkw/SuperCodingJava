package practice.week4_day4.exception_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Locale;

public class TryMultiCatchTest {

    public static void main(String[] args) {
        try{
            FileInputStream fs = new FileInputStream("C:\\Users\\mkkw2\\Documents\\GitHub\\SuperCodingJavaSpring\\src\\main\\java\\practice\\week4_day4\\exception_test\\example.txt");

            int i = 10;
            int data = 100/i;

            String str = null;
            System.out.println(str.toUpperCase());
        }
        catch (FileNotFoundException e){
            System.out.println("File을 찾을 수가 없습니다.");
            e.printStackTrace();
        }
        catch (ArithmeticException e){
            System.out.println("0으로 나눌 수 없습니다.");
        }
        catch (NullPointerException e){
            System.out.println("null이 들어왔습니다.");
        }

        //이렇게 여러개의 catch문이 있는 경우 위에서 exception 처리되면 그냥 종료됨. 이후 예외는 처리하지 않고 그냥 종료.

        try{
            FileInputStream fs = new FileInputStream("C:\\Users\\mkkw2\\Documents\\GitHub\\SuperCodingJavaSpring\\src\\main\\java\\practice\\week4_day4\\exception_test\\example.txt");

            int i = 10;
            int data = 100/i;

            String str = "ab";
            System.out.println(str.toUpperCase());

            int index = 5;
            int[] intArr = new int[5];
            System.out.println(intArr[index]);

        }
        catch (FileNotFoundException e){
            System.out.println("File을 찾을 수가 없습니다.");
            e.printStackTrace();
        }
        catch (ArithmeticException | NullPointerException e){ // | 이용 다중 catch문
            System.out.println("0으로 나눌 수 없습니다. 또는 null이 들어왔습니다.");
            e.printStackTrace();
        }
        catch (Exception e){ //최종 필터 - 어떤 예외더라도 걸림.
            System.out.println("exception이 발생하였습니다.");
        }

        System.out.println("메인메소드가 종료됩니다.");
    }
}
