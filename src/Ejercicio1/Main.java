package Ejercicio1;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre del animal: ");
        String nombrePerro = scanner.nextLine();
        System.out.println("Ingrese la edad del animal: ");
        int edadPerro = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el sonido caracteristico del animal: ");
        String sonidoCaracteristico = scanner.nextLine();


        System.out.println("\nIngrese el nombre del animal: ");
        String nombreGato = scanner.nextLine();
        System.out.println("Ingrese la edad del animal: ");
        int edadGato = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Ingrese el sonido caracteristico del animal: ");
        String sonidoCaracteristico2 = scanner.nextLine();



        System.out.println("\n");
        Perro perro = new Perro(nombrePerro, edadPerro, sonidoCaracteristico);
        perro.HacerSonido();
        System.out.println("\n");
        Gato gato = new Gato(nombreGato, edadGato, sonidoCaracteristico2);
        gato.HacerSonido();

    }
}

