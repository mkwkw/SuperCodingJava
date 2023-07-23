package practice.week4_day3.collection_test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListInterfaceTest {

    public static void main(String[] args) {
        List<String> fruitList = new ArrayList<>();

        //add
        fruitList.add("orange");
        fruitList.add("apple");
        fruitList.add("banana");
        fruitList.add("kiwi");

        System.out.println("fruit list: "+fruitList);

        //add(index, element)
        fruitList.add(3, "mango"); //banana와 kiwi 사이에 들어감.
        System.out.println("fruit list: "+fruitList);

        //remove(index)
        fruitList.remove(3);

        //get(index)
        String myFruit = fruitList.get(3);
        System.out.println(myFruit);

        //set(index, element) - 교체
        fruitList.set(1, "pineapple");
        System.out.println("fruit list: "+fruitList);

        //size
        System.out.println(fruitList.size());

        //isEmpty
        List<String> fruitList2 = new ArrayList<>();
        System.out.println(fruitList.isEmpty());
        System.out.println(fruitList2.isEmpty());

        //contains(element) - 해당 element가 있는지
        System.out.println(fruitList.contains("kiwi"));
        System.out.println(fruitList.contains("apple"));

        //indexOf(element) - 해당 element의 인덱스 - 있으면 인덱스, 없으면 -1 리턴
        System.out.println(fruitList.indexOf("orange"));
        System.out.println(fruitList.indexOf("apple"));

        //clear - 모든 원소 없애기 - List 자체를 없애는 것은 아님.
        fruitList.clear();
        System.out.println("fruit list: "+fruitList);

    }
}
