package practice.week5_day1.singleton_test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterSingleton {

    //FileWriter static으로 생성
    private static FileWriterSingleton instance = null; // FileWriter()

    private FileWriter fileWriter;

    public FileWriterSingleton() {
        try {
            this.fileWriter = new FileWriter("test.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //싱글톤
    //synchronized 키워드로 동기화 문제 해결
    public synchronized static FileWriterSingleton getInstance(){
        //instance가 null이면 새로 filewriter를 생성
        if (instance == null){
            instance = new FileWriterSingleton();
        }
        //instance가 null이 아니면 있는 것 그대로 사용
        return instance;
    }

    //synchronized 키워드로 동기화 문제 해결
    public synchronized void writeToFile(String message){
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //synchronized 키워드로 동기화 문제 해결
    public synchronized void closeFile(){
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
