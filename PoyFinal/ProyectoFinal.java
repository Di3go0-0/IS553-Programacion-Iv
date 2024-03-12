package PoyFinal;

import PoyFinal.Menu.Menu;

public class ProyectoFinal {
    public static void main(String[] args) {
        Menu menu = new Menu();
        while (true) {
            menu.printOptions();
            menu.scannerOptions();
            menu.options();
        }
    }
}