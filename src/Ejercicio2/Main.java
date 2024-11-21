package Ejercicio2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Instanciar las clases
        Cliente cliente1 = new Cliente("Ariel Sánchez", "123456789");
        Cliente cliente2 = new Cliente("Richard Mendoza", "987654321");

        CuentaCorriente cuentaCorriente = new CuentaCorriente("AS021", cliente1);
        CuentaAhorro cuentaAhorro = new CuentaAhorro("RM020", cliente2);

        //El menu
        int opcion;
        do {
            System.out.println("\n.: Menú :.");
            System.out.println("1. InformaciOn del cliente y saldo");
            System.out.println("2. Transferir dinero entre cuentas");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Depositar dinero");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Informacion de la Cuenta Corriente:");
                    cuentaCorriente.mostrarInformacion();
                    System.out.println("Informacion de la Cuenta Ahorro:");
                    cuentaAhorro.mostrarInformacion();
                    break;

                case 2:
                    System.out.print("Ingrese el monto a transferir de la Cuenta Corriente a la Cuenta Ahorro: ");
                    double montoTransferencia = scanner.nextDouble();
                    if (montoTransferencia > 0 && montoTransferencia <= cuentaCorriente.getSaldo()) { //La transferencia solo se hace si el monto es valido
                        cuentaCorriente.retirar(montoTransferencia); //por eso comprueba si es mayor a cero o si no es mayor al de la cuenta corriente
                        cuentaAhorro.depositar(montoTransferencia);
                        System.out.println("Transferencia realizada");
                    } else {
                        System.out.println("Monto invalido o saldo insuficiente.");
                    }
                    break;

                case 3:
                    System.out.print("Seleccione la cuenta (1: Corriente 2: Ahorro): ");
                    int cuentaSeleccionada = scanner.nextInt();
                    System.out.print("Ingrese el monto a retirar: ");
                    double montoRetiro = scanner.nextDouble();

                    if (cuentaSeleccionada == 1) {
                        cuentaCorriente.retirar(montoRetiro); //Ya las comprobaciones la hace cada cuenta segun su tipo
                    } else if (cuentaSeleccionada == 2) {
                        cuentaAhorro.retirar(montoRetiro);
                    } else {
                        System.out.println("No existe ese tipo de cuenta");
                    }
                    break;

                case 4:
                    System.out.print("Seleccione la cuenta (1: Corriente, 2: Ahorro): ");
                    cuentaSeleccionada = scanner.nextInt();
                    System.out.print("Ingrese el monto a depositar: ");
                    double montoDeposito = scanner.nextDouble();

                    if (cuentaSeleccionada == 1) {
                        cuentaCorriente.depositar(montoDeposito); //Igual aca
                    } else if (cuentaSeleccionada == 2) {
                        cuentaAhorro.depositar(montoDeposito);
                    } else {
                        System.out.println("No existe ese tipo de cuenta");
                    }
                    break;

                case 5:
                    System.out.println("Gracias por confiar en banco Pichincha 😳");
                    break;

                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }
}
