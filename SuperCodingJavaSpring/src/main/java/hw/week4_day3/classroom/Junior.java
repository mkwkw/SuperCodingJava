package hw.week4_day3.classroom;

public class Junior extends ElderGroupCollegeStudent{

    private int grade;

    public Junior(String studentNumber, String name, double gpa){
        super(studentNumber, name, gpa);
        this.grade = 3;
    }

    @Override
    public String toString() {
        return "Junior{" + "studentNumber='" + studentNumber + "\'" + ", name='" + name + "\'" + ", gpa=" + gpa + '}';
    }
}
