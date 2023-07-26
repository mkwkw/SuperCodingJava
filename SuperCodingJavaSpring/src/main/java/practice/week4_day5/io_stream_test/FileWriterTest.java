package practice.week4_day5.io_stream_test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    //FileWriter
    //try-with-resource로 리소스 자동 해제
    //UTF-8
    public static void main(String[] args){
        String content = "이것은 파일 컨텐츠 입니다.";

        try(FileWriter fos = new FileWriter("src\\main\\java\\practice\\week4_day4\\exception_test\\example.txt")){
            fos.write(content);

            System.out.println("txt 파일이 생성되었습니다.");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
