import javax.swing.JOptionPane;

public class annoyingjoke {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			speak("Knock Knock");
			JOptionPane.showInputDialog("");
			speak("Banana");
			JOptionPane.showInputDialog("");
		}
			for (int j = 0; j < 1; j++) {
				speak("Knock Knock");
				JOptionPane.showInputDialog("");
				speak("Orange");
				JOptionPane.showInputDialog("");
				speak("Orange you glad I didn't say banana");
			}
		}
	

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
