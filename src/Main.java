import cuentas.CuentaAhorro;
import cuentas.CuentaBancaria;
import cuentas.CuentaCorriente;
import cuentas.GestorCuentas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.Scanner;

public class Main {
    public static void main (String args[]){
        CuentaAhorro cuentaAhorro1 = new CuentaAhorro("Andres", 1200000.00);
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente("david", 1200000.00);

        //depositar en la cuenta
        cuentaAhorro1.depositar(500);
        cuentaCorriente1.depositar(700);

        //obtener saldo
        cuentaAhorro1.obtenerSaldo();
        cuentaCorriente1.obtenerSaldo();

        //retirar saldo
        System.out.println("Retiramos saldo de la cuenta:");
        cuentaAhorro1.retirar(500);
        cuentaCorriente1.retirar(560);
        cuentaAhorro1.obtenerSaldo();
        cuentaCorriente1.obtenerSaldo();

        //Gestionar ceuntas
        HashMap<String, CuentaBancaria> cuentas = new HashMap<>();
        cuentas.put("cuentasAhorro", cuentaAhorro1);
        cuentas.put("cuentasCorriente", cuentaCorriente1);

        GestorCuentas gestionCuentas = new GestorCuentas(cuentas);
        System.out.println("Cuentas gestionadas:");
        gestionCuentas.mostarCuentas();
    }
}
