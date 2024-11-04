package org.ejercicioprogramaciom.java.proramas001.semana3.contarletras;

import java.util.Arrays;
import java.util.List;

/*
Dada una lista que busque palabras que contengan una letra en especifico
 */
public class ContarLetras {
    public static void main(String[] args) {

        List<String > palabrasLetras = Arrays.asList("Pera", "Daniela", "Platano", "Manzana");

        long contador = palabrasLetras.stream().filter(p -> p.contains("e")).count();

        System.out.println("Numero de palabras con la letra \"e\" es: " + contador);
    }
}
