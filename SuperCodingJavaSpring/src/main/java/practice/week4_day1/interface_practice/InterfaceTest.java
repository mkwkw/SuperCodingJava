package practice.week4_day1.interface_practice;

public class InterfaceTest {
    public static void main(String[] args) {

        System.out.println(Flyable.atmosphereLimit); //static final 상수이므로 바로 부를 수 있음.

        Flyable bird = new Bird(); //Flyable로 bird를 갖고 와서 eat이나 sleep메소드를 불러 올 수 없다.
        Flyable airplane = new Airplane("AB123");

        bird.fly();
        airplane.fly();

        Walkable person = new Person();
        Person person2 = new Person();
        person2.setName("Jane");
        Walkable robot = new Robot("RB123");

        person.walk();
        robot.walk();

        //Flyable에 정의된 메소드 외에 Robot에 정의된 메소드 사용하고 싶을 때 - 다운캐스팅
        if(robot instanceof Robot){
            Robot robot2 = (Robot)robot;
            robot2.helpPerson(person2);
        }

        Flyable drone = new Drone();
        drone.fly();

        if(drone instanceof Drone){
            Drone drone1 = (Drone) drone;
            drone1.takePicture();
        }

    }
}
