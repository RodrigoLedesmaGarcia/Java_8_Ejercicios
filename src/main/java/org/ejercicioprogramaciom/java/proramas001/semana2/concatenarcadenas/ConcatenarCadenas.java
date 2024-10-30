package org.ejercicioprogramaciom.java.proramas001.semana2.concatenarcadenas;

/*
Crea un programa que usando Streams conactene todas la palabras de una lista
en una sola cadena, separada por espacios o comas
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatenarCadenas {
    public static void main(String[] args) {

        List<String> palabras = Arrays.
                asList("Un","Bello","Morir","Honrra","Toda","Una","Vida");


        String resultado = palabras.stream().collect(Collectors.joining(" | "));

        System.out.println(resultado);

    }
}
