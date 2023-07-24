package hw.week4_day4.order_system;

public class Customer {
    private String name;
    private int age;
    private Gender gender;

    public Customer(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = Enum.valueOf(Gender.class, gender);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender.toString() + '\'' +
        '}';
    }
}
