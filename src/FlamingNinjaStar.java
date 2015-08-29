import java.awt.Color;

import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Before beginning recipe: 1. ask students to find and explain the variable in
 * this recipe.
 * 
 * 2. ask students what Tortoise commands they think they will use to make
 * picture in the laminated hand-outs.
 */

public class FlamingNinjaStar {
	public static void main(String[] args) {

		int baseSize = 300; // the size of the black part of the star
		int flameSize = 200; // the length of the flaming arms

		// *14. Use the methods setX and setY to move the ninja star into the
		// center of the screen

		// *15. Make some adjustments to see what other kinds of shapes you can
		// make.

		
		Tortoise.show();

		
		Tortoise.setSpeed(10);

		
			Tortoise.setX(960);
			Tortoise.setY(540);
			
			for (int i = 0; i < 25; i++) {
			Tortoise.turn(360 / 8);

			
			Tortoise.move(64);

			
			Tortoise.turn(-40);
			Tortoise.setPenColor(Colors.getRandomColor());
Tortoise.setSpeed(1);
			Tortoise.move(200);
		
			Tortoise.turn(170);
			
			
			Tortoise.move(200);
			
			Tortoise.turn(64);
			
			Tortoise.setSpeed(10);
			Tortoise.move(300);
		
			

			

		}

	}
}
