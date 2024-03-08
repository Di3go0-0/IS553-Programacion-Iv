package Taller;

public class Ejercicios {
    public static void main(String[] args) {
        // Tipos de datos primitivos y sus valores mínimos, máximos y tamaño en bytes
        System.out.println("Para byte el valor minimo es: " + Byte.MIN_VALUE + " y el valor maximo es: " + Byte.MAX_VALUE + " Ocupa " + Byte.BYTES + " byte que son " + (Byte.BYTES * 8) + " bits");
        System.out.println("Para short el valor minimo es: " + Short.MIN_VALUE + " y el valor maximo es: " + Short.MAX_VALUE + " Ocupa " + Short.BYTES + " bytes que son " + (Short.BYTES * 8) + " bits");
        System.out.println("Para int el valor minimo es: " + Integer.MIN_VALUE + " y el valor maximo es: " + Integer.MAX_VALUE + " Ocupa " + Integer.BYTES + " bytes que son " + (Integer.BYTES * 8) + " bits");
        System.out.println("Para long el valor minimo es: " + Long.MIN_VALUE + " y el valor maximo es: " + Long.MAX_VALUE + " Ocupa " + Long.BYTES + " bytes que son " + (Long.BYTES * 8) + " bits");
        System.out.println("Para float el valor minimo es: " + Float.MIN_VALUE + " y el valor maximo es: " + Float.MAX_VALUE + " Ocupa " + Float.BYTES + " bytes que son " + (Float.BYTES * 8) + " bits");
        System.out.println("Para double el valor minimo es: " + Double.MIN_VALUE + " y el valor maximo es: " + Double.MAX_VALUE + " Ocupa " + Double.BYTES + " bytes que son " + (Double.BYTES * 8) + " bits");
        System.out.println("Para char el valor minimo es: " + (int) Character.MIN_VALUE + " y el valor maximo es: " + (int) Character.MAX_VALUE + " Ocupa " + Character.BYTES + " bytes que son " + (Character.BYTES * 8) + " bits");
        System.out.println("Para boolean no tiene un valor mínimo o máximo definido. Se usa para representar un valor verdadero o falso. Ocupa " + Byte.BYTES + " byte que son " + (Byte.BYTES * 8) + " bits");
    }
}
