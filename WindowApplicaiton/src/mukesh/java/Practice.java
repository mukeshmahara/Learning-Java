/**
 * 
 */
package mukesh.java;

import javax.swing.JFrame;
import java.awt.Graphics;
import java.awt.Label;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
/**
 * @author Mukes
 *
 */
public class Practice extends JFrame  {
   
	
	public Practice() {
               
                JFrame frame1=new JFrame("HelloWorld");
//                frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JLabel l=new JLabel("Hello Brother I'm Here Starting Swing");
                frame1.getContentPane().add(l);

                //makes the frame visible 
                frame1.setVisible(true); 
                //400 width and 500 height of frame1 
                frame1.setSize(300, 200) ;
                
                
		setLocationRelativeTo(null);
//		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice object=new Practice();
                
		
		
        }

}
