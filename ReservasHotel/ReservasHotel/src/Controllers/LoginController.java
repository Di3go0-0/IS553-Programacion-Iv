package Controllers;
import java.util.List;

import Models.User;
import Services.UserManager;

public class LoginController {
	
	private Boolean LoginSuccessful = false;
	
	private UserManager users;
	
	public LoginController(UserManager users) {
		this.users = users;
	}
	public LoginController() {
		
	}
	
	public boolean Login(String email, String password) {
		if (!checkEmailExists(email)) {
			this.LoginSuccessful = false;
			return false;
		}else if(!verifyLogin(email, password)){
			this.LoginSuccessful = false;
			return false;
		}
		this.LoginSuccessful = true;
		return true;
    }
	
	private boolean checkEmailExists(String email) {
		List<User> userList = users.getUsers();
        for(User user : userList) {
            if(user.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }
	
	private boolean verifyLogin(String email, String password) {
		List<User> userList = users.getUsers();
        for(User user : userList) {
            if(user.getEmail().equals(email) && user.getPassword().equals(password)) {
                return true;
            }
        }
        return false;
    }
}
