package Clases.Animales;
public abstract class Perro extends Mascota  {
    
    public Perro(String nombre, String raza, int edad){
        super(nombre, raza, edad);
    }

    @Override
    public void emitirSonido(){
        System.out.println("Guau guau");
    }
}