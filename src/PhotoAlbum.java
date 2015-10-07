import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class PhotoAlbum extends MouseAdapter {

	Frame frame = new Frame();

	private void makeAlbum() throws Exception {

		frame.setVisible(true);

		frame.setSize(1000, 1000);

		String face = "http://www.illusions.org/dp/confuse.jpg";

		JLabel jLabel = new JLabel();

		jLabel = loadImageFromTheInternet(face);

		frame.add(jLabel);

		frame.pack();

		frame.addMouseListener(this);
	}

	public void mousePressed(MouseEvent e) {

		String duckrab = "http://static.nautil.us/4676_ea6979872125d5acbac6068f186a0359.png";
		System.out.println("Mouse Clicked");

		frame.removeAll();
		JLabel jLebel = new JLabel();
		try {
			jLebel = loadImageFromTheInternet(duckrab);
		} catch (MalformedURLException e1) {

			e1.printStackTrace();
		}
		frame.add(jLebel);
		frame.pack();

	}

	public JLabel loadImageFromTheInternet(String imageURL)
			throws MalformedURLException {
		URL url = new URL(imageURL);
		Icon icon = new ImageIcon(url);
		return new JLabel(icon);
	}

	public JLabel loadImageFromComputer(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		return new JLabel(icon);
	}

	public static void main(String[] args) throws Exception {
		new PhotoAlbum().makeAlbum();
	}
}
