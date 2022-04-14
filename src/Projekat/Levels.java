package Projekat;

import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Levels{
	
	protected static int correctcount = 0, incorrectcount = 0;

	//EASY START
	public static void leveleasy(JRadioButton rbeasyoption, JLabel lbeasyimage, 
			String lbeasyimagestr, JButton btneasy, String btneasystr, 
			JPanel paneleasy1, JPanel paneleasy2, ButtonGroup bgeasy, 
			JButton btneasydone, JButton btnmedium, JLabel lbeasyrequest, 
			JLabel lbeasyanswer) {
		if(rbeasyoption.isSelected()) {
			lbeasyimage.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource(lbeasyimagestr)));
			btneasy.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource(btneasystr)));
			btneasy.setBackground(new Color(0, 204, 255));
			lbeasyrequest.setForeground(new Color(255,0,102));
			lbeasyrequest.setText("CONGRATULATIONS!");
			btneasydone.setVisible(false);
			lbeasyanswer.setVisible(true);
			JOptionPane.showMessageDialog(null, "Correct answer!");
			if(correctcount == 6) {
				btnmedium.setEnabled(true);
				JOptionPane.showMessageDialog(null, "MEDIUM LEVEL IS UNLOCKED!!!");
			}
			paneleasy1.setVisible(false);
			paneleasy2.setVisible(true);
			correctcount ++;
		}
		else {
			bgeasy.clearSelection();
			incorrectcount++;
			JOptionPane.showMessageDialog(null, "Incorrect answer!");
		}
	}
	//EASY END
	
	//MEDIUM START
	public static void levelmedium(JRadioButton rbmediumoption1, 
			JRadioButton rbmediumoption2, JLabel lbmediumimage, 
			String lbmediummagestr, JButton btnmedium, String btnmediumstr, 
			JPanel panelmedium1, JPanel panelmedium2, ButtonGroup bgmedium1, 
			ButtonGroup bgmedium2, JButton btnmediumdone, JButton btnhard, 
			JLabel lbmediumrequest, JLabel lbmediumanswer) {
		if(rbmediumoption1.isSelected() && rbmediumoption2.isSelected()) {
			lbmediumimage.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource(lbmediummagestr)));
			btnmedium.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource(btnmediumstr)));
			btnmedium.setBackground(new Color(0, 204, 255));
			lbmediumrequest.setText("CONGRATULATIONS!");
			lbmediumrequest.setForeground(new Color(255,0,102));
			btnmediumdone.setVisible(false);
			lbmediumanswer.setVisible(true);
			JOptionPane.showMessageDialog(null, "Correct answer!");
			if(correctcount == 14) {
				btnhard.setEnabled(true);
				JOptionPane.showMessageDialog(null, "HARD LEVEL IS UNLOCKED!!!");
			}
			panelmedium1.setVisible(false);
			panelmedium2.setVisible(true);
			correctcount ++;
		}
		else {
			bgmedium1.clearSelection();
			bgmedium2.clearSelection();
			incorrectcount++;
			JOptionPane.showMessageDialog(null, "Incorrect answer!");
		}
	}
	//MEDIUM END
	
	//HARD START	
	public static void levelhard(JTextField tfanswer, String tfanswerstr1, 
			String tfanswerstr2, JLabel lbhardimage, String lbhardimagestr, 
			JButton btnhard, String btnhardstr, JPanel panelhard1, 
			JPanel panelhard2, JButton btnharddone, JLabel lbhardrequest, 
			JLabel lbhardanswer) {
		if(tfanswer.getText().equalsIgnoreCase(tfanswerstr1) || tfanswer.getText().equalsIgnoreCase(tfanswerstr2)) {
			lbhardimage.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource(lbhardimagestr)));
			btnhard.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource(btnhardstr)));
			btnhard.setBackground(new Color(0, 204, 255));
			lbhardrequest.setText("CONGRATULATIONS!");
			lbhardrequest.setForeground(new Color(255,0,102));
			btnharddone.setVisible(false);
			lbhardanswer.setVisible(true);
			JOptionPane.showMessageDialog(null, "Correct answer!");
			panelhard1.setVisible(false);
			panelhard2.setVisible(true);
			correctcount ++;
		}
		else {
			tfanswer.setText("");
			incorrectcount++;
			JOptionPane.showMessageDialog(null, "Incorrect answer!");
		}
	}
	
	public static void levelhard(JTextField tfanswer, String tfanswerstr1, 
			String tfanswerstr2, String tfanswerstr3, JLabel lbhardimage, 
			String lbhardimagestr, JButton btnhard, String btnhardstr, 
			JPanel panelhard1, JPanel panelhard2, JButton btnharddone, 
			JLabel lbhardrequest, JLabel lbhardanswer) {
		if(tfanswer.getText().equalsIgnoreCase(tfanswerstr1) || tfanswer.getText().equalsIgnoreCase(tfanswerstr2) || tfanswer.getText().equalsIgnoreCase(tfanswerstr3)) {
			lbhardimage.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource(lbhardimagestr)));
			btnhard.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource(btnhardstr)));
			btnhard.setBackground(new Color(0, 204, 255));
			lbhardrequest.setText("CONGRATULATIONS!");
			lbhardrequest.setForeground(new Color(255,0,153));
			btnharddone.setVisible(false);
			lbhardanswer.setVisible(true);
			JOptionPane.showMessageDialog(null, "Correct answer!");
			panelhard1.setVisible(false);
			panelhard2.setVisible(true);
			correctcount ++;
		}
		else {
			tfanswer.setText("");
			incorrectcount++;
			JOptionPane.showMessageDialog(null, "Incorrect answer!");
		}
	}
	//HARD END
}