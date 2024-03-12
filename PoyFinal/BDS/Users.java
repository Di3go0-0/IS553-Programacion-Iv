package PoyFinal.BDS;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Users {
    // Instancias la clase que hemos creado anteriormente
    private ConexionMySQL SQL = new ConexionMySQL();
    // Llamas al método que tiene la clase y te devuelve una conexión
    private Connection conn = SQL.conectarMySQL();
    // Query que usarás para hacer lo que necesites
    private String sSQL =   "";

    public void addUser(String name, String email, String password, String typeUser) {
    sSQL = "INSERT INTO users (name, email, password, typeUser) VALUES (?, ?, ?, ?)";

        try {
            PreparedStatement pst = conn.prepareStatement(sSQL);
            pst.setString(1, name);
            pst.setString(2, email);
            pst.setString(3, password);
            pst.setString(4, typeUser);
            pst.execute();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }   
}
