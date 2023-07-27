package practice.week5_day1.singleton_test;

public class FileWriterSingletonTest {
    public static void main(String[] args) {

        //싱글톤 방식
        //FileWriterSingleton으로 인스턴스를 얻어서 (재)사용
        Thread thread1 = new Thread( () -> {
            FileWriterSingleton writer = FileWriterSingleton.getInstance();
            writer.writeToFile("Thread 1: Message 1");
            writer.writeToFile("Thread 1: Message 2");
        });

        //FileWriterSingleton으로 인스턴스를 얻어서 (재)사용
        Thread thread2 = new Thread(() -> {
            FileWriterSingleton writer = FileWriterSingleton.getInstance();
            writer.writeToFile("Thread 2: Message 3");
            writer.writeToFile("Thread 2: Message 4");
        });

        thread1.start();
        thread2.start();

        // join을 해서 close해야함.
    }
}
