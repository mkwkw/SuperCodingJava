package hw.week5_day1.singleton;

public class SingletonConfig {

    //싱글톤으로 쓰일 book과 car
    @Singleton(name = "book")
    public Book makeBook(){
        return new Book("title", "author");
    }

    @Singleton(name = "book2")
    public Book makeBook2(){
        return new Book("title2", "author2");
    }

    @Singleton(name = "car")
    public Car makeCar(){
        return new Car(2022, "red");
    }

    @Singleton(name = "car3")
    public Car makeYellowCar(){
        return new Car(2021, "yellow");
    }

}
