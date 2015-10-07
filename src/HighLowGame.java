import java.util.Random;
import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {

		int random = new Random().nextInt(10);

		System.out.println(random);

		for (int i = 0; i < 10; i++) {

			String input = JOptionPane
					.showInputDialog("What number between 1 and 10 am I thinking of? Make a guess");

			int y = Integer.parseInt(input);

			if (y == random) {
				JOptionPane.showMessageDialog(null, "You win!");
			}

			else if (y >= random) {
				JOptionPane.showMessageDialog(null, "That guess is too high!");
			}

			else if (y <= random) {
				JOptionPane.showMessageDialog(null, "That guess is too low!");
			}

		}
	}
}
