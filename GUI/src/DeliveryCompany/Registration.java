package DeliveryCompany;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Registration extends GUI {
	JLabel uname, uemail, upassword, phone_no;
	JTextField unameTextField, uemailField, phone_noJTextField;
	JPasswordField uPasswordField;

	JFrame regFrame = new JFrame();
	JButton regButton = new JButton("Register");
	JLabel welcome_MsgJLabel = new JLabel();
	JPanel regPanel = new JPanel(new GridLayout(5, 2, 15, 20));
	JLabel statusJLabel = new JLabel();
	public Registration() {

		regPanel.setBorder(BorderFactory.createLineBorder(Color.black));

		regPanel.setBackground(Color.cyan);
		regFrame.setForeground(Color.red);
		welcome_MsgJLabel.setText("Welcome to registration Page");

		JPanel topPanel = new JPanel();
		topPanel.setBorder(BorderFactory.createLineBorder(Color.black));
		topPanel.add(welcome_MsgJLabel);
		
		regFrame.add(topPanel, BorderLayout.NORTH);

		uname = new JLabel();
		unameTextField = new JTextField();
		uname.setText("User Name :");
		unameTextField.setColumns(30);

		regPanel.add(uname);
		regPanel.add(unameTextField);

		uemail = new JLabel();
		uemailField = new JTextField();
		uemail.setText("Email :");
		uemailField.setColumns(30);
		regPanel.add(uemail);
		regPanel.add(uemailField);

		upassword = new JLabel();
		uPasswordField = new JPasswordField();
		upassword.setText("Password");
		uPasswordField.setColumns(30);
		regPanel.add(upassword);
		regPanel.add(uPasswordField);

		phone_no = new JLabel();
		phone_noJTextField = new JTextField();
		phone_no.setText("Phone number");
		phone_noJTextField.setColumns(30);
		regPanel.add(phone_no);
		regPanel.add(phone_noJTextField);
		
		

		regButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				DB_Connection db = new DB_Connection();
				if(unameTextField.getText().isEmpty()&&
				uemailField.getText().isEmpty()&&
				uPasswordField.getText().isEmpty()&&
				phone_noJTextField.getText().isEmpty()) {
					statusJLabel.setText("Error!! All fields required...");
					statusJLabel.setForeground(Color.red);
					
				}
				regPanel.add(statusJLabel);
				int id = (int) Math.random() * 1000;

				String insertUser = "Insert into  user(id,username,email,password,phone_number) values('" + id + "','"
						+ unameTextField.getText() + "','" + uemailField.getText() + "','" + uPasswordField.getText()
						+ "','" + phone_noJTextField.getText() + "' )";
				try {
					Statement stmtStatement = db.connectdb().createStatement();
					stmtStatement.execute(insertUser);

					
					statusJLabel.setText("Record inserted Sucessfuly..");
					unameTextField.setText("");
					uemailField.setText("");
					uPasswordField.setText("");
					phone_noJTextField.setText("");
					
					regFrame.setVisible(false); 

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		regPanel.setBounds(300, 200, 200, 150);
		regPanel.add(regButton);
		regPanel.add(statusJLabel);

		regFrame.add(regPanel);

		regFrame.setTitle("Registration");
		regFrame.setSize(600, 500);

		regFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		regFrame.pack();
		regFrame.setLocationRelativeTo(null);
		regFrame.setVisible(true);

	}

}
