package practice.week5_day1.multi_thread_test;

public class JavaMultiThreadingIssue {

    public static void main(String[] args) {
        Counter counter = new Counter();

        //3개의 thread가 1개의 counter 객체를 공유한다. - 동기화 문제 발생 가능 - 누락 가능
        //Counter 객체의 increment 메소드에 synchronized 키워드 추가
        Thread thread1 = new Thread(new IncrementRunnable(counter));
        Thread thread2 = new Thread(new IncrementRunnable(counter));
        Thread thread3 = new Thread(new IncrementRunnable(counter));

        thread1.start();
        thread2.start();
        thread3.start();
    }

}
