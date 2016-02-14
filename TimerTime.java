import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.Timer;

public class TimerTime implements ActionListener {
	boolean isRunning;
	Jamie jamie = new Jamie();
	Timer timer;

	TimerTime() {
		isRunning = false;
	}

	void timerTeller(int minutes) {
		timer = new Timer(minutes * 1000, this);
		timer.start();
		isRunning = true;
	}

	public void actionPerformed(ActionEvent e) {
		Jamie.speak("Your timer has now expired!");
		JOptionPane.showMessageDialog(null, "Your timer has now expired!");
		isRunning = false;
		timer.stop();
	}

	public boolean getIsRunning() {
		return isRunning;
	}
}