package Ejercicio9;

public class Estudiante {
    private String identificacion;
    private String nombre;

    public Estudiante() {
    }

    public Estudiante(String nombre, String identificacion) {
        this.identificacion = identificacion;
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre del estudiante= " + this.nombre + ", identificacion= " + this.identificacion;
    }
}
