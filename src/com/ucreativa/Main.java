package com.ucreativa;

import com.ucreativa.familia.Kenneth;
import com.ucreativa.familia.Liz;
import com.ucreativa.vacunacion.Amigo;
import com.ucreativa.vacunacion.BitacoraVacunas;
import com.ucreativa.vacunacion.Familiar;
import com.ucreativa.vacunacion.Persona;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {


    public static void main(String[] args) {

        Familiar mama = new Familiar ("Liz", "123", 51, true, "Mama" );

        Familiar hermana = new Familiar ("Fernanda", "345", 17, false, "Hermana");

        Amigo compaTrabajo = new Amigo("Oscar","987", 26, false, "Compa Trabajo", "No se");

        List<BitacoraVacunas> bitacora = new ArrayList<BitacoraVacunas>();
        bitacora.add(new BitacoraVacunas(mama, "Pfizer", new Date()));
        bitacora.add(new BitacoraVacunas(hermana, "Astraceneca", new Date()));
        bitacora.add(new BitacoraVacunas(compaTrabajo,"Johnson", new Date()));

    }
}
