package hw.week4_day4.calculator;

public class DivideByZeroException extends RuntimeException{
    public DivideByZeroException(String message) {
        super(message);
    }
}
