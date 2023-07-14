package hw.week3day3;

public class MovieAge {

    static String gradeByAge(int age){
        if(age<0){
            return "유아 관람 불가";
        }
        else if(age<12){
            return "전체 관람가";
        }
        else if(age<15){
            return "12세 이상 관람가";
        }
        else if(age<19){
            return "15세 이상 관람가";
        }
        else{
            return "청소년 관람불가";
        }
    }

    public static void main(String[] args) {
        for(int i=-1; i<20; i++){
            System.out.println(gradeByAge(i));
        }
    }
}
