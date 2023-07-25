package practice.week4_day5.lambda_test;

@FunctionalInterface
public interface GenericLambda<T> {
    T calculate(T t);
}
