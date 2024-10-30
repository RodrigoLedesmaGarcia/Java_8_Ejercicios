package org.ejercicioprogramaciom.java.proramas001.semana1.filtrarimpares;

import java.util.Arrays;
import java.util.List;

public class FiltrarImpares {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20);

        numeros.stream().
                filter( n -> n % 2 == 0).
                forEach(System.out::println);
    }
}
