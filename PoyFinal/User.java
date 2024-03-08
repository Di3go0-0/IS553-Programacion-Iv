package PoyFinal;

public class User {
    private String name;
    private String email;
    private String password;
    private String typeUser;

    public User(String name, String email, String password, String typeUser){
        this.name = name;
        this.email = email;
        this.password = password;
        this.typeUser = typeUser;
        
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPassword(){
        return password;
    }
    public String getTypeUser(){
        return typeUser;
    }
}
