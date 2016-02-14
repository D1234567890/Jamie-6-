import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Goodbye {
	Font font;
	JFrame frame;
	JPanel panel;
	JLabel label;

	@SuppressWarnings("static-access")
	void frameDisplayer() {
		Jamie james = new Jamie();
		font = new Font("Arial", Font.BOLD, 15);
		frame = new JFrame("Goodbye!");
		frame.setVisible(true);
		frame.setSize(750, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		panel = new JPanel();
		frame.add(panel);
		label = new JLabel();
		label.setFont(font);
		label.setText("Goodbye! Hope you enjoyed using me and be sure to tell other people about it!");
		panel.add(label);
		if (james.favoriteColorr.equalsIgnoreCase("red")) {
			label.setForeground(Color.red);
		} else if (james.favoriteColorr.equalsIgnoreCase("blue")) {
			label.setForeground(Color.blue);
		} else if (james.favoriteColorr.equalsIgnoreCase("yellow")) {
			label.setForeground(Color.yellow);
		} else if (james.favoriteColorr.equalsIgnoreCase("green")) {
			label.setForeground(Color.green);
		} else if (james.favoriteColorr.equalsIgnoreCase("orange")) {
			label.setForeground(Color.orange);
		} else if (james.favoriteColorr.equalsIgnoreCase("black")) {
			label.setForeground(Color.black);
		} else if (james.favoriteColorr.equalsIgnoreCase("purple")) {
			label.setForeground(Color.magenta);
		} else if (james.favoriteColorr.equalsIgnoreCase("white")) {
			label.setForeground(Color.white);
		} else if (james.favoriteColorr.equalsIgnoreCase("pink")) {
			label.setForeground(Color.pink);
		} else if (james.favoriteColorr.equalsIgnoreCase("brown")) {
			james.joptionpane = "I am sorry! I cannot make a brown JLabel for this because I do not have the ability!";
			james.speak(james.joptionpane);
			JOptionPane.showMessageDialog(null, james.joptionpane);
		} else if (james.favoriteColorr.equalsIgnoreCase("gray")) {
			label.setForeground(Color.gray);
		} else {
			james.joptionpane = "I am sorry! I do not know of such a color of " + james.favoriteColorr + " to make your special custom-made JLabel that color!";
			james.speak(james.joptionpane);
			JOptionPane.showMessageDialog(null, james.joptionpane);
		}
		james.speak("Okay! Bye!");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("WARNING! Cannot make system sleep!");
		}
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
}
