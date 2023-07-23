package hw.week4_day3.classroom;

public class Sophomore extends YoungGroupCollegeStudent{

    protected int grade;
    public Sophomore(String studentNumber, String name, double gpa){
        super(studentNumber, name, gpa);
        this.grade = 2;
    }

    @Override
    public String toString() {
        return "Sophomore{" + "studentNumber='" + studentNumber + "\'" + ", name='" + name + "\'" + ", gpa=" + gpa + '}';
    }
}
