// Copyright Wintriss Technical Schools 2013
import org.teachingextensions.logo.Colors;
import org.teachingextensions.logo.Tortoise;
import org.teachingextensions.logo.Turtle.Animals;

public class TriangleShell {

	public static void main(String[] args) {
		Tortoise.setAnimal(Animals.Spider);
		Tortoise.setSpeed(10);

		int length = 25;

		for (int i = 0; i < 60; i++) {

			Tortoise.setPenColor(Colors.getRandomColor());

			length = length + 4;

			drawTriangle(length);

			Tortoise.turn(6);
		}
	}

	
	private static void drawTriangle(int length) {
		for (int i = 0; i < 3; i++) {

			Tortoise.move(length);
			Tortoise.turn(120);

		}
	}
}