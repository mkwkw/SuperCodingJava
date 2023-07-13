package hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoPowerArr {

    //문제: arr의 길이가 2의 정수 거듭제곱이 되도록 arr 뒤에 최소한의 개수에 정수 0을 추가하는 함수를 만들어라.
    static int[] makeTwoPowerArr(int[] arr){
        int[] result;

        //1. arr 길이 계산
        int arrLength = arr.length;

        //2. arr의 길이보다 큰 가장 작은 2의 제곱 수 찾기
        int exp = 0; //지수
        while(Math.pow(2,exp)<arrLength){
            ++exp;
        }

        result = new int[(int)Math.pow(2,exp)];

        for(int i=0; i<arrLength; i++){
            result[i] = arr[i];
        }
        for(int i=arrLength; i<(int)Math.pow(2,exp); i++){
            result[i] = 0;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        String answer = Arrays.toString(makeTwoPowerArr(arr));
        System.out.println(answer);
    }
}
