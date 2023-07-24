package practice.week4_day4.exception_test.custom_exception;

public class PTMemberTest {
    public static void main(String[] args) {
        PTMember member = new PTMember("민철", 178, 70, "Male");
        member.setID(null);

        System.out.println(member);
    }
}
