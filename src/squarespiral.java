import javax.swing.JOptionPane;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;


public class squarespiral {public static void main(String[] args) {
	String input = JOptionPane.showInputDialog("Do you want a square spiral or triangle spiral?");
	if (input.equals("triangle")) {
		for (int i = 0; i < 100; i++) {
			Tortoise.setPenColor(Colors.getRandomColor());
			Tortoise.setSpeed(10);
			Tortoise.move(5*i);
			Tortoise.turn(120);
			
		}
		
	}
	
	
	if (input.equals("square"))
	for (int i = 0; i < 100; i++) {
		Tortoise.setPenColor(Colors.getRandomColor());
		Tortoise.setSpeed(10);
		Tortoise.move(10);
		Tortoise.turn(90);
		Tortoise.move(5*i);
		
	}
}

}
