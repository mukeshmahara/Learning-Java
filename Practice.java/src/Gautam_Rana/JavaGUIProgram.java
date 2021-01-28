package Gautam_Rana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.mysql.cj.x.protobuf.MysqlxNotice.Frame;

public class JavaGUIProgram {

	public JavaGUIProgram() {
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		JTextField num1 = new JTextField();
		JTextField num2 = new JTextField();
		JTextField resulTextField = new JTextField();
		
		JLabel num1JLabel = new JLabel("Number1");
		JLabel num2JLabel = new JLabel("Number2");
		JLabel resultJLabel = new JLabel("Result");
		
		frame.setTitle("Java GUI Program");
		
		num1.setColumns(20);
		num2.setColumns(20);
		resulTextField.setColumns(20);
		
		panel.add(num1JLabel);
		panel.add(num1);
		
		panel.add(num2JLabel);
		panel.add(num2);
		
		panel.add(resultJLabel);
		panel.add(resulTextField);
		
		JButton calButton = new JButton("Calculate");
		
		panel.add(calButton);
		
		calButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String number1 = num1.getText();
				int n1 = Integer.parseInt(number1);
				String number2 = num2.getText();
				int n2 = Integer.parseInt(number2);
			
				if(n1>n2) {
					resulTextField.setText(n1+" is greate than "+n2);
				}
				
				
				
				else {
					resulTextField.setText(n2+" is greate than "+n1);
				}
				
				
			
			}
		});
		
		frame.add(panel);
		
		frame.setSize(250,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
JavaGUIProgram javaGUIProgram =new JavaGUIProgram();
		
	}

}
