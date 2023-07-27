package hw.week5_day1.three_threads_list_filler;

import java.util.Arrays;
import java.util.List;

public class ThreeThreadsListFiller {
    public static void main(String[] args) {
        // 작업할 List 생성 - 크기 1000으로 지정
        int listSize = 1000;
        List<Integer> list =  Arrays.asList(new Integer[listSize]);

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);

        // 3개의 쓰레드 생성, 업무 분담 실행
        Thread thread1 = new Thread(new ListFillerTask(list, 0));
        Thread thread2 = new Thread(new ListFillerTask(list, 1));
        Thread thread3 = new Thread(new ListFillerTask(list, 2));

        // 3개 Thread 작업 진행
        thread1.start();
        thread2.start();
        thread3.start();

        // 결과 확인
        System.out.println("List의 길이: " + list.size());
        System.out.println("List의 내용: " + list);
    }

    // 자신이 맡은 리스트 인덱스의 값을 각각 0, 1, 2로 채우도록 구현하는 Task 구현 필요
    static class ListFillerTask implements Runnable {
        private List<Integer> list;
        private int num; //0, 1, 2 중 하나 (인덱스를 3으로 나눈 나머지)

        public ListFillerTask(List<Integer> list, int num) {
            this.list = list;
            this.num = num;
        }

        @Override
        public void run() {
            // TODO
            for(int i=0; i<list.size(); i++){
                if(i%3==num){
                    list.set(i,num);
                }
            }
        }
    }
}
