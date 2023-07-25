package practice.week4_day5.stream_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class streamTest1 {
    public static void main(String[] args) {

        //Stream.of, Arrays.Stream, Collection(=List) -> Stream
        //Stream.of
        Stream<String> fruits = Stream.of("Apple", "Banana", "Orange");
        Stream<Integer> integerStream = Stream.of(1,2,3,4,5);

        //Arrays.Stream
        Stream<String> fruits2 = Arrays.stream(new String[]{"Apple", "Banana", "Orange"});
        Stream<Integer> integerStream2 = Arrays.stream(new Integer[]{1,2,3,4,5});

        //Collection
        List<String> fruitList = new ArrayList<>();
        fruitList.add("Apple");
        fruitList.add("Banana");
        fruitList.add("Orange");

        Stream<String> fruits3 = fruitList.stream();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);

        Stream<Integer> integerStream3 = integerList.stream();

        //Stream 가지고 for-loop
        //기존 방법
        for(String fruit: fruitList){
            System.out.println("fruit: "+fruit);
        }
        //Stream
        fruits3.forEach((fruit)-> System.out.println("forEach로 fruit 산출"+fruit.toUpperCase()));

        //기존 방법
        for(Integer integer : integerList){
            if(integer%2==0) System.out.println("짝수: "+integer);
            else continue;
        }
        //Stream
        integerStream3.filter((i)->i%2==0)
                .forEach(i-> System.out.println("forEach로 짝수 산출: "+i));
    }
}
