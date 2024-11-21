package Ejercicio2;

class CuentaCorriente extends CuentaBancaria {
    private static final double COMISION_RETIRO = 0.02; //final para que sea una constante (como no va a cambiar en ningun momento pues final)
    //static para que pertenezca a la clase y no a las instancias
    public CuentaCorriente(String numeroCuenta, Cliente cliente) {
        super(1000.0, numeroCuenta, cliente); //Se puede ingresar directo el valor sin tener que crear mas variables
    }

    @Override
    public void retirar(double monto) {
        double montoConComision = monto + (monto * COMISION_RETIRO); //Aumentar la comision
        if (montoConComision <= getSaldo()) {//Comprobar que el monto del retiro pues no sea mayor que el saldo actual
            ajustarSaldo(getSaldo() - montoConComision);//Actualizar el saldo
            System.out.println("Retiro con comision realizado, nuevo saldo: " + getSaldo());
        } else {
            System.out.println("Saldo insuficiente para hacer el retiro con comision.");
        }
    }
}
