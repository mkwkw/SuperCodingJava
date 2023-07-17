package practice.week4_day1.interface_practice;

public interface Flyable {
    //속성
    long atmosphereLimit = 476; //대기권

    default void fly(){
        System.out.println("<정보> 현재 날고 있습니다.");
    }

    static void printAlert(){
        System.out.println("<경보> 현재 이 사물은 공중에 있습니다.");
    }
}
