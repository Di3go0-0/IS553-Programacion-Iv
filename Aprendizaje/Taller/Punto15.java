package Taller;

public class Punto15 {
    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Deben ingresarse dos argumentos en formato: cadena1 cadena2");
        }
        
        String cadena1 = args[0];
        String cadena2 = args[1];

        if(cadena1.equalsIgnoreCase(cadena2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

    }
}
