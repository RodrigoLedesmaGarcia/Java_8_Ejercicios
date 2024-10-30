package org.ejercicioprogramaciom.java.proramas001.semana1.numerosparesimpares;

/*
Dada una lista de números enteros agrupados en dos listas, pares e impares
 */

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumerosParesImpares {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        Map<String, List<Integer>> grupos = numeros.
                stream().collect(Collectors.groupingBy(n -> n % 2 == 0 ? "pares" : "impares"));

        System.out.println("Los números pares son: " + grupos.get("pares"));
        System.out.println("Los números impares son: " + grupos.get("impares"));
    }
}
