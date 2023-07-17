package practice.week4_day1.abstract_practice;

public class Person extends Animal{

    private String job;
    private int height;

    @Override
    public void eat(String food) {
        System.out.printf("사람이 %s를 먹습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("사람이 잠을 자고 있습니다.");
    }

    public void walk(){
        System.out.println("사람이 걷고 있습니다.");
    }
}
