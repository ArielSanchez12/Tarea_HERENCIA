package Ejercicio1;
public class Animal {
    private String nombre;
    private int edad;


    public Animal(String nombre, int edad) {
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void HacerSonido() {
        System.out.println("Nombre del animal: " + nombre);
        System.out.println("Edad: " + edad + " años");
    }
}