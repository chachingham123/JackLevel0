import org.jointheleague.graphical.robot.Robot;

public class robot {
	public static void main(String[] args) {
		robot robot = new robot();
	}
	robot(){
		Robot jaclk = new Robot();
		jaclk.setPenWidth(10);
		jaclk.setSpeed(10);
		jaclk.penDown();
		jaclk.move(450);
		jaclk.turn(-90);
		jaclk.move(650);
		jaclk.turn(-90);
		jaclk.move(450);
		
	}
}
