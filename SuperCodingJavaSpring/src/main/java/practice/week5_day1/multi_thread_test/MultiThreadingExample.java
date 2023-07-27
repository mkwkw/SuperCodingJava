package practice.week5_day1.multi_thread_test;

public class MultiThreadingExample {

    public static void main(String[] args){
        // Q) 1~1000까지 출력하는건데, Multi threading 일 분담해서 실행

        long startTime = System.currentTimeMillis();
        // 3명 Thread
        //Thread thread1 = new Thread(new PrintNumberRunnable(1, 330));
        //Thread thread2 = new Thread(new PrintNumberRunnable(331, 660));
        //Thread thread3 = new Thread(new PrintNumberRunnable(661, 1000));

        Thread thread = new Thread(new PrintNumberRunnable(1,1000));

        //thread1.start();
        //thread2.start();
        //thread3.start();
        thread.start();

        long endTime = System.currentTimeMillis();

        System.out.println("\n걸린 시간: "+(endTime-startTime)+"ms");
    }
}
