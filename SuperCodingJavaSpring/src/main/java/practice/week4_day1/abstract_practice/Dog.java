package practice.week4_day1.abstract_practice;

public class Dog extends Animal{

    @Override
    public void eat(String food) {
        System.out.printf("개는 %s를 먹습니다.", food);
    }

    @Override
    public void sleep() {
        System.out.println("개는 잠을 잡니다.");
    }
}
