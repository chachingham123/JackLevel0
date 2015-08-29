import javax.swing.JOptionPane;


public class areyouhappy {public static void main(String[] args) {
	String q1 = JOptionPane.showInputDialog("Are you happy?");
	String q2 = null;
	if (q1.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing");
	}
	if (q1.equalsIgnoreCase("No")) {
	q2 = JOptionPane.showInputDialog("Do you want to be happy?");
	}
	if (q2.equalsIgnoreCase("Yes")) {
		JOptionPane.showMessageDialog(null, "Change something"); }
	if (q2.equalsIgnoreCase("No")) {
		JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing"); }
	}
	
	
}
	
	

		
	



