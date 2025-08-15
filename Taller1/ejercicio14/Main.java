package ejercicio14;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do{
            System.out.println("======MENU=======");
            System.out.println("1. Ordenar");
            System.out.println("2.salir");

            System.out.println("ingrese opcion: ");
            opcion = sc.nextInt();
            sc.nextLine();
            switch(opcion){
                case 1:
                    System.out.print("Ingrese el nombre del cliente: ");
                    String nombreCliente = sc.nextLine();
                    System.out.println("ingrese el apellido del cliente: ");
                    String apellidoCliente = sc.nextLine();
                    System.out.println("Ingrese la direccion del cliente: ");
                    String direccionCliente = sc.nextLine();
                    System.out.println("Ingrese el telefono del cliente: ");
                    String telefonoCliente = sc.nextLine();
                    Cliente cliente = new Cliente(nombreCliente, apellidoCliente, direccionCliente, telefonoCliente);

                    System.out.print("¿Cuántos pedidos quiere ingresar para este cliente? ");
                    int cantidadPedidos = sc.nextInt();
                    sc.nextLine(); // Limpiar buffer

                    for (int i = 0; i < cantidadPedidos; i++) {
                        System.out.println("Pedido " + (i + 1) + ":");
                        System.out.print("Ingrese el codigo del pedido: ");
                        int codigo = sc.nextInt();
                        sc.nextLine(); // Limpiar buffer
                        System.out.print("Descripción del pedido: ");
                        String descripcion = sc.nextLine();

                        System.out.println("ngrese el tipo del pedido: ");
                        String tipo = sc.nextLine();

                        System.out.println("ingrese el precio del pedido: ");
                        double precio = sc.nextDouble();
                        cliente.agregarPedido(new Pedido(codigo, descripcion, tipo, precio));

                    }

                    // Mostrar resultados
                    System.out.println("--- Resumen de pedidos ---");
                    cliente.imprimirPedidos();

                    break;

                case 2:
                    break;
            }

        }while (opcion != 2);



    }


}


