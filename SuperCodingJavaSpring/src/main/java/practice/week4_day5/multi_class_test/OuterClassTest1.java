package practice.week4_day5.multi_class_test;

public class OuterClassTest1 {

    public static void main(String[] args) {

        //일반 중첩 클래스
        OuterClass outerClass = new OuterClass(20);
        OuterClass.InnerClass innerClass1 = outerClass.new InnerClass(10);
        innerClass1.display();

        //정적 중첩 클래스
        OuterStaticClass outerStaticClass = new OuterStaticClass(22);
        OuterStaticClass.InnerStaticClass innerStaticClass2 = new OuterStaticClass.InnerStaticClass(12);
    }
}
