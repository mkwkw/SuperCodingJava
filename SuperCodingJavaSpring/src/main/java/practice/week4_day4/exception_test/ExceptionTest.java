package practice.week4_day4.exception_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionTest {

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("메인 메소드가 시작합니다.");
        //makeCheckException();
        makeUncheckException();
        System.out.println("메인 메소드가 종료합니다.");
    }

    public static void makeUncheckException(){ //UncheckException - 빨간줄 표시되지는 않음.
        int[] intArr={1,2,3,4,5,6,7,8,9,10};
        int index = 10;

        try{
            System.out.println("값: "+intArr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("인덱스 범위를 벗어났습니다.");
        }

        try {
            int div = 0;
            int data = 50/div;
            System.out.println("data: "+data);
        }
        catch (ArithmeticException e){
            System.out.println("0으로 나눌수가 없습니다.");
            e.printStackTrace();
        }

        List<String> wordList = new ArrayList<>();
        wordList.add("hi");
        wordList.add(null);
        wordList.add("world");

        for (int i=0; i<wordList.size(); i++){
            try{
                System.out.println(wordList.get(i));
            }
            catch (NullPointerException e){
                System.out.println("null은 들어갈 수 없습니다.");
            }
        }
    }

    public static void makeCheckException() throws FileNotFoundException { //throws FileNotFoundException 안하면 빨간줄 표시됨. - CheckException - 반드시 고쳐야함.
        File file = new File("");
        FileInputStream fs = new FileInputStream(file);

        System.out.println("fs 실행됩니다.");
    }
}
