package ejercicio4;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria() {}
    public CuentaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public  void Depositar(double cantidad) {
        this.saldo+=cantidad;
        System.out.println("Acabaste de depositar:  " +  cantidad + "y tu saldo es de: " + this.saldo);
    }
    public void retirar(double cantidad) {
        this.saldo-=cantidad;
        System.out.println("Acabaste de retirar:  " +  cantidad  + "y tu saldo es de: " + this.saldo);
    }


}
