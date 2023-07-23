package practice.week4_day3.collection_test;

import java.util.HashMap;
import java.util.Map;

public class MapInterfaceTest {

    public static void main(String[] args) {

        Map<String, Integer> fruitMap = new HashMap<>();

        fruitMap.put("orange", 5);
        fruitMap.put("apple", 10);
        fruitMap.put("banana", 3);
        fruitMap.put("kiwi", 20);

        System.out.println("fruitMap: "+fruitMap); //삽입한 순서대로 출력되지는 않음.

        //get(key)
        Integer appleCnt = fruitMap.get("apple");
        Integer bananaCnt = fruitMap.get("banana");

        //containsKey(Key) - key가 있는지 없는지 리턴
        Boolean isApple = fruitMap.containsKey("apple");
        Boolean isMango = fruitMap.containsKey("mango");

        //remove(key)
        fruitMap.remove("apple");

        //size
        fruitMap.size();

        //KeySet() - 무슨 key있는지만 알고 싶을 때
        System.out.println(fruitMap.keySet());
    }
}
