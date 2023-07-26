package practice.week4_day5.socket_programming;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class ServerAdvance {
    public static void main(String[] args) {

        List<Customer> customerList = new ArrayList<>();

        //한 번 실행하고 종료되지 않도록 하기
        //서버 소켓 생성
        //클라이언트 접속 대기
        try(ServerSocket serverSocket = new ServerSocket(1234); //서버 소켓 생성
        ){
            System.out.println("서버가 시작되었습니다.");

            //무한 루프로 종료되지 않도록 하기
            while(true) {
                try (Socket clientSocket = serverSocket.accept(); //클라이언트 접속 대기
                ) {
                    System.out.println("클라이언트가 접속하였습니다.");

                    //클라이언트로부터 데이터를 받기 위한 InputStream 생성
                    InputStream clientInputStream = clientSocket.getInputStream();
                    BufferedReader clientBufferedReader = new BufferedReader(new InputStreamReader(clientInputStream));

                    //클라이언트로 데이터를 보내기 위한 OutputStream 생성
                    OutputStream serverOutputStream = clientSocket.getOutputStream();
                    PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

                    //input line
                    String inputLine;

                    //클라이언트로부터 데이터를 읽고 화면에 출력
                    while ((inputLine = clientBufferedReader.readLine()) != null) {
                        System.out.println("클라이언트로부터 온 요청은 " + inputLine);

                        String[] strs = inputLine.split(",");
                        String name = strs[1];
                        String ID = strs[0];

                        Customer customer = new Customer("");
                        customerList.add(customer);

                        printWriter.println("현재 고객 대기명단입니다."); //클라이언트가 받을 응답 //클라언트에게 응답을 보냄.
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
