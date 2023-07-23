package practice.week4_day3.wrapper_class_test;

public class WrapperClassTest {

    public static void main(String[] args) {
        //Integer
        Integer integer1 = new Integer(20); //박싱
        Integer integer2 = new Integer(30);

        int int1 = integer1.intValue(); //언박싱

        System.out.println(integer1);
        System.out.println(int1);

        //오토박싱
        Integer integer3 = 20; //new Integer(20)
        //오토언박싱
        int int2 = integer3;

        //연산자 - 잘 됨.
        System.out.println(integer1+integer2);
        System.out.println(integer1+int1);

        //Character
        Character character = new Character('X'); //박싱
        char ch1 = character.charValue(); //언박싱

        //오토박싱
        Character character1 = 'x';
        Character[] characters = {'a','b','c'};
        String str = String.valueOf(characters); //예상대로 안됨. 주소값이 들어감. -> wrapper 클래스는 지원X
        //오토언박싱
        char ch2 = character1;

        System.out.println(character);
        System.out.println(ch1);

        //Boolean
        Boolean boolean1 = new Boolean(true);
        boolean b1 = boolean1.booleanValue();

        Boolean boolean2 = true;
        boolean b2 = boolean2;

        System.out.println(boolean1&boolean2); //wrapper 클래스도 연산됨.
        System.out.println(boolean1|boolean2); //wrapper 클래스도 연산됨.
        //if문에도 wrapper 클래스가 조건으로 들어갈 수 있음.
    }
}
