package Gautam_Rana;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class KilometerToMile_Converter {
	public KilometerToMile_Converter() {
		System.out.println("Im working");

		
		
		JFrame frame = new JFrame();
		JPanel jPanel = new JPanel();
		
		frame.setTitle("Kilometer to Mile Converter");
		JLabel jLabel = new JLabel();
		JLabel resultJLabel = new JLabel();

		JTextField textField = new JTextField();
		JButton btn = new JButton("Convert");
		
		
		jLabel.setText("Enter the length in KM :");		
		jPanel.add(jLabel);
		textField.setColumns(30);
		jPanel.add(textField);

		jPanel.add(btn);

		
		jPanel.add(resultJLabel);
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				double Km = Integer.parseInt(textField.getText());
				double mile = Km*0.621371192;
				String mileString = Double.toString(mile);

				
				 JOptionPane.showMessageDialog(frame,Km+" km is "+mileString+" miles");
				
			}
		});

		frame.add(jPanel);
		frame.setSize(400, 400);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setVisible(true);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		KilometerToMile_Converter KtoM = new KilometerToMile_Converter();
	}

}
