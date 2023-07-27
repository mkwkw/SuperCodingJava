package practice.week5_day1.multi_thread_and_socket;

import practice.week4_day5.socket_programming.Customer;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {

    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        try(ServerSocket serverSocket = new ServerSocket(1234); // 서버 소켓 생성
        ){
            System.out.println("Thread: "+Thread.currentThread().getName()+": "+"서버가 시작되었습니다.");

            //한번 수행하고 종료하지 않도록
            while(true) {
                try {
                    Socket clientSocket = serverSocket.accept(); // 클라이언트 접속 대기

                    //멀티 쓰레드로 실행되도록
                    //여러 쓰레드로 실행되더라도 customerList를 공유하도록 인자로 넣음.
                    Thread request = new Thread(new RequestHandler(clientSocket, customerList));
                    request.start();

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
