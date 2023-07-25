package practice.week4_day5.string_util_test;

public class StringUtilTest {

    public static void main(String[] args) {
        String str = "Hello, World!";
        char target = 'o';

        //1. 문자열이 비어있는지 확인
        boolean isEmpty = StringUtils.isEmpty(str);
        System.out.println("str이 비어있는가? "+isEmpty);

        //2. 문자열을 반대로 뒤집기
        String str2 = StringUtils.reverse(str);
        System.out.println("reverse: "+str2);

        //3. 주어진 문자열에서 특정 문자의 개수 세기
        int countChar = StringUtils.countChar(str, target);
        System.out.println("o의 개수: "+countChar);

        //4. 주어진 문자열에 특정 문자가 있는지 확인
        boolean containChar = StringUtils.containsChar(str,target);
        System.out.println("o가 있는가? "+containChar);

    }
}
