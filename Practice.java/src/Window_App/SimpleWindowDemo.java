package Window_App;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SimpleWindowDemo {

	public SimpleWindowDemo() {
		// TODO Auto-generated constructor stub
		JFrame myFrame = new JFrame("Colors");
		
		JLabel myLabel = new JLabel(); 
		
		JButton red,blue,yellow;
		
		JPanel panel,textpanel;
		
		panel = new JPanel();
		textpanel = new JPanel();
		
		myLabel.setText("Enter button to set the Color");
		textpanel.add(myLabel);
	
		myFrame.add(textpanel,BorderLayout.NORTH);
		myFrame.add(panel,BorderLayout.CENTER);
		
		
		red = new JButton("Red");
		blue = new JButton("blue");
		yellow = new JButton("yellow");
		
		panel.add(red);
		panel.add(blue);
		panel.add(yellow);
		
		
		red.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myLabel.setForeground(Color.red);
				panel.setBackground(Color.RED);
			}
		});
		blue.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				
				myLabel.setForeground(Color.blue);
				panel.setBackground(Color.blue);
				
				
			}
		});
		
		yellow.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myLabel.setForeground(Color.yellow);
				panel.setBackground(Color.yellow);
				
			}
		});
		
		myFrame.setSize(400, 400);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		myFrame.setVisible(true);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleWindowDemo myApp = new SimpleWindowDemo();

	}

}
