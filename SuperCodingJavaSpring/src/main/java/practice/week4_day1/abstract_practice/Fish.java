package practice.week4_day1.abstract_practice;

public class Fish extends Animal{

    private boolean havingPoison;
    private String livingSea;

    @Override
    public void eat(String food) {
        System.out.printf("물고기가 %s를 먹고 있습니다.\n", food);
    }

    @Override
    public void sleep() {
        System.out.println("물고기가 잠을 자고 있습니다.");
    }

    public void swim(){
        System.out.println("물고기가 헤엄치고 있습니다.");
    }
}
