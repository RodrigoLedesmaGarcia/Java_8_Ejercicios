package org.ejercicioprogramaciom.java.proramas001.semana1.separarporcomas;

// dada una lista de palabras crea una cadena donde todas las pabras esten separdas por una lista

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UnirPalabras {
    public static void main(String[] args) {

        List<String > palabras = Arrays.asList("Maria", "Zapato", "aguila", "computadora", "celular", "Carro", "camion");

        String resultado = palabras.stream().collect(Collectors.joining(" , "));

        System.out.println(resultado);
    }
}
