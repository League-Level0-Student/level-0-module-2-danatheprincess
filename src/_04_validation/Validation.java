//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		for(int d=1;d<10;d++) {
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(5);
		
		

		// 1. Use each value of randomNumber to give the user a random compliment.
		if(randomNumber==0) {
			
			System.out.println("you are smart");	
		}
		if(randomNumber==1) {
		System.out.println("you are hard working");
		}
		if(randomNumber==2) {
		System.out.println("you are inspiring");
}
		if(randomNumber==3) {
			System.out.println("you have a nice name");
		}
		if(randomNumber==4) {		
		System.out.println("I like your shoes");
		}
			// 2. Repeat all the code above 10 times
			
			// 3. Find someone to test out your program. They will like it :)
		}
	}
}
