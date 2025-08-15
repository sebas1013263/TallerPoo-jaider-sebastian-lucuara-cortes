package ejercicio14;

public class Pedido {


    private int codigo;
    private String descripcion;
    private String tipo;
    private double precio;
    private Cliente cliente;

    public Pedido() {
    }


    public Pedido(int codigo, String descripcion, String tipo, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.tipo = tipo;
        this.precio = precio;

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void imprimirPedido() {
        System.out.println(codigo+ ")" +" descripcion: "+descripcion+" tipo: "+tipo+" precio: "+precio);
    }
}
