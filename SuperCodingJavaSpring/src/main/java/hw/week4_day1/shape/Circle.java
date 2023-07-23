package hw.week4_day1.shape;

public class Circle extends Shape {

    private static final double PI = Math.PI;
    private double radius;

    public Circle(double radius) {
        super(2, "기본색");
        this.radius = radius;
    }

    public double calculatePerimeter(){
        return 2*PI*radius;
    }

    @Override
    public double calculateArea() {
        return PI*radius*radius;
    }

    public double calculateDiameter(){
        return 2*radius;
    }

    public double getRadius() {
        return radius;
    }
}
