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
	jf.setVisible(true);
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
	// TODO Auto-generated method stub
	//JOptionPane.showMessageDialog(null, "Hi");
	if (e.getSource() == jb1) {
		JOptionPane.showMessageDialog(null, "Why did the chicken cross the road?");
	
		
	}
	if (e.getSource() == jb2) { 
		JOptionPane.showMessageDialog(null, "To get to the other side.");
		
	}
}
}


