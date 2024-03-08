package Taller;

public class Punto14{
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("Deben ingresarse tres argumentos en formato: operacion numero1 numero2");
        }

        String operacion = args[0];
        double numero1 = Double.parseDouble(args[1]);
        double numero2 = Double.parseDouble(args[2]);
        double resultado = 0;

        switch(operacion.toUpperCase()){
            case "SUMA":
                resultado = numero1 + numero2;
                break;
            case "RESTA":
                resultado = numero1 - numero2;
                break;
            case "MULTIPLICACION":
                resultado = numero1 * numero2;
                break;
            case "DIVISION":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operacion no valida");
                return;
            }
        System.out.println("El resultado de la operacion " + operacion + " es: " + resultado);
    }

}