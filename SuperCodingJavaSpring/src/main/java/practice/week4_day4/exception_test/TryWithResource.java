package practice.week4_day4.exception_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TryWithResource {

    public static void main(String[] args) {

        try(FileInputStream fs = new FileInputStream("C:\\Users\\mkkw2\\Documents\\GitHub\\SuperCodingJavaSpring\\src\\main\\java\\practice\\week4_day4\\exception_test\\example.txt"))
        {
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
    }
}
