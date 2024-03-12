package PoyFinal.Menu;

import PoyFinal.Users.UserManager;
import PoyFinal.utils.InputHandler;

public class Menu {
    private int option;
    private UserManager userManager = new UserManager();
    private InputHandler inputHandler = new InputHandler();

    public void printOptions() {
        inputHandler.printOptions();
    }

    public void scannerOptions() {
        this.option = inputHandler.getOption();
    }

    public void options() {
        switch (this.option) {
            case 1:
                registerClient();
                break;
            case 2:
                login();
                break;
            case 3:
                System.out.println("Saliendo...");
                System.exit(0);
                break;
            default:
                break;
        }
    }

    private void registerClient() {
        String name = inputHandler.getInput("Ingresa tu nombre: ");
        String email = inputHandler.getInput("Ingresa tu correo electrónico: ");
        String password = inputHandler.getInput("Ingresa tu contraseña: ");
        userManager.registerClient(name, email, password);
    }

    private void login() {
        String name = inputHandler.getInput("Ingresa tu nombre: ");
        String email = inputHandler.getInput("Ingresa tu correo electrónico: ");
        String password = inputHandler.getInput("Ingresa tu contraseña: ");
        userManager.login(name, email, password);
    }
}