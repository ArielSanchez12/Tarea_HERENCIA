package Ejercicio1;

public class Perro extends Animal {
    private String sonidoCaracteristico;
    public Perro(String nombrePerro, int edadPerro, String sonidoCaracteristico){
        super(nombrePerro, edadPerro);
        this.sonidoCaracteristico = sonidoCaracteristico;
    }

    public String ladrar(String sonidoCaracteristico){
         return sonidoCaracteristico;
    }

    @Override
    public void HacerSonido(){
        super.HacerSonido();
        System.out.println("El animal " + getNombre() + " hace: " + ladrar(sonidoCaracteristico));
    }
}
