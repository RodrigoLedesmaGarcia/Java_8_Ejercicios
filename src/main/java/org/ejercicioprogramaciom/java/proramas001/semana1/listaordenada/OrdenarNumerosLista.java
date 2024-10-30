package org.ejercicioprogramaciom.java.proramas001.semana1.listaordenada;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenarNumerosLista {
    public static void main(String[] args) {

        List<Integer> listadoNumeros = Arrays.asList(1,2,34,5,98,12,34,43,9,84,23,55,76,77,90, 100, 123, 897, 777, 564, 666, 13565, 8765, 4575);

        Collections.sort(listadoNumeros);

        System.out.println("La lista ordenada es: " + listadoNumeros);
    }
}
