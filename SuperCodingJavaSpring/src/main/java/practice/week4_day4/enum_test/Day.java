package practice.week4_day4.enum_test;

public enum Day {
    //SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    SUNDAY("일요일"),
    MONDAY("월요일"),
    TUESDAY("화요일"),
    WEDNESDAY("수요일"),
    THURSDAY("목요일"),
    FRIDAY("금요일"),
    SATURDAY("토요일");

    private final String koreanName; //enum의 필드 선언

    Day(String koreanName){
        this.koreanName = koreanName;
    }

    public String getKoreanName(){
        return koreanName;
    }
}
