package practice.week4_day5.socket_programming;

import java.io.Serializable;

public class Person implements Serializable { //직렬화

    //고유 번호 관리
    private static final long serialVersionUID = 1L;

    private transient String name;
    private String gender;
    private transient int age; //나이는 직렬화할 때 숨기고 싶다. -> 기본값으로 전달.

    private String country;
    private String occupation;

    public void showMyself(){
        System.out.printf("Person 인스턴스: name: %s, gender: %s, age: %d\n", this.name, this.gender, this.age);
    }
    public Person(String name){
        this(name, "unknown");
    }

    public Person(String name, String gender){
        this(name, gender, -1, "Korea", null);
    }

    public Person(String name, String gender, int age, String country, String occupation) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.country = country;
        this.occupation = occupation;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", occupation='" + occupation + '\'' +
                '}';
    }


    public Person returnMySelf(){
        return this;
    }


}
