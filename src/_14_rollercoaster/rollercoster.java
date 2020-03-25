package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoster {
public static void main(String[] args) {
	
 String height=JOptionPane.showInputDialog("how tall are you in inches");
	int num=Integer.parseInt(height);
	if(num>48) {
	JOptionPane.showMessageDialog(null,"you can ride a roller coaster");
}
	else 
		JOptionPane.showMessageDialog(null,"you need to grow more");
	
}

}