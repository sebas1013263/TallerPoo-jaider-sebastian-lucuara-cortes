package ejercicio12;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("=====REGISTRO PERSONA=====");
        System.out.println("Ingrese el nombre del persona:");
        String nombre1 = sc.nextLine();
        System.out.println("Ingrese el apellido de la persona:");
        String apellido1 = sc.nextLine();
        System.out.println("Ingrese la edad de la persona:");
        int edad1 = sc.nextInt();
        sc.nextLine();

       Persona persona1 = new Persona(nombre1, apellido1, edad1);


        System.out.println("=====REGISTRO PASAPORTE=====");
        System.out.println("Ingrese el Radicado del pasaporte:");
        String radicado1 = sc.nextLine();

        System.out.println("Ingrese el pais de origen del pasaporte:");
        String paisOrigen1 = sc.nextLine();





        Pasaporte pasa1 = new Pasaporte(radicado1, paisOrigen1);

        persona1.asignarPasaporte(pasa1);
        persona1.asignarPasaporte(pasa1);


        System.out.println("=== Datos Registrados ===");
        persona1.imprimirPersona();
        pasa1.imprimirPasaporte();






    }
}

