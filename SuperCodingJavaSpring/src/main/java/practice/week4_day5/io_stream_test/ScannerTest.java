package practice.week4_day5.io_stream_test;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("이름 입력해주세요!");
        String name = sc.nextLine();

        System.out.println("직업 입력해주세요!");
        String job = sc.nextLine();

        System.out.println("나이 입력해주세요!");
        int age = sc.nextInt();

        System.out.printf("이름: %s 직업: %s 나이:%d", name,job,age);
    }
}
