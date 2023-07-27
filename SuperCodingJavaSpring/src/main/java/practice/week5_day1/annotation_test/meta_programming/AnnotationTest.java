package practice.week5_day1.annotation_test.meta_programming;

public class AnnotationTest {

    public static void main(String[] args) {
        MyClass myObj = new MyClass();
        AnnotationUtils.executeMethodsByRepeatAnnotation(myObj);
    }
}
