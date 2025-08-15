package ejercicio6;

public class Rectangulo {
    private int ancho;
    private int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public void area() {
        System.out.println("El area del rectangulo de ancho: "+this.ancho+" el alto: "+this.alto + " es: " + (this.alto*this.alto));
    }
}