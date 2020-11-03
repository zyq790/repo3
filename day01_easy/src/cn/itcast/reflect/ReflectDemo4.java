package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class ReflectDemo4 {
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class personClass = Person.class;

       // Method methods = personClass.getMethod("food");
        Method methods = personClass.getMethod("food",String.class);
        Person person=new Person();
        methods.invoke(person,"苹果");

        System.out.println("--------------");
        Method[] methods1 = personClass.getMethods();
        for (Method method:methods1){
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
        }

        String name = personClass.getName();
        System.out.println(name);

    }
}
