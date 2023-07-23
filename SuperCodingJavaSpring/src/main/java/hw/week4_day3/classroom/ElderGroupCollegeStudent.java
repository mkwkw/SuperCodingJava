package hw.week4_day3.classroom;

public abstract class ElderGroupCollegeStudent extends CollegeStudent{

    public ElderGroupCollegeStudent(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "ElderGroupCollegeStudent{" + "studentNumber='" + studentNumber + "\'" + ", name='" + name + "\'" + ", gpa=" + gpa + '}';
    }

}
