package Ejercicio1;

public class Gato extends Animal {
    private String sonidoCaracteristico2;
    public Gato(String nombreGato, int edadGato, String sonidoCaracteristico2){
        super(nombreGato, edadGato);
        this.sonidoCaracteristico2 = sonidoCaracteristico2;
    }

    public String maullar(String sonidoCaracteristico2){
        return sonidoCaracteristico2;
    }

    @Override
    public void HacerSonido(){
        super.HacerSonido();
        System.out.println("El animal " + getNombre() + " hace: " + maullar(sonidoCaracteristico2));
    }
}
