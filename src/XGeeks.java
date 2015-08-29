// Copyright Wintriss Technical Schools 2014
import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class XGeeks {
public static void main(String[] args) {

		// 1. Save the superpower for each person in a variable.
	String superpower = JOptionPane.showInputDialog("What is your name? Jack, Ian, ethan, Alec");
	if (superpower.equalsIgnoreCase("Jack"))
		JOptionPane.showMessageDialog(null, "Jack's superpower is flight!");
	if (superpower.equalsIgnoreCase("Ian"))
		JOptionPane.showMessageDialog(null, "Ian's superpower is invisability!");
	if (superpower.equalsIgnoreCase("Ethan"))
		JOptionPane.showMessageDialog(null, "Ethan's power is breathing underwater!");
	if (superpower.equalsIgnoreCase("Alec"))
		JOptionPane.showMessageDialog(null, "Alec's superpower is freezing things!");
		
		// 2. Ask the user to enter a name. Store their answer in a variable.

		// 3. Show the superpower in a pop-up, depending on the name entered. 

	}
}
