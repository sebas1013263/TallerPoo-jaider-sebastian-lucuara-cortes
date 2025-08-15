package ejercicio4;

public class Main {
    public static void main(String[] args) {
        CuentaBancaria cuentaBancaria = new CuentaBancaria();
        cuentaBancaria.setSaldo(5000);
        System.out.println("el saldo inical es de: " + cuentaBancaria.getSaldo());
        cuentaBancaria.Depositar(500);
        cuentaBancaria.retirar(3000);


    }
}
