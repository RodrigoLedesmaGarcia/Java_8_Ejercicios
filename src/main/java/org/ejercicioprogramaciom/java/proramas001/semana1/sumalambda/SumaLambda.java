package org.ejercicioprogramaciom.java.proramas001.semana1.sumalambda;


interface Operacion {
    int operacion(int a, int b);
}
public class SumaLambda {
    public static void main(String[] args) {
        Operacion suma = (a, b) -> a+b;
        System.out.println("La suma de tu operacion es: " + suma.operacion(10,7));

    }
}
