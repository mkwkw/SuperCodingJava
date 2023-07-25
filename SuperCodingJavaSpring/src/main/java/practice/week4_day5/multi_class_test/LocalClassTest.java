package practice.week4_day5.multi_class_test;

public class LocalClassTest {

    public static void main(String[] args) {
        //지역 내부 클래스
        class LocalWalk implements Walkable{
            @Override
            public void walk() {
                System.out.println("LocalWalk: Walking");
            }
        }

        LocalWalk localWalk = new LocalWalk();
        localWalk.walk();

        int i=100;
        //익명 클래스
        Walkable anonymousWalk = new Walkable() {
            @Override
            public void walk() {
                System.out.println("i: "+i); //외부 변수 접근 가능
                //i=200; //외부 변수 수정은 불가능
                System.out.println("AnonymousWalk: Walking");
            }
        };
    }

    //메소드 외부에서는 LocalWalk 사용 불가
}
