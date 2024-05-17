package Controllers;
import java.util.List;

import Models.User;
import Services.UserManager;


public class RegisterController {
    private UserManager users;
    
    public RegisterController(UserManager users) {
    	this.users = users;
    }
    public RegisterController() {
		
	}
    public boolean registerUser(
			String idType, 
			String id, 
			String names, 
			String lastNames,
			String email,
			String residenceAddress,
			String residenceCity,
			String phone,
			String password
			) 
	{
    	
		users.addUser(idType,
						id, 
						names, 
						lastNames, 
						email, 
						residenceAddress, 
						residenceCity, 
						phone, password);
		return true;
	}
    
  
    
    
    
}
