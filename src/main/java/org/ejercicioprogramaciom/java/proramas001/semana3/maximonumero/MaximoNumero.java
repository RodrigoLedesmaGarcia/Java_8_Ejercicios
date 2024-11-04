package org.ejercicioprogramaciom.java.proramas001.semana3.maximonumero;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/*
programa que encuetre el numero mas grande de una lista de numeros dada
 */
public class MaximoNumero {
    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        Optional<Integer> numeroMayor = numeros.stream().max(Integer::compareTo);

        numeroMayor.ifPresent(max -> System.out.println("El numero mayor es: " + max));

    }
}
