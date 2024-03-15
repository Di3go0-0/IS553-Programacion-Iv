package PoyFinal.Users;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<User>();

    public void registerClient(String typeCC, String cc, String name, String lastName, String email, String address, String city, String phone, String password){
        User newUser = new User(typeCC, cc, name, lastName, email, address, city, phone, password, "Cliente");
        users.add(newUser);
        System.out.println("Cliente registrado exitosamente.");
    }

    public boolean loginClient(String email, String password){
        for(User user : users) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password) && user.getTypeUser().equals("Cliente")) {
                System.out.println("Inicio de sesión exitoso.");
                return true;
            }
        }
        System.out.println("Nombre de usuario o correo electrónico incorrectos.");
        return false;
    }
}