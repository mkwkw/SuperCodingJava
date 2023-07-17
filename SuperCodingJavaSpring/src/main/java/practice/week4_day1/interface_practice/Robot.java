package practice.week4_day1.interface_practice;

public class Robot implements Walkable{

    private String robotID;
    private String modelName;
    private String color;

    @Override
    public void walk() {
        System.out.println("로봇ID "+this.robotID+"입니다.");
    }

    public void helpPerson(Person person){
        String name = person.getName();
        System.out.println("로봇이 인간"+name+"을 돕습니다.");
    }

    public Robot(String robotID) {
        this.robotID = robotID;
    }
}
