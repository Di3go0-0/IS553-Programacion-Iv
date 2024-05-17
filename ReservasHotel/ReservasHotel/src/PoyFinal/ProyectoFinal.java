package PoyFinal;

import Controllers.LoginController;
import Services.UserManager;
import Views.LoginView;

public class ProyectoFinal {
	public static void main(String[] args) {
		//Menu menu = new Menu();
		//menu.menuLoop();
		UserManager users =  new UserManager();
		users.addUser("T.I", 
					  "111111", 
					  "Diego",
					  "Rincon",
					  "d.rincon@utp.edu.co",
					  "La virginia", 
					  "Pereira",
					  "3162580642", 
					  "12345");
		LoginView loginview = new LoginView(users);
		
	}
}
