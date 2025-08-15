package ejercicio11;
import ejercicio10.Profesor;

import java.util.ArrayList;
import java.util.List;

public class Compania {
    private String nombre;
    private List<Empleados> empleados;

    public Compania() {}
    public Compania(String nombre) {
        this.nombre = nombre;
        empleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarEmpleados(Empleados empleado){
        empleados.add(empleado);
    }



   public void imprimirEmpleadosConSalarioMayorA(double salarioMinimo){
       System.out.println("Empleados con salario mayor a $ "+salarioMinimo+ " :");
       for(Empleados empleado: empleados){
           if(empleado.getSalario()>=salarioMinimo){
               System.out.println(empleado.toString());
           }
       }
   }





}
