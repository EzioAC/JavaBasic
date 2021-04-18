package com.xgh.java.basic.accessRight.testPackage;

public class PublicClass {
    public int publicVal;
    protected int protectedVal;
    int defaultVal;
    private int privateVal;
    private static int privateStaticVal;

    public PublicClass()
    {
        publicVal = 1;
        protectedVal = 2;
        defaultVal = 3;
        privateVal = 4;
    }

    public void showPublicVal()
    {
        System.out.println(publicVal);
    }

    protected void showProtectVal()
    {
        System.out.println(protectedVal);
    }

    void showDefaultVal()
    {
        System.out.println(defaultVal);
    }

    private void showPrivateVal()
    {
        System.out.println(privateVal);
    }


    private static class PrivateStaticInnerClass
    {
        public void Show()
        {
            //静态内部类没有外部类的静态方法字段算有权限
            System.out.println(privateStaticVal);
            System.out.println("PrivateInnerClass");
        }
    }

    static class DefaultStaticInnerClass
    {
        public void Show()
        {
            System.out.println("DefaultInnerClass");
        }
    }

    protected static class ProtectedStaticInnerClass
    {
        public void Show()
        {
            System.out.println("ProtectedStaticInnerClass");
        }
    }

    public static class PublicStaticInnerClass
    {
        public void Show()
        {
            System.out.println("PrivateInnerClass");
        }
    }

    private class PrivateInnerClass
    {
        public void Show()
        {
            //静态内部类没有外部类的静态方法字段算有权限
            System.out.println(privateStaticVal);
            System.out.println("PrivateInnerClass");
        }
    }

    class DefaultInnerClass
    {
        public void Show()
        {
            privateVal = 1;
            System.out.println("DefaultInnerClass");
        }
    }

    protected class ProtectedInnerClass
    {
        public void Show()
        {
            privateVal = 1;
            System.out.println("ProtectedStaticInnerClass");
        }
    }

    public class PublicInnerClass
    {
        public void Show()
        {
            privateVal = 1;
            System.out.println("PrivateInnerClass");
        }
    }



}
