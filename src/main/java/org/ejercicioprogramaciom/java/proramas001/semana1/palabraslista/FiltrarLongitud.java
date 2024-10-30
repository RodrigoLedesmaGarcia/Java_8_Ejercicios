package org.ejercicioprogramaciom.java.proramas001.semana1.palabraslista;

/*
Dada una lista de palabras. filtra las que tengan una logitud de más de cinco caracteres
 */

import java.util.Arrays;
import java.util.List;

public class FiltrarLongitud {
    public static void main(String[] args) {

        List<String> palabras = Arrays.asList("Mario", "leon", "Television", "celular", "menester", "raudo", "reciprocidad");

        palabras.stream().filter(palabra -> palabra.length() > 9).forEach(System.out::println);
    }
}
