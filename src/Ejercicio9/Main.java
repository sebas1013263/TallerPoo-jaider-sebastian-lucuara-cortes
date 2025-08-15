package Ejercicio9;


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;
        Curso curso = new Curso();

        do {
            System.out.println("\n|||||||||||||| Menú |||||||||||||||||||||");
            System.out.println("1. insetar estudiante");
            System.out.println("2. Buscar estudiante");
            System.out.println("3. Imprimir estudiante");
            System.out.println("4. eliminar estudiante");
            System.out.println("5. Salir");
            System.out.println("|||||||||||||||||||||||||||||||||||||||||||");



            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("nombre del estudiante: ");
                    String nombre = scanner.nextLine();

                    System.out.print("Id del estudiante: ");
                    String id = scanner.nextLine();

                    curso.InsertarEstudiante(new Estudiante(nombre, id));
                    break;


                case 2:
                    System.out.print("nombre del estudiante: ");
                    String nombreBuscar = scanner.nextLine();
                    curso.buscarEstudiante(nombreBuscar);
                    break;

                case 3:

                    curso.imprimirEstudiantes();
                    break;

                case 4:
                    System.out.println("ingrese el nombre del estudiante: ");
                    String nombreIngresado = scanner.nextLine();
                    curso.eliminar(nombreIngresado);
                    break;


                case 5:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}



