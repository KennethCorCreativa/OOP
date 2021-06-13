package com.ucreativa;

import com.ucreativa.familia.Kenneth;
import com.ucreativa.familia.Liz;

public class Main {


    public static void main(String[] args) {

        Kenneth yo = new Kenneth("Hola a todos", 28, "Ciclismo");
        Liz madre = new Liz("Hola Kenneth", 51, "Coser"
        );

        madre.setAge();
        int age = madre.getAge();

        System.out.println("Chao Kenneth");
        System.out.println("Mi edad es: " + age);
        System.out.println("Hobby: " + madre.getHobby());


    }
}
