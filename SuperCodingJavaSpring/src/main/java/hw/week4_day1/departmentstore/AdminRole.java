package hw.week4_day1.departmentstore;

public interface AdminRole {
    default void manageUsers(String username){
        System.out.println("슈퍼유저("+username+")은 유저를 매니징할 수 있습니다.");
    }
    default void changeSettings(String username){
        System.out.println("슈퍼유저("+username+")은 세팅을 변경할 수 있습니다.");
    };
}
