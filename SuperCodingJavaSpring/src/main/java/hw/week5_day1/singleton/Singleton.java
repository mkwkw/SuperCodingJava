package hw.week5_day1.singleton;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// SingleTon Annotation을 만들어주세요. ( hint: Method, Runtime 에 동작 해야합니다. )
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Singleton {
    String name();
}
