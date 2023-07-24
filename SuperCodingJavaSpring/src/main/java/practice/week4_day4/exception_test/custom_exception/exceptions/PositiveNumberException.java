package practice.week4_day4.exception_test.custom_exception.exceptions;

public class PositiveNumberException extends RuntimeException {
    public PositiveNumberException(String message) { //예외 메시지 작성
        super(message);
    }
}
