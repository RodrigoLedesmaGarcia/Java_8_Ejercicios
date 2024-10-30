package org.ejercicioprogramaciom.java.proramas001.semana2.contarunicos;

import java.util.Arrays;
import java.util.List;

/*
Crea un programa que con una lista de enteros quente cuantos elementos unicos
 */
public class ContarUnicos {
    public static void main(String[] args) {

        List<String > unicos = Arrays.
                asList("Uno", "Dos", "Dos", "Uno", "Tres", "Tres", "Mayo", "Mayo",
                        "Agosto, Agosto","Julio", "Septiembre", "Julio", "Rodrigo",
                        "Septiembre", "Rodrigo", "Cinco", "Seis");


        long resultado = unicos.stream().distinct().count();
        System.out.println(resultado);

    }
}
