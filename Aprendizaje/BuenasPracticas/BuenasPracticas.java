package BuenasPracticas;

import java.util.Scanner;


public class BuenasPracticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt(); 
        Piramide piramide = new Piramide(altura);
        piramide.imprimirPiramide();
        scanner.close(); // Cerrar el scanner al finalizar su uso
    }
}


