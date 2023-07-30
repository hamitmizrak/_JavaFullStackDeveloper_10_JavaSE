package com.hamitmizrak._01_JavaSE;

import java.util.Objects;

public class _19_1_ClassTutorials {

    // Nesne değişkenleri
    private String userName;
    private String userSurname;

    // parametresiz Constructor
    public  _19_1_ClassTutorials() {
        this.userName="Adınızı yazınız";
    }

    // parametreli Constructor
    public _19_1_ClassTutorials(String userName, String userSurname) {
        this.userName = userName;
        this.userSurname = userSurname;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, userSurname);
    }

    @Override
    public String toString() {
        return "_19_ClassTutorials{" +
                "adınız='" + userName + '\'' +
                ", soyadınız='" + userSurname + '\'' +
                '}';
    }

    // GETTER SETTER

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSurname() {
        return userSurname;
    }

    public void setUserSurname(String userSurname) {
        this.userSurname = userSurname;
    }
}// end Class


class Main{
    public static void main(String[] args) {
        _19_1_ClassTutorials tutorials=new _19_1_ClassTutorials();
        tutorials.setUserName("Hamit");
        tutorials.setUserSurname("Mızrak");
        System.out.println(tutorials);
    }
}
