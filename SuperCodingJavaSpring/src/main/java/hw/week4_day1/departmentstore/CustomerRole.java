package hw.week4_day1.departmentstore;

public interface CustomerRole {
    default void order(String username){
        System.out.println("유저("+username+")은 주문을 할 수 있습니다.");
    }
    default void payment(String username){
        System.out.println("유저("+username+")은 결제를 할 수 있습니다.");
    };
}
