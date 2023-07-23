package practice.week4_day3.collection_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListGetPerformanceTest {

    static final int SIZE = 10000;
    public static void main(String[] args) {

        List<Integer> integerList1 = new ArrayList<>();

        for(int i=0; i<SIZE; i++){
            integerList1.add(i);
        }

        List<Integer> integerList2 = new LinkedList<>();

        for(int i=0; i<SIZE; i++){
            integerList2.add(i);
        }

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();

        for(int i=0; i<SIZE; i++){
            integerList1.get(i);
        }

        endTime = System.currentTimeMillis();

        System.out.println("ArrayList Get 요청 걸린 시간"+(endTime-startTime)+"ms");

        startTime = System.currentTimeMillis();

        for(int i=0; i<SIZE; i++){
            integerList2.get(i);
        }

        endTime = System.currentTimeMillis();

        System.out.println("LinkedList Get 요청 걸린 시간"+(endTime-startTime)+"ms");
    }
}
