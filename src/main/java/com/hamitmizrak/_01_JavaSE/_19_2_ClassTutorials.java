package com.hamitmizrak._01_JavaSE;

import lombok.*;

// LOMBOK
@AllArgsConstructor
@NoArgsConstructor
@Data
public class _19_2_ClassTutorials {

    // Nesne değişkenleri
    private String userName;
    private String userSurname;
}

class MainData{
    public static void main(String[] args) {
        _19_2_ClassTutorials tutorials=new _19_2_ClassTutorials();
        tutorials.setUserName("Hamit");
        tutorials.setUserSurname("Mızrak");
        System.out.println(tutorials);
    }
}

