package org.ejercicioprogramaciom.java.proramas001.semana3.Empleado;

import java.util.Arrays;
import java.util.List;

/*
dada una lista de objetos de tipo empleados calcula el salario promedio
 */
class Empleado{
    String nombre;
    int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }
}

public class PromedioSalario {
    public static void main(String[] args) {

        List<Empleado> empleados = Arrays.asList(
                new Empleado("Maria Lourdes", 12000),
                new Empleado("Pedro Ledesma", 15000),
                new Empleado("Diana Cavendish", 20000),
                new Empleado("Jose Lopez", 12000)
        );


        double salarioMedio = empleados.stream().mapToDouble(e -> e.salario).average().orElse(0);

        System.out.println("El salario medio de los empleados es: " + salarioMedio);

    }
}
