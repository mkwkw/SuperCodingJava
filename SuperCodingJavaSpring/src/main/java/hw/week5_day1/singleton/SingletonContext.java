package hw.week5_day1.singleton;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class SingletonContext {

    private static SingletonConfig config;
    private static Map<String, Method> singletonMap = new HashMap<>();
    private static Map<String, Object> singletonObjectMap = new HashMap<>();

    public static void setConfig(SingletonConfig config) {
        SingletonContext.config = config;
    }

    static synchronized Object getSingleton(String name) throws InvocationTargetException, IllegalAccessException {
        //Map을 이용한 Singleton 생성 로직 구현 필요합니다.
        Object singletonObject = singletonObjectMap.get(name);
        //없으면 싱글톤 객체 하나 만들고
        if(singletonObject == null){
            singletonObject = singletonMap.get(name).invoke(config); //싱글톤 객체 생성
            singletonObjectMap.put(name, singletonObject);
        }
        //있으면 그냥 리턴
        return singletonObject;
    }

    public static void executeMethodsBySingletonAnnotation(Object object) {
        // 1: Object 가 들어 오면 해당 클래스의 Method를 돌면서, @Singleton annotation을 발견합니다.
        //클래스 가져오기
        Class clazz = object.getClass();
        //가져온 클래스에서 메소드 가져오기
        Method[] methods = clazz.getDeclaredMethods();

        //메소드 돌면서 어노테이션 가져오기
        for(Method method : methods){
            Annotation[] annotations = method.getDeclaredAnnotations();

            for(Annotation annotation : annotations){
                if(annotation instanceof Singleton){
                    Singleton singletonAnnotation = (Singleton) annotation;
                    String name = singletonAnnotation.name();

                    // 2: 해당 Annotation의 name 과 method를 적당한 Map에 저장합니다.
                    singletonMap.put(name, method);
                }
            }
        }
    }

}
