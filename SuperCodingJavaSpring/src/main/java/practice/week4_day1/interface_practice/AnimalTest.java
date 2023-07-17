package practice.week4_day1.interface_practice;

public class AnimalTest {
    public static void main(String[] args) {
        //Animal animal1 = new Animal(); //추상 클래스여서 인스턴스화 불가능
        Animal animal2 = new Bird();
        Animal animal3 = new Fish();
        Animal animal4 = new Person();
        Animal animal5 = new Dog();

        //feed(animal1, "빼빼로");
        feed(animal2, "벌레");
        feed(animal3, "모이");
        feed(animal4, "김밥");
        feed(animal5, "사료");
    }

    public static void feed(Animal animal, String food){
        animal.eat(food);
    }
}
