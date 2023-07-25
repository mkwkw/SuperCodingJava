package practice.week4_day4.exception_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryCatchFinallyCloseTest {

    public static void main(String[] args) throws IOException {

        FileInputStream fs = null;
        try{
            fs = new FileInputStream("src\\main\\java\\practice\\week4_day4\\exception_test\\example.txt");
            int i;
            while((i=fs.read())!=-1){
                System.out.print((char)i);
            }
        }
        catch (FileNotFoundException e){
            System.out.println("File을 찾을 수가 없습니다.");
            e.printStackTrace();
        }
        catch (IOException e){
            System.out.println("입출력 예외가 발생했습니다.");
        }
        catch (Exception e){
            System.out.println("exception이 발생했습니다.");
        }
        finally {
            fs.close();
            System.out.println("\n리소스를 해제합니다.");
        }
    }
}
