import java.util.Random;

import javax.swing.JOptionPane;

// Copyright Wintriss Technical Schools 2013
public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(10);
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. do the following 10 times
		for (int i = 0; i < 10; i++) {
			
		
			// 1. ask the user for a guess using a pop-up window, and save their response 
String input = JOptionPane.showInputDialog("What number between 1 and 10 am I thinking of? Make a guess");
			// 4. convert the usersÕ answer to an int (Integer.parseInt(string))
			int y = Integer.parseInt(input);
			// 5. if the guess is correct
			if(y == random){
				JOptionPane.showMessageDialog(null, "You win!");
			}
				// 6. win
			// 7. if the guess is high
			else if(y >= random){
				JOptionPane.showMessageDialog(null, "That guess is too high!");
			}
				// 8. tell them it's too high
			// 9. if the guess is low
			else if(y <= random){
				JOptionPane.showMessageDialog(null, "That guess is too low!");
			}
				// 10. tell them it's too low

		// 12. tell them they lose
	}
	}}
	
