package hw.week4_day3.classroom;

public class Senior extends ElderGroupCollegeStudent{

    private int grade;

    public Senior(String studentNumber, String name, double gpa){
        super(studentNumber, name, gpa);
        this.grade = 4;
    }

    @Override
    public String toString() {
        return "Senior{" + "studentNumber='" + studentNumber + "\'" + ", name='" + name + "\'" + ", gpa=" + gpa + '}';
    }
}
