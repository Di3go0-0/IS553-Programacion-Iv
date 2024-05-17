package Services;

import java.util.ArrayList;

import java.util.List;

import Models.User;



public class UserManager {
	private List<User> users = new ArrayList<User>();
    
    

    public List<User> getUsers() {
		return users;
	}


	public void setUsers(List<User> users) {
		this.users = users;
	}


    public void addUser(String typeCC,
    					String cc, 
    					String name, 
    					String lastName, 
    					String email, 
    					String address, 
    					String city, 
    					String phone, 
    					String password)
    {
        User newUser = new User(typeCC, cc, name, lastName, email, address, city, phone, password, "Cliente");
        users.add(newUser);
 
    }

}
