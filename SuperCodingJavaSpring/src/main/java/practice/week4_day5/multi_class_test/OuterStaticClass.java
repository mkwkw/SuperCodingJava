package practice.week4_day5.multi_class_test;

public class OuterStaticClass {

    private static int outerData; //기본값 0으로

    public OuterStaticClass(int outerData) {
    }

    public static class InnerStaticClass{
        private int innerData;

        public InnerStaticClass(int innerData) {
            this.innerData = innerData;
        }

        void display(){
            System.out.println("OuterData: "+outerData); //static으로 정의된 데이터만 접근 가능
            System.out.println("InnerData: "+innerData);
        }
    }
}
