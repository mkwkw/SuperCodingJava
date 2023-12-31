package practice.week4_day5.string_util_test;

public class StringUtils {

    public static boolean isEmpty(String str){
        if(str==null || str.isEmpty()){
            return true;
        }
        return false;
    }

    public static String reverse(String str){
        StringBuilder sb = new StringBuilder();

        for(int i=str.length()-1; i>=0; i--){
            sb.append(str.charAt(i));
        }

        return sb.toString();
    }

    //2개의 메소드를 하나의 내부 클래스로 묶기
    public static class CharChecker{
        public static int countChar(String str, char targetChar){
            int count = 0;
            for(int i=0; i<str.length(); i++){
                if(str.charAt(i)==targetChar){
                    count++;
                }
            }
            return count;
        }

        public static boolean containsChar(String str, char targetChar){
            return countChar(str, targetChar)>=1;
        }
    }


}
