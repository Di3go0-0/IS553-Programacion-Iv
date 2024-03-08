package Taller;

public class Punto18 {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.out.println("Error: Deben ingresarse tres cadenas como argumentos.");
            return;
        }

        String identificacion = extraerValor(args[0]);
        String nombre = extraerValor(args[1]);
        String apellido = extraerValor(args[2]);

        if (identificacion == null || nombre == null || apellido == null) {
            System.out.println("Error: Las cadenas no están en el formato especificado.");
            return;
        }

        String resultado = "identificacion: " + identificacion + ";nombre: " + nombre + ";apellido: " + apellido;
        System.out.println(resultado);
    }

    // Método para extraer el valor de una cadena con el formato "clave: valor"
    private static String extraerValor(String cadena) {
        String[] partes = cadena.split(":");
        if (partes.length == 2) {
            return partes[1].trim();
        } else {
            return null;
        }
    }

}
