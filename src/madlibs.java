import javax.swing.JOptionPane;


public class madlibs {public static void main(String[] args) {
	
	String input= JOptionPane.showInputDialog("Input a noun");
	JOptionPane.showMessageDialog(null,"Tommy walked down to the store, when he got there he bought " +input);
	String input2= JOptionPane.showInputDialog("Input a noun");
	JOptionPane.showMessageDialog(null,"He later rode back to his house on his " +input2);
	String input3= JOptionPane.showInputDialog("Input an adjective");
	JOptionPane.showMessageDialog(null, "The " +input+ " is very " +input3);
	String input4= JOptionPane.showInputDialog("Input a verb");
	JOptionPane.showMessageDialog(null,"The" +input+ " that Tommy bought were very" +input4);
	String input5= JOptionPane.showInputDialog("Input an feeling");
	JOptionPane.showMessageDialog(null,"Tommy felt very " +input5+ " because he went all the way to the store to buy" +input4 + input);
	
	
	
	
	
	
} 

}
