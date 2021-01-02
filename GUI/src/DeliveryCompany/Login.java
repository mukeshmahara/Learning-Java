package DeliveryCompany;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;



import java.sql.*;

public class Login extends JPanel {

	private static final long serialVersionUID = -4082135099487518646L;
	protected JFrame frame;
	private JButton loginbtn, signupbtn;
	private JLabel ulabel, plabel, mlabel;
	private JPanel panel;
	private JTextField utextfield;
	private JPasswordField passwordfield;

	@SuppressWarnings("deprecation")

	public void login() {

		JPanel login_imgPanel = new JPanel();
		ImageIcon background = new ImageIcon("C:\\Users\\Dell\\Desktop\\login.jpeg");
		Image img = background.getImage();
		Image temp = img.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		background = new ImageIcon(temp);
		JLabel back = new JLabel(background);

		back.setBounds(0, 0, 500, 600);
		login_imgPanel.add(back);

		frame = new JFrame();

		frame.setTitle("App");
		frame.setSize(400, 450);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel(new FlowLayout((int) TOP_ALIGNMENT, 30, 10));
		panel.setBounds(300, 200, 200, 150);
//		panel.setBounds(30, 300, 300, 300);
		login_imgPanel.setBackground(Color.white);
		frame.add(login_imgPanel, BorderLayout.NORTH);

		ulabel = new JLabel();

		utextfield = new JTextField();
		passwordfield = new JPasswordField();

		ulabel.setText("Username");
		ulabel.setForeground(Color.white);
		plabel = new JLabel();
		panel.add(ulabel);

		mlabel = new JLabel();

		loginbtn = new JButton("login");
		signupbtn = new JButton("SignUp");

		utextfield.setColumns(30);
		passwordfield.setColumns(30);

		panel.setBackground(Color.darkGray);
		panel.add(utextfield);

		plabel.setText("Password");
		plabel.setForeground(Color.white);

		panel.add(plabel);
		panel.add(passwordfield);

		panel.add(loginbtn);
		panel.add(signupbtn);

		panel.setBorder(BorderFactory.createLineBorder(Color.darkGray));
		;

		loginbtn.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseEntered(java.awt.event.MouseEvent evt) {
			        loginbtn.setBackground(Color.green);
			    }

			    public void mouseExited(java.awt.event.MouseEvent evt) {
			        loginbtn.setBackground(UIManager.getColor("control"));
			    }
		});
		loginbtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				

				String username = utextfield.getText();
				String password = passwordfield.getText();

				DB_Connection db = new DB_Connection();

				String RecordSQL = "Select username,email,password from user";

				try {

					Statement stmt = db.connectdb().createStatement();
					ResultSet resultSet = stmt.executeQuery(RecordSQL);

					while (resultSet.next()) {
						verification(resultSet.getString("username"), resultSet.getString("password"));
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});

		signupbtn.setBounds(100, 300, 30, 20);
		signupbtn.addMouseListener(new java.awt.event.MouseAdapter() {
			 public void mouseEntered(java.awt.event.MouseEvent evt) {
				 signupbtn.setBackground(new Color(255,153,51));
			    }

			    public void mouseExited(java.awt.event.MouseEvent evt) {
			    	signupbtn.setBackground(UIManager.getColor("control"));
			    }
		});
		
		signupbtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				frame.setVisible(false);
				Registration registration = new Registration();

			}
		});
		frame.add(panel);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}

	public void verification(String username, String password) {

		if (utextfield.getText().isEmpty()) {
System.out.println(mlabel);
			panel.add(mlabel);
			mlabel.setText("Enter user name !!");
			mlabel.setForeground(Color.red);

		} else if (passwordfield.getText().isEmpty()) {

			panel.add(mlabel);
			mlabel.setText("Please Enter Password!!");
			mlabel.setForeground(Color.red);

		} else if (utextfield.getText().equals(username) && passwordfield.getText().equals(password)) {
			frame.setVisible(false);
			Dashboard dashboard = new Dashboard(username);
			

		} else {
			panel.add(mlabel);
			mlabel.setText("Invalid Credentials!!");
		}

	}
	
	
}
