package org.ejercicioprogramaciom.java.proramas001.operadorternario;

public class OperadorTernarioDoble {
    public static void main(String[] args) {
        int edad = 21;
        boolean tieneLicencia = false;

        String resultado = (edad >= 18) ? (tieneLicencia ? "Puede conducir solo" : "No puede conducir") : "No puede conducir";

        System.out.println(resultado);
    }
}