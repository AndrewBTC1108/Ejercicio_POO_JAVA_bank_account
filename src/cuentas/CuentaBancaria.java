package cuentas;

public abstract class CuentaBancaria {

    private double saldo;
    private String nombreCliente;

    public String getNombreCliente() {
        return nombreCliente;
    }

    public CuentaBancaria(String nombreCliente, double saldoInicial) {
        this.nombreCliente = nombreCliente;
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Depósito exitoso. Saldo actual: " + saldo);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente para realizar el retiro.");
        } else if (cantidad <= 0) {
            System.out.println("La cantidad a retirar debe ser positiva.");
        } else {
            saldo -= cantidad;
            System.out.println("Retiro exitoso. Saldo actual: " + saldo);
        }
    }

    public double obtenerSaldo() {
        return saldo;
    }
}
