package com.hamitmizrak._01_JavaSE;

public class _16_AccessModifier2 {


    // Access Modifier
    // public, protected, private, -(friendly,default)
    public static void main(String[] args) {
        _16_AccessModifier data=new _16_AccessModifier();
        System.out.println(data.publicValue);
        System.out.println(data.protectedValue);
        //System.out.println(data.privateValue);
        System.out.println(data.defaultValue);
    }
}