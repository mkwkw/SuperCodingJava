package practice.week4_day3.generic_test;

public class PointSituation {

    public static void main(String[] args) {
        Point<Integer, Integer> point1 = new Point(1,5);
        Point<Integer, Double> point2 = new Point(5, 4.55);
        Point<Double, Double> point3 = new Point(1.5, 5.5);

        System.out.println(point1.calculateDistance());
        System.out.println(point2.calculateDistance());
        System.out.println(point3.calculateDistance());

        //extends Number를 지정하면 에러가 남.
        //Point<String, Integer> point4 = new Point<>("Cat", 5);
    }
}
