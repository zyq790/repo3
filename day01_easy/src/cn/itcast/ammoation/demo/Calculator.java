package cn.itcast.ammoation.demo;

public class Calculator {

    /**
     * 加法
      * @param a
     * @param b
     * @return
     */
    @check
    public void add(int a,int b){
        System.out.println("1 + 0 ="+(1 + 0));
    }

    /**
     * 减法
     * @param a
     * @param b
     * @return
     */
    @check
    public void sub(int a,int b){
        System.out.println("1 - 0 ="+(1 - 0));
    }

    /**
     * 乘法
     * @param a
     * @param b
     * @return
     */
    @check
    public void mul(int a,int b){
        System.out.println("1 * 0 ="+(1 * 0));
    }

    /**
     * 除法
     * @param a
     * @param b
     * @return
     */
    @check
    public void div(int a,int b){
        System.out.println("1 / 0 ="+(1 / 0));
    }

    public  void show(){
        System.out.println("没有bug...");
    }
}
