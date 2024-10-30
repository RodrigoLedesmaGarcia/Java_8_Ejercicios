package org.ejercicioprogramaciom.java.proramas001.semana1.numermaximo;

/*
Dada una lista de números enteros, encuentra el número
más alto
 */


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class NumeroMaximoDouble {
    public static void main(String[] args) {

        List<Double> numerosD = Arrays.asList(12.1, 22.1, 55.78, 23.44, 77.90, 102.783);

        Optional<Double> maximoD = numerosD.stream().max(Double::compareTo);

        Optional<Double> minimoD = numerosD.stream().min(Double::compareTo);

        maximoD.ifPresent(valor -> System.out.println( "El número double más grande es: " +valor));
        System.out.println(" ");
        minimoD.ifPresent(valor -> System.out.println("El número double más chico es: " + valor));
    }
}
