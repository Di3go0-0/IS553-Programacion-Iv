package Views;
import java.awt.event.*;

import javax.swing.*;

//import Users.User;
import Controllers.LoginController;
import Services.UserManager;
import Views.RegisterView;

public class LoginView {
	private LoginController login;
	private UserManager users;
	
	public LoginView(UserManager users) {
		this.users = users;
		login = new LoginController(this.users);
		
		JFrame f= new JFrame();
		
		//The necessary labels are declared.
		JLabel EmailLabel, PasswordLabel, LoginLabel;
		
		LoginLabel = new JLabel("Login");
		LoginLabel.setBounds(270, 100, 100, 20);
		
		EmailLabel = new JLabel("Email");
		EmailLabel.setBounds(200, 180, 100, 20);
		
		PasswordLabel = new JLabel("Password");
		PasswordLabel.setBounds(200, 260, 100, 20);
		
		JTextField EmailTextField = new JTextField(20);
	    EmailTextField.setToolTipText("Enter Email"); // Add placeholder
        EmailTextField.setBounds(200, 200, 200,30);
		
        JPasswordField PasswordTextField = new JPasswordField(20);
        PasswordTextField.setToolTipText("Enter Password"); // Add placeholder
        PasswordTextField.setBounds(200, 280, 200,30);
        
        
        JButton LoginButton = new JButton("Login");
        LoginButton.setBounds(250,350,100,20);
        LoginButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent even) {
        		if(login.Login(EmailTextField.getText(), new String(PasswordTextField.getPassword()))) {
        			f.dispose();
        			@SuppressWarnings("unused")
        			HomeView homeView = new HomeView();
        		}else {
        			JOptionPane.showMessageDialog(f, "User Incorrect or Don't Exist", "Error", JOptionPane.CLOSED_OPTION);
        		}
        	}
        });
        
        JButton RegisterButton = new JButton("Register");
        RegisterButton.setBounds(240,380,120,20);
        RegisterButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		f.dispose();
        		@SuppressWarnings("unused")
				RegisterView registerView = new RegisterView(users);
        	}
        		
        });
        
      //adding elements to frame
        f.add(EmailTextField);
        f.add(PasswordTextField);
        f.add(LoginButton);
        f.add(RegisterButton);
        f.add(EmailLabel);
        f.add(PasswordLabel);
        f.add(LoginLabel);
        
        //frame settings
        f.setTitle("Login");
        f.setSize(600,550);  
        f.setLayout(null);  
        f.setVisible(true);  
 
	}
	
	
}
