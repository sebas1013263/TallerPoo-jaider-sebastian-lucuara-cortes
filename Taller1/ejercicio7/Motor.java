package ejercicio7;

public class Motor {
    public int potencia;
    public String tipo;

    public Motor(int potencia, String tipo) {
        this.potencia = potencia;
        this.tipo = tipo;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Motor() {
    }

    @Override
    public String toString() {
        return "potencia = " + potencia + ", tipo = " + tipo;
    }
}
