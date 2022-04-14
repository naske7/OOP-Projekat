package Projekat;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Score extends Levels {
	
	//OPENING THE FILE START
	public static void printscore(ArrayList<User> node) {
		PrintWriter pw = null;
		try
		{
			if(correctcount < 27)
				JOptionPane.showMessageDialog(null, "Play the game first");
			else {
			pw = new PrintWriter(new FileWriter("Score.txt"));
			JOptionPane.showMessageDialog(null, "Success!");
			}
		}
		catch(IOException IOe)
		{
			JOptionPane.showMessageDialog(null, "Opening failed!");
			return;
		}
		//OPENING THE FILE END
		
		//PRINTING CONDITIONS START
		if(correctcount >= 27) {
			if(incorrectcount == 0) 
				for (User u : node) {
					pw.println(u.toString() + "\nCorrect answers: " + Levels.correctcount + "\nIncorrect answers: " + Levels.incorrectcount + "\nYou are a great connoisseur of the English Premier League!!!");
					pw.flush();
				}
			else if(incorrectcount > 0 && incorrectcount <= 5)
				for (User u : node) {
					pw.println(u.toString() + "\nCorrect answers: " + Levels.correctcount + "\nIncorrect answers: " + Levels.incorrectcount + "\nExcellent score!");
					pw.flush();
				}
			else if(incorrectcount > 5 && incorrectcount <=10)
				for (User u : node) {
					pw.println(u.toString() + "\nCorrect answers: " + Levels.correctcount + "\nIncorrect answers: " + Levels.incorrectcount + "\nNot bad!");
					pw.flush();	
				}
			else 
				for (User u : node) {
					pw.println(u.toString() + "\nCorrect answers: " + Levels.correctcount + "\nIncorrect answers: " + Levels.incorrectcount + "\nDesperately...");
					pw.flush();
				}
		}
		else {
			pw.flush();
			pw.close();	
		}
		//PRINTING CONDITIONS END
	}
}