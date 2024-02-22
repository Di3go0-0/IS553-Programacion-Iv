package BuenasPracticas;

public class Piramide {
    private byte altura;

    public Piramide(byte altura) {
        this.altura = altura;
    }
    //Metodo para imprimir la piramide
    public void imprimirPiramide() {
        for (int fila = 0; fila < altura; fila++) {
            imprimirEspacios(altura - fila - 1);
            imprimirAsteriscos(2 * fila + 1);
            System.out.println();
        }
    }
    //Metodo para imprimir Espacios
    private void imprimirEspacios(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print(" ");
        }
    }
    //Metodo para imprimir Asteriscos
    private void imprimirAsteriscos(int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            System.out.print("*");
        }
    }
}
