package practice.week4_day4.enum_test;

import java.util.Arrays;

public class DayTest {

    public static void main(String[] args) {
        Day monday = Day.MONDAY;

        System.out.println("요일: "+monday);
        System.out.println("요일: "+monday.getKoreanName());

        //switch문과 함께 이용
        Day day = Day.SUNDAY;
        switch (day){
            case MONDAY:
                System.out.println("오늘은 한 주의 시작입니다."+day.getKoreanName());
                break;
            case TUESDAY:
            case WEDNESDAY:
            case THURSDAY:
            case FRIDAY:
                System.out.println("오늘은 평일입니다.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("오늘은 주말입니다.");
                break;
        }

        //ENUM의 기본 메서드
        Day tuesday = Day.TUESDAY;
        Day sunday = Day.SUNDAY;
        Day thursday = Day.THURSDAY;

        System.out.println("ordinal 값: "+ thursday.ordinal());
        System.out.println("ordinal 값: "+ sunday.ordinal());
        System.out.println("ordinal 값: "+ tuesday.ordinal());

        System.out.println("tuesday compareTo sunday: "+tuesday.compareTo(sunday)); //2-0 = 2

        Day[] days = Day.values();
        System.out.println("Days: "+ Arrays.toString(days));
    }
}