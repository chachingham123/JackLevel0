                                               
// Copyright Wintriss Technical Schools 2013
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Colors;
public class spiral {

	public static void main(String[] args) {

		Tortoise.show();
	
		Tortoise.setSpeed(10);
	
for (int i = 0; i < 75; i++) 
{Tortoise.move(5*i);
Tortoise.setPenColor(Colors.getRandomColor());
Tortoise.setPenWidth(i);	

			

Tortoise.turn(360/7);
	

	}

}
}



