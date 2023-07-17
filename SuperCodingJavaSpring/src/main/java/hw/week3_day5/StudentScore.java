package hw.week3_day5;

import java.util.Arrays;

public class StudentScore {

    // static
    private static int serialIndex;
    private static int[] allScores;

    private int myIndex;
    private int score;

    public static int[] getAllScores() {
        return allScores;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
        allScores[myIndex] = score;
    }

    public StudentScore(int score) {
        this.score = score;
        this.myIndex = serialIndex++; //전체 allScore의 길이++
        addAllScore(score);
    }

    private static void addAllScore(int score) {
        if(allScores==null){
            allScores = new int[1];
            allScores[0] = score;
            return;
        }
        //else
        int length = allScores.length;
        allScores = Arrays.copyOf(allScores, length+1);
        allScores[length] = score;
    }
}
