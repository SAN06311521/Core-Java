import java.awt.*;
import javax.swing.*;

class colour extends JFrame {
	// constructor
	colour() {
		super("colour");

		// create a new Color
		Color c = Color.yellow;
	
		// create a panel
		JPanel p = new JPanel();

		// set the background of the frame
		// to the specified Color
		p.setBackground(c);

		setSize(200, 200);
		add(p);
		show();
	}
	public static void main(String args[]) {
		colour c = new colour();
	}
}