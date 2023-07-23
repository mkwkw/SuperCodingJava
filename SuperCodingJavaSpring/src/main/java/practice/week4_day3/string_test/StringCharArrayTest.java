package practice.week4_day3.string_test;

public class StringCharArrayTest {

    public static void main(String[] args) {

        //CharArray -> String
        char[] chars = {'a','b','c'};

        String str1 = new String(chars);
        String str2 = String.valueOf(chars);

        System.out.println(str1);
        System.out.println(str2);

        //String -> CharArray
        char[] chars2 = str1.toCharArray();
        for(char ch : chars2){
            System.out.println(ch);
        }

        System.out.println(str1.charAt(0));
        System.out.println(str1.charAt(1));
        System.out.println(str1.charAt(2));
    }
}
