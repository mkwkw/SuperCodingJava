package practice.week4_day3.collection_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInsertRemovePerformanceTest {

    static final int SIZE = 1000000;

    public static void main(String[] args) {

        long startTime;
        long endTime;

        startTime = System.currentTimeMillis();

        List<Integer> integerList1 = new ArrayList<>();

        for(int i=0; i<SIZE; i++){
            integerList1.add(i);
            if(i%5==0) integerList1.remove(0);
        }

        endTime = System.currentTimeMillis();

        System.out.println("ArrayList Insert/Remove 요청 걸린 시간"+(endTime-startTime)+"ms");

        startTime = System.currentTimeMillis();

        List<Integer> integerList2 = new LinkedList<>();

        for(int i=0; i<SIZE; i++){
            integerList2.add(i);
            if(i%5==0) integerList2.remove(0);
        }

        endTime = System.currentTimeMillis();

        System.out.println("LinkedList Insert/Remove 요청 걸린 시간"+(endTime-startTime)+"ms");
    }
}
