package practice.week4_day3.generic_test;

public class Point<T extends Number,V extends Number> {

    private T x;
    private V y;

    public Point(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public V getY() {
        return y;
    }

    //해당 좌표와 원점 사이의 거리 구하기
    public Double calculateDistance(){
        if(this.x instanceof Number && this.y instanceof Number){

            Double num1 = ((Number)this.x).doubleValue();
            Double num2 = ((Number)this.y).doubleValue();

            return Math.sqrt(Math.pow(num1, 2)+Math.pow(num2, 2));
        }
        else{
            return null;
        }
    }
}
