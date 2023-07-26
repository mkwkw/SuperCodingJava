package practice.week4_day5.io_stream_test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest {
    public static void main(String[] args){
        // FileInputStream
        // try-with-resource 이용해서 자동으로 리소스 해제되도록
        try(FileInputStream fis = new FileInputStream("src\\main\\java\\practice\\week4_day4\\exception_test\\example.txt")){

            int i;
            while((i = fis.read()) != -1){
                System.out.print((char) i);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
