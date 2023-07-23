package hw.week4_day1.shape;

public abstract class Shape {

    private int dimension;
    private String color;

    public Shape(int dimension, String color) {
        this.dimension = dimension;
        this.color = color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public String getColor(){
        return color;
    }

    public int getDimension(){
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
