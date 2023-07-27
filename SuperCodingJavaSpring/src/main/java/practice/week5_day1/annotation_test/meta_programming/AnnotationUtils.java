package practice.week5_day1.annotation_test.meta_programming;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationUtils {

    //어노테이션의 정보를 가지고 메소드를 실행
    public static void executeMethodsByRepeatAnnotation(Object object) {

        //리플랙션 이용
        //클래스 타입 가져오기, 메소드 가져오기
        Class clazz = object.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            //메소드에 붙은 어노테이션 들고오기
            Annotation[] annotations = method.getDeclaredAnnotations();

            for (Annotation annotation : annotations) {
                //Repeat 어노테이션이 있을 때
                if (annotation instanceof Repeat) {
                    Repeat repeatAnnotation = (Repeat) annotation;
                    int repeatCount = repeatAnnotation.value(); //어노테이션의 속성인 value에서 숫자값 가져오기

                    for (int i = 0; i < repeatCount; i++) {
                        try {
                            //리플랙션
                            method.invoke(object);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }

}
