package ejercicio7;

public class Main {
    public static void main(String[] args) {
        Motor motor = new Motor(1234,"mecanico");
        AutoMovil autoMovil = new AutoMovil(motor,"onix","sanfe","rojo");
        System.out.println(autoMovil);



    }
}
