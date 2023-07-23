package hw.week4_day3.classroom;

public class Freshman extends YoungGroupCollegeStudent{

    private int grade;

    public Freshman(String studentNumber, String name, double gpa){
        super(studentNumber, name, gpa);
        this.grade = 1;
    }

    @Override
    public String toString() {
        return "Freshman{" + "studentNumber='" + studentNumber + "\'" + ", name='" + name + "\'" + ", gpa=" + gpa + '}';
    }
}
