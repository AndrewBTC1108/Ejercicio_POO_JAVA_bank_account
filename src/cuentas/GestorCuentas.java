package cuentas;

import java.util.HashMap;

public class GestorCuentas {

    private HashMap<String, CuentaBancaria> cuentas;

    public GestorCuentas(HashMap<String, CuentaBancaria> cuentas) {
        this.cuentas = cuentas;
    }

    public void mostarCuentas() {
        System.out.println("**********|Cuentas|**********");
        boolean hasAhorros = false;
        boolean hasCorriente = false;

        for (CuentaBancaria cuenta : cuentas.values()) {
            if(cuenta instanceof CuentaAhorro){
                hasAhorros = true;
            }else if(cuenta instanceof CuentaCorriente) {
                hasCorriente = true;
            }
        }

        if(hasAhorros){
            System.out.println();
            System.out.println("**********************************************|Cuentas Ahorros|****************************************************************");
            for(CuentaBancaria cuenta : cuentas.values()){
                if(cuenta instanceof CuentaAhorro){
                    System.out.println("*" + "El saldo de la cuenta de " + cuenta.getNombreCliente() + " es "  + cuenta.obtenerSaldo() + "*");
                }
            }
            System.out.println("*****************************************************************************************************************************");
        }
        if(hasCorriente){
            System.out.println();
            System.out.println("**********************************************|Cuentas Corriente|***************************************************************");
            for(CuentaBancaria cuenta : cuentas.values()){
                if(cuenta instanceof CuentaCorriente){
                    System.out.println("*" + "El saldo de la cuenta de " + cuenta.getNombreCliente() + " es "  + cuenta.obtenerSaldo() + "*");
                }
            }
            System.out.println("*****************************************************************************************************************************");
        }

        if(cuentas.isEmpty()){
            System.out.println("No hay Cuentas Registradas aun");
            System.out.println("*******************************");
        }
    }
}
