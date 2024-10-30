package org.ejercicioprogramaciom.java.proramas001.semana1.numermaximo;

/*
Dada una lista de números enteros, encuentra el número
más alto
 */

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NumeroMaximo {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(10, 88, 1, 33, 78, 23, 33, 11, 55);

        Optional<Integer> maximo = numeros.stream().max(Integer::compareTo);

        maximo.ifPresent(valor -> System.out.println("El número más grande es: "+valor));

    }
}
