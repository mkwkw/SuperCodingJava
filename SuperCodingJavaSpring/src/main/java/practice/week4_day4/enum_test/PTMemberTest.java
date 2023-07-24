package practice.week4_day4.enum_test;

public class PTMemberTest {
    public static void main(String[] args) {
        PTMember member = new PTMember("민철", 178, 70, "Male");
        member.setID(null);

        System.out.println(member);
    }
}
