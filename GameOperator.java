import java.util.Random;

import javax.swing.JOptionPane;

public class GameOperator {
	Jamie j = new Jamie();

	@SuppressWarnings("static-access")
	void playGames() {
		j.joptionpane = "Ok! What game would you like to play?";
		j.speak(j.joptionpane);
		JOptionPane.showConfirmDialog(null, j.joptionpane);
		while (!game.equalsIgnoreCase("number game") && !game.equalsIgnoreCase("number guessing game") && !game.equalsIgnoreCase("rock paper scissors")
				&& !game.equalsIgnoreCase("rock, paper, scissors") && !game.equalsIgnoreCase("memorizing game")) {
			game = JOptionPane.showInputDialog("I don't know how to play this game yet. Please enter a different game.");
		}
		if (game.equalsIgnoreCase("memorizing game")) {
			boolean madeItToTheEnd = false;
			String object1 = "book";
			String object2 = "house";
			String object3 = "water";
			String object4 = "phone";
			String object5 = "television";
			String object6 = "hat";
			String object7 = "paper";
			String object8 = "city";
			String object9 = "planet";
			String object10 = "chair";
			j.joptionpane = "Repeat the object I say in the order I say it. The list will get longer. To seperate the objects in the text, just put a space in between them. Enjoy!";
			j.speak(j.joptionpane);
			JOptionPane.showMessageDialog(null, j.joptionpane);
			j.joptionpane = object1;
			j.speak(j.joptionpane);
			String input1 = JOptionPane.showInputDialog("Input:");
			if (input1.equalsIgnoreCase(object1)) {
				j.joptionpane = object2;
				j.speak(j.joptionpane);
				String input2 = JOptionPane.showInputDialog("Input:");
				if (input2.equalsIgnoreCase(object1 + " " + object2)) {
					j.joptionpane = object3;
					j.speak(j.joptionpane);
					String input3 = JOptionPane.showInputDialog("Input:");
					if (input3.equalsIgnoreCase(object1 + " " + object2 + " " + object3)) {
						j.joptionpane = object4;
						j.speak(j.joptionpane);
						String input4 = JOptionPane.showInputDialog("Input:");
						if (input4.equalsIgnoreCase(object1 + " " + object2 + " " + object3 + " " + object4)) {
							j.joptionpane = object5;
							j.speak(j.joptionpane);
							String input5 = JOptionPane.showInputDialog("Input:");
							if (input5.equalsIgnoreCase(object1 + " " + object2 + " " + object3 + " " + object4 + " " + object5)) {
								j.joptionpane = object6;
								j.speak(j.joptionpane);
								String input6 = JOptionPane.showInputDialog("Input:");
								if (input6.equalsIgnoreCase(object1 + " " + object2 + " " + object3 + " " + object4 + " " + object5 + " " + object6)) {
									j.joptionpane = object7;
									j.speak(j.joptionpane);
									String input7 = JOptionPane.showInputDialog("Input:");
									if (input7.equalsIgnoreCase(object1 + " " + object2 + " " + object3 + " " + object4 + " " + object5 + " " + object6 + " " + object7)) {
										j.joptionpane = object8;
										j.speak(j.joptionpane);
										String input8 = JOptionPane.showInputDialog("Input:");
										if (input8.equalsIgnoreCase(
												object1 + " " + object2 + " " + object3 + " " + object4 + " " + object5 + " " + object6 + " " + object7 + " " + object8)) {
											j.joptionpane = object9;
											j.speak(j.joptionpane);
											String input9 = JOptionPane.showInputDialog("Input:");
											if (input9.equalsIgnoreCase(object1 + " " + object2 + " " + object3 + " " + object4 + " " + object5 + " " + object6 + " " + object7
													+ " " + object8 + " " + object9)) {
												j.joptionpane = object10;
												j.speak(j.joptionpane);
												String input10 = JOptionPane.showInputDialog("Input:");
												if (input10.equalsIgnoreCase(object1 + " " + object2 + " " + object3 + " " + object4 + " " + object5 + " " + object6 + " " + object7
														+ " " + object8 + " " + object9 + " " + object10)) {
													j.joptionpane = "You made it to the end!";
													j.speak(j.joptionpane);
													JOptionPane.showMessageDialog(null, j.joptionpane);
													madeItToTheEnd = true;
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			if (!madeItToTheEnd) {
				j.joptionpane = "That is incorrect. You didn't make it to the end!";
				j.speak(j.joptionpane);
				JOptionPane.showMessageDialog(null, j.joptionpane);
			}
		}
		if (game.equalsIgnoreCase("number game") || game.equalsIgnoreCase("number guessing game")) {
			boolean hasGotNumber = false;
			j.joptionpane = "Try to guess my number from 1-100!";
			j.speak("Try to guess my number from 1 to 100");
			JOptionPane.showMessageDialog(null, j.joptionpane);
			int randomNumber = new Random().nextInt(100) + 1;
			for (int i = 0; i < 5; i++) {
				String number = JOptionPane.showInputDialog("Guess:");
				int numberToInt = Integer.parseInt(number);
				if (numberToInt > randomNumber) {
					j.joptionpane = "Lower!";
					j.speak(j.joptionpane);
					JOptionPane.showMessageDialog(null, j.joptionpane);
				}
				if (numberToInt < randomNumber) {
					j.joptionpane = "Higher!";
					j.speak(j.joptionpane);
					JOptionPane.showMessageDialog(null, j.joptionpane);
				}
				if (numberToInt == randomNumber) {
					j.joptionpane = "You got it in " + i + " tries!";
					j.speak(j.joptionpane);
					JOptionPane.showMessageDialog(null, j.joptionpane);
					i = 1000;
					hasGotNumber = true;
				}
			}
			if (!hasGotNumber) {
				j.joptionpane = "Sorry! Your five tries is up! The correct number was " + randomNumber;
				j.speak(j.joptionpane);
				JOptionPane.showMessageDialog(null, j.joptionpane);
			}
		}
		if (game.equalsIgnoreCase("rock paper scissors") || game.equalsIgnoreCase("rock, paper, scissors")) {
			int Jamie = 0;
			int user = 0;
			for (int i = 0; i < 3; i++) {
				int newnewnewnewnewrandom = new Random().nextInt(3);
				if (newnewnewnewnewrandom == 0) {
					j.speak("3");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					String winorlose = JOptionPane.showInputDialog("Enter rock, paper, or scissors!");
					if (winorlose.equalsIgnoreCase("scissors")) {
						Jamie++;
						user++;
					}
					if (winorlose.equalsIgnoreCase("rock")) {
						user++;
					}
					if (winorlose.equalsIgnoreCase("paper")) {
						Jamie++;
					}
					j.speak("scissors");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
				}
				if (newnewnewnewnewrandom == 1) {
					j.speak("3");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					String winorlose = JOptionPane.showInputDialog("Enter rock, paper, or scissors!");
					if (winorlose.equalsIgnoreCase("scissors")) {
						Jamie++;
					}
					if (winorlose.equalsIgnoreCase("rock")) {
						user++;
						Jamie++;
					}
					if (winorlose.equalsIgnoreCase("paper")) {
						user++;
					}
					j.speak("rock");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
				}
				if (newnewnewnewnewrandom == 2) {
					j.speak("3");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					j.speak("1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					String winorlose = JOptionPane.showInputDialog("Enter rock, paper, or scissors!");
					if (winorlose.equalsIgnoreCase("scissors")) {
						user++;
					}
					if (winorlose.equalsIgnoreCase("rock")) {
						Jamie++;
					}
					if (winorlose.equalsIgnoreCase("paper")) {
						user++;
						Jamie++;
					}
					j.speak("paper");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
				}
			}
			if (user == Jamie) {
				j.joptionpane = "Tie! I wish we could have a rematch.";
				j.speak(j.joptionpane);
				JOptionPane.showMessageDialog(null, j.joptionpane);
			}
			if (user > Jamie) {
				j.joptionpane = "You won! ANGRY! ANGRY! ANGRY!";
				j.speak(j.joptionpane);
				JOptionPane.showMessageDialog(null, j.joptionpane);
			}
			if (user < Jamie) {
				j.joptionpane = "I WON!!! YAY!";
				j.speak(j.joptionpane);
				JOptionPane.showMessageDialog(null, j.joptionpane);
			}
		}
	}
}