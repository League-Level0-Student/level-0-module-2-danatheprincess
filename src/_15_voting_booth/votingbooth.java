package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingbooth {
public static void main(String [] args) {
	
	String age=JOptionPane.showInputDialog("how old are you?");
	
	int votingage=Integer.parseInt(age);
	
	if(votingage>=18) {
	JOptionPane.showMessageDialog(null,"who should the next president be?");
	}
	else
		JOptionPane.showMessageDialog(null,"noboby cares what you think");
	
	
	
	
	
	
	
	
	
	
	
}
}