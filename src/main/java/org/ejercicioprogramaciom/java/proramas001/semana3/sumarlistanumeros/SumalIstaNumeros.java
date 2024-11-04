package org.ejercicioprogramaciom.java.proramas001.semana3.sumarlistanumeros;

/*
Dado un arreglo de enteros y otro con double, calcula la suma de todos su elementos
 */

import java.util.Arrays;
import java.util.List;

public class SumalIstaNumeros {
    public static void main(String[] args) {

        /*
        List<Integer> numeros = Arrays.asList(1,1,1);

        int suma = numeros.stream().mapToInt(Integer::intValue).sum();

        System.out.println("La suma de los elementos de la lista es: " + suma);

         */

        List<Double> numerosD = Arrays.asList(1.1, 1.1, 1.1, 1.1);

        double sumadouble = numerosD.stream().mapToDouble(Double::doubleValue).sum();

        System.out.println("El valor de la suma de los numeros double es: ".concat(String.valueOf(sumadouble)));
    }
}
