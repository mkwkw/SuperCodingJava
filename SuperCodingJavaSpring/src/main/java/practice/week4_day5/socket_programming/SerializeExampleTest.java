package practice.week4_day5.socket_programming;

import java.io.*;

public class SerializeExampleTest {
    public static void main(String[] args) {

        byte[] serializedData = null;
        //직렬화
        Person person = new Person("이순신", "Male", 30, "Korea", "soldier");

        try(ByteArrayOutputStream bao = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bao);){

            objectOutputStream.writeObject(person); //객체 -> 바이트
            objectOutputStream.flush();

            serializedData = bao.toByteArray();
            System.out.println("Person 직렬화 후: "+new String(serializedData));

        } catch (IOException e) {
            e.printStackTrace();
        }

        try(ByteArrayInputStream bai = new ByteArrayInputStream(serializedData);
            ObjectInputStream objectInputStream = new ObjectInputStream(bai);
        ){
            Person person1 = (Person) objectInputStream.readObject();
            System.out.println("Person 역직렬화 후"+person1);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
