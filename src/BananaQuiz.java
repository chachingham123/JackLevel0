// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

public class BananaQuiz
{
	
	public static void main(String[] args)
	{
		//1. ask the user if they like bananas
		String input = JOptionPane.showInputDialog("Do you like Bananas?");
		if (input.equalsIgnoreCase("No")) {
			JOptionPane.showMessageDialog(null, "You are crazy");
		
		}
		
		
		//2. if they say no, 
	if (input.equalsIgnoreCase("Yes")) {
		String input2 =	JOptionPane.showInputDialog("What is your favorite hobby");
			//tell them they are crazy 
		JOptionPane.showMessageDialog(null, input2 + "is much better than bananas");
			//and end quiz
		//3. if they say yes
		//	ask them what is their favorite hobby
		//	show a pop up that says "<your hobby> is much better with bananas!"
	
	}

}
}