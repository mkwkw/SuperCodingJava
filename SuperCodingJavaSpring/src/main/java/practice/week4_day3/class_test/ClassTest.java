package practice.week4_day3.class_test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Customer customer = new Customer("민철");
        Class clazz = customer.getClass();

        Constructor[] constructors = clazz.getConstructors(); //생성자 2개 들어감. - 이름만 필요한 생성자, 이름과 아이디가 필요한 생성자
        for(Constructor constructor : constructors){
            System.out.println(constructor);
        }

        Method[] methods = clazz.getMethods();
        for(Method method: methods){
            System.out.println(method);
        }

        //Field[] fields = clazz.getFields(); //public으로 선언된 필드만 가져올 수 있음.
        Field[] fields1 = clazz.getDeclaredFields(); //public으로 선언된 필드가 아니더라도 가져옴.
        for(Field field : fields1){
            System.out.println(field);
        }

        //인스턴스 생성
        Customer customer1 = (Customer) clazz.getConstructor(String.class).newInstance("민철");
        System.out.println(customer1);
    }
}
