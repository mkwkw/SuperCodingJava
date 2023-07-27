package practice.week5_day1.multi_thread_test;

class Counter {
    private int count = 0;

    //synchronized 키워드로 동기화 문제 방지
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}