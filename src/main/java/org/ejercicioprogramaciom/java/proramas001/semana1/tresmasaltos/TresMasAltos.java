package org.ejercicioprogramaciom.java.proramas001.semana1.tresmasaltos;

// Programa que calcule los tres números mas altos

import java.util.Arrays;
import java.util.List;

public class TresMasAltos {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,11,32,44,56,77,89,91,100,45,97);

        numeros.stream().sorted((a,b) -> b-a).limit(3).forEach(System.out::println);
    }
}
