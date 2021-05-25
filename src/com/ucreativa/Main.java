package com.ucreativa;

import com.ucreativa.familia.Kenneth;
import com.ucreativa.familia.Liz;

public class Main {

    public static void main(String[] args) {

        Kenneth yo = new Kenneth();
        Liz madre = new Liz("Hola Kenneth");

        madre.setAge();
        int age = madre.getAge();

        System.out.println("Chao Kenneth");
        System.out.println("Mi edad es: " + age);
        System.out.println("Hobby: " + madre.getHobby());



    }
}
