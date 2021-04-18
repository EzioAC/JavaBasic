package com.xgh.java.basic.accessRight.testPackage;

public class SubClass extends PublicClass
{
    @Override
    public void showPublicVal()
    {
        super.showPublicVal();
        System.out.println(publicVal);
    }

    @Override
    //允许权限升级
    // default -> protected -> public
    // private就算了,你自己没权限,还升个锤子级
    public void showProtectVal()
    {
        super.showProtectVal();
        System.out.println(protectedVal);
    }


    @Override
    protected void showDefaultVal()
    {
        super.showDefaultVal();
        System.out.println(defaultVal);
    }

    // @Override 添加额外的编译器检查 "嘿!这是一个重写方法,如果不是就报错!"
    // 这里并没有重写,你看不到private的方法,更别提重写它了
    //@Override
    private void showPrivateVal()
    {
        System.out.println("无法获取父类的private方法和字段");
        //super.showPrivateVal();
        //System.out.println(privateVal);
    }
}
