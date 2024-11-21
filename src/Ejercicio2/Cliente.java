package Ejercicio2;
class Cliente {
    private String nombre;
    private String identificacion;

    public Cliente(String nombre, String identificacion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
    }
    /*
    public String getNombre() {
        return nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }
     */
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Identificacion: " + identificacion);
    }
}
