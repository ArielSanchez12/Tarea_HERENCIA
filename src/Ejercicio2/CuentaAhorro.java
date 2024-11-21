package Ejercicio2;

class CuentaAhorro extends CuentaBancaria {
    private static final double SALDO_MINIMO = 100.0; //Lo mismo que en corriente

    public CuentaAhorro(String numeroCuenta, Cliente cliente) {
        super(500.0, numeroCuenta, cliente); //Lo mismo que en corriente
    }

    @Override
    public void retirar(double monto) {
        if (getSaldo() - monto >= SALDO_MINIMO) { //Las comprobaciones para que no deje menos de 100 en su cuenta
            ajustarSaldo(getSaldo() - monto);
            System.out.println("Retiro realizado, nuevo saldo: " + getSaldo());
        } else {
            System.out.println("No se puede realizar el retiro, el saldo debe ser mayor a " + SALDO_MINIMO + " despues del retiro.");
        }
    }
}
