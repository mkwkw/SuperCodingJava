package hw.week3day4;

import hw.week3day4.Student;

import java.util.ArrayList;

public class StudentManagementSystem {

    private ArrayList<Student> arr;
    int capacity;

    public StudentManagementSystem(int capacity){
        this.arr = new ArrayList<>();
        this.capacity = capacity;
    }

    //학생 객체 추가
    public void addStudent(Student student){
        if(arr.size()<capacity){
            arr.add(student);
            System.out.println("학생 추가: "+student.getName());
        }
        else{
            System.out.println("학생 데이터베이스가 가득 찼습니다.");
        }
    }

    //학생 객체 삭제
    public void removeStudent(Student student){
        if(arr.contains(student)) {
            arr.remove(student);
        }
        else{
            System.out.println("학생을 찾을 수 없습니다.");
        }
    }

    //힉생 객체 검색
    public void searchStudent(int id){
        for(Student student : arr){
            if(student.getId()==id){
                System.out.println("학생을 찾았습니다.");
                System.out.println("이름: "+student.getName());
                System.out.println("학번: "+student.getId());
                System.out.println("전공: "+student.getMajor());
                System.out.println("학년: "+student.getGrade());
                return;
            }
        }

        System.out.println("학생을 찾을 수 없습니다.");
    }
}
