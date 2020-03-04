package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
	public static void main(String[] args) {
		
		//making random object
		Random randy=new Random();
		
		String ticket = "";
		
		for(int i=0;i<15;i++) {
		
			ticket = ticket + randy.nextInt(42) + ",";
		}
		
		
		JOptionPane.showMessageDialog(null,ticket);
		
	}
}
