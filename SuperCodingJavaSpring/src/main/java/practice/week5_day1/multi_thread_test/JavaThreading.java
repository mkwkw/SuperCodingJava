package practice.week5_day1.multi_thread_test;

public class JavaThreading {
    public static void main(String[] args) {
        //Thread 실행
        Thread thread1 = new Thread(new MyRunnable());
        //익명
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread: "+Thread.currentThread().getName()+" 실행하고 있습니다.");
            }
        });
        //람다식
        Thread thread3 = new Thread(()->  System.out.println("Thread: "+Thread.currentThread().getName()+" 실행하고 있습니다."));

        thread1.start();
        thread2.start();
        thread3.start();

        //main thread
        System.out.println("Thread: "+Thread.currentThread().getName()+" 실행하고 있습니다.");
        System.out.println("Thread: "+Thread.currentThread().getName()+" 실행하고 있습니다.");
    }

    static class MyRunnable implements Runnable{
        @Override
        public void run() {
            //Thread-0,1,,
            System.out.println("Thread: "+Thread.currentThread().getName()+" 실행하고 있습니다.");
        }
    }
}
