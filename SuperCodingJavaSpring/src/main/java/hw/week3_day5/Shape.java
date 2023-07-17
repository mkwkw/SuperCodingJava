package hw.week3_day5;

class Shape {
    protected String color;

    protected Shape(String color) {
        this.color = color;
    }

    public double getArea() {
        return 0.0;
    } //오버라이딩 됨.

    protected void printInfo() {
        System.out.println("도형의 색상: " + color);
        System.out.println("도형의 면적: " + getArea());
    }
}
