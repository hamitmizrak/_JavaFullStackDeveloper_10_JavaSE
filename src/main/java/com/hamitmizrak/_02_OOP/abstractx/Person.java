package com.hamitmizrak._02_OOP.abstractx;

import lombok.Data;

@Data
abstract public class Person {
    private Long id;
    private String username;
    private String emailAddress;
    private String password;
    private String telNumber;

    public void govdeliMethod(String data){
        System.out.println(data+" ");
    }
    abstract public void govdesizMethod(String data);
}
