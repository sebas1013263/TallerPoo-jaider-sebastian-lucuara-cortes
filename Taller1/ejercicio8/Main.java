package ejercicio8;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Insertar libro");
            System.out.println("2. Borrar libro");
            System.out.println("3. Buscar libro");
            System.out.println("4. Imprimir libros");
            System.out.println("5. Salir");

            System.out.print("Selecciona una opción: ");
             opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Título del libro: ");
                    String titulo = scanner.nextLine();

                    System.out.print("Autor del libro: ");
                    String autor = scanner.nextLine();

                    biblioteca.insertarLibro(new Libro(titulo, autor));
                    break;

                case 2:
                    System.out.print("Título del libro a borrar: ");
                    String tituloBorrar = scanner.nextLine();

                    biblioteca.borrarLibro(tituloBorrar);
                    break;

                case 3:

                    System.out.print("Título del libro a buscar: ");
                    String tituloBuscar = scanner.nextLine();

                    biblioteca.buscarLibro(tituloBuscar);
                    break;

                case 4:

                    biblioteca.imprimirLibros();
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

