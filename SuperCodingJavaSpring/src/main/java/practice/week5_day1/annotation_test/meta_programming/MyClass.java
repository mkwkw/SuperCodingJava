package practice.week5_day1.annotation_test.meta_programming;

public class MyClass {

    @Repeat(value = 20)
    public void printMessage() {
        System.out.println("Hello, world!");
    }

    @Repeat(value = 10)
    public void foo() {
        System.out.println("This is another method.");
    }

}
