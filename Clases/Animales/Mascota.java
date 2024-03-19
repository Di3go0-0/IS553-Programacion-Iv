package Clases.Animales;

public class Mascota extends Animal{

    public String nombre;
    public String raza;
    public int edad;

    public Mascota(String nombre, String raza, int edad){
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    @Override
    public void emitirSonido(){
        System.out.println("Guau guau");
    }
    
}
