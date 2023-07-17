package practice.week4_day1.interface_practice;

public class Airplane implements Flyable{

    private String airplaneID;
    private long remainingFuelAmount;
    private long maximumCapacity;

    @Override
    public void fly() {
        System.out.println("비행기 ID("+airplaneID+")가 납니다.");
    }

    public void refillFuel(long fuel){
        remainingFuelAmount += fuel;
    }

    public Airplane(String airplaneID) {
        this.airplaneID = airplaneID;
    }
}
