package PoyFinal.Users;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<User>();

    public void registerClient(String name, String email, String password){
        User newUser = new User(name, email, password, "Cliente");
        users.add(newUser);
        System.out.println("Cliente registrado exitosamente.");
    }

    public boolean login(String name, String email, String password){
        for(User user : users) {
            if(user.getName().equals(name) && user.getEmail().equals(email) && user.getPassword().equals(password) && user.getTypeUser().equals("Cliente")) {
                System.out.println("Inicio de sesión exitoso.");
                return true;
            }
        }
        System.out.println("Nombre de usuario o correo electrónico incorrectos.");
        return false;
    }
}