package Taller;

public class Punto17 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Error: Deben ingresarse dos cadenas como argumentos.");
            return;
        }

        String cadena1 = args[0];
        String cadena2 = args[1];

        // Imprimir la primera cadena sin espacios
        String cadena1SinEspacios = cadena1.trim();
        System.out.println("La primera cadena sin espacios es: " + cadena1SinEspacios);

        // Verificar si la primera cadena tiene 5 espacios al inicio y 5 al final
        if (cadena1.startsWith("     ") && cadena1.endsWith("     ")) {
            System.out.println("La primera cadena cumple con el formato especificado.");
        } else {
            System.out.println("Error: La primera cadena no cumple con el formato especificado.");
        }

        // Modificar la segunda cadena para imprimir en el formato solicitado
        String identificacion = extraerValor(cadena2, "identificacion");
        String nombre = extraerValor(cadena2, "nombre");
        String apellido = extraerValor(cadena2, "apellido");

        if (identificacion == null || nombre == null || apellido == null) {
            System.out.println("Error: La segunda cadena no está codificada correctamente.");
            return;
        }

        // Imprimir la segunda cadena en el formato solicitado
        System.out.println("La segunda cadena en el formato solicitado es:");
        System.out.println("[identificacion: " + identificacion + ", nombre: \"" + nombre + "\", apellido: \"" + apellido + "\"]");
    }

    // Método para extraer el valor asociado a una clave en una cadena con formato clave: valor
    private static String extraerValor(String cadena, String clave) {
        String[] partes = cadena.split("\\|");
        for (String parte : partes) {
            if (parte.trim().startsWith(clave + ":")) {
                return parte.trim().substring(clave.length() + 2);
            }
        }
        return null;
    }
}
