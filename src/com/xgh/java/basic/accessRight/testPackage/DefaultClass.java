package com.xgh.java.basic.accessRight.testPackage;

class DefaultClass {
    private static class PrivateInnerClass
    {
        public void Show()
        {
            System.out.println("PrivateInnerClass");
        }
    }

    static class DefaultInnerClass
    {
        public void Show()
        {
            System.out.println("DefaultInnerClass");
        }
    }

    public static class PublicInnerClass
    {
        public void Show()
        {
            System.out.println("PrivateInnerClass");
        }
    }
}
