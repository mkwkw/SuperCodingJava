package hw.week3_day5;

class Circle extends Shape {
    private static final double PI = 3.14;
    private double radius;

    public Circle(String color, double radius) {
        super(color); //Shape 생성자 이용
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return PI*radius*radius;
    }

    public void printCircleInfo() {
        super.printInfo(); //Shape의 메서드 이용
        System.out.println("원의 반지름: "+radius);
    }
}
