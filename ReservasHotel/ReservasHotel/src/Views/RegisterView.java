package Views;
import javax.swing.*;
import java.awt.event.*;

import Views.LoginView;

import Controllers.RegisterController;
import Services.UserManager;
 

public class RegisterView {
	private UserManager users;
	final String[] idTypes = {"T.I","C.C"};
	JFrame f = new JFrame("Register");
	JComboBox<String> idTypeField;
	JTextField idField, namesField, lastNamesField, emailField,
				residenceAddressField, residenceCityField,
				phoneField;
	JPasswordField passwordField, confirmPasswordField;
	
	
	public RegisterView(UserManager users) {	
		this.users = users;
		
	    addLabels();
	    addFields();
	    addButtons();
	    
	    // Set frame properties
	    f.setTitle("Register");
	    f.setSize(600, 800);
	    f.setLayout(null);
	    f.setVisible(true);
    }  
	
	private boolean registerHandler() {
		String passwordString = new String(passwordField.getPassword());
		String confirmPasswordString = new String(confirmPasswordField.getPassword());
		
		if(!passwordString.equals(confirmPasswordString)) {
			JOptionPane.showMessageDialog(f, "Password doesn't  match", "Error", JOptionPane.CLOSED_OPTION);
			return false;
		}
		
		
		return true;
	}
	
	private void addButtons() {
		JButton registerButton, loginButton;
		
		//registerbutton definition and settings
		registerButton = new JButton("Registrarse");
		registerButton.setBounds(210,590,180, 20);
		registerButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(!registerHandler()) {
        			return;
        		}
        		
        		RegisterController register = new RegisterController(users);
        		register.registerUser(
        				idTypeField.getItemAt(idTypeField.getSelectedIndex()),
        				idField.getText(),
        				namesField.getText(),
        				lastNamesField.getText(),
        				emailField.getText(),
        				residenceAddressField.getText(),
        				residenceCityField.getText(),
        				phoneField.getText(),
        				new String(passwordField.getPassword())
        				);
        		
    			JOptionPane.showMessageDialog(f, "User Create Succesfuly", "Succesfuly registration", JOptionPane.CLOSED_OPTION);
    			f.dispose();
    			@SuppressWarnings("unused")
				LoginView loginView = new LoginView(users);
        	}
        		
        });
		
		//loginbutton definition and settings
		loginButton = new JButton("Login");
		loginButton.setBounds(210,620,180, 20);
		loginButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		f.dispose();
        		@SuppressWarnings("unused")
				LoginView loginView = new LoginView(users);
        	}
        		
        });
		
		f.add(registerButton);
		f.add(loginButton);
	}
	
	private void addFields() {
		idTypeField = new JComboBox<String>(idTypes);  
		idTypeField.setBounds(200, 90, 200, 20);
		f.add(idTypeField);

		idField = new JTextField();
		idField.setBounds(200, 130, 200, 20);
		f.add(idField);

		namesField = new JTextField();
		namesField.setBounds(200, 170, 200, 20);
		f.add(namesField);

		lastNamesField = new JTextField();
		lastNamesField.setBounds(200, 210, 200, 20);
		f.add(lastNamesField);

		emailField = new JTextField();
		emailField.setBounds(200, 250, 200, 20);
		f.add(emailField);

		residenceAddressField = new JTextField();
		residenceAddressField.setBounds(200, 290, 200, 20);
		f.add(residenceAddressField);

		residenceCityField = new JTextField();
		residenceCityField.setBounds(200, 330, 200, 20);
		f.add(residenceCityField);

		phoneField = new JTextField();
		phoneField.setBounds(200, 370, 200, 20);
		f.add(phoneField);

		passwordField = new JPasswordField();
		passwordField.setBounds(200, 410, 200, 20);
		f.add(passwordField);

		confirmPasswordField = new JPasswordField();
		confirmPasswordField.setBounds(200, 450, 200, 20);
		f.add(confirmPasswordField);

	}
	
	private void addLabels() {
		JLabel idTypeLabel, idLabel, namesLabel, lastNamesLabel, emailLabel,
	    residenceAddressLabel, residenceCityLabel, phoneLabel,
	    passwordLabel, confirmPasswordLabel;
	    
	    //JTextField
	
		 // Definition and settings of idType label
		 idTypeLabel = new JLabel("Type document");
		 idTypeLabel.setBounds(200, 70, 150, 20);
		
		 // Definition and settings of id label
		 idLabel = new JLabel("ID");
		 idLabel.setBounds(200, 110, 150, 20);
		
		 // Definition and settings of names label
		 namesLabel = new JLabel("Name");
		 namesLabel.setBounds(200, 150, 150, 20);
		
		 // Definition and settings of lastNames label
		 lastNamesLabel = new JLabel("Last name");
		 lastNamesLabel.setBounds(200, 190, 150, 20);
		
		 // Definition and settings of email label
		 emailLabel = new JLabel("Email");
		 emailLabel.setBounds(200, 230, 150, 20);
		
		 // Definition and settings of residenceAddress label
		 residenceAddressLabel = new JLabel("Address");
		 residenceAddressLabel.setBounds(200, 270, 150, 20);
		
		 // Definition and settings of residenceCity label
		 residenceCityLabel = new JLabel("City");
		 residenceCityLabel.setBounds(200, 310, 150, 20);
		
		 // Definition and settings of phone label
		 phoneLabel = new JLabel("Phone");
		 phoneLabel.setBounds(200, 350, 150, 20);
		
		 // Definition and settings of password label
		 passwordLabel = new JLabel("Password");
		 passwordLabel.setBounds(200, 390, 150, 20);
		
		 // Definition and settings of confirmPassword label
		 confirmPasswordLabel = new JLabel("Confirm Password");
		 confirmPasswordLabel.setBounds(200, 430, 150, 20);
		 
		 f.add(idTypeLabel);
	     f.add(idLabel);
	     f.add(namesLabel);
	     f.add(lastNamesLabel);
	     f.add(emailLabel);
	     f.add(residenceAddressLabel);
	     f.add(residenceCityLabel);
	     f.add(phoneLabel);
	     f.add(passwordLabel);
	     f.add(confirmPasswordLabel);
	}
}