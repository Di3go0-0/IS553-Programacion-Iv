package Taller;

public class Punto16 {
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Deben ingresarse dos argumentos en formato: cadena1 cadena2");
        }
        
        String cadena1 = args[0];
        String cadena2 = args[1];

        System.out.println(cadena1 + cadena2);
    }
}
