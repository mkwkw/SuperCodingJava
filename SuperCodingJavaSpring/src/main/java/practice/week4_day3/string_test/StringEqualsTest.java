package practice.week4_day3.string_test;

public class StringEqualsTest {

    public static void main(String[] args) {

        String str1 = "cat";
        String str2 = "cat";

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String str3 = new String("cat");
        String str4 = new String("cat");

        System.out.println(str3==str4);
        System.out.println(str3.equals(str4));

        //둘 다 charArray내용은 cat -> true
        System.out.println(str3.equals(str1));
        //주소값은 다름
        System.out.println(str3==str1);
    }
}
