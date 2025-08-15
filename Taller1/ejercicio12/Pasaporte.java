package ejercicio12;

public class Pasaporte {
    private String radicado;
    private String paisOrigen;
    private Persona persona;

    public Pasaporte() {
    }

    public Pasaporte(String radicado, String paisOrigen) {
        this.radicado = radicado;
        this.paisOrigen = paisOrigen;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public String getRadicado() {
        return radicado;
    }

    public void setRadicado(String radicado) {
        this.radicado = radicado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public void asignarPersona(Persona persona) {
        if (persona != null && this.persona != persona) {
            this.persona = persona;
            persona.setPasaporte(this); // Evita bucle infinito
        }
    }



    public void imprimirPasaporte() {
        System.out.println("Pasaporte Nº: " + radicado + ", País: " + this.paisOrigen +
                ", Titular: " + (persona != null ? persona.getNombre()+ " "  + persona.getApellido() : "Sin titular"));
    }
}
