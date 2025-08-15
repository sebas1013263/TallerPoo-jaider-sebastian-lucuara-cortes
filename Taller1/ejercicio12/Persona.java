package ejercicio12;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private Pasaporte pasaporte;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public void asignarPasaporte(Pasaporte pasaporte) {
        if (pasaporte != null && this.pasaporte != pasaporte) {
            this.pasaporte = pasaporte;
            pasaporte.setPersona(this); // Evita bucle infinito
        }
    }


    public void imprimirPersona() {
        System.out.println("Persona: " + nombre + ", Apellido: " + apellido + ", Edad: " + edad +
                ", Pasaporte: " + (pasaporte != null ? pasaporte.getRadicado() : "Sin pasaporte"));
    }
}
