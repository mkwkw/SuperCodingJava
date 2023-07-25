package practice.week4_day5.multi_class_test;

public class OuterClass {
    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    //일반 중첩 클래스
    public class InnerClass{
        private int innerData;

        public InnerClass(int innerData) {
            this.innerData = innerData;
        }

        void display(){
            System.out.println("OuterData: "+outerData); //private이어도 내부클래스에서는 접근 가능
            System.out.println("InnerData: "+innerData);
        }
    }
}
