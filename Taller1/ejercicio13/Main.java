package ejercicio13;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Estudiante> listaEstudiantes = new ArrayList<>();
        List<Curso> listaCursos = new ArrayList<>();
        int opcion;

        do{
            System.out.println("============MENU===========");
            System.out.println("1. Ingresar Estudiante");
            System.out.println("2. Ingresar Curso");
            System.out.println("3. Inscribir estudiantes en cursos");
            System.out.println("4. Imprimir estudiantes");
            System.out.println("5. Imprimir Cursos");
            System.out.println("6. Salir");

            System.out.println("ingrese una opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre del estudiante: ");
                    String nombre = sc.nextLine();
                    listaEstudiantes.add(new Estudiante(nombre));
                    System.out.println("agregado exitosamente");
                    break;

                case 2:
                    System.out.println("Ingrese el nombre del curso: ");
                    String curso = sc.nextLine();
                    listaCursos.add(new Curso(curso));
                    System.out.println("agregado exitosamente");
                    break;

                case 3:
                    for (Estudiante est : listaEstudiantes) {
                        System.out.println("Inscribiendo a " + est.getNombre());
                        System.out.println("Ingrese la cantidad de cursos para este estudiante:");
                        int cantCursosEst = sc.nextInt();
                        sc.nextLine();
                        for (int j = 0; j < cantCursosEst; j++) {
                            System.out.println("Cursos disponibles:");
                            for (int k = 0; k < listaCursos.size(); k++) {
                                System.out.println((k + 1) + ". " + listaCursos.get(k).getNombre());
                            }
                            System.out.print("Seleccione el número de curso: ");
                            int opcion1 = sc.nextInt();
                            sc.nextLine();
                            if (opcion1 >= 1 && opcion1 <= listaCursos.size()) {
                                est.inscribirenCurso(listaCursos.get(opcion1 - 1));
                            } else {
                                System.out.println("Opción inválida");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.println("\n=============Estudiantes==============");
                    for (Estudiante est : listaEstudiantes) {
                        est.imprimirCursos();
                    }
                    break;

                case 5:

                    System.out.println("\n=========Cursos=========");
                    for (Curso c : listaCursos) {
                        c.imprimirEstudiantes();
                    }

                    break;

                case 6:
                    System.out.println("saliendo......");
                    break;

                default:
                    System.out.println("Opcion no valida");


            }
        }while(opcion != 6);

    }
}
