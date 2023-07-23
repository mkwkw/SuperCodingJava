package practice.week4_day3.collection_test;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceTest {

    public static void main(String[] args) {
        Set<String> fruitSet = new HashSet<>();

        //add
        fruitSet.add("orange");
        fruitSet.add("apple");
        fruitSet.add("mango");
        fruitSet.add("grape");

        System.out.println("fruitSet: "+fruitSet);

        //중복 add
        fruitSet.add("apple"); //효력 없음
        System.out.println("fruitSet: "+fruitSet);

        //remove
        fruitSet.remove("mango");

        //contains
        System.out.println(fruitSet.contains("apple"));
        System.out.println(fruitSet.contains("mango"));

        //size, isEmpty, clear
        System.out.println("fruitSet size: "+fruitSet.size());
        System.out.println("fruitSet isEmpty: "+fruitSet.isEmpty());
        fruitSet.clear();
        System.out.println("fruitSet isEmpty: "+fruitSet.isEmpty());

    }
}
