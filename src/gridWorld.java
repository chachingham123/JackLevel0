import java.awt.Color;
import java.util.Random;

import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridWorld {
	public static void main(String[] args) {
		gridWorld gop = new gridWorld();

	}

	gridWorld() {
		World world = new World();
		world.show();
		Bug bug = new Bug();
		Bug bug2 = new Bug();
		Random random = new Random();
		int ian = random.nextInt(11);
		int jack = random.nextInt(11);
		Location flower = new Location(ian-1,jack);
		Location flower2 = new Location(ian+1,jack);
		Location bugg = new Location(random.nextInt(11),random.nextInt(11));
		Location buggg = new Location(random.nextInt(11),random.nextInt(11));
		bug2.setColor(Color.blue);
		bug.setDirection(90);
		Flower flower11 = new Flower();
		Flower flower22= new Flower();
		world.add(bugg,bug);
		world.add(buggg,bug2);
		world.add(flower,flower11);
		world.add(flower2,flower22);
		
	}
}
