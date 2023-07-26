package practice.week4_day5.io_stream_test;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
    public static void main(String[] args){
        String content = "This is content of File3";

        //try-with-resource
        try(FileOutputStream fos = new FileOutputStream("C:\\Users\\mkkw2\\Documents\\GitHub\\SuperCodingJavaSpring\\src\\main\\java\\practice\\week4_day4\\exception_test\\example.txt", true)){
            byte[] bytes = content.getBytes();
            fos.write(bytes);

            System.out.println("txt 파일이 생성되었습니다.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
