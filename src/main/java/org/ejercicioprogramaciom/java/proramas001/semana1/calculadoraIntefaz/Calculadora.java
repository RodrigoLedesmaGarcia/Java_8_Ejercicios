package org.ejercicioprogramaciom.java.proramas001.semana1.calculadoraIntefaz;

@FunctionalInterface
interface Calculo{
    double operacion(double a, double b);
}


public class Calculadora {
    public static void main(String[] args) {

        Calculo suma = Double::sum;

        System.out.println(suma.operacion(10 , 5.1));

    }
}
