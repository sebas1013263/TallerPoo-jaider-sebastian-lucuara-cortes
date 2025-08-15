package ejercicio10;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        // Lista de cursos
        List<Curso> cursos = new ArrayList<>();

        do {
            System.out.println("-----------Menu---------------");
            System.out.println("1. Crear Cursos");
            System.out.println("2. Agregar un profesor a un curso");
            System.out.println("3. Imprimir Cursos");
            System.out.println("4. Salir");

            System.out.println("Elija una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Cuantos cursos desea crear: ");
                    int numCursos = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < numCursos; i++) {
                        System.out.print("Ingrese el nombre del curso " + (i + 1) + ": ");
                        String nombreCurso = sc.nextLine();
                        cursos.add(new Curso(nombreCurso));
                    }
                    break;

                case 2:
                    System.out.println("Cuantos profesores desea agra+egar: ");
                    int numProfesores = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < numProfesores; i++) {
                        System.out.print("Ingrese el nombre del profesor " + (i + 1) + ": ");
                        String nombreProfesor = sc.nextLine();
                        Profesor profesor = new Profesor(nombreProfesor);


                        // Mostrar lista de cursos
                        System.out.println("Seleccione el curso para este profesor:");
                        for (int j = 0; j < cursos.size(); j++) {
                            System.out.println((j + 1) + ". " + cursos.get(j).getNombre());
                        }

                        System.out.print("Opción: ");
                        int opcion1 = sc.nextInt();
                        sc.nextLine();

                        if (opcion1 >= 1 && opcion1 <= cursos.size()) {
                            cursos.get(opcion1 - 1).agregarProfesor(profesor);
                        } else {
                            System.out.println("Opción inválida, profesor sin curso asignado.");
                        }

                    }
                    break;

                case 3:
                    System.out.println("==== Listado final de cursos y profesores============");
                    for (Curso curso : cursos) {
                        curso.imprimirProfesores();
                    }
                    break;

                case 4:
                    System.out.println( "Saliendo.............");



                default:
                    System.out.println("Opcion no valida");


            }

        }while (opcion != 4);







    }

    }

