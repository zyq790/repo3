package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class ReflectDemo3 {
    public static void main(String[] args) throws Exception {
        //获取Person的class对象
        Class personClass = Person.class;

        Constructor constructor = personClass.getConstructor(String.class, int.class);
        System.out.println(constructor);
        Object obj = constructor.newInstance("郑三", 23);
        System.out.println(obj);

        System.out.println("-------------------");
        Constructor constructor1 = personClass.getConstructor();
        System.out.println(constructor1);
        Object obj1 = constructor1.newInstance();
        System.out.println(obj1);
    }
}
