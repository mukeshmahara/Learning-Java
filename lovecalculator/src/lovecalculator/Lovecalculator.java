/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lovecalculator;

import java.awt.Color;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

import net.miginfocom.swing.MigLayout;


/**
 *
 * @author Mukesh Mahara
 */
public class Lovecalculator {
	
	private JFrame frame = new JFrame();
	private JPanel contentpanel =new JPanel(new MigLayout("insets 300, center"));
	private JButton submitButton = new JButton("Submit");
	private JLabel textJLabel = new JLabel("Hello");
	private JLabel textJLabel1 = new JLabel("world");
	
	public Lovecalculator() {
		// TODO Auto-generated constructor stub
		
		frame.setTitle("Love Calculator");

		
		
		
		contentpanel.setBorder(BorderFactory.createEmptyBorder(50, 50, 50, 50));

		
		contentpanel.add(textJLabel,"span 2 2, w 100!");
		
		contentpanel.add(textJLabel1,"span 0 1, w 100!");
		
		
		contentpanel.add(submitButton,"w 100!");
		
		
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
		frame.setLocationRelativeTo(contentpanel);
	
		frame.add(contentpanel);
	
		frame.setVisible(true);
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
	}
	
	public static void main(String[] args) {
		
		new Lovecalculator();
	}
	
	
	
	
	
}
