package practice.week5_day1.multi_thread_test;

class IncrementRunnable implements Runnable {
    private Counter counter;

    public IncrementRunnable(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {

            //잠깐 멈췄다가 실행 - 두 스레드가 겹치도록 - 누락 발생
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            counter.increment();
            System.out.println("Count: " + counter.getCount());
        }
    }
}
