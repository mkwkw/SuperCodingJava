package practice.week5_day1.annotation_test;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Documented
public @interface MyAnnotation {
    //속성 정의
    String name();
    int count() default 0;
}
