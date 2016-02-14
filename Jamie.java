import java.io.IOException;
import java.util.Random;

import javax.swing.JOptionPane;

public class Jamie {
	static TimerTime timer = new TimerTime();
	static CPU p = new CPU();
	static TimeIndex whatTime = new TimeIndex();
	static int numberOfTimes = 0;
	static int angerLevel = 0;
	static String joptionpane = "";
	static boolean hasDonePersonalInformation = false;
	static int age1;
	static String favoriteColorr;
	static String name;
	static boolean qq = true;
	static String IMPORTANT;

	public static void main(String[] args) {
		while (qq) {
			if (!hasDonePersonalInformation) {
				joptionpane = "Hello! My name is Jamie! What is yours?";
				speak(joptionpane);
				String userName = JOptionPane.showInputDialog(joptionpane);
				while (userName.equalsIgnoreCase("Jamie")) {
					joptionpane = "Copy-cat! Please say your true name!";
					speak(joptionpane);
					userName = JOptionPane.showInputDialog(joptionpane);
				}
				name = userName;
				joptionpane = "I'm curious to know how old you are " + userName + "!";
				speak(joptionpane);
				String userAge = JOptionPane.showInputDialog(joptionpane);
				age1 = Integer.parseInt(userAge);
				joptionpane = "Also, what is your favorite color?";
				speak(joptionpane);
				String userFavoriteColor = JOptionPane.showInputDialog(joptionpane);
				favoriteColorr = userFavoriteColor;
				hasDonePersonalInformation = true;
				joptionpane = "If you need help on what I can do, just say help.";
				speak(joptionpane);
				JOptionPane.showMessageDialog(null, joptionpane);
			}
			checkNumberOfTimes(numberOfTimes);
			String a = JOptionPane.showInputDialog(joptionpane);
			while (!a.equalsIgnoreCase("no") && !a.equalsIgnoreCase("yes") && !a.equalsIgnoreCase("of course") && !a.equalsIgnoreCase("sure") && !a.equalsIgnoreCase("obviously")
					&& !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you") && !a.equalsIgnoreCase("are you okay") && !a.equalsIgnoreCase("are you okay?")
					&& !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word") && !a.equalsIgnoreCase("say a random color")
					&& !a.equalsIgnoreCase("say a random number") && !a.equalsIgnoreCase("what time is it") && !a.equalsIgnoreCase("what time is it?")
					&& !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
				if (angerLevel == 0) {
					speak("Please say your answer so that I can comprehend!");
					joptionpane = "Please say your answer so that I can comprehend!";
					a = JOptionPane.showInputDialog(joptionpane);
					if (!a.equalsIgnoreCase("no") && !a.equalsIgnoreCase("yes") && !a.equalsIgnoreCase("of course") && !a.equalsIgnoreCase("sure")
							&& !a.equalsIgnoreCase("obviously") && !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you") && !a.equalsIgnoreCase("are you okay")
							&& !a.equalsIgnoreCase("are you okay?") && !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word")
							&& !a.equalsIgnoreCase("say a random color") && !a.equalsIgnoreCase("say a random number") && !a.equalsIgnoreCase("what time is it")
							&& !a.equalsIgnoreCase("what time is it?") && !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
						angerLevel++;
					}
				}
				if (angerLevel == 1) {
					speak("Please say something that has significance to my question I stated earlier!");
					joptionpane = "Please say something that has significance to my question I stated earlier!";
					a = JOptionPane.showInputDialog(joptionpane);
					if (!a.equalsIgnoreCase("no") && !a.equalsIgnoreCase("yes") && !a.equalsIgnoreCase("of course") && !a.equalsIgnoreCase("sure")
							&& !a.equalsIgnoreCase("obviously") && !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you") && !a.equalsIgnoreCase("are you okay")
							&& !a.equalsIgnoreCase("are you okay?") && !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word")
							&& !a.equalsIgnoreCase("say a random color") && !a.equalsIgnoreCase("say a random number") && !a.equalsIgnoreCase("what time is it")
							&& !a.equalsIgnoreCase("what time is it?") && !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
						angerLevel++;
					}
				}
				if (angerLevel == 2) {
					speak("Stop speaking this gibberish language immediately or else I will fry my motherboard!");
					joptionpane = "Stop speaking this gibberish language immediately or else I will fry my motherboard!";
					a = JOptionPane.showInputDialog(joptionpane);
					if (!a.equalsIgnoreCase("no") && !a.equalsIgnoreCase("yes") && !a.equalsIgnoreCase("of course") && !a.equalsIgnoreCase("sure")
							&& !a.equalsIgnoreCase("obviously") && !a.equalsIgnoreCase("how are you?") && !a.equalsIgnoreCase("how are you") && !a.equalsIgnoreCase("are you okay")
							&& !a.equalsIgnoreCase("are you okay?") && !a.equalsIgnoreCase("say a random letter") && !a.equalsIgnoreCase("say a random word")
							&& !a.equalsIgnoreCase("say a random color") && !a.equalsIgnoreCase("say a random number") && !a.equalsIgnoreCase("what time is it")
							&& !a.equalsIgnoreCase("what time is it?") && !a.equalsIgnoreCase("who are you") && !a.equalsIgnoreCase("who are you?")) {
						angerLevel = 0;
					}
				}
			}
			if (a.equalsIgnoreCase("who are you") || a.equalsIgnoreCase("who are you?")) {
				joptionpane = "I am Jamie, your personal and quite helpful assistant.";
				speak(joptionpane);
				JOptionPane.showMessageDialog(null, joptionpane);
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
			}
			if (a.equalsIgnoreCase("say a random number") || a.equalsIgnoreCase("say a random letter") || a.equalsIgnoreCase("say a random word")
					|| a.equalsIgnoreCase("say a random color")) {
				IMPORTANT = a;
				randomStuff();
				if (numberOfTimes < 3) {
					numberOfTimes++;
				} else {
					numberOfTimes = 1;
				}
				try {
					Thread.sleep(1000);
				} catch (Exception e) {
					System.out.println("WARNING! Cannot make system sleep!");
				}
				qq = true;
			}
			if (a.equalsIgnoreCase("what time is it") || a.equalsIgnoreCase("what time is it?") || a.equalsIgnoreCase("tell me the time") || a.equalsIgnoreCase("the time")
					|| a.equalsIgnoreCase("time")) {
				speak(whatTime.getTime());
				JOptionPane.showMessageDialog(null, whatTime.getTime());
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(6000);
				} catch (Exception e) {
					System.out.println("WARNING! Cannot make system sleep!");
				}
				qq = true;
			}
			if (a.equalsIgnoreCase("how are you") || a.equalsIgnoreCase("how are you?")) {
				speak("good!");
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					System.out.println("WARNING! Could not make system sleep!");
				}
			}
			if (a.equalsIgnoreCase("Are you okay?") || a.equalsIgnoreCase("Are you okay")) {
				int random = new Random().nextInt(3);
				if (random == 0) {
					speak("of course");
				}
				if (random == 1) {
					speak("obviously");
				}
				if (random == 2) {
					speak("Do I look okay?");
				}
				if (numberOfTimes <= 3) {
					numberOfTimes = 4;
				} else if (numberOfTimes == 6) {
					numberOfTimes = 4;
				} else {
					numberOfTimes++;
				}
				try {
					Thread.sleep(1500);
				} catch (InterruptedException e) {
					System.out.println("WARNING! Could not make system sleep!");
				}
			}
			if (a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("sure") || a.equalsIgnoreCase("obviously") || a.equalsIgnoreCase("of course")) {
				qq = false;
				joptionpane = "What questions do you have for me?";
				speak(joptionpane);
				String whatIsIt = JOptionPane.showInputDialog(joptionpane);
				while (!whatIsIt.equalsIgnoreCase("math problem") && !whatIsIt.equalsIgnoreCase("do a math problem") && !whatIsIt.equalsIgnoreCase("math problems")
						&& !whatIsIt.equalsIgnoreCase("solve a math problem") && !whatIsIt.equalsIgnoreCase("pronounce a word") && !whatIsIt.equalsIgnoreCase("pronounce words")
						&& !whatIsIt.equalsIgnoreCase("pronounce word") && !whatIsIt.equalsIgnoreCase("what time is it") && !whatIsIt.equalsIgnoreCase("what time is it?")
						&& !whatIsIt.equalsIgnoreCase("tell me the time") && !whatIsIt.equalsIgnoreCase("the time") && !whatIsIt.equalsIgnoreCase("time")
						&& !whatIsIt.equalsIgnoreCase("play a game") && !whatIsIt.equalsIgnoreCase("recite pi") && !whatIsIt.equalsIgnoreCase("say a random letter")
						&& !whatIsIt.equalsIgnoreCase("say a random word") && !whatIsIt.equalsIgnoreCase("say a random color") && !whatIsIt.equalsIgnoreCase("say a random number")
						&& !whatIsIt.equalsIgnoreCase("who are you") && !whatIsIt.equalsIgnoreCase("who are you?") && !whatIsIt.equalsIgnoreCase("are you okay")
						&& !whatIsIt.equalsIgnoreCase("are you okay?") && !whatIsIt.equalsIgnoreCase("tell me a joke") && !whatIsIt.equalsIgnoreCase("give me a joke")
						&& !whatIsIt.equalsIgnoreCase("joke") && !whatIsIt.equalsIgnoreCase("tell a joke") && !whatIsIt.equalsIgnoreCase("give a joke")
						&& !whatIsIt.equalsIgnoreCase("how are you") && !whatIsIt.equalsIgnoreCase("how are you?") && !whatIsIt.equalsIgnoreCase("how are you today")
						&& !whatIsIt.equalsIgnoreCase("how are you today?") && !whatIsIt.equalsIgnoreCase("set a timer") && !whatIsIt.equalsIgnoreCase("How old am I")
						&& !whatIsIt.equalsIgnoreCase("How old am I?") && !whatIsIt.equalsIgnoreCase("What is my name") && !whatIsIt.equalsIgnoreCase("What is my name?")
						&& !whatIsIt.equalsIgnoreCase("What is my favorite color") && !whatIsIt.equalsIgnoreCase("What is my favorite color?") && !whatIsIt.equalsIgnoreCase("help")
						&& !whatIsIt.equalsIgnoreCase("when was I born") && !whatIsIt.equalsIgnoreCase("when was I born?") && !whatIsIt.equalsIgnoreCase("game")
						&& !whatIsIt.equalsIgnoreCase("game!") && !whatIsIt.equalsIgnoreCase("play a game!") && !whatIsIt.equalsIgnoreCase("be annoying")) {
					int random = new Random().nextInt(3);
					if (random == 0) {
						joptionpane = "Please say your answer so that I can comprehend.";
						speak("Please say your answer so that I can comprehend");
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
					}
					if (random == 1) {
						joptionpane = "Please say something that my CPU can process without any error.";
						speak("Please say something that my See Pee You can process without any error");
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
					}
					if (random == 2) {
						joptionpane = "Please say something that doesn't require neurons to calculate.";
						speak("Please say something that doesn't require neurons to calculate.");
						whatIsIt = JOptionPane.showInputDialog(joptionpane);
					}
				}
				if (whatIsIt.equalsIgnoreCase("When was I born?") || whatIsIt.equalsIgnoreCase("When was I born")) {
					int newAge = 2015 - age1;
					joptionpane = "Since you are " + age1 + " years old, you would be born in " + newAge;
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("help")) {
					@SuppressWarnings("unused")
					JamieGuide guide = new JamieGuide();
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("What is my favorite color") || whatIsIt.equalsIgnoreCase("What is my favorite color?")) {
					joptionpane = "You said your favorite color was " + favoriteColorr + "!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("What is my name") || whatIsIt.equalsIgnoreCase("What is my name?")) {
					joptionpane = "You said your name was " + name + "!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("How old am I") || whatIsIt.equalsIgnoreCase("How old am I?")) {
					joptionpane = "You said you were " + age1 + " years old!";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("How are you?") || whatIsIt.equalsIgnoreCase("How are you") || whatIsIt.equalsIgnoreCase("How are you today?")
						|| whatIsIt.equalsIgnoreCase("How are you today")) {
					int newnewnewnewnewnewnewnewrandom = new Random().nextInt(3);
					if (newnewnewnewnewnewnewnewrandom == 0) {
						joptionpane = "I'm doing excellent!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewnewrandom == 1) {
						joptionpane = "Great!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewnewrandom == 2) {
						joptionpane = "My see pee you is in perfect order!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, "My CPU is in perfect order!");
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("tell me a joke") || whatIsIt.equalsIgnoreCase("give me a joke") || whatIsIt.equalsIgnoreCase("joke")
						|| whatIsIt.equalsIgnoreCase("tell a joke") || whatIsIt.equalsIgnoreCase("give a joke")) {
					int newnewnewnewnewnewnewrandom = new Random().nextInt(3);
					if (newnewnewnewnewnewnewrandom == 0) {
						for (int i = 0; i < 3; i++) {
							joptionpane = "Knock Knock!";
							speak(joptionpane);
							String joke = JOptionPane.showInputDialog(joptionpane);
							while (!joke.equalsIgnoreCase("who's there") && !joke.equalsIgnoreCase("whos there") && !joke.equalsIgnoreCase("who is there")
									&& !joke.equalsIgnoreCase("who's there?") && !joke.equalsIgnoreCase("whos there?") && !joke.equalsIgnoreCase("who is there?")) {
								joptionpane = "Please say who's there!";
								speak(joptionpane);
								joke = JOptionPane.showInputDialog(joptionpane);
							}
							if (i != 2) {
								joptionpane = "Orange!";
								speak(joptionpane);
								JOptionPane.showInputDialog(joptionpane);
							}
						}
						joptionpane = "Orange you glad I didn't say orange?";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewrandom == 1) {
						joptionpane = "Why shouldn't you trust atoms?";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
						joptionpane = "Because they make up everything!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (newnewnewnewnewnewnewrandom == 2) {
						joptionpane = "I connot think of any good jokes to say at the momment!";
						speak(joptionpane);
						JOptionPane.showMessageDialog(null, joptionpane);
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("Are you okay?") || whatIsIt.equalsIgnoreCase("Are you okay")) {
					int newnewnewnewnewnewRandom = new Random().nextInt(3);
					if (newnewnewnewnewnewRandom == 0) {
						speak("of course");
					}
					if (newnewnewnewnewnewRandom == 1) {
						speak("obviously");
					}
					if (newnewnewnewnewnewRandom == 2) {
						speak("Do I look okay?");
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("who are you") || whatIsIt.equalsIgnoreCase("who are you?")) {
					joptionpane = "I am Jamie, your personal and quite helpful assistant.";
					speak(joptionpane);
					JOptionPane.showMessageDialog(null, joptionpane);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("say a random number") || whatIsIt.equalsIgnoreCase("say a random letter") || whatIsIt.equalsIgnoreCase("say a random word")
						|| whatIsIt.equalsIgnoreCase("say a random color")) {
					IMPORTANT = whatIsIt;
					randomStuff();
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("set a timer")) {
					joptionpane = "In which unit would you like the timer to be: seconds, minutes, or hours?";
					speak(joptionpane);
					String howMuchTime = JOptionPane.showInputDialog(joptionpane);
					while (!howMuchTime.equalsIgnoreCase("seconds") && !howMuchTime.equalsIgnoreCase("minutes") && !howMuchTime.equalsIgnoreCase("hours")) {
						joptionpane = "Please answer either seconds, minutes,or hours!";
						speak(joptionpane);
						howMuchTime = JOptionPane.showInputDialog(joptionpane);
					}
					if (howMuchTime.equalsIgnoreCase("minutes")) {
						joptionpane = "How many minutes!";
						speak(joptionpane);
						String timelyTime = JOptionPane.showInputDialog(joptionpane);
						if (timelyTime.equalsIgnoreCase("1")) {
							speak(timelyTime + "minute, starting now.");
						} else {
							speak(timelyTime + "minutes, starting now.");
						}
						int knowTheTime = Integer.parseInt(timelyTime);
						timer.timerTeller(knowTheTime * 60);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (howMuchTime.equalsIgnoreCase("seconds")) {
						joptionpane = "How many seconds!";
						speak(joptionpane);
						String timelyTime = JOptionPane.showInputDialog(joptionpane);
						if (timelyTime.equalsIgnoreCase("1")) {
							speak(timelyTime + "second, starting now.");
						} else {
							speak(timelyTime + "seconds, starting now.");
						}
						int knowTheTime = Integer.parseInt(timelyTime);
						timer.timerTeller(knowTheTime);
						try {
							Thread.sleep(3000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (howMuchTime.equalsIgnoreCase("hours")) {
						joptionpane = "How many hours!";
						speak(joptionpane);
						String timelyTime = JOptionPane.showInputDialog(joptionpane);
						if (timelyTime.equalsIgnoreCase("1")) {
							speak(timelyTime + "hour, starting now.");
						} else {
							speak(timelyTime + "hours, starting now.");
						}
						int knowTheTime = Integer.parseInt(timelyTime);
						timer.timerTeller(knowTheTime * 60 * 60);
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("recite pi")) {
					speak("I will recite pi up to 200 digits! Pi=3.14159265358979323846264338327950288419716939937510582097494459230781640628620899862803482534211706798214808651328230664709384460955058223172535940812848111745028410270193852110555964462294895493038196");
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("play a game") || whatIsIt.equalsIgnoreCase("game") || whatIsIt.equalsIgnoreCase("game!")
						|| whatIsIt.equalsIgnoreCase("play a game!")) {
					GameOperator g = new GameOperator();
					g.playGames();
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("be annoying")) {
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(5);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					speak("Is this annoying?");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("what time is it") || whatIsIt.equalsIgnoreCase("what time is it?") || whatIsIt.equalsIgnoreCase("tell me the time")
						|| whatIsIt.equalsIgnoreCase("the time") || whatIsIt.equalsIgnoreCase("time")) {
					speak(whatTime.getTime());
					JOptionPane.showMessageDialog(null, whatTime.getTime());
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("pronounce a word") || whatIsIt.equalsIgnoreCase("pronounce words") || whatIsIt.equalsIgnoreCase("pronounce word")) {
					speak("enter the word");
					String word = JOptionPane.showInputDialog("Enter the word!");
					speak(word);
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
				if (whatIsIt.equalsIgnoreCase("math problem") || whatIsIt.equalsIgnoreCase("do a math problem") || whatIsIt.equalsIgnoreCase("math problems")
						|| whatIsIt.equalsIgnoreCase("solve a math problem")) {
					speak("What is the math problem? It cannot have more than one symbol and only two numbers with no parentheses.");
					String problem = JOptionPane.showInputDialog("Math Problem:");
					if (problem.equalsIgnoreCase("example") || problem.equalsIgnoreCase("give me an example")) {
						joptionpane = "Ex. 1: 4*8.2, Ex. 2: 23.27+76, Ex. 3: 434.3-517.896, Ex. 4: 652.193/937.2568, NOTE: Do not put any equation that equals 0!";
						JOptionPane.showMessageDialog(null, joptionpane);
					} else {
						String answer = "" + p.parseFunction(problem);
						joptionpane = answer;
						if (answer.equalsIgnoreCase("0.0")) {
							joptionpane = "You put the math problem in an invalid format!";
							speak(joptionpane);
							JOptionPane.showMessageDialog(null, joptionpane);
						} else {
							speak(answer);
							JOptionPane.showMessageDialog(null, joptionpane);
						}
					}
					if (numberOfTimes < 3) {
						numberOfTimes++;
					} else {
						numberOfTimes = 1;
					}
					try {
						Thread.sleep(1000);
					} catch (Exception e) {
						System.out.println("WARNING! Cannot make system sleep!");
					}
					qq = true;
				}
			}
			if (a.equalsIgnoreCase("no")) {
				Goodbye farewell = new Goodbye();
				farewell.frameDisplayer();
				qq = false;
			}
		}
	}

	static void randomStuff() {
		if (IMPORTANT.equalsIgnoreCase("say a random letter")) {
			int random = new Random().nextInt(26);
			char num1 = 'a';
			char num2 = 'b';
			char num3 = 'c';
			char num4 = 'd';
			char num5 = 'e';
			char num6 = 'f';
			char num7 = 'g';
			char num8 = 'h';
			char num9 = 'i';
			char num10 = 'j';
			char num11 = 'k';
			char num12 = 'l';
			char num13 = 'm';
			char num14 = 'n';
			char num15 = 'o';
			char num16 = 'p';
			char num17 = 'q';
			char num18 = 'r';
			char num19 = 's';
			char num20 = 't';
			char num21 = 'u';
			char num22 = 'v';
			char num23 = 'w';
			char num24 = 'x';
			char num25 = 'y';
			char num26 = 'z';
			if (random == 0) {
				String qqq = "" + num1;
				speak(qqq);
			} else if (random == 1) {
				String qqq = "" + num2;
				speak(qqq);
			} else if (random == 2) {
				String qqq = "" + num3;
				speak(qqq);
			} else if (random == 3) {
				String qqq = "" + num4;
				speak(qqq);
			} else if (random == 4) {
				String qqq = "" + num5;
				speak(qqq);
			} else if (random == 5) {
				String qqq = "" + num6;
				speak(qqq);
			} else if (random == 6) {
				String qqq = "" + num7;
				speak(qqq);
			} else if (random == 7) {
				String qqq = "" + num8;
				speak(qqq);
			} else if (random == 8) {
				String qqq = "" + num9;
				speak(qqq);
			} else if (random == 9) {
				String qqq = "" + num10;
				speak(qqq);
			} else if (random == 10) {
				String qqq = "" + num11;
				speak(qqq);
			} else if (random == 11) {
				String qqq = "" + num12;
				speak(qqq);
			} else if (random == 12) {
				String qqq = "" + num13;
				speak(qqq);
			} else if (random == 13) {
				String qqq = "" + num14;
				speak(qqq);
			} else if (random == 14) {
				String qqq = "" + num15;
				speak(qqq);
			} else if (random == 15) {
				String qqq = "" + num16;
				speak(qqq);
			} else if (random == 16) {
				String qqq = "" + num17;
				speak(qqq);
			} else if (random == 17) {
				String qqq = "" + num18;
				speak(qqq);
			} else if (random == 18) {
				String qqq = "" + num19;
				speak(qqq);
			} else if (random == 19) {
				String qqq = "" + num20;
				speak(qqq);
			} else if (random == 20) {
				String qqq = "" + num21;
				speak(qqq);
			} else if (random == 21) {
				String qqq = "" + num22;
				speak(qqq);
			} else if (random == 22) {
				String qqq = "" + num23;
				speak(qqq);
			} else if (random == 23) {
				String qqq = "" + num24;
				speak(qqq);
			} else if (random == 24) {
				String qqq = "" + num25;
				speak(qqq);
			} else {
				String qqq = "" + num26;
				speak(qqq);
			}
		}
		if (IMPORTANT.equalsIgnoreCase("say a random number")) {
			int random = new Random().nextInt();
			String convertRandomToString = "" + random;
			speak(convertRandomToString);
		}
		if (IMPORTANT.equalsIgnoreCase("say a random color")) {
			int random = new Random().nextInt(9);
			String color1 = "red";
			String color2 = "blue";
			String color3 = "green";
			String color4 = "yellow";
			String color5 = "orange";
			String color6 = "purple";
			String color7 = "black";
			String color8 = "white";
			String color9 = "pink";
			String color10 = "brown";
			if (random == 0) {
				speak(color1);
			} else if (random == 1) {
				speak(color2);
			} else if (random == 2) {
				speak(color3);
			} else if (random == 3) {
				speak(color4);
			} else if (random == 4) {
				speak(color5);
			} else if (random == 5) {
				speak(color6);
			} else if (random == 6) {
				speak(color7);
			} else if (random == 7) {
				speak(color8);
			} else if (random == 8) {
				speak(color9);
			} else {
				speak(color10);
			}
		}
	}

	static void checkNumberOfTimes(int numberOfTimes) {
		if (numberOfTimes == 0) {
			speak("Do you require assistance?");
			joptionpane = "Do you require assistance?";
		} else if (numberOfTimes == 1) {
			speak("Do you want me to do another problem?");
			joptionpane = "Do you want me to do another problem?";
		} else if (numberOfTimes == 2) {
			speak("More problems for me to calculate in my See Pee You?");
			joptionpane = "More problems for me to calculate in my CPU?";
		} else if (numberOfTimes == 3) {
			speak("Are there anymore problems waiting to be solved?");
			joptionpane = "Are there any more problems waiting to be solved?";
		} else if (numberOfTimes == 4) {
			speak("do you want me to do a problem?");
			joptionpane = "Do  you want me to do a problem?";
		} else if (numberOfTimes == 5) {
			speak("Require problems to be calculated in my see pee you?");
			joptionpane = "Require problems to be calculated in my CPU?";
		} else if (numberOfTimes == 6) {
			speak("Have any problems waiting to be solved?");
			joptionpane = "Have any problems waiting to be solved?";
		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}