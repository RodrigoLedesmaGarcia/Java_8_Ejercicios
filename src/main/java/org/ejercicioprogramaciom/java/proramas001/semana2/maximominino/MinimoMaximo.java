package org.ejercicioprogramaciom.java.proramas001.semana2.maximominino;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
Dada una lista de enteros usa streams para encontrar el valor
minimo y maximo de la lista.
 */
public class MinimoMaximo {
    public static void main(String[] args) {


        List<Integer> numeros = Arrays.asList(75, 84, 68, 28, 44, 40, 46, 62, 3, 67, 22, 44,
                46, 53, 1, 69, 69, 18, 35, 64, 62, 79, 80, 14, 96, 58, 6,
                20, 23, 46, 70, 91, 4, 26, 81, 47, 66, 82, 39, 68, 95, 37,
                41, 78, 70, 90, 94, 36, 99, 48, 100);

        Optional<Integer> minimo = numeros.stream().min(Integer::compareTo);
        Optional<Integer> maximo = numeros.stream().max(Integer::compareTo);

        minimo.ifPresent(min -> System.out.println("Minimo " + min));
        maximo.ifPresent(max -> System.out.println("Maximo " + max));

    }
}
