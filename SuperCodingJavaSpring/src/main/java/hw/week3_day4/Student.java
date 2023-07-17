package hw.week3_day4;

public class Student {
    private String name;
    private int id;
    private String major;
    private int grade;

    public Student(String name, int id, String major, int grade){
        this.name = name;
        this.id = id;
        this.major = major;
        this.grade = grade;
    }

    public String getName(){
        return this.name;
    }

    public int getId(){
        return this.id;
    }

    public String getMajor(){
        return this.major;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setMajor(String major){
        this.major = major;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }
}
