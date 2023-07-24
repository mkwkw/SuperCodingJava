package practice.week4_day4.datetime_test;

public class PTMemberTest {
    public static void main(String[] args) {
        PTMember member = new PTMember("민철", 178, 70, "Male");
        member.setID("abcdefghij");

        System.out.println(member.toString());
    }
}
