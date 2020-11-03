package cn.itcast.reflect;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

public class ReflectTest {
    public static void main(String[] args) throws Exception {
        //可以创建任意类的对象,可以执行任意方法
        /**
         * 前提:不能改变类的任意代码,可以创建任意类的对象,可以执行任意方法
         */
       /* Person p=new Person();
        p.eat();*/
        /*Student stu=new Student();
        stu.sleep();*/
        Properties pro=new Properties();
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodsName");

        Class cls = Class.forName(className);
        Object obj= cls.newInstance();
        Method method = cls.getMethod(methodName);
        method.invoke(obj);
    }
}
