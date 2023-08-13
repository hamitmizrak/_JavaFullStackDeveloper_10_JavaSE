package com.hamitmizrak._02_OOP.interfacex;

public class InterfaceMain implements ICrud{
    @Override
    public void create() {
        System.out.println("create");
    }

    @Override
    public void delete() {
        System.out.println("delete");
    }

    @Override
    public void update() {
        System.out.println("update");
    }

    @Override
    public void select() {
        System.out.println("select");
    }

    public static void main(String[] args) {
        InterfaceMain main=new InterfaceMain();
        main.create();
    }
}
