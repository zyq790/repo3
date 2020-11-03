package cn.itcast.junit.cn.itcast.test;

import cn.itcast.junit.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    /**
     * 初始化操作
     * 用于资源申请
     */
    @Before
    public void init(){
        System.out.println("init...");
    }

    /**
     * 释放资源方法
     *
     */
    @After
    public void close(){
        System.out.println("close...");
    }

    /**
     * 测试add方法
     */
    @Test
    public void testAdd(){
        //System.out.println("呜呜");
        Calculator c=new Calculator();
        int result=c.add(1,7);
        //System.out.println(result);
        /*//断言
        Assert.assertEquals(3,result);*/
        System.out.println("testAdd...");
    }
}
