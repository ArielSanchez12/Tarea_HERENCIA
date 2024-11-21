package Ejercicio2;
//El 'abstract' es practicamente una plantilla un tanto mas 'avanzada' por asi decirlo, ya que no se instancia directamente
abstract class CuentaBancaria { //abstract porque necesitamos definir los detalles especificos de los retiros segun la clase
    private double saldo;
    private String numeroCuenta;
    private Cliente cliente; //Directo de la clase cliente

    public CuentaBancaria(double saldoInicial, String numeroCuenta, Cliente cliente) {
        this.saldo = saldoInicial;
        this.numeroCuenta = numeroCuenta;
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }
    /*
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public Cliente getCliente() {
        return cliente;
    }
     */

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito realizado, nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto a depositar debe ser mayor que cero");
        }
    }

    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado, nuevo saldo: " + saldo);
        } else {
            System.out.println("Saldo insuficiente o monto invalido.");
        }
    }

    protected void ajustarSaldo(double nuevoSaldo) {
        saldo = nuevoSaldo;
    }

    public void mostrarInformacion() {
        cliente.mostrarInformacion();
        System.out.println("Numero de cuenta: " + numeroCuenta);
        System.out.println("Saldo: " + saldo);
    }
}
