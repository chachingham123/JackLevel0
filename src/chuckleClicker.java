import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class chuckleClicker implements ActionListener{
	JButton jb1 = new JButton("joke");
	JButton jb2 = new JButton("punchline");
	public static void main(String[] args) {
	
	 chuckleClicker chuckle = new chuckleClicker();
}
	 
	 chuckleClicker(){
		 makeButtons();
	 
}
void makeButtons()
{
	JFrame jf = new JFrame();
	jf.setVisible(false);
	JPanel jp = new JPanel();
	
	
	jp.add(jb1);
	jp.add(jb2);
	jf.add(jp);
	jf.setSize(200, 200);
	jb1.addActionListener(this);
	jb2.addActionListener(this);
	
	
	

}

@Override
public void actionPerformed(ActionEvent e) {
	JOptionPane.showMessageDialog(null, "This game requires 2 people");
	JOptionPane.showMessageDialog(null, "Chose who will create a joke to tell the other person");
	String joke = JOptionPane.showInputDialog("Think of a funny joke and put it in here");
	String answer = JOptionPane.showInputDialog("Now type in the answer to your joke here");
	makeButtons();
	
	if (e.getSource() == jb1) {
		JOptionPane.showMessageDialog(null, joke);
	
		
	}
	if (e.getSource() == jb2) { 
		JOptionPane.showMessageDialog(null, answer);
		
	}
}
}


