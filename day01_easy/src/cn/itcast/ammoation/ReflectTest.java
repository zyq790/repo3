package cn.itcast.ammoation;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

@Pro(className = "cn.itcast.ammoation.Demo2",methodName = "show")
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象,可以执行任意方法
        /**
         * 前提:不能改变类的任意代码,可以创建任意类的对象,可以执行任意方法
         */
         //1、解析注解
        Class<ReflectTest> reflectTestClass = ReflectTest.class;
        Pro an = reflectTestClass.getAnnotation(Pro.class);
        String className = an.className();
        String methodName = an.methodName();
        System.out.println(className);
        System.out.println(methodName);
        Class cls = Class.forName(className);
        Object obj= cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
