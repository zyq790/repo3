package cn.itcast.reflect;

import cn.itcast.domain.Person;

import java.lang.reflect.Field;

public class ReflectDemo2 {
    public static void main(String[] args) {
        //获取Person的class对象
        Class personClass = Person.class;
        Field[] fields = personClass.getFields();
        for(Field field:fields){
            System.out.println(field);
        }

    }
}
