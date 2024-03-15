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

    public void menuLoop() {
        while(this.option != 3){
            printOptions();
            scannerOptions();
            switch (this.option) {
                case 1:
                    registerClient();
                    break;
                case 2:
                    loginClient();
                    break;
                case 3:
                    System.out.println("Saliendo...");
                    this.option = 3;
                    break;
                default:
                    break;
            }
        }
        
    }

    private void registerClient() {
        String typeCC = inputHandler.getInput("Ingresa tu tipo de documento: ");
        String cc = inputHandler.getInput("Ingresa tu número de documento: ");
        String name = inputHandler.getInput("Ingresa tu nombre: ");
        String lastName = inputHandler.getInput("Ingresa tu apellido: ");
        String email = inputHandler.getInput("Ingresa tu correo electrónico: ");
        String address = inputHandler.getInput("Ingresa tu dirección: ");
        String city = inputHandler.getInput("Ingresa tu ciudad: ");
        String phone = inputHandler.getInput("Ingresa tu número de teléfono: ");
        String password = inputHandler.getInput("Ingresa tu contraseña: ");
        String password2 = inputHandler.getInput("Confirma tu contraseña: ");
        while (!password.equals(password2)) {
            System.out.println("Las contraseñas no coinciden.");
            password = inputHandler.getInput("Ingresa tu contraseña: ");
            password2 = inputHandler.getInput("Confirma tu contraseña: ");
        }
        userManager.registerClient(typeCC, cc, name, lastName, email, address, city, phone, password);
    }

    private void loginClient() {
        String email = inputHandler.getInput("Ingresa tu correo electrónico: ");
        String password = inputHandler.getInput("Ingresa tu contraseña: ");
        userManager.loginClient(email, password);
    }
}