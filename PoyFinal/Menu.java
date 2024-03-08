package PoyFinal;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    private int option;
    private ArrayList<User> users = new ArrayList<User>(); // Create an ArrayList object
    private Scanner scanner = new Scanner(System.in); // Create a Scanner object

    
    public void printOptions() {
        System.out.println("Ingresa una Opcion: ");
        System.out.println("1. Registrarse Como cliente ");
        System.out.println("2. Iniciar Sesion ");
        System.out.println("3. Salir ");
    }

    public void scannerOptions(){
        try {
            this.option = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over
            if (this.option > 3) {
                throw new Exception("El número ingresado es mayor a 3.");
            }
        } catch (Exception e) {
            System.out.println("Por favor, ingresa un número válido.");
            this.scannerOptions();
        }
    }

    public void options(){
        switch (this.option){
            case 1:
                this.registerClient();
                break;
            case 2:
                this.login();
                break;
            case 3:
                this.exit();
                break;
            default:
                break;
        }
    }


    public int getOption(){
        return option;
    }

    public void registerClient(){
        System.out.println("Ingresa tu nombre: ");
        String name = scanner.nextLine();
        
        System.out.println("Ingresa tu correo electrónico: ");
        String email = scanner.nextLine();

        System.out.println("Ingresa tu contraseña: ");
        String password = scanner.nextLine();
        
        User newUser = new User(name, email, password, "Cliente");
        users.add(newUser);
        
        System.out.println("Cliente registrado exitosamente.");
    }

    public void login(){
        System.out.println("Ingresa tu nombre: ");
        String name = scanner.nextLine();
        
        System.out.println("Ingresa tu correo electrónico: ");
        String email = scanner.nextLine();
        
        System.out.println("Ingresa tu contraseña: ");
        String password = scanner.nextLine();
        
        for(User user : users) {
            if(user.getName().equals(name) && user.getEmail().equals(email) && user.getPassword().equals(password) && user.getTypeUser().equals("Cliente")) {
                System.out.println("Inicio de sesión exitoso.");
                return;
            }
        }
        
        System.out.println("Nombre de usuario o correo electrónico incorrectos.");
    }

    public void exit(){
        System.out.println("Saliendo...");
        return;
    }
    
}