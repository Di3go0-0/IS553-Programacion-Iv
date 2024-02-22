package BuenasPracticas;
import java.util.Scanner;

public class AplicarBuenasPracticas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la altura de la pirámide: ");
        int altura = scanner.nextInt();

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < altura - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close(); // Se cierra el scanner al finalizar
    }
}
