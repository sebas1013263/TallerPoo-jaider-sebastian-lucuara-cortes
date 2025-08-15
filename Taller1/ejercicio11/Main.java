package ejercicio11;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        List<Compania> companias = new ArrayList<>();


        do{
            System.out.println("------------Menu-----------");
            System.out.println("1. Crear compañia");
            System.out.println("2. Agregar Empleados a Compañia");
            System.out.println("3. Imprimir empleados");
            System.out.println("4. Salir");

            System.out.println("Elija una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Nombre de la compañia: ");
                    String nombre = sc.nextLine();
                    companias.add(new Compania(nombre));
                    System.out.println("Agregado exitosamente");
                    break;

                case 2:
                    System.out.println("Nombre de los empleados: ");
                    String nombreEmpleado = sc.nextLine();
                    System.out.println("Ingrese el salario: ");
                    double salario = sc.nextDouble();
                    Empleados empleado = new Empleados(nombreEmpleado,salario);

                    System.out.println("ingrese a que compañia lo quiere ingresar: ");
                    for (int j = 0; j < companias.size(); j++) {
                        System.out.println((j + 1) + ". " + companias.get(j).getNombre());
                    }

                    System.out.print("Opción: ");
                    int opcion1 = sc.nextInt();
                    sc.nextLine();

                    if (opcion1 >= 1 && opcion1 <= companias.size()) {
                        companias.get(opcion1 - 1).agregarEmpleados(empleado);
                    } else {
                        System.out.println("Opción inválida, Empleado sin compañia asignado.");
                    }

                    break;

                case 3:
                    System.out.println("ingrese el salario minimo que deben tener los empleados");
                    double salario1 = sc.nextDouble();

                    System.out.println("ingrese de que compañia quiere aplicar el proceso");
                    for (int j = 0; j < companias.size(); j++) {
                        System.out.println((j + 1) + ". " + companias.get(j).getNombre());
                    }

                    System.out.print("Opción: ");
                    int opcion2 = sc.nextInt();
                    sc.nextLine();

                    if (opcion2 >= 1 && opcion2 <= companias.size()) {
                        companias.get(opcion2 - 1).imprimirEmpleadosConSalarioMayorA(salario1);
                    } else {
                        System.out.println("Opción inválida");
                    }

                    break;

                case 4:
                    System.out.println("Saliendo........");
                    break;

                    default:
                        System.out.println("opcion incorrecta");
            }

        }while (opcion != 4);




    }
}
