package hw.week4_day3.classroom;

public abstract class YoungGroupCollegeStudent extends CollegeStudent{

    public YoungGroupCollegeStudent(String studentNumber, String name, double gpa) {
        super(studentNumber, name, gpa);
    }

    @Override
    public String toString() {
        return "YoungGroupCollegeStudent{" + "studentNumber='" + studentNumber + "\'" + ", name='" + name + "\'" + ", gpa=" + gpa + '}';
    }
}
