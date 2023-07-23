package hw.week4_day3.classroom;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassRoom<T extends CollegeStudent> { //CollegeStudent 범위의 객체만 받겠다.

    private String className;
    private Map<String, T> studentMap; //학번, 학생 객체
    private List<String> studentNames; //학생 이름

    public ClassRoom(String className) {
        this.className = className;
        studentMap = new HashMap<>();
        studentNames = new ArrayList<>();
    }

    public void addStudent(T student) { //Map, List 둘 다 삽입
        studentMap.put(student.studentNumber, student);
        studentNames.add(student.name);
    }

    public CollegeStudent getStudentByStudentNumber(String studentId){ //Map 이용
        if(studentMap.containsKey(studentId)){
            return studentMap.get(studentId);
        }

        return null;
    }

    public void printStudentNames(){
        System.out.println("이 클래스 룸("+this.className+")은 학생들"+studentNames.toString()+"가 있습니다.");
    }
}