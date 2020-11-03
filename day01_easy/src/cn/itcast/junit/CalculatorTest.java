package cn.itcast.junit;

public class CalculatorTest {

    public static void main(String[] args) {
        Calculator c=new Calculator();
        int result=c.add(2,4);
        System.out.println(result);
    }
}
