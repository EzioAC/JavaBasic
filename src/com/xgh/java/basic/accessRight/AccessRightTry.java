package com.xgh.java.basic.accessRight;

//import com.xgh.java.basic.accessRight.testPackage1.DefaultClass;
import com.xgh.java.basic.accessRight.testPackage.PublicClass;
import com.xgh.java.basic.accessRight.testPackage.SubClass;

public class AccessRightTry {



    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        //1.1 不同权限级别的的字段和方法
        // 可以访问 public
        System.out.println(publicClass.publicVal);
        publicClass.showPublicVal();
        //1.2 不同权限的类
        // 不可以访问protected(不在同一个包里面)
        //System.out.println(publicClass.protectedVal);
        //publicClass.showProtectVal();

        //2.1 不同权限的类
        // 不可以访问default类(不在同一个包里面)
        //DefaultClass defaultClass = new DefaultClass();

        //3.1 父子类之间权限级别
        SubClass subClass = new SubClass();
        subClass.showPublicVal();
        subClass.showProtectVal();

        //4.1 外部类为public 内部静态类为public
        PublicClass.PublicStaticInnerClass temp = new PublicClass.PublicStaticInnerClass();
        temp.Show();
        //4.2 外部类没有权限,内部类免谈
        //DefaultClass.PublicInnerClass temp2 = new DefaultClass.PublicInnerClass();

        //5.1 外部类为public 内部类为public
        PublicClass.PublicInnerClass a = publicClass.new PublicInnerClass();
        //5.2 同4.2
        //PublicClass.PublicInnerClass b = publicClass.new DefaultInnerClass();
    }
}
