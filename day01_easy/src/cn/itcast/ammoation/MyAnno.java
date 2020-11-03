package cn.itcast.ammoation;


public @interface MyAnno {
    String name();
    int age();
    String cno() default "120";
}
