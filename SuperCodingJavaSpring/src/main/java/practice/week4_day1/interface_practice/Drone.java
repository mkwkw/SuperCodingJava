package practice.week4_day1.interface_practice;

public class Drone implements Flyable{

    private String droneID;
    private long remainingFuelAmount;
    private long remainingFileStorage;

    public void takePicture(){
        Flyable.printAlert();
        System.out.println("이 드론은 사진을 찍고 있습니다.");
    }
}
