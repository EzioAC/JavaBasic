package com.xgh.java.basic.innerClass;

public class InnerClassTry {
    private String name;
    static private String staticName;

    InnerClassTry() {
        name = "InnerClassTry";
    }

    public void Show() {
        System.out.println("InnerClassTry:" + name);
    }

    private static void privateMethod()
    {

    }
    /*
     * 内部类(非静态内部类,准确点的话)
     * 依赖于外部类对象才行 var inner = test.new Inner();
     * 可以使用外部类的数据
     * System.out.println("Inner:"+this.name);
     * System.out.println("Outer:"+InnerClassTry.this.name);
     * */
    public class Inner {
        String name;

        Inner() {
            name = "Inner";
        }

        public void Show() {
            //等同于this.name 局部变量覆盖原则
            System.out.println("Inner:" + name);
            //private也有权限访问(相当于内部类是外部类的一部分)
            //InnerClassTry.this.name 比较特殊,显式访问外部类数据用
            System.out.println("Outer:" + InnerClassTry.this.name);
        }

    }

    /*
     * 静态内部类(或者内部嵌套类,这个叫法更合理,这个类实际上一点都不静态)
     * 除了
     * 1.new的时候需要new InnerClassTry.StasticInner();
     * 2.可以访问外部类的私有静态字段和方法
     * 完全是个独立类,和外部类没啥关系,单纯的"寄人篱下"而已
     * */
    public static class Static {
        String name;

        Static() {
            name = "StasticInner";
        }

        public void Show() {
            System.out.println("我能访问外部类的私有静态字段和方法:" + staticName);
            privateMethod();
            System.out.println("StasticInner:" + name);
            privateMethod();
        }
    }

    public static void main(String[] args) {
        var test = new InnerClassTry();
        var inner = test.new Inner();
        var statisInner = new Static();
        test.Show();
        inner.Show();
        statisInner.Show();
    }
}
