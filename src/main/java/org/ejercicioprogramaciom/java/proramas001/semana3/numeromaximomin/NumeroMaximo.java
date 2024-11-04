package org.ejercicioprogramaciom.java.proramas001.semana3.numeromaximomin;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NumeroMaximo {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);

        Optional<Integer> numeroMax = numeros.stream().max(Integer::compareTo);

        Optional<Integer> numeroMin = numeros.stream().min(Integer::compareTo);

        numeroMax.ifPresent(max -> System.out.println("El número maxino es: " + max));
        numeroMin.ifPresent(min -> System.out.println("El núemro minimo es: " + min));
    }
}
