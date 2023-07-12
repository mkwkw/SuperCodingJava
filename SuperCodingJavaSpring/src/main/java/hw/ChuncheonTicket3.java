package hw;

import java.util.ArrayList;
import java.util.List;

public class ChuncheonTicket3 {

    static class Person{
        String name;
        int age;
        String nationality;

        Person(String name, int age, String nationality){
            this.name = name;
            this.age = age;
            this.nationality = nationality;
        }
    }

    public static void main(String[] args) {
        Person Alice = new Person("Alice", 70, "USA");
        Person Kim = new Person("Kim", 65, "Korea");
        Person Yoo = new Person("Yoo", 42, "Korea");

        List<Person> people = new ArrayList<>();
        people.add(Alice);
        people.add(Kim);
        people.add(Yoo);

        for(Person person : people){
            if(person.age>=65 && person.nationality=="Korea"){
                System.out.println(person.name+"는 적용 대상자입니다.");
            }
            else{
                System.out.println(person.name+"는 적용 대상자가 아닙니다.");
            }
        }
    }
}
