package UI;

import java.awt.EventQueue;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import java.awt.Font;

//Login class which inherits the methods and attributes of JPanel
public class Login extends JPanel {

	//declaring the instance variables
	private JTextField userName;
	private JPasswordField password;
	private JButton btnLogin;
	private JLabel lblNewLabel;

	//class constructor which will run the method initialize();
	public Login() {
		initialize();
	}

	//Initialize the contents of the frame.
	private void initialize() {
		setLayout(null);

		//adding the necessary buttons, text fields and buttons
		btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 33));
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {}
		});
		btnLogin.setBounds(400, 464, 200, 60);
		add(btnLogin);
		
		userName = new JTextField();
		userName.setFont(new Font("Tahoma", Font.PLAIN, 33));
		userName.setBounds(383, 255, 326, 50);
		add(userName);
		userName.setColumns(10);
		
		password = new JPasswordField();
		password.setFont(new Font("Tahoma", Font.PLAIN, 33));
		password.setBounds(383, 341, 326, 50);
		add(password);
		password.setColumns(10);
		
		JLabel lblLogin = new JLabel("LOGIN");
		lblLogin.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblLogin.setBounds(25, 25, 300, 40);
		add(lblLogin);
		
		JLabel lblBrugernavn = new JLabel("Username:");
		lblBrugernavn.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblBrugernavn.setBounds(176, 258, 208, 36);
		add(lblBrugernavn);
		
		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 33));
		lblPassword.setBounds(176, 344, 181, 33);
		add(lblPassword);
	}

	//adding actionlistener to the login button, so that it can be used
	public void addActionListeners(ActionListener l){
		btnLogin.addActionListener(l); 
	}


	public String getUserName() {
		return userName.getText();
	}
	
	public String getPassword () {
		return password.getText();
	}
}
