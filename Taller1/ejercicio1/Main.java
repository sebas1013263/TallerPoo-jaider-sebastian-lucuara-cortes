package ejercicio1;

public class Main {

        public static void main(String[] args) {
            Persona p1=new Persona();
            Persona p2=new Persona();

            p1.setNombre("Esteban");
            p1.setEdad(18);
            p2.setNombre("Sebastian");
            p2.setEdad(18);

            System.out.println("el nombre de la persona 1: "+p1.getNombre()+" la edad: "+p1.getEdad());
            System.out.println("el nombre de la persona 2: "+p2.getNombre() + " la edad: "+p2.getEdad());
        }
    }

