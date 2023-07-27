package practice.week5_day1.multi_thread_and_socket;

import practice.week4_day5.socket_programming.Customer;

import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.List;

public class RequestHandler implements Runnable{

    private Socket clientSocket;
    private List<Customer> customerList; //대기 명단

    public RequestHandler(Socket clientSocket, List<Customer> customerList) {
        this.clientSocket = clientSocket;
        this.customerList = customerList;
    }

    @Override
    public void run() {
        try{
            System.out.println("클라이언트가 접속하였습니다.");

            //소켓 열기
            // 클라이언트로부터 데이터를 받기 위한 InputStream 생성
            InputStream clientInputstream = clientSocket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(clientInputstream);

            // 클라이언트로 데이터를 보내기 위한 OutputStream 생성
            OutputStream serverOutputStream = clientSocket.getOutputStream();
            PrintWriter printWriter = new PrintWriter(serverOutputStream, true);

            Customer customer = (Customer) objectInputStream.readObject();

            //synchronized 키워드를 사용하기 위하여 ListUtils라이브러리에 addList 메소드 생성
            //customerList.add(customer);
            ListUtils.addList(customerList, customer);
            //Socket 연동 요청이 올 때마다, 새로운 Thread로 업무 할당하기
            System.out.println("Thread: "+Thread.currentThread().getName()+": "+customer + "가 대기명단에 추가되었습니다.");

            printWriter.println("현재 고객 대기 명단은: "+customerList);

            //소켓 닫기
            clientSocket.close();

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
