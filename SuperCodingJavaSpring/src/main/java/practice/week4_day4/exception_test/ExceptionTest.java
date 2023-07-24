package practice.week4_day4.exception_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메인 메소드가 시작합니다.");
        //makeCheckException();
        makeUncheckException();
        System.out.println("메인 메소드가 종료합니다.");
    }

    public static void makeUncheckException(){ //UncheckException - 빨간줄 표시되지는 않음. - try-catch문으로 예외 처리 가능
        int[] intArr={1,2,3,4,5,6,7,8,9,10};
        int index = 10;

        try{
            System.out.println("값: "+intArr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 범위를 벗어났습니다.");
        }


    }

    public static void makeCheckException() throws FileNotFoundException { //throws FileNotFoundException 안하면 빨간줄 표시됨. - CheckException - 반드시 고쳐야함.
        File file = new File("");
        FileInputStream fs = new FileInputStream(file);

        System.out.println("fs 실행됩니다.");
    }
}
