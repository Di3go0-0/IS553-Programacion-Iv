package Clases;

import Clases.Figuras.Circulo;
import Clases.Figuras.Rectangulo;
import Clases.Animales.Perro;

public class Main {
    public static void main(String[] args) {
        figurasTest();
        perroTest();
    }
    
    private static void figurasTest(){
        Circulo circulo = new Circulo(5);
        Rectangulo rectangulo = new Rectangulo(5, 10);
        System.out.println("Area del circulo: " + circulo.calcularArea());
        System.out.println("Area del rectangulo: " + rectangulo.calcularArea());
    }

    private static void perroTest(){
        Perro perro = new Perro("Firulais", "Pastor Aleman", 5);
        perro.emitirSonido();

    }
}