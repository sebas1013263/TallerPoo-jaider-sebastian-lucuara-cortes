package ejercicio11;

import java.util.ArrayList;

public class Empleados {
    private String nombre;
    private double salario;
    private Compania compania;

    public Empleados() {
    }

    public Empleados(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }




    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Nombre del Empleado: " + this.nombre + ", Tiene un salario de: " + this.salario;
    }
}

