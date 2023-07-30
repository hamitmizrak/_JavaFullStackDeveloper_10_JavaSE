package com.hamitmizrak._01_JavaSE;

public class _16_AccessModifier {

    public String publicValue = "public Value";
    protected String protectedValue = "protected Value";
    private String privateValue = "private Value";
    String defaultValue = "default Value";

    // Access Modifier
    // public, protected, private, -(friendly,default)
    public static void main(String[] args) {
        // instance
        _16_AccessModifier data=new _16_AccessModifier();

        System.out.println(data.publicValue);
        System.out.println(data.protectedValue);
        System.out.println(data.privateValue);
        System.out.println(data.defaultValue);
    }
}