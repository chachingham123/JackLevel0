import java.io.IOException;

import javax.swing.JOptionPane;

public class stevenhawkings {
	public static void main(String[] args) {
		String sentence = JOptionPane.showInputDialog("Write a sentence");
		for (int i = 100; i < 2; i--) {
			if (sentence.equals("jack"))
				speak("Jack is a god");	
			else
				speak(sentence);
		}

	}

	// 1. make a main method and put steps 2, 3 & 4 inside it

	// 2. ask the user for a sentence
	// 3. repeat the sentence using the speak method below
	// 4. make this repeat a lot of times

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

// Copyright Wintriss Technical Schools 2014
