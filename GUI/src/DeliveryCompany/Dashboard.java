package DeliveryCompany;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.UIManager;

import java.awt.Toolkit;

public class Dashboard {
	JPanel eastPanel, westPanel, centerPanel, northPanel, southPanel;
	JLabel textLabel = new JLabel();

	JPanel dasboardPanel = new JPanel(new BorderLayout());

	public Dashboard(String username) {
		eastPanel = new JPanel(new BorderLayout());
		westPanel = new JPanel(new BorderLayout());
		centerPanel = new JPanel(new BorderLayout());
		southPanel = new JPanel(new FlowLayout());
		northPanel = new JPanel(new BorderLayout());

//		eastPanel.setSize(100, 400);
		dasboardPanel.add(eastPanel, BorderLayout.EAST);
		eastPanel.setBackground(new Color(102, 178, 255));

//		westPanel.setSize(100, 400);
		dasboardPanel.add(westPanel, BorderLayout.WEST);
		westPanel.setBackground(new Color(204, 229, 255));

		dasboardPanel.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setBackground(Color.DARK_GRAY);

		dasboardPanel.add(northPanel, BorderLayout.NORTH);
		northPanel.setBackground(new Color(48, 105, 148));

		dasboardPanel.add(southPanel, BorderLayout.SOUTH);

		southPanel.setBackground(new Color(48, 110, 148));
		
		String currentDateString = java.util.Calendar.getInstance().getTime().toString();

		textLabel.setText("Copyright Mukesh Mahara | "+ currentDateString);
		southPanel.add(textLabel, BorderLayout.CENTER);
		
		JButton profileButton = new JButton("Profile");
		profileButton.setBounds(630, 0, 80, 30);

		northPanel.add(profileButton);

		profileButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Toolkit tk = Toolkit.getDefaultToolkit();

				String imageURL = "";
				tk.getImage(imageURL);
				centerPanel.setBackground(new Color(204, 255, 255));

				profileButton.setBackground(new Color(204, 255, 255));
				showProfile(username);

			}
		});

		JLabel mlabel = new JLabel();

		JFrame dashboard_Frame = new JFrame();
		JButton logoutButton = new JButton("logout");

		northPanel.add(mlabel, BorderLayout.CENTER);
		mlabel.setText("Welcome " + username);
		mlabel.setForeground(Color.green);

		northPanel.add(logoutButton, BorderLayout.EAST);
		dasboardPanel.setBackground(Color.cyan);
		dasboardPanel.setSize(300, 300);

		dashboard_Frame.add(dasboardPanel);

		logoutButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseEntered(java.awt.event.MouseEvent evt) {
				logoutButton.setBackground(Color.red);
			}

			public void mouseExited(java.awt.event.MouseEvent evt) {
				logoutButton.setBackground(UIManager.getColor("control"));
			}
		});

		logoutButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Login login = new Login();
				login.login();

				dashboard_Frame.setVisible(false);

			}
		});
		dashboard_Frame.setTitle("Dashboard");
		dashboard_Frame.setSize(800, 400);
		dashboard_Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		dashboard_Frame.add(dasboardPanel);
		dashboard_Frame.setVisible(true);

	}

	public void showProfile(String username) {
		JLabel detailLabel = new JLabel();
		detailLabel.setText("My name is " + username);
		detailLabel.setForeground(Color.black);
		detailLabel.setBounds(400, 200, 300, 20);
		centerPanel.add(detailLabel, BorderLayout.BEFORE_LINE_BEGINS);

//		dasboardPanel.add(centerPanel);

	}

}
