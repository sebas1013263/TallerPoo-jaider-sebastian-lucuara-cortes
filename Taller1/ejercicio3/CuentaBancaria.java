package ejercicio3;

public class CuentaBancaria {

        private double saldo;

        public CuentaBancaria() {
        }

        public CuentaBancaria(double saldo) {
            this.saldo = saldo;
        }

        public double getSaldo() {
            return saldo;
        }

        public void setSaldo(double saldo) {
            this.saldo = saldo;
        }

        public void Depositar(double cantidad){
            this.saldo+=cantidad;
        }

        @Override
        public String toString() {
            return "Tu saldo era de: "+  this.saldo;
        }
    }

