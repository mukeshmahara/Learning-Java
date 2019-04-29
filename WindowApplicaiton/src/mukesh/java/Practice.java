/**
 * 
 */
package mukesh.java;

import javax.swing.JFrame;
import java.awt.Graphics;
import javax.swing.SwingUtilities;
import javax.swing.JPanel;
/**
 * @author Mukes
 *
 */
public class Practice extends JFrame  {

	
	public Practice() {
		// TODO Auto-generated constructor stub
		setTitle("My Practice");
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Practice object=new Practice();
		object.setVisible(true);
		
		JFrame frame=new JFrame("Wellcome mukesh");
		
	}

}
