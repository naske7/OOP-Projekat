package Projekat;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class JPremierLeagueLogoQuiz extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	//CREATING AN ARRAY LIST
	public static ArrayList<User>users = new ArrayList<>();
	
	//CREATING A SOUND OBJECT
	public static Sound bgm = new Sound("/Music/PremierLeagueLogoQuizBackgroundMusic.wav");
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JPremierLeagueLogoQuiz frame = new JPremierLeagueLogoQuiz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public JPremierLeagueLogoQuiz() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage(JPremierLeagueLogoQuiz.class.getResource("/Images/ICON/PremierLeagueLogoQuizIcon.png")));
		setTitle("Premier League Logo Quiz");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 421, 449);
		JPanel mainwindow = new JPanel();
		mainwindow.setBackground(new Color(51, 0, 51));
		mainwindow.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(mainwindow);
		mainwindow.setLayout(null);
		
		//PANEL START
		JPanel paneluserinfo = new JPanel();
		paneluserinfo.setBackground(new Color(51, 0, 51));
		paneluserinfo.setBounds(15, 11, 379, 388);
		mainwindow.add(paneluserinfo);
		paneluserinfo.setLayout(null);
		
		JPanel panelmenu = new JPanel();
		panelmenu.setBackground(new Color(51, 0, 51));
		panelmenu.setBounds(15, 11, 378, 388);
		mainwindow.add(panelmenu);
		panelmenu.setVisible(false);
		
		JPanel panelstart = new JPanel();
		panelstart.setBackground(new Color(51, 0, 51));
		panelstart.setBounds(15, 11, 379, 388);
		mainwindow.add(panelstart);
		panelstart.setVisible(false);
		
		JPanel paneloptions = new JPanel();
		paneloptions.setBackground(new Color(51, 0, 51));
		paneloptions.setBounds(15, 11, 379, 388);
		mainwindow.add(paneloptions);
		paneloptions.setVisible(false);
		
		JPanel panelinfo = new JPanel();
		panelinfo.setBackground(new Color(51, 0, 51));
		panelinfo.setBounds(15, 11, 379, 388);
		mainwindow.add(panelinfo);
		panelinfo.setVisible(false);
	
		JPanel paneleasy = new JPanel();
		paneleasy.setBackground(new Color(51, 0, 51));
		paneleasy.setBounds(15, 11, 379, 388);
		mainwindow.add(paneleasy);
		paneleasy.setLayout(null);
		paneleasy.setVisible(false);
		
		JPanel panelmedium = new JPanel();
		panelmedium.setBackground(new Color(51, 0, 51));
		panelmedium.setBounds(15, 11, 379, 388);
		mainwindow.add(panelmedium);
		panelmedium.setLayout(null);
		panelmedium.setVisible(false);
		
		JPanel panelhard = new JPanel();
		panelhard.setBackground(new Color(51, 0, 51));
		panelhard.setBounds(15, 11, 379, 388);
		mainwindow.add(panelhard);
		panelhard.setLayout(null);
		panelhard.setVisible(false);
		
		JPanel paneleasy1 = new JPanel();
		paneleasy1.setBackground(new Color(51, 0, 51));
		paneleasy1.setBounds(15, 11, 379, 388);
		mainwindow.add(paneleasy1);
		paneleasy1.setLayout(null);
		paneleasy1.setVisible(false);
		
		JPanel paneleasy2 = new JPanel();
		paneleasy2.setLayout(null);
		paneleasy2.setBackground(new Color(51, 0, 51));
		paneleasy2.setBounds(15, 11, 379, 388);
		mainwindow.add(paneleasy2);
		paneleasy2.setVisible(false);
		
		JPanel paneleasy3 = new JPanel();
		paneleasy3.setLayout(null);
		paneleasy3.setBackground(new Color(51, 0, 51));
		paneleasy3.setBounds(15, 11, 379, 388);
		mainwindow.add(paneleasy3);
		paneleasy3.setVisible(false);
		
		JPanel paneleasy4 = new JPanel();
		paneleasy4.setLayout(null);
		paneleasy4.setBackground(new Color(51, 0, 51));
		paneleasy4.setBounds(15, 11, 379, 388);
		mainwindow.add(paneleasy4);
		paneleasy4.setVisible(false);
		
		JPanel paneleasy5 = new JPanel();
		paneleasy5.setLayout(null);
		paneleasy5.setBackground(new Color(51, 0, 51));
		paneleasy5.setBounds(15, 11, 379, 388);
		mainwindow.add(paneleasy5);
		paneleasy5.setVisible(false);
		
		JPanel paneleasy6 = new JPanel();
		paneleasy6.setLayout(null);
		paneleasy6.setBackground(new Color(51, 0, 51));
		paneleasy6.setBounds(15, 11, 379, 388);
		mainwindow.add(paneleasy6);
		paneleasy6.setVisible(false);
		
		JPanel paneleasy7 = new JPanel();
		paneleasy7.setLayout(null);
		paneleasy7.setBackground(new Color(51, 0, 51));
		paneleasy7.setBounds(15, 11, 379, 388);
		mainwindow.add(paneleasy7);
		paneleasy7.setVisible(false);
		
		JPanel paneleasy8 = new JPanel();
		paneleasy8.setLayout(null);
		paneleasy8.setBackground(new Color(51, 0, 51));
		paneleasy8.setBounds(15, 11, 379, 388);
		mainwindow.add(paneleasy8);
		paneleasy8.setVisible(false);
		
		JPanel paneleasy9 = new JPanel();
		paneleasy9.setLayout(null);
		paneleasy9.setBackground(new Color(51, 0, 51));
		paneleasy9.setBounds(15, 11, 379, 388);
		mainwindow.add(paneleasy9);
		paneleasy9.setVisible(false);
		
		JPanel panelmedium1 = new JPanel();
		panelmedium1.setBackground(new Color(51, 0, 51));
		panelmedium1.setBounds(15, 11, 379, 388);
		mainwindow.add(panelmedium1);
		panelmedium1.setLayout(null);
		panelmedium1.setVisible(false);
		
		JPanel panelmedium2 = new JPanel();
		panelmedium2.setLayout(null);
		panelmedium2.setBackground(new Color(51, 0, 51));
		panelmedium2.setBounds(15, 11, 379, 388);
		mainwindow.add(panelmedium2);
		panelmedium2.setVisible(false);
		
		JPanel panelmedium3 = new JPanel();
		panelmedium3.setLayout(null);
		panelmedium3.setBackground(new Color(51, 0, 51));
		panelmedium3.setBounds(15, 11, 379, 388);
		mainwindow.add(panelmedium3);
		panelmedium3.setVisible(false);
		
		JPanel panelmedium4 = new JPanel();
		panelmedium4.setLayout(null);
		panelmedium4.setBackground(new Color(51, 0, 51));
		panelmedium4.setBounds(15, 11, 379, 388);
		mainwindow.add(panelmedium4);
		panelmedium4.setVisible(false);
		
		JPanel panelmedium5 = new JPanel();
		panelmedium5.setLayout(null);
		panelmedium5.setBackground(new Color(51, 0, 51));
		panelmedium5.setBounds(15, 11, 379, 388);
		mainwindow.add(panelmedium5);
		panelmedium5.setVisible(false);
		
		JPanel panelmedium6 = new JPanel();
		panelmedium6.setLayout(null);
		panelmedium6.setBackground(new Color(51, 0, 51));
		panelmedium6.setBounds(15, 11, 379, 388);
		mainwindow.add(panelmedium6);
		panelmedium6.setVisible(false);
		
		JPanel panelmedium7 = new JPanel();
		panelmedium7.setLayout(null);
		panelmedium7.setBackground(new Color(51, 0, 51));
		panelmedium7.setBounds(15, 11, 379, 388);
		mainwindow.add(panelmedium7);
		panelmedium7.setVisible(false);
		
		JPanel panelmedium8 = new JPanel();
		panelmedium8.setLayout(null);
		panelmedium8.setBackground(new Color(51, 0, 51));
		panelmedium8.setBounds(15, 11, 379, 388);
		mainwindow.add(panelmedium8);
		panelmedium8.setVisible(false);
		
		JPanel panelmedium9 = new JPanel();
		panelmedium9.setLayout(null);
		panelmedium9.setBackground(new Color(51, 0, 51));
		panelmedium9.setBounds(15, 11, 379, 388);
		mainwindow.add(panelmedium9);
		panelmedium9.setVisible(false);
		
		JPanel panelhard1 = new JPanel();
		panelhard1.setBackground(new Color(51, 0, 51));
		panelhard1.setBounds(15, 11, 379, 388);
		mainwindow.add(panelhard1);
		panelhard1.setLayout(null);
		panelhard1.setVisible(false);
		
		JPanel panelhard2 = new JPanel();
		panelhard2.setLayout(null);
		panelhard2.setBackground(new Color(51, 0, 51));
		panelhard2.setBounds(15, 11, 379, 388);
		mainwindow.add(panelhard2);
		panelhard2.setVisible(false);
		
		JPanel panelhard3 = new JPanel();
		panelhard3.setLayout(null);
		panelhard3.setBackground(new Color(51, 0, 51));
		panelhard3.setBounds(15, 11, 379, 388);
		mainwindow.add(panelhard3);
		panelhard3.setVisible(false);
		
		JPanel panelhard4 = new JPanel();
		panelhard4.setLayout(null);
		panelhard4.setBackground(new Color(51, 0, 51));
		panelhard4.setBounds(15, 11, 379, 388);
		mainwindow.add(panelhard4);
		panelhard4.setVisible(false);
		
		JPanel panelhard5 = new JPanel();
		panelhard5.setLayout(null);
		panelhard5.setBackground(new Color(51, 0, 51));
		panelhard5.setBounds(15, 11, 379, 388);
		mainwindow.add(panelhard5);
		panelhard5.setVisible(false);
		
		JPanel panelhard6 = new JPanel();
		panelhard6.setLayout(null);
		panelhard6.setBackground(new Color(51, 0, 51));
		panelhard6.setBounds(15, 11, 379, 388);
		mainwindow.add(panelhard6);
		panelhard6.setVisible(false);
		
		JPanel panelhard7 = new JPanel();
		panelhard7.setLayout(null);
		panelhard7.setBackground(new Color(51, 0, 51));
		panelhard7.setBounds(15, 11, 379, 388);
		mainwindow.add(panelhard7);
		panelhard7.setVisible(false);
		
		JPanel panelhard8 = new JPanel();
		panelhard8.setLayout(null);
		panelhard8.setBackground(new Color(51, 0, 51));
		panelhard8.setBounds(15, 11, 379, 388);
		mainwindow.add(panelhard8);
		panelhard8.setVisible(false);
		
		JPanel panelhard9 = new JPanel();
		panelhard9.setLayout(null);
		panelhard9.setBackground(new Color(51, 0, 51));
		panelhard9.setBounds(15, 11, 379, 388);
		mainwindow.add(panelhard9);
		panelhard9.setVisible(false);
		//PANEL END
		
		//USER INFO START
		JLabel lbuserinfotitle = new JLabel("<html><center>USER INFO</center></html>");
		lbuserinfotitle.setForeground(new Color(0, 204, 255));
		lbuserinfotitle.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 24));
		lbuserinfotitle.setHorizontalAlignment(SwingConstants.CENTER);
		lbuserinfotitle.setBounds(0, 0, 379, 61);
		paneluserinfo.add(lbuserinfotitle);
				
		JLabel lbfirstname = new JLabel("First name:");
		lbfirstname.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lbfirstname.setForeground(new Color(0, 204, 255));
		lbfirstname.setBounds(34, 95, 118, 14);
		paneluserinfo.add(lbfirstname);
				
		JLabel lblastname = new JLabel("Last name:");
		lblastname.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lblastname.setForeground(new Color(0, 204, 255));
		lblastname.setBounds(34, 133, 118, 14);
		paneluserinfo.add(lblastname);
				
		JLabel lbfavoriteclub = new JLabel("Favorite club:");
		lbfavoriteclub.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		lbfavoriteclub.setForeground(new Color(0, 204, 255));
		lbfavoriteclub.setBounds(34, 169, 118, 14);
		paneluserinfo.add(lbfavoriteclub);
				
		JTextField tffirstname = new JTextField();
		tffirstname.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		tffirstname.setBackground(new Color(0, 204, 255));
		tffirstname.setBounds(150, 92, 204, 20);
		paneluserinfo.add(tffirstname);
		tffirstname.setColumns(10);
				
		JTextField tflastname = new JTextField();
		tflastname.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		tflastname.setColumns(10);
		tflastname.setBackground(new Color(0, 204, 255));
		tflastname.setBounds(150, 130, 204, 20);
		paneluserinfo.add(tflastname);
				
		JComboBox<Object> cbfavoriteclub = new JComboBox<Object>();
		cbfavoriteclub.setModel(new DefaultComboBoxModel<Object>(new String[] {"Arsenal", "Aston Villa", "Brighton and Hove Albion", "Burnley", "Chelsea", "Crystal Palace", "Everton", "Fulham", "Leeds United", "Leicester City", "Liverpool", "Manchester City", "Manchester United", "Newcasatle United", "Sheffield United", "Southampton", "Tottenham Hotspur", "West Bromwich Albion", "West Ham United", "Wolverhampton Wanderers"}));
		cbfavoriteclub.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		cbfavoriteclub.setBackground(new Color(0, 204, 255));
		cbfavoriteclub.setBounds(150, 165, 204, 22);
		paneluserinfo.add(cbfavoriteclub);
				
		JButton btnregister = new JButton("REGISTER");
		btnregister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					if(tffirstname.getText().equalsIgnoreCase("") || tflastname.getText().equalsIgnoreCase("")) {
						JOptionPane.showMessageDialog(null, "You must enter your first and last name!");
					}
					else {
					String firstname = tffirstname.getText();
					String lastname = tflastname.getText();
					String favoriteclub = cbfavoriteclub.getSelectedItem().toString();
					User u = new User(firstname, lastname, favoriteclub);
					users.add(u);
					tffirstname.setText("");
					tflastname.setText("");
					Panels.paneltransition(paneluserinfo, panelmenu);
					bgm.play();
					}
				} catch (Exception e) {
					JOptionPane.showMessageDialog(null, "Invalid entry!");
				}
			}
		});
		btnregister.setBackground(new Color(0, 204, 255));
		btnregister.setFont(new Font("Bookman Old Style", Font.BOLD, 12));
		btnregister.setBounds(150, 203, 204, 23);
		paneluserinfo.add(btnregister);
				
		JLabel lbuserinfoimage = new JLabel("");
		lbuserinfoimage.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/ICON/PremierLeagueLogoQuizIcon100x100.png")));
		lbuserinfoimage.setHorizontalAlignment(SwingConstants.CENTER);
		lbuserinfoimage.setBounds(0, 237, 379, 161);
		paneluserinfo.add(lbuserinfoimage);
		//USER INFO END
		
		//MENU START
		JButton btnstart = new JButton("START");
		btnstart.setBounds(0, 1, 378, 55);
		btnstart.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/ICON/PremierLeagueLogoQuizIconEasy40x40.png")));
		btnstart.setForeground(new Color(255, 255, 255));
		btnstart.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		btnstart.setBackground(new Color(255, 0, 102));
		btnstart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelmenu, panelstart);
			}
		});
		panelmenu.setLayout(null);
		panelmenu.add(btnstart);
		
		JButton btninfo = new JButton("INFO");
		btninfo.setBounds(0, 111, 378, 55);
		btninfo.setForeground(new Color(255, 255, 255));
		btninfo.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		btninfo.setBackground(new Color(255, 0, 102));
		btninfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelmenu, panelinfo);
			}
		});
		panelmenu.add(btninfo);
		
		JButton btnoptions = new JButton("OPTIONS");
		btnoptions.setBounds(0, 221, 378, 55);
		btnoptions.setForeground(new Color(255, 255, 255));
		btnoptions.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		btnoptions.setBackground(new Color(255, 0, 102));
		btnoptions.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelmenu, paneloptions);
			}
		});
		panelmenu.add(btnoptions);
		
		JButton btnexit = new JButton("EXIT");
		btnexit.setBounds(0, 331, 378, 55);
		btnexit.setForeground(new Color(255, 255, 255));
		btnexit.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		btnexit.setBackground(new Color(255, 0, 102));
		btnexit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.exit(0);
			}
		});
		panelmenu.add(btnexit);
		//MENU END
		
		//OPTIONS START
		JLabel lbsound = new JLabel("SOUND");
		lbsound.setBounds(0, 0, 379, 55);
		lbsound.setHorizontalAlignment(SwingConstants.CENTER);
		lbsound.setForeground(new Color(0, 204, 255));
		lbsound.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 24));
		paneloptions.add(lbsound);
		
		JButton btnsoundon = new JButton("ON");
		btnsoundon.setBounds(102, 78, 87, 43);
		btnsoundon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bgm.play();
			}
		});
		btnsoundon.setForeground(Color.WHITE);
		btnsoundon.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnsoundon.setBackground(new Color(255, 0, 102));
		paneloptions.add(btnsoundon);
		
		JButton btnsoundoff = new JButton("OFF");
		btnsoundoff.setBounds(193, 78, 87, 43);
		btnsoundoff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				bgm.stop();
			}
		});
		btnsoundoff.setForeground(Color.WHITE);
		btnsoundoff.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnsoundoff.setBackground(new Color(255, 0, 102));
		paneloptions.add(btnsoundoff);
		
		JButton btnoptionsback = new JButton("BACK");
		btnoptionsback.setBounds(0, 331, 379, 55);
		btnoptionsback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneloptions, panelmenu);
			}
		});
		paneloptions.setLayout(null);
		btnoptionsback.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		btnoptionsback.setBackground(new Color(255, 0, 102));
		btnoptionsback.setForeground(new Color(255, 255, 255));
		paneloptions.add(btnoptionsback);
		//OPTIONS END
		
		//START GAME START
		JButton btneasy = new JButton("EASY");
		btneasy.setBounds(0, 1, 379, 55);
		btneasy.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/ICON/PremierLeagueLogoQuizIconEasy40x40.png")));
		btneasy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelstart, paneleasy);
			}
		});
		panelstart.setLayout(null);
		btneasy.setForeground(new Color(0, 0, 0));
		btneasy.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		btneasy.setBackground(new Color(0, 204, 255));
		panelstart.add(btneasy);
		
		JButton btnmedium = new JButton("MEDIUM");
		btnmedium.setBounds(0, 111, 379, 55);
		btnmedium.setEnabled(false);
		btnmedium.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/ICON/PremierLeagueLogoQuizIconMedium40x40.png")));
		btnmedium.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelstart, panelmedium);
			}
		});
		btnmedium.setBackground(new Color(0, 204, 255));
		btnmedium.setForeground(new Color(0, 0, 0));
		btnmedium.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		panelstart.add(btnmedium);
		
		JButton btnhard = new JButton("HARD");
		btnhard.setBounds(0, 221, 379, 55);
		btnhard.setEnabled(false);
		btnhard.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/ICON/PremierLeagueLogoQuizIconHard40x40.png")));
		btnhard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelstart, panelhard);
			}
		});
		btnhard.setBackground(new Color(0, 204, 255));
		btnhard.setForeground(new Color(0, 0, 0));
		btnhard.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		panelstart.add(btnhard);
		
		JButton btnstartback = new JButton("BACK");
		btnstartback.setBounds(0, 331, 379, 55);
		btnstartback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelstart, panelmenu);
			}
		});
		btnstartback.setBackground(new Color(255, 0, 102));
		btnstartback.setForeground(new Color(255, 255, 255));
		btnstartback.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		panelstart.add(btnstartback);
		panelinfo.setLayout(null);
		//START GAME END
		
		//INFO START
		JLabel lbinfotitle = new JLabel("INFO:");
		lbinfotitle.setBounds(0, 1, 379, 55);
		lbinfotitle.setForeground(new Color(0, 204, 255));
		lbinfotitle.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 24));
		lbinfotitle.setHorizontalAlignment(SwingConstants.CENTER);
		panelinfo.add(lbinfotitle);
		
		JLabel lbinfo1 = new JLabel("<html><center>This game represents a quiz to know clubs that used to play or still play in the English Premier League.</center></html>\r\n");
		lbinfo1.setBounds(0, 56, 379, 55);
		lbinfo1.setHorizontalAlignment(SwingConstants.CENTER);
		lbinfo1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 12));
		lbinfo1.setForeground(new Color(0, 204, 255));
		panelinfo.add(lbinfo1);
		
		JLabel lbinfo2 = new JLabel("<html><center>The game contains three difficulty levels:</center></html>");
		lbinfo2.setBounds(0, 111, 379, 55);
		lbinfo2.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 12));
		lbinfo2.setForeground(new Color(0, 204, 255));
		lbinfo2.setHorizontalAlignment(SwingConstants.CENTER);
		panelinfo.add(lbinfo2);
		
		JLabel lbinfo3 = new JLabel("<html><center>EASY: Clubs currently playing in the Premier League.\r\n<br>\r\nMEDIUM: Clubs that have played in the last 10 years.\r\n<br>\r\nHARD: Clubs that have played in the last 20 years.</center></html>");
		lbinfo3.setBounds(0, 166, 379, 55);
		lbinfo3.setForeground(new Color(0, 204, 255));
		lbinfo3.setToolTipText("");
		lbinfo3.setHorizontalAlignment(SwingConstants.CENTER);
		lbinfo3.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 12));
		panelinfo.add(lbinfo3);
		
		JLabel lbinfospace1 = new JLabel("Stefan Nasi\u0107 111/2019");
		lbinfospace1.setForeground(new Color(0, 204, 255));
		lbinfospace1.setFont(new Font("Bookman Old Style", Font.BOLD | Font.ITALIC, 12));
		lbinfospace1.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/ICON/PremierLeagueLogoQuizIcon50x50.png")));
		lbinfospace1.setBounds(0, 232, 379, 99);
		lbinfospace1.setHorizontalAlignment(SwingConstants.CENTER);
		panelinfo.add(lbinfospace1);
		
		JButton btninfoprint = new JButton("PRINT");
		btninfoprint.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Score.printscore(users);
			}
		});
		btninfoprint.setToolTipText("PRINT YOUR SCORE");
		btninfoprint.setForeground(Color.WHITE);
		btninfoprint.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btninfoprint.setBackground(new Color(255, 0, 102));
		btninfoprint.setBounds(279, 345, 100, 43);
		panelinfo.add(btninfoprint);
		
		JButton btninfoback = new JButton("BACK");
		btninfoback.setBounds(0, 345, 100, 43);
		btninfoback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelinfo, panelmenu);
			}
		});
		btninfoback.setBackground(new Color(255, 0, 102));
		btninfoback.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btninfoback.setForeground(new Color(255, 255, 255));
		panelinfo.add(btninfoback);
		//INFO END
		
		//EASY START
		JButton btneasy1 = new JButton("");
		btneasy1.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Manchester-United Edited 100x100.png")));
		btneasy1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy, paneleasy1);
			}
		});
		btneasy1.setBackground(new Color(51, 0, 51));
		btneasy1.setBounds(10, 0, 100, 100);
		paneleasy.add(btneasy1);
		
		JButton btneasy3 = new JButton("");
		btneasy3.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Liverpool Edited 100x100.png")));
		btneasy3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy, paneleasy3);
			}
		});
		btneasy3.setBackground(new Color(51, 0, 51));
		btneasy3.setBounds(269, 0, 100, 100);
		paneleasy.add(btneasy3);
		
		JButton btneasy2 = new JButton("");
		btneasy2.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Arsenal Edited 100x100.png")));
		btneasy2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy, paneleasy2);
			}
		});
		btneasy2.setBackground(new Color(51, 0, 51));
		btneasy2.setBounds(140, 0, 100, 100);
		paneleasy.add(btneasy2);
		
		JButton btneasy4 = new JButton("");
		btneasy4.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Chelsea Edited 100x100.png")));
		btneasy4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy, paneleasy4);
			}
		});
		btneasy4.setBackground(new Color(51, 0, 51));
		btneasy4.setBounds(10, 111, 100, 100);
		paneleasy.add(btneasy4);
		
		JButton btneasy5 = new JButton("");
		btneasy5.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Manchester-City Edited 100x100.png")));
		btneasy5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy, paneleasy5);
			}
		});
		btneasy5.setBackground(new Color(51, 0, 51));
		btneasy5.setBounds(140, 111, 100, 100);
		paneleasy.add(btneasy5);
		
		JButton btneasy6 = new JButton("");
		btneasy6.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Leicester-City Edited 100x100.png")));
		btneasy6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy, paneleasy6);
			}
		});
		btneasy6.setBackground(new Color(51, 0, 51));
		btneasy6.setBounds(269, 111, 100, 100);
		paneleasy.add(btneasy6);
		
		JButton btneasy7 = new JButton("");
		btneasy7.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Fulham-FC Edited 100x100.png")));
		btneasy7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy, paneleasy7);
			}
		});
		btneasy7.setBackground(new Color(51, 0, 51));
		btneasy7.setBounds(10, 222, 100, 100);
		paneleasy.add(btneasy7);
		
		JButton btneasy8 = new JButton("");
		btneasy8.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Everton Edited 100x100.png")));
		btneasy8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy, paneleasy8);
			}
		});
		btneasy8.setBackground(new Color(51, 0, 51));
		btneasy8.setBounds(140, 222, 100, 100);
		paneleasy.add(btneasy8);
		
		JButton btneasy9 = new JButton("");
		btneasy9.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Southampton-FC Edited 100x100.png")));
		btneasy9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy, paneleasy9);
			}
		});
		btneasy9.setBackground(new Color(51, 0, 51));
		btneasy9.setBounds(269, 222, 100, 100);
		paneleasy.add(btneasy9);
		
		JButton btneasyback = new JButton("BACK");
		btneasyback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy, panelstart);
			}
		});
		btneasyback.setBackground(new Color(255, 0, 102));
		btneasyback.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyback.setForeground(new Color(255, 255, 255));
		btneasyback.setBounds(140, 345, 100, 43);
		paneleasy.add(btneasyback);
		//EASY END
		
		//MEDIUM START
		JButton btnmedium1 = new JButton("");
		btnmedium1.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Birmingham-City Edited 100x100.png")));
		btnmedium1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium, panelmedium1);
			}
		});
		btnmedium1.setBackground(new Color(51, 0, 51));
		btnmedium1.setBounds(10, 0, 100, 100);
		panelmedium.add(btnmedium1);
		
		JButton btnmedium3 = new JButton("");
		btnmedium3.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Blackburn-Rovers Edited 100x100.png")));
		btnmedium3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium, panelmedium3);
			}
		});
		btnmedium3.setBackground(new Color(51, 0, 51));
		btnmedium3.setBounds(269, 0, 100, 100);
		panelmedium.add(btnmedium3);
		
		JButton btnmedium2 = new JButton("");
		btnmedium2.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Newcastle-United Edited 100x100.png")));
		btnmedium2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium, panelmedium2);
			}
		});
		btnmedium2.setBackground(new Color(51, 0, 51));
		btnmedium2.setBounds(142, 0, 100, 100);
		panelmedium.add(btnmedium2);
		
		JButton btnmedium4 = new JButton("");
		btnmedium4.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/West-Ham-United Edited 100x100.png")));
		btnmedium4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium, panelmedium4);
			}
		});
		btnmedium4.setBackground(new Color(51, 0, 51));
		btnmedium4.setBounds(10, 111, 100, 100);
		panelmedium.add(btnmedium4);
		
		JButton btnmedium5 = new JButton("");
		btnmedium5.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Hull-City Edited 100x100.png")));
		btnmedium5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium, panelmedium5);
			}
		});
		btnmedium5.setBackground(new Color(51, 0, 51));
		btnmedium5.setBounds(142, 111, 100, 100);
		panelmedium.add(btnmedium5);
		
		JButton btnmedium6 = new JButton("");
		btnmedium6.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Norwich-City Edited 100x100.png")));
		btnmedium6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium, panelmedium6);
			}
		});
		btnmedium6.setBackground(new Color(51, 0, 51));
		btnmedium6.setBounds(269, 111, 100, 100);
		panelmedium.add(btnmedium6);
		
		JButton btnmedium7 = new JButton("");
		btnmedium7.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Queens-Park-Rangers Edited 100x100.png")));
		btnmedium7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium, panelmedium7);
			}
		});
		btnmedium7.setBackground(new Color(51, 0, 51));
		btnmedium7.setBounds(10, 222, 100, 100);
		panelmedium.add(btnmedium7);
		
		JButton btnmedium8 = new JButton("");
		btnmedium8.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Stoke-City Edited 100x100.png")));
		btnmedium8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium, panelmedium8);
			}
		});
		btnmedium8.setBackground(new Color(51, 0, 51));
		btnmedium8.setBounds(142, 222, 100, 100);
		panelmedium.add(btnmedium8);
		
		JButton btnmedium9 = new JButton("");
		btnmedium9.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Wigan-Athletic Edited 100x100.png")));
		btnmedium9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium, panelmedium9);
			}
		});
		btnmedium9.setBackground(new Color(51, 0, 51));
		btnmedium9.setBounds(269, 222, 100, 100);
		panelmedium.add(btnmedium9);
		
		JButton btnmediumback = new JButton("BACK");
		btnmediumback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelmedium, panelstart);
			}
		});
		btnmediumback.setForeground(Color.WHITE);
		btnmediumback.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumback.setBackground(new Color(255, 0, 102));
		btnmediumback.setBounds(142, 345, 100, 43);
		panelmedium.add(btnmediumback);
		//MEDIUM END
		
		//HARD START
		JButton btnhard1 = new JButton("");
		btnhard1.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Coventry-City Edited 100x100.png")));
		btnhard1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard, panelhard1);
			}
		});
		btnhard1.setBackground(new Color(51, 0, 51));
		btnhard1.setBounds(10, 0, 100, 100);
		panelhard.add(btnhard1);
		
		JButton btnhard3 = new JButton("");
		btnhard3.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Derby-County Edited 100x100.png")));
		btnhard3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard, panelhard3);
			}
		});
		btnhard3.setBackground(new Color(51, 0, 51));
		btnhard3.setBounds(269, 0, 100, 100);
		panelhard.add(btnhard3);
		
		JButton btnhard2 = new JButton("");
		btnhard2.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Ipswich-Town Edited 100x100.png")));
		btnhard2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard, panelhard2);
			}
		});
		btnhard2.setBackground(new Color(51, 0, 51));
		btnhard2.setBounds(141, 0, 100, 100);
		panelhard.add(btnhard2);
		
		JButton btnhard4 = new JButton("");
		btnhard4.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Leeds-United Edited 100x100.png")));
		btnhard4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard, panelhard4);
			}
		});
		btnhard4.setBackground(new Color(51, 0, 51));
		btnhard4.setBounds(10, 111, 100, 100);
		panelhard.add(btnhard4);
		
		JButton btnhard5 = new JButton("");
		btnhard5.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Portsmouth-FC Edited 100x100.png")));
		btnhard5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard, panelhard5);
			}
		});
		btnhard5.setBackground(new Color(51, 0, 51));
		btnhard5.setBounds(141, 111, 100, 100);
		panelhard.add(btnhard5);
		
		JButton btnhard6 = new JButton("");
		btnhard6.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Sunderland-AFC Edited 100x100.png")));
		btnhard6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard, panelhard6);
			}
		});
		btnhard6.setBackground(new Color(51, 0, 51));
		btnhard6.setBounds(269, 111, 100, 100);
		panelhard.add(btnhard6);
		
		JButton btnhard7 = new JButton("");
		btnhard7.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Swansea-City Edited 100x100.png")));
		btnhard7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard, panelhard7);
			}
		});
		btnhard7.setBackground(new Color(51, 0, 51));
		btnhard7.setBounds(10, 222, 100, 100);
		panelhard.add(btnhard7);
		
		JButton btnhard8 = new JButton("");
		btnhard8.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Watford-FC Edited 100x100.png")));
		btnhard8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard, panelhard8);
			}
		});
		btnhard8.setBackground(new Color(51, 0, 51));
		btnhard8.setBounds(141, 222, 100, 100);
		panelhard.add(btnhard8);
		
		JButton btnhard9 = new JButton("");
		btnhard9.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/West-Bromwich-Albion Edited 100x100.png")));
		btnhard9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard, panelhard9);
			}
		});
		btnhard9.setBackground(new Color(51, 0, 51));
		btnhard9.setBounds(269, 222, 100, 100);
		panelhard.add(btnhard9);
		
		JButton btnhardback = new JButton("BACK");
		btnhardback.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard, panelstart);
			}
		});
		btnhardback.setForeground(Color.WHITE);
		btnhardback.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardback.setBackground(new Color(255, 0, 102));
		btnhardback.setBounds(141, 345, 100, 43);
		panelhard.add(btnhardback);
		//HARD END
		
		//EASY 1 START
		JButton btneasynext1 = new JButton("NEXT");
		btneasynext1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy1, paneleasy2);
			}
		});
		btneasynext1.setForeground(Color.WHITE);
		btneasynext1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasynext1.setBackground(new Color(255, 0, 102));
		btneasynext1.setBounds(279, 345, 100, 43);
		paneleasy1.add(btneasynext1);
		
		JButton btneasyback1 = new JButton("BACK");
		btneasyback1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy1, paneleasy);
			}
		});
		btneasyback1.setForeground(Color.WHITE);
		btneasyback1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyback1.setBackground(new Color(255, 0, 102));
		btneasyback1.setBounds(0, 345, 100, 43);
		paneleasy1.add(btneasyback1);
		
		JLabel lbeasytitle1 = new JLabel("1/9");
		lbeasytitle1.setForeground(new Color(0, 204, 255));
		lbeasytitle1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbeasytitle1.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasytitle1.setBounds(141, 0, 100, 43);
		paneleasy1.add(lbeasytitle1);
		
		JLabel lbeasyimage1 = new JLabel("");
		lbeasyimage1.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Manchester-United Edited 130x130.png")));
		lbeasyimage1.setForeground(new Color(0, 204, 255));
		lbeasyimage1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbeasyimage1.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyimage1.setBounds(128, 40, 130, 130);
		paneleasy1.add(lbeasyimage1);
		
		JRadioButton rbeasy1option1 = new JRadioButton("Man United");
		rbeasy1option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy1option1.setBackground(new Color(0, 204, 255));
		rbeasy1option1.setBounds(23, 196, 109, 23);
		paneleasy1.add(rbeasy1option1);
		
		JRadioButton rbeasy1option3 = new JRadioButton("Man City");
		rbeasy1option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy1option3.setBackground(new Color(0, 204, 255));
		rbeasy1option3.setBounds(23, 242, 109, 23);
		paneleasy1.add(rbeasy1option3);
		
		JRadioButton rbeasy1option2 = new JRadioButton("Liverpool");
		rbeasy1option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy1option2.setBackground(new Color(0, 204, 255));
		rbeasy1option2.setBounds(251, 196, 109, 23);
		paneleasy1.add(rbeasy1option2);
		
		JRadioButton rbeasy1option4 = new JRadioButton("Chelsea");
		rbeasy1option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy1option4.setBackground(new Color(0, 204, 255));
		rbeasy1option4.setBounds(251, 242, 109, 23);
		paneleasy1.add(rbeasy1option4);
		
		ButtonGroup bgeasy1 = new ButtonGroup();
		bgeasy1.add(rbeasy1option1);
		bgeasy1.add(rbeasy1option3);
		bgeasy1.add(rbeasy1option2);
		bgeasy1.add(rbeasy1option4);
		
		JLabel lbeasyrequest1 = new JLabel("Choose one answer.");
		lbeasyrequest1.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyrequest1.setForeground(new Color(0, 204, 255));
		lbeasyrequest1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbeasyrequest1.setBounds(0, 166, 379, 23);
		paneleasy1.add(lbeasyrequest1);
		
		JLabel lbeasyanswer1 = new JLabel("Manchester United");
		lbeasyanswer1.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyanswer1.setForeground(new Color(255, 0, 102));
		lbeasyanswer1.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbeasyanswer1.setBounds(0, 291, 379, 33);
		paneleasy1.add(lbeasyanswer1);
		lbeasyanswer1.setVisible(false);
		
		JButton btneasydone1 = new JButton("DONE");
		btneasydone1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.leveleasy(rbeasy1option1, lbeasyimage1, "/Images/EASY/Manchester-United 130x130.png", btneasy1, "/Images/EASY/Manchester-United 100x100.png", paneleasy1, paneleasy2, bgeasy1, btneasydone1, btnmedium, lbeasyrequest1, lbeasyanswer1);
			}
		});
		btneasydone1.setForeground(Color.WHITE);
		btneasydone1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasydone1.setBackground(new Color(255, 0, 102));
		btneasydone1.setBounds(141, 291, 100, 33);
		paneleasy1.add(btneasydone1);
		//EASY 1 END
		
		//EASY 2 START
		JButton btneasynext2 = new JButton("NEXT");
		btneasynext2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy2, paneleasy3);
			}
		});
		btneasynext2.setForeground(Color.WHITE);
		btneasynext2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasynext2.setBackground(new Color(255, 0, 102));
		btneasynext2.setBounds(279, 345, 100, 43);
		paneleasy2.add(btneasynext2);
		
		JButton btneasyback2 = new JButton("BACK");
		btneasyback2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy2, paneleasy);
			}
		});
		btneasyback2.setForeground(Color.WHITE);
		btneasyback2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyback2.setBackground(new Color(255, 0, 102));
		btneasyback2.setBounds(0, 345, 100, 43);
		paneleasy2.add(btneasyback2);
		
		JLabel lbeasytitle2 = new JLabel("2/9");
		lbeasytitle2.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasytitle2.setForeground(new Color(0, 204, 255));
		lbeasytitle2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbeasytitle2.setBounds(141, 0, 100, 43);
		paneleasy2.add(lbeasytitle2);
		
		JLabel lbeasyimage2 = new JLabel("");
		lbeasyimage2.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Arsenal Edited 130x130.png")));
		lbeasyimage2.setForeground(new Color(0, 204, 255));
		lbeasyimage2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbeasyimage2.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyimage2.setBounds(128, 40, 130, 130);
		paneleasy2.add(lbeasyimage2);
		
		JRadioButton rbeasy2option1 = new JRadioButton("Arsenal");
		rbeasy2option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy2option1.setBackground(new Color(0, 204, 255));
		rbeasy2option1.setBounds(23, 196, 109, 23);
		paneleasy2.add(rbeasy2option1);
		
		JRadioButton rbeasy2option3 = new JRadioButton("Southampton");
		rbeasy2option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy2option3.setBackground(new Color(0, 204, 255));
		rbeasy2option3.setBounds(23, 242, 109, 23);
		paneleasy2.add(rbeasy2option3);
		
		JRadioButton rbeasy2option2 = new JRadioButton("Liverpool");
		rbeasy2option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy2option2.setBackground(new Color(0, 204, 255));
		rbeasy2option2.setBounds(251, 196, 109, 23);
		paneleasy2.add(rbeasy2option2);
		
		JRadioButton rbeasy2option4 = new JRadioButton("Fulham");
		rbeasy2option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy2option4.setBackground(new Color(0, 204, 255));
		rbeasy2option4.setBounds(251, 242, 109, 23);
		paneleasy2.add(rbeasy2option4);
		
		ButtonGroup bgeasy2 = new ButtonGroup();
		bgeasy2.add(rbeasy2option1);
		bgeasy2.add(rbeasy2option2);
		bgeasy2.add(rbeasy2option3);
		bgeasy2.add(rbeasy2option4);
		
		JLabel lbeasyrequest2 = new JLabel("Choose one answer.");
		lbeasyrequest2.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyrequest2.setForeground(new Color(0, 204, 255));
		lbeasyrequest2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbeasyrequest2.setBounds(0, 166, 379, 23);
		paneleasy2.add(lbeasyrequest2);
		
		JLabel lbeasyanswer2 = new JLabel("Arsenal");
		lbeasyanswer2.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyanswer2.setForeground(new Color(255, 0, 102));
		lbeasyanswer2.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbeasyanswer2.setBounds(0, 291, 379, 33);
		paneleasy2.add(lbeasyanswer2);
		lbeasyanswer2.setVisible(false);
		
		JButton btneasydone2 = new JButton("DONE");
		btneasydone2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.leveleasy(rbeasy2option1, lbeasyimage2, "/Images/EASY/Arsenal 130x130.png", btneasy2, "/Images/EASY/Arsenal 100x100.png", paneleasy2, paneleasy3, bgeasy2, btneasydone2, btnmedium, lbeasyrequest2, lbeasyanswer2);
			}
		});
		btneasydone2.setForeground(Color.WHITE);
		btneasydone2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasydone2.setBackground(new Color(255, 0, 102));
		btneasydone2.setBounds(141, 291, 100, 33);
		paneleasy2.add(btneasydone2);
		
		JButton btneasyprevious2 = new JButton("PREV");
		btneasyprevious2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy2, paneleasy1);
			}
		});
		btneasyprevious2.setForeground(Color.WHITE);
		btneasyprevious2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyprevious2.setBackground(new Color(255, 0, 102));
		btneasyprevious2.setBounds(141, 345, 100, 43);
		paneleasy2.add(btneasyprevious2);
		//EASY 2 END
		
		//EASY 3 START
		JButton btneasynext3 = new JButton("NEXT");
		btneasynext3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy3, paneleasy4);
			}
		});
		btneasynext3.setForeground(Color.WHITE);
		btneasynext3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasynext3.setBackground(new Color(255, 0, 102));
		btneasynext3.setBounds(279, 345, 100, 43);
		paneleasy3.add(btneasynext3);
		
		JButton btneasyback3 = new JButton("BACK");
		btneasyback3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy3, paneleasy);
			}
		});
		btneasyback3.setForeground(Color.WHITE);
		btneasyback3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyback3.setBackground(new Color(255, 0, 102));
		btneasyback3.setBounds(0, 345, 100, 43);
		paneleasy3.add(btneasyback3);
		
		JLabel lbeasytitle3 = new JLabel("3/9");
		lbeasytitle3.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasytitle3.setForeground(new Color(0, 204, 255));
		lbeasytitle3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbeasytitle3.setBounds(141, 0, 100, 43);
		paneleasy3.add(lbeasytitle3);
		
		JLabel lbeasyimage3 = new JLabel("");
		lbeasyimage3.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Liverpool Edited 130x130.png")));
		lbeasyimage3.setForeground(new Color(0, 204, 255));
		lbeasyimage3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbeasyimage3.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyimage3.setBounds(128, 40, 130, 130);
		paneleasy3.add(lbeasyimage3);
		
		JRadioButton rbeasy3option1 = new JRadioButton("Tottenham");
		rbeasy3option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy3option1.setBackground(new Color(0, 204, 255));
		rbeasy3option1.setBounds(23, 196, 109, 23);
		paneleasy3.add(rbeasy3option1);
		
		JRadioButton rbeasy3option3 = new JRadioButton("Wolves");
		rbeasy3option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy3option3.setBackground(new Color(0, 204, 255));
		rbeasy3option3.setBounds(23, 242, 109, 23);
		paneleasy3.add(rbeasy3option3);
		
		JRadioButton rbeasy3option2 = new JRadioButton("Stoke City");
		rbeasy3option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy3option2.setBackground(new Color(0, 204, 255));
		rbeasy3option2.setBounds(251, 196, 109, 23);
		paneleasy3.add(rbeasy3option2);
		
		JRadioButton rbeasy3option4 = new JRadioButton("Liverpool");
		rbeasy3option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy3option4.setBackground(new Color(0, 204, 255));
		rbeasy3option4.setBounds(251, 242, 109, 23);
		paneleasy3.add(rbeasy3option4);
		
		ButtonGroup bgeasy3 = new ButtonGroup();
		bgeasy3.add(rbeasy3option1);
		bgeasy3.add(rbeasy3option2);
		bgeasy3.add(rbeasy3option3);
		bgeasy3.add(rbeasy3option4);
		
		JLabel lbeasyrequest3 = new JLabel("Choose one answer.");
		lbeasyrequest3.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyrequest3.setForeground(new Color(0, 204, 255));
		lbeasyrequest3.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbeasyrequest3.setBounds(0, 166, 379, 23);
		paneleasy3.add(lbeasyrequest3);
		
		JLabel lbeasyanswer3 = new JLabel("Liverpool");
		lbeasyanswer3.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyanswer3.setForeground(new Color(255, 0, 102));
		lbeasyanswer3.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbeasyanswer3.setBounds(0, 291, 379, 33);
		paneleasy3.add(lbeasyanswer3);
		lbeasyanswer3.setVisible(false);
		
		JButton btneasydone3 = new JButton("DONE");
		btneasydone3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.leveleasy(rbeasy3option4, lbeasyimage3, "/Images/EASY/Liverpool 130x130.png", btneasy3, "/Images/EASY/Liverpool 100x100.png", paneleasy3, paneleasy4, bgeasy3, btneasydone3, btnmedium, lbeasyrequest3, lbeasyanswer3);
			}
		});
		btneasydone3.setForeground(Color.WHITE);
		btneasydone3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasydone3.setBackground(new Color(255, 0, 102));
		btneasydone3.setBounds(141, 291, 100, 33);
		paneleasy3.add(btneasydone3);
		
		JButton btneasyprevious3 = new JButton("PREV");
		btneasyprevious3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy3, paneleasy2);
			}
		});
		btneasyprevious3.setForeground(Color.WHITE);
		btneasyprevious3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyprevious3.setBackground(new Color(255, 0, 102));
		btneasyprevious3.setBounds(141, 345, 100, 43);
		paneleasy3.add(btneasyprevious3);
		//EASY 3 END
		
		//EASY 4 START
		JButton btneasynext4 = new JButton("NEXT");
		btneasynext4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy4, paneleasy5);
			}
		});
		btneasynext4.setForeground(Color.WHITE);
		btneasynext4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasynext4.setBackground(new Color(255, 0, 102));
		btneasynext4.setBounds(279, 345, 100, 43);
		paneleasy4.add(btneasynext4);
		
		JButton btneasyback4 = new JButton("BACK");
		btneasyback4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy4, paneleasy);
			}
		});
		btneasyback4.setForeground(Color.WHITE);
		btneasyback4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyback4.setBackground(new Color(255, 0, 102));
		btneasyback4.setBounds(0, 345, 100, 43);
		paneleasy4.add(btneasyback4);
		
		JLabel lbeasytitle4 = new JLabel("4/9");
		lbeasytitle4.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasytitle4.setForeground(new Color(0, 204, 255));
		lbeasytitle4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbeasytitle4.setBounds(141, 0, 100, 43);
		paneleasy4.add(lbeasytitle4);
		
		JLabel lbeasyimage4 = new JLabel("");
		lbeasyimage4.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Chelsea Edited 130x130.png")));
		lbeasyimage4.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyimage4.setForeground(new Color(0, 204, 255));
		lbeasyimage4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbeasyimage4.setBounds(128, 40, 130, 130);
		paneleasy4.add(lbeasyimage4);
		
		JRadioButton rbeasy4option1 = new JRadioButton("Brighton");
		rbeasy4option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy4option1.setBackground(new Color(0, 204, 255));
		rbeasy4option1.setBounds(23, 196, 109, 23);
		paneleasy4.add(rbeasy4option1);
		
		JRadioButton rbeasy4option3 = new JRadioButton("Crystal Palace");
		rbeasy4option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy4option3.setBackground(new Color(0, 204, 255));
		rbeasy4option3.setBounds(23, 242, 109, 23);
		paneleasy4.add(rbeasy4option3);
		
		JRadioButton rbeasy4option2 = new JRadioButton("Chelsea");
		rbeasy4option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy4option2.setBackground(new Color(0, 204, 255));
		rbeasy4option2.setBounds(251, 196, 109, 23);
		paneleasy4.add(rbeasy4option2);
		
		JRadioButton rbeasy4option4 = new JRadioButton("Tottenham");
		rbeasy4option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy4option4.setBackground(new Color(0, 204, 255));
		rbeasy4option4.setBounds(251, 242, 109, 23);
		paneleasy4.add(rbeasy4option4);
		
		ButtonGroup bgeasy4 = new ButtonGroup();
		bgeasy4.add(rbeasy4option1);
		bgeasy4.add(rbeasy4option2);
		bgeasy4.add(rbeasy4option3);
		bgeasy4.add(rbeasy4option4);
		
		JLabel lbeasyrequest4 = new JLabel("Choose one answer.");
		lbeasyrequest4.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyrequest4.setForeground(new Color(0, 204, 255));
		lbeasyrequest4.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbeasyrequest4.setBounds(0, 166, 379, 23);
		paneleasy4.add(lbeasyrequest4);
		
		JLabel lbeasyanswer4 = new JLabel("Chelsea");
		lbeasyanswer4.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyanswer4.setForeground(new Color(255, 0, 102));
		lbeasyanswer4.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbeasyanswer4.setBounds(0, 291, 379, 33);
		paneleasy4.add(lbeasyanswer4);
		lbeasyanswer4.setVisible(false);
		
		JButton btneasydone4 = new JButton("DONE");
		btneasydone4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.leveleasy(rbeasy4option2, lbeasyimage4, "/Images/EASY/Chelsea 130x130.png", btneasy4, "/Images/EASY/Chelsea 100x100.png", paneleasy4, paneleasy5, bgeasy4, btneasydone4, btnmedium, lbeasyrequest4, lbeasyanswer4);
			}
		});
		btneasydone4.setForeground(Color.WHITE);
		btneasydone4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasydone4.setBackground(new Color(255, 0, 102));
		btneasydone4.setBounds(141, 291, 100, 33);
		paneleasy4.add(btneasydone4);
		
		JButton btneasyprevious4 = new JButton("PREV");
		btneasyprevious4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy4, paneleasy3);
			}
		});
		btneasyprevious4.setForeground(Color.WHITE);
		btneasyprevious4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyprevious4.setBackground(new Color(255, 0, 102));
		btneasyprevious4.setBounds(141, 345, 100, 43);
		paneleasy4.add(btneasyprevious4);
		//EASY 4 END
		
		//EASY 5 START
		JButton btneasynext5 = new JButton("NEXT");
		btneasynext5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy5, paneleasy6);
			}
		});
		btneasynext5.setForeground(Color.WHITE);
		btneasynext5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasynext5.setBackground(new Color(255, 0, 102));
		btneasynext5.setBounds(279, 345, 100, 43);
		paneleasy5.add(btneasynext5);
		
		JButton btneasyback5 = new JButton("BACK");
		btneasyback5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy5, paneleasy);
			}
		});
		btneasyback5.setForeground(Color.WHITE);
		btneasyback5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyback5.setBackground(new Color(255, 0, 102));
		btneasyback5.setBounds(0, 345, 100, 43);
		paneleasy5.add(btneasyback5);
		
		JLabel lbeasytitle5 = new JLabel("5/9");
		lbeasytitle5.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasytitle5.setForeground(new Color(0, 204, 255));
		lbeasytitle5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbeasytitle5.setBounds(141, 0, 100, 43);
		paneleasy5.add(lbeasytitle5);
		
		JLabel lbeasyimage5 = new JLabel("");
		lbeasyimage5.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Manchester-City Edited 130x130.png")));
		lbeasyimage5.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyimage5.setForeground(new Color(0, 204, 255));
		lbeasyimage5.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbeasyimage5.setBounds(128, 40, 130, 130);
		paneleasy5.add(lbeasyimage5);
		
		JRadioButton rbeasy5option1 = new JRadioButton("Burnley");
		rbeasy5option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy5option1.setBackground(new Color(0, 204, 255));
		rbeasy5option1.setBounds(23, 196, 109, 23);
		paneleasy5.add(rbeasy5option1);
		
		JRadioButton rbeasy5option3 = new JRadioButton("Man City");
		rbeasy5option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy5option3.setBackground(new Color(0, 204, 255));
		rbeasy5option3.setBounds(23, 242, 109, 23);
		paneleasy5.add(rbeasy5option3);
		
		JRadioButton rbeasy5option2 = new JRadioButton("West Ham Utd");
		rbeasy5option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy5option2.setBackground(new Color(0, 204, 255));
		rbeasy5option2.setBounds(251, 196, 109, 23);
		paneleasy5.add(rbeasy5option2);
		
		JRadioButton rbeasy5option4 = new JRadioButton("Leicester City");
		rbeasy5option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy5option4.setBackground(new Color(0, 204, 255));
		rbeasy5option4.setBounds(251, 242, 109, 23);
		paneleasy5.add(rbeasy5option4);
		
		ButtonGroup bgeasy5 = new ButtonGroup();
		bgeasy5.add(rbeasy5option1);
		bgeasy5.add(rbeasy5option2);
		bgeasy5.add(rbeasy5option3);
		bgeasy5.add(rbeasy5option4);
		
		JLabel lbeasyrequest5 = new JLabel("Choose one answer.");
		lbeasyrequest5.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyrequest5.setForeground(new Color(0, 204, 255));
		lbeasyrequest5.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbeasyrequest5.setBounds(0, 166, 379, 23);
		paneleasy5.add(lbeasyrequest5);
		
		JLabel lbeasyanswer5 = new JLabel("Manchester City");
		lbeasyanswer5.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyanswer5.setForeground(new Color(255, 0, 102));
		lbeasyanswer5.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbeasyanswer5.setBounds(0, 291, 379, 33);
		paneleasy5.add(lbeasyanswer5);
		lbeasyanswer5.setVisible(false);
		
		
		JButton btneasydone5 = new JButton("DONE");
		btneasydone5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.leveleasy(rbeasy5option3, lbeasyimage5, "/Images/EASY/Manchester-City 130x130.png", btneasy5, "/Images/EASY/Manchester-City 100x100.png", paneleasy5, paneleasy6, bgeasy5, btneasydone5, btnmedium, lbeasyrequest5, lbeasyanswer5);
			}
		});
		btneasydone5.setForeground(Color.WHITE);
		btneasydone5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasydone5.setBackground(new Color(255, 0, 102));
		btneasydone5.setBounds(141, 291, 100, 33);
		paneleasy5.add(btneasydone5);
		
		JButton btneasyprevious5 = new JButton("PREV");
		btneasyprevious5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy5, paneleasy4);
			}
		});
		btneasyprevious5.setForeground(Color.WHITE);
		btneasyprevious5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyprevious5.setBackground(new Color(255, 0, 102));
		btneasyprevious5.setBounds(141, 345, 100, 43);
		paneleasy5.add(btneasyprevious5);
		//EASY 5 END
		
		//EASY 6 START
		JButton btneasynext6 = new JButton("NEXT");
		btneasynext6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy6, paneleasy7);
			}
		});
		btneasynext6.setForeground(Color.WHITE);
		btneasynext6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasynext6.setBackground(new Color(255, 0, 102));
		btneasynext6.setBounds(279, 345, 100, 43);
		paneleasy6.add(btneasynext6);
		
		JButton btneasyback6 = new JButton("BACK");
		btneasyback6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy6, paneleasy);
			}
		});
		btneasyback6.setForeground(Color.WHITE);
		btneasyback6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyback6.setBackground(new Color(255, 0, 102));
		btneasyback6.setBounds(0, 345, 100, 43);
		paneleasy6.add(btneasyback6);
		
		JLabel lbeasytitle6 = new JLabel("6/9");
		lbeasytitle6.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasytitle6.setForeground(new Color(0, 204, 255));
		lbeasytitle6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbeasytitle6.setBounds(141, 0, 100, 43);
		paneleasy6.add(lbeasytitle6);
		
		JLabel lbeasyimage6 = new JLabel("");
		lbeasyimage6.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Leicester-City Edited 130x130.png")));
		lbeasyimage6.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyimage6.setForeground(new Color(0, 204, 255));
		lbeasyimage6.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbeasyimage6.setBounds(128, 40, 130, 130);
		paneleasy6.add(lbeasyimage6);
		
		JRadioButton rbeasy6option1 = new JRadioButton("Leicester City");
		rbeasy6option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy6option1.setBackground(new Color(0, 204, 255));
		rbeasy6option1.setBounds(23, 196, 109, 23);
		paneleasy6.add(rbeasy6option1);
		
		JRadioButton rbeasy6option3 = new JRadioButton("Sheffield Utd");
		rbeasy6option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy6option3.setBackground(new Color(0, 204, 255));
		rbeasy6option3.setBounds(23, 242, 109, 23);
		paneleasy6.add(rbeasy6option3);
		
		JRadioButton rbeasy6option2 = new JRadioButton("Leeds Utd");
		rbeasy6option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy6option2.setBackground(new Color(0, 204, 255));
		rbeasy6option2.setBounds(251, 196, 109, 23);
		paneleasy6.add(rbeasy6option2);
		
		JRadioButton rbeasy6option4 = new JRadioButton("Tottenham");
		rbeasy6option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy6option4.setBackground(new Color(0, 204, 255));
		rbeasy6option4.setBounds(251, 242, 109, 23);
		paneleasy6.add(rbeasy6option4);
		
		ButtonGroup bgeasy6 = new ButtonGroup();
		bgeasy6.add(rbeasy6option1);
		bgeasy6.add(rbeasy6option2);
		bgeasy6.add(rbeasy6option3);
		bgeasy6.add(rbeasy6option4);
		
		JLabel lbeasyrequest6 = new JLabel("Choose one answer.");
		lbeasyrequest6.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyrequest6.setForeground(new Color(0, 204, 255));
		lbeasyrequest6.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbeasyrequest6.setBounds(0, 166, 379, 23);
		paneleasy6.add(lbeasyrequest6);
		
		JLabel lbeasyanswer6 = new JLabel("Leicester City");
		lbeasyanswer6.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyanswer6.setForeground(new Color(255, 0, 102));
		lbeasyanswer6.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbeasyanswer6.setBounds(0, 291, 379, 33);
		paneleasy6.add(lbeasyanswer6);
		lbeasyanswer6.setVisible(false);
		
		JButton btneasydone6 = new JButton("DONE");
		btneasydone6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.leveleasy(rbeasy6option1, lbeasyimage6, "/Images/EASY/Leicester-City 130x130.png", btneasy6, "/Images/EASY/Leicester-City 100x100.png", paneleasy6, paneleasy7, bgeasy6, btneasydone6, btnmedium, lbeasyrequest6, lbeasyanswer6);
			}
		});
		btneasydone6.setForeground(Color.WHITE);
		btneasydone6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasydone6.setBackground(new Color(255, 0, 102));
		btneasydone6.setBounds(141, 291, 100, 33);
		paneleasy6.add(btneasydone6);
		
		JButton btneasyprevious6 = new JButton("PREV");
		btneasyprevious6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy6, paneleasy5);
			}
		});
		btneasyprevious6.setForeground(Color.WHITE);
		btneasyprevious6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyprevious6.setBackground(new Color(255, 0, 102));
		btneasyprevious6.setBounds(141, 345, 100, 43);
		paneleasy6.add(btneasyprevious6);
		//EASY 6 END
		
		//EASY 7 START
		JButton btneasynext7 = new JButton("NEXT");
		btneasynext7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy7, paneleasy8);
			}
		});
		btneasynext7.setForeground(Color.WHITE);
		btneasynext7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasynext7.setBackground(new Color(255, 0, 102));
		btneasynext7.setBounds(279, 345, 100, 43);
		paneleasy7.add(btneasynext7);
		
		JButton btneasyback7 = new JButton("BACK");
		btneasyback7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy7, paneleasy);
			}
		});
		btneasyback7.setForeground(Color.WHITE);
		btneasyback7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyback7.setBackground(new Color(255, 0, 102));
		btneasyback7.setBounds(0, 345, 100, 43);
		paneleasy7.add(btneasyback7);
		
		JLabel lbeasytitle7 = new JLabel("7/9");
		lbeasytitle7.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasytitle7.setForeground(new Color(0, 204, 255));
		lbeasytitle7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbeasytitle7.setBounds(141, 0, 100, 43);
		paneleasy7.add(lbeasytitle7);
		
		JLabel lbeasyimage7 = new JLabel("");
		lbeasyimage7.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Fulham-FC Edited 130x130.png")));
		lbeasyimage7.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyimage7.setForeground(new Color(0, 204, 255));
		lbeasyimage7.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbeasyimage7.setBounds(128, 40, 130, 130);
		paneleasy7.add(lbeasyimage7);
		
		JRadioButton rbeasy7option1 = new JRadioButton("Wolves");
		rbeasy7option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy7option1.setBackground(new Color(0, 204, 255));
		rbeasy7option1.setBounds(23, 196, 109, 23);
		paneleasy7.add(rbeasy7option1);
		
		JRadioButton rbeasy7option3 = new JRadioButton("Crystal Palace");
		rbeasy7option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy7option3.setBackground(new Color(0, 204, 255));
		rbeasy7option3.setBounds(23, 242, 109, 23);
		paneleasy7.add(rbeasy7option3);
		
		JRadioButton rbeasy7option2 = new JRadioButton("Brighton");
		rbeasy7option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy7option2.setBackground(new Color(0, 204, 255));
		rbeasy7option2.setBounds(251, 196, 109, 23);
		paneleasy7.add(rbeasy7option2);
		
		JRadioButton rbeasy7option4 = new JRadioButton("Fulham");
		rbeasy7option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy7option4.setBackground(new Color(0, 204, 255));
		rbeasy7option4.setBounds(251, 242, 109, 23);
		paneleasy7.add(rbeasy7option4);
		
		ButtonGroup bgeasy7 = new  ButtonGroup();
		bgeasy7.add(rbeasy7option1);
		bgeasy7.add(rbeasy7option2);
		bgeasy7.add(rbeasy7option3);
		bgeasy7.add(rbeasy7option4);
		
		JLabel lbeasyrequest7 = new JLabel("Choose one answer.");
		lbeasyrequest7.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyrequest7.setForeground(new Color(0, 204, 255));
		lbeasyrequest7.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbeasyrequest7.setBounds(0, 166, 379, 23);
		paneleasy7.add(lbeasyrequest7);
		
		JLabel lbeasyanswer7 = new JLabel("Fulham FC");
		lbeasyanswer7.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyanswer7.setForeground(new Color(255, 0, 102));
		lbeasyanswer7.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbeasyanswer7.setBounds(0, 291, 379, 33);
		paneleasy7.add(lbeasyanswer7);
		lbeasyanswer7.setVisible(false);
		
		JButton btneasydone7 = new JButton("DONE");
		btneasydone7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.leveleasy(rbeasy7option4, lbeasyimage7, "/Images/EASY/Fulham-FC 130x130.png", btneasy7, "/Images/EASY/Fulham-FC 100x100.png", paneleasy7, paneleasy8, bgeasy7, btneasydone7, btnmedium, lbeasyrequest7, lbeasyanswer7);
			}
		});
		btneasydone7.setForeground(Color.WHITE);
		btneasydone7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasydone7.setBackground(new Color(255, 0, 102));
		btneasydone7.setBounds(141, 291, 100, 33);
		paneleasy7.add(btneasydone7);
		
		JButton btneasyprevious7 = new JButton("PREV");
		btneasyprevious7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy7, paneleasy6);
			}
		});
		btneasyprevious7.setForeground(Color.WHITE);
		btneasyprevious7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyprevious7.setBackground(new Color(255, 0, 102));
		btneasyprevious7.setBounds(141, 345, 100, 43);
		paneleasy7.add(btneasyprevious7);
		//EASY 7 END
		
		//EASY 8 START
		JButton btneasynext8 = new JButton("NEXT");
		btneasynext8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy8, paneleasy9);
			}
		});
		btneasynext8.setForeground(Color.WHITE);
		btneasynext8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasynext8.setBackground(new Color(255, 0, 102));
		btneasynext8.setBounds(279, 345, 100, 43);
		paneleasy8.add(btneasynext8);
		
		JButton btneasyback8 = new JButton("BACK");
		btneasyback8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy8, paneleasy);
			}
		});
		btneasyback8.setForeground(Color.WHITE);
		btneasyback8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyback8.setBackground(new Color(255, 0, 102));
		btneasyback8.setBounds(0, 345, 100, 43);
		paneleasy8.add(btneasyback8);
		
		JLabel lbeasytitle8 = new JLabel("8/9");
		lbeasytitle8.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasytitle8.setForeground(new Color(0, 204, 255));
		lbeasytitle8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbeasytitle8.setBounds(141, 0, 100, 43);
		paneleasy8.add(lbeasytitle8);
		
		JLabel lbeasyimage8 = new JLabel("");
		lbeasyimage8.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Everton Edited 130x130.png")));
		lbeasyimage8.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyimage8.setForeground(new Color(0, 204, 255));
		lbeasyimage8.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbeasyimage8.setBounds(128, 40, 130, 130);
		paneleasy8.add(lbeasyimage8);
		
		JRadioButton rbeasy8option1 = new JRadioButton("Everton");
		rbeasy8option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy8option1.setBackground(new Color(0, 204, 255));
		rbeasy8option1.setBounds(23, 196, 109, 23);
		paneleasy8.add(rbeasy8option1);
		
		JRadioButton rbeasy8option3 = new JRadioButton("West Ham Utd");
		rbeasy8option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy8option3.setBackground(new Color(0, 204, 255));
		rbeasy8option3.setBounds(23, 242, 109, 23);
		paneleasy8.add(rbeasy8option3);
		
		JRadioButton rbeasy8option2 = new JRadioButton("Aston Villa");
		rbeasy8option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy8option2.setBackground(new Color(0, 204, 255));
		rbeasy8option2.setBounds(251, 196, 109, 23);
		paneleasy8.add(rbeasy8option2);
		
		JRadioButton rbeasy8option4 = new JRadioButton("Crystal Palace");
		rbeasy8option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy8option4.setBackground(new Color(0, 204, 255));
		rbeasy8option4.setBounds(251, 242, 109, 23);
		paneleasy8.add(rbeasy8option4);
		
		ButtonGroup bgeasy8 = new ButtonGroup();
		bgeasy8.add(rbeasy8option1);
		bgeasy8.add(rbeasy8option2);
		bgeasy8.add(rbeasy8option3);
		bgeasy8.add(rbeasy8option4);
		
		JLabel lbeasyrequest8 = new JLabel("Choose one answer.");
		lbeasyrequest8.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyrequest8.setForeground(new Color(0, 204, 255));
		lbeasyrequest8.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbeasyrequest8.setBounds(0, 166, 379, 23);
		paneleasy8.add(lbeasyrequest8);
		
		JLabel lbeasyanswer8 = new JLabel("Everton");
		lbeasyanswer8.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyanswer8.setForeground(new Color(255, 0, 102));
		lbeasyanswer8.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbeasyanswer8.setBounds(0, 291, 379, 33);
		paneleasy8.add(lbeasyanswer8);
		lbeasyanswer8.setVisible(false);
		
		JButton btneasydone8 = new JButton("DONE");
		btneasydone8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.leveleasy(rbeasy8option1, lbeasyimage8, "/Images/EASY/Everton 130x130.png", btneasy8, "/Images/EASY/Everton 100x100.png", paneleasy8, paneleasy9, bgeasy8, btneasydone8, btnmedium, lbeasyrequest8, lbeasyanswer8);
			}
		});
		btneasydone8.setForeground(Color.WHITE);
		btneasydone8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasydone8.setBackground(new Color(255, 0, 102));
		btneasydone8.setBounds(141, 291, 100, 33);
		paneleasy8.add(btneasydone8);
		
		JButton btneasyprevious8 = new JButton("PREV");
		btneasyprevious8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			Panels.paneltransition(paneleasy8, paneleasy7);
			}
		});
		btneasyprevious8.setForeground(Color.WHITE);
		btneasyprevious8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyprevious8.setBackground(new Color(255, 0, 102));
		btneasyprevious8.setBounds(141, 345, 100, 43);
		paneleasy8.add(btneasyprevious8);
		//EASY 8 END
		
		//EASY 9 START
		JButton btneasyback9 = new JButton("BACK");
		btneasyback9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy9, paneleasy);
			}
		});
		btneasyback9.setForeground(Color.WHITE);
		btneasyback9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyback9.setBackground(new Color(255, 0, 102));
		btneasyback9.setBounds(0, 345, 100, 43);
		paneleasy9.add(btneasyback9);
		
		JLabel lbeasytitle9 = new JLabel("9/9");
		lbeasytitle9.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasytitle9.setForeground(new Color(0, 204, 255));
		lbeasytitle9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbeasytitle9.setBounds(141, 0, 100, 43);
		paneleasy9.add(lbeasytitle9);
		
		JLabel lbeasyimage9 = new JLabel("");
		lbeasyimage9.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/EASY/Southampton-FC Edited 130x130.png")));
		lbeasyimage9.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyimage9.setForeground(new Color(0, 204, 255));
		lbeasyimage9.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbeasyimage9.setBounds(128, 40, 130, 130);
		paneleasy9.add(lbeasyimage9);
		
		JRadioButton rbeasy9option1 = new JRadioButton("Southampton");
		rbeasy9option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy9option1.setBackground(new Color(0, 204, 255));
		rbeasy9option1.setBounds(23, 196, 109, 23);
		paneleasy9.add(rbeasy9option1);
		
		JRadioButton rbeasy9option3 = new JRadioButton("Arsenal");
		rbeasy9option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy9option3.setBackground(new Color(0, 204, 255));
		rbeasy9option3.setBounds(23, 242, 109, 23);
		paneleasy9.add(rbeasy9option3);
		
		JRadioButton rbeasy9option2 = new JRadioButton("Wolves");
		rbeasy9option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy9option2.setBackground(new Color(0, 204, 255));
		rbeasy9option2.setBounds(251, 196, 109, 23);
		paneleasy9.add(rbeasy9option2);
		
		JRadioButton rbeasy9option4 = new JRadioButton("WBA");
		rbeasy9option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbeasy9option4.setBackground(new Color(0, 204, 255));
		rbeasy9option4.setBounds(251, 242, 109, 23);
		paneleasy9.add(rbeasy9option4);
		
		ButtonGroup bgeasy9 = new ButtonGroup();
		bgeasy9.add(rbeasy9option1);
		bgeasy9.add(rbeasy9option2);
		bgeasy9.add(rbeasy9option3);
		bgeasy9.add(rbeasy9option4);
		
		JLabel lbeasyrequest9 = new JLabel("Choose one answer.");
		lbeasyrequest9.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyrequest9.setForeground(new Color(0, 204, 255));
		lbeasyrequest9.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbeasyrequest9.setBounds(0, 166, 379, 23);
		paneleasy9.add(lbeasyrequest9);
		
		JLabel lbeasyanswer9 = new JLabel("Southampton FC");
		lbeasyanswer9.setHorizontalAlignment(SwingConstants.CENTER);
		lbeasyanswer9.setForeground(new Color(255, 0, 102));
		lbeasyanswer9.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbeasyanswer9.setBounds(0, 291, 379, 33);
		paneleasy9.add(lbeasyanswer9);
		lbeasyanswer9.setVisible(false);
		
		JButton btneasydone9 = new JButton("DONE");
		btneasydone9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.leveleasy(rbeasy9option1, lbeasyimage9, "/Images/EASY/Southampton-FC 130x130.png", btneasy9, "/Images/EASY/Southampton-FC 100x100.png", paneleasy9, paneleasy, bgeasy9, btneasydone9, btnmedium, lbeasyrequest9, lbeasyanswer9);
			}
		});
		btneasydone9.setForeground(Color.WHITE);
		btneasydone9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasydone9.setBackground(new Color(255, 0, 102));
		btneasydone9.setBounds(141, 291, 100, 33);
		paneleasy9.add(btneasydone9);
		
		JButton btneasyprevious9 = new JButton("PREV");
		btneasyprevious9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(paneleasy9, paneleasy8);
			}
		});
		btneasyprevious9.setForeground(Color.WHITE);
		btneasyprevious9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btneasyprevious9.setBackground(new Color(255, 0, 102));
		btneasyprevious9.setBounds(141, 345, 100, 43);
		paneleasy9.add(btneasyprevious9);
		////EASY 9 END
		
		//MEDIUM 1 START
		JButton btnmediumnext1 = new JButton("NEXT");
		btnmediumnext1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium1, panelmedium2);
			}
		});
		btnmediumnext1.setForeground(Color.WHITE);
		btnmediumnext1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumnext1.setBackground(new Color(255, 0, 102));
		btnmediumnext1.setBounds(279, 345, 100, 43);
		panelmedium1.add(btnmediumnext1);
		
		JButton btnmediumback1 = new JButton("BACK");
		btnmediumback1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium1, panelmedium);
			}
		});
		btnmediumback1.setForeground(Color.WHITE);
		btnmediumback1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumback1.setBackground(new Color(255, 0, 102));
		btnmediumback1.setBounds(0, 345, 100, 43);
		panelmedium1.add(btnmediumback1);
		
		JLabel lbmediumtitle1 = new JLabel("1/9");
		lbmediumtitle1.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumtitle1.setForeground(new Color(0, 204, 255));
		lbmediumtitle1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbmediumtitle1.setBounds(141, 0, 100, 43);
		panelmedium1.add(lbmediumtitle1);
		
		JLabel lbmediumimage1 = new JLabel("");
		lbmediumimage1.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Birmingham-City Edited 130x130.png")));
		lbmediumimage1.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumimage1.setForeground(new Color(0, 204, 255));
		lbmediumimage1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbmediumimage1.setBounds(128, 40, 130, 130);
		panelmedium1.add(lbmediumimage1);
		
		JRadioButton rbmedium1option1 = new JRadioButton("Birmingham");
		rbmedium1option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium1option1.setBackground(new Color(0, 204, 255));
		rbmedium1option1.setBounds(23, 196, 109, 23);
		panelmedium1.add(rbmedium1option1);
		
		JRadioButton rbmedium1option3 = new JRadioButton("Bristol");
		rbmedium1option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium1option3.setBackground(new Color(0, 204, 255));
		rbmedium1option3.setBounds(23, 242, 109, 23);
		panelmedium1.add(rbmedium1option3);
		
		ButtonGroup bgmedium11 = new ButtonGroup();
		bgmedium11.add(rbmedium1option1);
		bgmedium11.add(rbmedium1option3);
		
		JRadioButton rbmedium1option2 = new JRadioButton("City");
		rbmedium1option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium1option2.setBackground(new Color(0, 204, 255));
		rbmedium1option2.setBounds(251, 196, 109, 23);
		panelmedium1.add(rbmedium1option2);
		
		JRadioButton rbmedium1option4 = new JRadioButton("Utd");
		rbmedium1option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium1option4.setBackground(new Color(0, 204, 255));
		rbmedium1option4.setBounds(251, 242, 109, 23);
		panelmedium1.add(rbmedium1option4);
		
		ButtonGroup bgmedium12 = new ButtonGroup();
		bgmedium12.add(rbmedium1option2);
		bgmedium12.add(rbmedium1option4);
		
		JLabel lbmediumrequest1 = new JLabel("Merge the club name.");
		lbmediumrequest1.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumrequest1.setForeground(new Color(0, 204, 255));
		lbmediumrequest1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbmediumrequest1.setBounds(0, 166, 379, 23);
		panelmedium1.add(lbmediumrequest1);
		
		JLabel lbmediumanswer1 = new JLabel("Birmingham City");
		lbmediumanswer1.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumanswer1.setForeground(new Color(255, 0, 102));
		lbmediumanswer1.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbmediumanswer1.setBounds(0, 291, 379, 33);
		panelmedium1.add(lbmediumanswer1);
		lbmediumanswer1.setVisible(false);
		
		JButton btnmediumdone1 = new JButton("DONE");
		btnmediumdone1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelmedium(rbmedium1option1, rbmedium1option2, lbmediumimage1, "/Images/MEDIUM/Birmingham-City 130x130.png", btnmedium1, "/Images/MEDIUM/Birmingham-City 100x100.png", panelmedium1, panelmedium2, bgmedium11, bgmedium12, btnmediumdone1, btnhard, lbmediumrequest1, lbmediumanswer1);
			}
		});
		btnmediumdone1.setForeground(Color.WHITE);
		btnmediumdone1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumdone1.setBackground(new Color(255, 0, 102));
		btnmediumdone1.setBounds(141, 291, 100, 33);
		panelmedium1.add(btnmediumdone1);
		//MEDIUM 1 END
		
		//MEDIUM 2 START
		JButton btnmediumnext2 = new JButton("NEXT");
		btnmediumnext2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium2, panelmedium3);
			}
		});
		btnmediumnext2.setForeground(Color.WHITE);
		btnmediumnext2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumnext2.setBackground(new Color(255, 0, 102));
		btnmediumnext2.setBounds(279, 345, 100, 43);
		panelmedium2.add(btnmediumnext2);
		
		JButton btnmediumback2 = new JButton("BACK");
		btnmediumback2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium2, panelmedium);
			}
		});
		btnmediumback2.setForeground(Color.WHITE);
		btnmediumback2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumback2.setBackground(new Color(255, 0, 102));
		btnmediumback2.setBounds(0, 345, 100, 43);
		panelmedium2.add(btnmediumback2);
		
		JLabel lbmediumtitle2 = new JLabel("2/9");
		lbmediumtitle2.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumtitle2.setForeground(new Color(0, 204, 255));
		lbmediumtitle2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbmediumtitle2.setBounds(141, 0, 100, 43);
		panelmedium2.add(lbmediumtitle2);
		
		JLabel lbmediumimage2 = new JLabel("");
		lbmediumimage2.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Newcastle-United Edited 130x130.png")));
		lbmediumimage2.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumimage2.setForeground(new Color(0, 204, 255));
		lbmediumimage2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbmediumimage2.setBounds(128, 40, 130, 130);
		panelmedium2.add(lbmediumimage2);
		
		JRadioButton rbmedium2option1 = new JRadioButton("Sheffield");
		rbmedium2option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium2option1.setBackground(new Color(0, 204, 255));
		rbmedium2option1.setBounds(23, 196, 109, 23);
		panelmedium2.add(rbmedium2option1);
		
		JRadioButton rbmedium2option3 = new JRadioButton("Newcastle");
		rbmedium2option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium2option3.setBackground(new Color(0, 204, 255));
		rbmedium2option3.setBounds(23, 242, 109, 23);
		panelmedium2.add(rbmedium2option3);
		
		ButtonGroup bgmedium21 = new ButtonGroup();
		bgmedium21.add(rbmedium2option1);
		bgmedium21.add(rbmedium2option3);
		
		JRadioButton rbmedium2option2 = new JRadioButton("Utd");
		rbmedium2option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium2option2.setBackground(new Color(0, 204, 255));
		rbmedium2option2.setBounds(251, 196, 109, 23);
		panelmedium2.add(rbmedium2option2);
		
		JRadioButton rbmedium2option4 = new JRadioButton("City");
		rbmedium2option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium2option4.setBackground(new Color(0, 204, 255));
		rbmedium2option4.setBounds(251, 242, 109, 23);
		panelmedium2.add(rbmedium2option4);
		
		ButtonGroup bgmedium22 = new ButtonGroup();
		bgmedium22.add(rbmedium2option2);
		bgmedium22.add(rbmedium2option4);
		
		JLabel lbmediumrequest2 = new JLabel("Merge the club name.");
		lbmediumrequest2.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumrequest2.setForeground(new Color(0, 204, 255));
		lbmediumrequest2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbmediumrequest2.setBounds(0, 166, 379, 23);
		panelmedium2.add(lbmediumrequest2);
		
		JLabel lbmediumanswer2 = new JLabel("Newcastle United");
		lbmediumanswer2.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumanswer2.setForeground(new Color(255, 0, 102));
		lbmediumanswer2.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbmediumanswer2.setBounds(0, 291, 379, 33);
		panelmedium2.add(lbmediumanswer2);
		lbmediumanswer2.setVisible(false);
		
		JButton btnmediumdone2 = new JButton("DONE");
		btnmediumdone2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelmedium(rbmedium2option3, rbmedium2option2, lbmediumimage2, "/Images/MEDIUM/Newcastle-United 130x130.png", btnmedium2, "/Images/MEDIUM/Newcastle-United 100x100.png", panelmedium2, panelmedium3, bgmedium21, bgmedium22, btnmediumdone2, btnhard, lbmediumrequest2, lbmediumanswer2);
			}
		});
		btnmediumdone2.setForeground(Color.WHITE);
		btnmediumdone2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumdone2.setBackground(new Color(255, 0, 102));
		btnmediumdone2.setBounds(141, 291, 100, 33);
		panelmedium2.add(btnmediumdone2);
		
		JButton btnmediumprevious2 = new JButton("PREV");
		btnmediumprevious2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium2, panelmedium1);
			}
		});
		btnmediumprevious2.setForeground(Color.WHITE);
		btnmediumprevious2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumprevious2.setBackground(new Color(255, 0, 102));
		btnmediumprevious2.setBounds(141, 345, 100, 43);
		panelmedium2.add(btnmediumprevious2);
		//MEDIUM 2 END
		
		//MEDIUM 3 START
		JButton btnmediumnext3 = new JButton("NEXT");
		btnmediumnext3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium3, panelmedium4);
			}
		});
		btnmediumnext3.setForeground(Color.WHITE);
		btnmediumnext3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumnext3.setBackground(new Color(255, 0, 102));
		btnmediumnext3.setBounds(279, 345, 100, 43);
		panelmedium3.add(btnmediumnext3);
		
		JButton btnmediumback3 = new JButton("BACK");
		btnmediumback3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium3, panelmedium);
			}
		});
		btnmediumback3.setForeground(Color.WHITE);
		btnmediumback3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumback3.setBackground(new Color(255, 0, 102));
		btnmediumback3.setBounds(0, 345, 100, 43);
		panelmedium3.add(btnmediumback3);
		
		JLabel lbmediumtitle3 = new JLabel("3/9");
		lbmediumtitle3.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumtitle3.setForeground(new Color(0, 204, 255));
		lbmediumtitle3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbmediumtitle3.setBounds(141, 0, 100, 43);
		panelmedium3.add(lbmediumtitle3);
		
		JLabel lbmediumimage3 = new JLabel("");
		lbmediumimage3.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Blackburn-Rovers Edited 130x130.png")));
		lbmediumimage3.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumimage3.setForeground(new Color(0, 204, 255));
		lbmediumimage3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbmediumimage3.setBounds(128, 40, 130, 130);
		panelmedium3.add(lbmediumimage3);
		
		JRadioButton rbmedium3option1 = new JRadioButton("Blackburn");
		rbmedium3option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium3option1.setBackground(new Color(0, 204, 255));
		rbmedium3option1.setBounds(23, 196, 109, 23);
		panelmedium3.add(rbmedium3option1);
		
		JRadioButton rbmedium3option3 = new JRadioButton("Blackpool");
		rbmedium3option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium3option3.setBackground(new Color(0, 204, 255));
		rbmedium3option3.setBounds(23, 242, 109, 23);
		panelmedium3.add(rbmedium3option3);
		
		ButtonGroup bgmedium31 = new ButtonGroup();
		bgmedium31.add(rbmedium3option1);
		bgmedium31.add(rbmedium3option3);
		
		JRadioButton rbmedium3option2 = new JRadioButton("Rovers");
		rbmedium3option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium3option2.setBackground(new Color(0, 204, 255));
		rbmedium3option2.setBounds(251, 196, 109, 23);
		panelmedium3.add(rbmedium3option2);
		
		JRadioButton rbmedium3option4 = new JRadioButton("Utd");
		rbmedium3option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium3option4.setBackground(new Color(0, 204, 255));
		rbmedium3option4.setBounds(251, 242, 109, 23);
		panelmedium3.add(rbmedium3option4);
		
		ButtonGroup bgmedium32 = new ButtonGroup();
		bgmedium32.add(rbmedium3option2);
		bgmedium32.add(rbmedium3option4);
		
		JLabel lbmediumrequest3 = new JLabel("Merge the club name.");
		lbmediumrequest3.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumrequest3.setForeground(new Color(0, 204, 255));
		lbmediumrequest3.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbmediumrequest3.setBounds(0, 166, 379, 23);
		panelmedium3.add(lbmediumrequest3);
		
		JLabel lbmediumanswer3 = new JLabel("Blackburn Rovers");
		lbmediumanswer3.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumanswer3.setForeground(new Color(255, 0, 102));
		lbmediumanswer3.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbmediumanswer3.setBounds(0, 291, 379, 33);
		panelmedium3.add(lbmediumanswer3);
		lbmediumanswer3.setVisible(false);
		
		JButton btnmediumdone3 = new JButton("DONE");
		btnmediumdone3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelmedium(rbmedium3option1, rbmedium3option2, lbmediumimage3, "/Images/MEDIUM/Blackburn-Rovers 130x130.png", btnmedium3, "/Images/MEDIUM/Blackburn-Rovers 100x100.png", panelmedium3, panelmedium4, bgmedium31, bgmedium32, btnmediumdone3, btnhard, lbmediumrequest3, lbmediumanswer3);
			}
		});
		btnmediumdone3.setForeground(Color.WHITE);
		btnmediumdone3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumdone3.setBackground(new Color(255, 0, 102));
		btnmediumdone3.setBounds(141, 291, 100, 33);
		panelmedium3.add(btnmediumdone3);
	
		JButton btnmediumprevious3 = new JButton("PREV");
		btnmediumprevious3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium3, panelmedium2);
			}
		});
		btnmediumprevious3.setForeground(Color.WHITE);
		btnmediumprevious3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumprevious3.setBackground(new Color(255, 0, 102));
		btnmediumprevious3.setBounds(141, 345, 100, 43);
		panelmedium3.add(btnmediumprevious3);
		//MEDIUM 3 END
		
		//MEDIUM 4 START
		JButton btnmediumnext4 = new JButton("NEXT");
		btnmediumnext4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium4, panelmedium5);
			}
		});
		btnmediumnext4.setForeground(Color.WHITE);
		btnmediumnext4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumnext4.setBackground(new Color(255, 0, 102));
		btnmediumnext4.setBounds(279, 345, 100, 43);
		panelmedium4.add(btnmediumnext4);
		
		JButton btnmediumback4 = new JButton("BACK");
		btnmediumback4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium4, panelmedium);
			}
		});
		btnmediumback4.setForeground(Color.WHITE);
		btnmediumback4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumback4.setBackground(new Color(255, 0, 102));
		btnmediumback4.setBounds(0, 345, 100, 43);
		panelmedium4.add(btnmediumback4);
		
		JLabel lbmediumtitle4 = new JLabel("4/9");
		lbmediumtitle4.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumtitle4.setForeground(new Color(0, 204, 255));
		lbmediumtitle4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbmediumtitle4.setBounds(141, 0, 100, 43);
		panelmedium4.add(lbmediumtitle4);
		
		JLabel lbmediumimage4 = new JLabel("");
		lbmediumimage4.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/West-Ham-United Edited 130x130.png")));
		lbmediumimage4.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumimage4.setForeground(new Color(0, 204, 255));
		lbmediumimage4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbmediumimage4.setBounds(128, 40, 130, 130);
		panelmedium4.add(lbmediumimage4);
		
		JRadioButton rbmedium4option1 = new JRadioButton("West Brom");
		rbmedium4option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium4option1.setBackground(new Color(0, 204, 255));
		rbmedium4option1.setBounds(23, 196, 109, 23);
		panelmedium4.add(rbmedium4option1);
		
		JRadioButton rbmedium4option3 = new JRadioButton("West Ham");
		rbmedium4option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium4option3.setBackground(new Color(0, 204, 255));
		rbmedium4option3.setBounds(23, 242, 109, 23);
		panelmedium4.add(rbmedium4option3);
		
		ButtonGroup bgmedium41 = new ButtonGroup();
		bgmedium41.add(rbmedium4option1);
		bgmedium41.add(rbmedium4option3);
		
		JRadioButton rbmedium4option2 = new JRadioButton("Albion");
		rbmedium4option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium4option2.setBackground(new Color(0, 204, 255));
		rbmedium4option2.setBounds(251, 196, 109, 23);
		panelmedium4.add(rbmedium4option2);
		
		JRadioButton rbmedium4option4 = new JRadioButton("Utd");
		rbmedium4option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium4option4.setBackground(new Color(0, 204, 255));
		rbmedium4option4.setBounds(251, 242, 109, 23);
		panelmedium4.add(rbmedium4option4);
		
		ButtonGroup bgmedium42 = new ButtonGroup();
		bgmedium42.add(rbmedium4option2);
		bgmedium42.add(rbmedium4option4);
		
		JLabel lbmediumrequest4 = new JLabel("Merge the club name.");
		lbmediumrequest4.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumrequest4.setForeground(new Color(0, 204, 255));
		lbmediumrequest4.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbmediumrequest4.setBounds(0, 166, 379, 23);
		panelmedium4.add(lbmediumrequest4);
		
		JLabel lbmediumanswer4 = new JLabel("West Ham United");
		lbmediumanswer4.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumanswer4.setForeground(new Color(255, 0, 102));
		lbmediumanswer4.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbmediumanswer4.setBounds(0, 291, 379, 33);
		panelmedium4.add(lbmediumanswer4);
		lbmediumanswer4.setVisible(false);
		
		JButton btnmediumdone4 = new JButton("DONE");
		btnmediumdone4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelmedium(rbmedium4option3, rbmedium4option4, lbmediumimage4, "/Images/MEDIUM/West-Ham-United 130x130.png", btnmedium4, "/Images/MEDIUM/West-Ham-United 100x100.png", panelmedium4, panelmedium5, bgmedium41, bgmedium42, btnmediumdone4, btnhard, lbmediumrequest4, lbmediumanswer4);
			}
		});
		btnmediumdone4.setForeground(Color.WHITE);
		btnmediumdone4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumdone4.setBackground(new Color(255, 0, 102));
		btnmediumdone4.setBounds(141, 291, 100, 33);
		panelmedium4.add(btnmediumdone4);
		
		JButton btnmediumprevious4 = new JButton("PREV");
		btnmediumprevious4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium4, panelmedium3);
			}
		});
		btnmediumprevious4.setForeground(Color.WHITE);
		btnmediumprevious4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumprevious4.setBackground(new Color(255, 0, 102));
		btnmediumprevious4.setBounds(141, 345, 100, 43);
		panelmedium4.add(btnmediumprevious4);
		//MEDIUM 4 END
		
		////MEDIUM 5 START
		JButton btnmediumnext5 = new JButton("NEXT");
		btnmediumnext5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium5, panelmedium6);
			}
		});
		btnmediumnext5.setForeground(Color.WHITE);
		btnmediumnext5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumnext5.setBackground(new Color(255, 0, 102));
		btnmediumnext5.setBounds(279, 345, 100, 43);
		panelmedium5.add(btnmediumnext5);
		
		JButton btnmediumback5 = new JButton("BACK");
		btnmediumback5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium5, panelmedium);
			}
		});
		btnmediumback5.setForeground(Color.WHITE);
		btnmediumback5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumback5.setBackground(new Color(255, 0, 102));
		btnmediumback5.setBounds(0, 345, 100, 43);
		panelmedium5.add(btnmediumback5);
		
		JLabel lbmediumtitle5 = new JLabel("5/9");
		lbmediumtitle5.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumtitle5.setForeground(new Color(0, 204, 255));
		lbmediumtitle5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbmediumtitle5.setBounds(141, 0, 100, 43);
		panelmedium5.add(lbmediumtitle5);
		
		JLabel lbmediumimage5 = new JLabel("");
		lbmediumimage5.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Hull-City Edited 130x130.png")));
		lbmediumimage5.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumimage5.setForeground(new Color(0, 204, 255));
		lbmediumimage5.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbmediumimage5.setBounds(128, 40, 130, 130);
		panelmedium5.add(lbmediumimage5);
		
		JRadioButton rbmedium5option1 = new JRadioButton("Hull");
		rbmedium5option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium5option1.setBackground(new Color(0, 204, 255));
		rbmedium5option1.setBounds(23, 196, 109, 23);
		panelmedium5.add(rbmedium5option1);
		
		JRadioButton rbmedium5option3 = new JRadioButton("Cardiff");
		rbmedium5option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium5option3.setBackground(new Color(0, 204, 255));
		rbmedium5option3.setBounds(23, 242, 109, 23);
		panelmedium5.add(rbmedium5option3);
		
		ButtonGroup bgmedium51 = new ButtonGroup();
		bgmedium51.add(rbmedium5option1);
		bgmedium51.add(rbmedium5option3);
		
		JRadioButton rbmedium5option2 = new JRadioButton("Athletic");
		rbmedium5option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium5option2.setBackground(new Color(0, 204, 255));
		rbmedium5option2.setBounds(251, 196, 109, 23);
		panelmedium5.add(rbmedium5option2);
		
		JRadioButton rbmedium5option4 = new JRadioButton("City");
		rbmedium5option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium5option4.setBackground(new Color(0, 204, 255));
		rbmedium5option4.setBounds(251, 242, 109, 23);
		panelmedium5.add(rbmedium5option4);
		
		ButtonGroup bgmedium52 = new ButtonGroup();
		bgmedium52.add(rbmedium5option2);
		bgmedium52.add(rbmedium5option4);
		
		JLabel lbmediumrequest5 = new JLabel("Merge the club name.");
		lbmediumrequest5.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumrequest5.setForeground(new Color(0, 204, 255));
		lbmediumrequest5.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbmediumrequest5.setBounds(0, 166, 379, 23);
		panelmedium5.add(lbmediumrequest5);
		
		JLabel lbmediumanswer5 = new JLabel("Hull City");
		lbmediumanswer5.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumanswer5.setForeground(new Color(255, 0, 102));
		lbmediumanswer5.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbmediumanswer5.setBounds(0, 291, 379, 33);
		panelmedium5.add(lbmediumanswer5);
		lbmediumanswer5.setVisible(false);
		
		JButton btnmediumdone5 = new JButton("DONE");
		btnmediumdone5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelmedium(rbmedium5option1, rbmedium5option4, lbmediumimage5, "/Images/MEDIUM/Hull-City 130x130.png", btnmedium5, "/Images/MEDIUM/Hull-City 100x100.png", panelmedium5, panelmedium6, bgmedium51, bgmedium52, btnmediumdone5, btnhard, lbmediumrequest5, lbmediumanswer5);
			}
		});
		btnmediumdone5.setForeground(Color.WHITE);
		btnmediumdone5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumdone5.setBackground(new Color(255, 0, 102));
		btnmediumdone5.setBounds(141, 291, 100, 33);
		panelmedium5.add(btnmediumdone5);
		
		JButton btnmediumprevious5 = new JButton("PREV");
		btnmediumprevious5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium5, panelmedium4);
			}
		});
		btnmediumprevious5.setForeground(Color.WHITE);
		btnmediumprevious5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumprevious5.setBackground(new Color(255, 0, 102));
		btnmediumprevious5.setBounds(141, 345, 100, 43);
		panelmedium5.add(btnmediumprevious5);
		//MEDIUM 5 END
		
		//MEDIUM 6 START
		JButton btnmediumnext6 = new JButton("NEXT");
		btnmediumnext6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium6, panelmedium7);
			}
		});
		btnmediumnext6.setForeground(Color.WHITE);
		btnmediumnext6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumnext6.setBackground(new Color(255, 0, 102));
		btnmediumnext6.setBounds(279, 345, 100, 43);
		panelmedium6.add(btnmediumnext6);
		
		JButton btnmediumback6 = new JButton("BACK");
		btnmediumback6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium6, panelmedium);
			}
		});
		btnmediumback6.setForeground(Color.WHITE);
		btnmediumback6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumback6.setBackground(new Color(255, 0, 102));
		btnmediumback6.setBounds(0, 345, 100, 43);
		panelmedium6.add(btnmediumback6);
		
		JLabel lbmediumtitle6 = new JLabel("6/9");
		lbmediumtitle6.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumtitle6.setForeground(new Color(0, 204, 255));
		lbmediumtitle6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbmediumtitle6.setBounds(141, 0, 100, 43);
		panelmedium6.add(lbmediumtitle6);
		
		JLabel lbmediumimage6 = new JLabel("");
		lbmediumimage6.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Norwich-City Edited 130x130.png")));
		lbmediumimage6.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumimage6.setForeground(new Color(0, 204, 255));
		lbmediumimage6.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbmediumimage6.setBounds(128, 40, 130, 130);
		panelmedium6.add(lbmediumimage6);
		
		JRadioButton rbmedium6option1 = new JRadioButton("Swansea");
		rbmedium6option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium6option1.setBackground(new Color(0, 204, 255));
		rbmedium6option1.setBounds(23, 196, 109, 23);
		panelmedium6.add(rbmedium6option1);
		
		JRadioButton rbmedium6option3 = new JRadioButton("Norwich");
		rbmedium6option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium6option3.setBackground(new Color(0, 204, 255));
		rbmedium6option3.setBounds(23, 242, 109, 23);
		panelmedium6.add(rbmedium6option3);
		
		ButtonGroup bgmedium61 = new ButtonGroup();
		bgmedium61.add(rbmedium6option1);
		bgmedium61.add(rbmedium6option3);
		
		JRadioButton rbmedium6option2 = new JRadioButton("City");
		rbmedium6option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium6option2.setBackground(new Color(0, 204, 255));
		rbmedium6option2.setBounds(251, 196, 109, 23);
		panelmedium6.add(rbmedium6option2);
		
		JRadioButton rbmedium6option4 = new JRadioButton("Utd");
		rbmedium6option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium6option4.setBackground(new Color(0, 204, 255));
		rbmedium6option4.setBounds(251, 242, 109, 23);
		panelmedium6.add(rbmedium6option4);
		
		ButtonGroup bgmedium62 = new ButtonGroup();
		bgmedium62.add(rbmedium6option2);
		bgmedium62.add(rbmedium6option4);
		
		JLabel lbmediumrequest6 = new JLabel("Merge the club name.");
		lbmediumrequest6.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumrequest6.setForeground(new Color(0, 204, 255));
		lbmediumrequest6.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbmediumrequest6.setBounds(0, 166, 379, 23);
		panelmedium6.add(lbmediumrequest6);
		
		JLabel lbmediumanswer6 = new JLabel("Norwich City");
		lbmediumanswer6.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumanswer6.setForeground(new Color(255, 0, 102));
		lbmediumanswer6.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbmediumanswer6.setBounds(0, 291, 379, 33);
		panelmedium6.add(lbmediumanswer6);
		lbmediumanswer6.setVisible(false);
		
		JButton btnmediumdone6 = new JButton("DONE");
		btnmediumdone6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelmedium(rbmedium6option3, rbmedium6option2, lbmediumimage6, "/Images/MEDIUM/Norwich-City 130x130.png", btnmedium6, "/Images/MEDIUM/Norwich-City 100x100.png", panelmedium6, panelmedium7, bgmedium61, bgmedium62, btnmediumdone6, btnhard, lbmediumrequest6, lbmediumanswer6);
			}
		});
		btnmediumdone6.setForeground(Color.WHITE);
		btnmediumdone6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumdone6.setBackground(new Color(255, 0, 102));
		btnmediumdone6.setBounds(141, 291, 100, 33);
		panelmedium6.add(btnmediumdone6);
		
		JButton btnmediumprevious6 = new JButton("PREV");
		btnmediumprevious6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium6, panelmedium5);
			}
		});
		btnmediumprevious6.setForeground(Color.WHITE);
		btnmediumprevious6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumprevious6.setBackground(new Color(255, 0, 102));
		btnmediumprevious6.setBounds(141, 345, 100, 43);
		panelmedium6.add(btnmediumprevious6);
		//MEDIUM 6 END
		
		//MEDIUM 7 START
		JButton btnmediumnext7 = new JButton("NEXT");
		btnmediumnext7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium7, panelmedium8);
			}
		});
		btnmediumnext7.setForeground(Color.WHITE);
		btnmediumnext7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumnext7.setBackground(new Color(255, 0, 102));
		btnmediumnext7.setBounds(279, 345, 100, 43);
		panelmedium7.add(btnmediumnext7);
		
		JButton btnmediumback7 = new JButton("BACK");
		btnmediumback7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium7, panelmedium);
			}
		});
		btnmediumback7.setForeground(Color.WHITE);
		btnmediumback7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumback7.setBackground(new Color(255, 0, 102));
		btnmediumback7.setBounds(0, 345, 100, 43);
		panelmedium7.add(btnmediumback7);
		
		JLabel lbmediumtitle7 = new JLabel("7/9");
		lbmediumtitle7.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumtitle7.setForeground(new Color(0, 204, 255));
		lbmediumtitle7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbmediumtitle7.setBounds(141, 0, 100, 43);
		panelmedium7.add(lbmediumtitle7);
		
		JLabel lbmediumimage7 = new JLabel("");
		lbmediumimage7.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Queens-Park-Rangers Edited 130x130.png")));
		lbmediumimage7.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumimage7.setForeground(new Color(0, 204, 255));
		lbmediumimage7.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbmediumimage7.setBounds(128, 40, 130, 130);
		panelmedium7.add(lbmediumimage7);
		
		JRadioButton rbmedium7option1 = new JRadioButton("Quens Park");
		rbmedium7option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium7option1.setBackground(new Color(0, 204, 255));
		rbmedium7option1.setBounds(23, 196, 109, 23);
		panelmedium7.add(rbmedium7option1);
		
		JRadioButton rbmedium7option3 = new JRadioButton("Derby");
		rbmedium7option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium7option3.setBackground(new Color(0, 204, 255));
		rbmedium7option3.setBounds(23, 242, 109, 23);
		panelmedium7.add(rbmedium7option3);
		
		ButtonGroup bgmedium71 = new ButtonGroup();
		bgmedium71.add(rbmedium7option1);
		bgmedium71.add(rbmedium7option3);
		
		JRadioButton rbmedium7option2 = new JRadioButton("County");
		rbmedium7option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium7option2.setBackground(new Color(0, 204, 255));
		rbmedium7option2.setBounds(251, 196, 109, 23);
		panelmedium7.add(rbmedium7option2);
		
		JRadioButton rbmedium7option4 = new JRadioButton("Rangers");
		rbmedium7option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium7option4.setBackground(new Color(0, 204, 255));
		rbmedium7option4.setBounds(251, 242, 109, 23);
		panelmedium7.add(rbmedium7option4);
		
		ButtonGroup bgmedium72 = new ButtonGroup();
		bgmedium72.add(rbmedium7option2);
		bgmedium72.add(rbmedium7option4);
		
		JLabel lbmediumrequest7 = new JLabel("Merge the club name.");
		lbmediumrequest7.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumrequest7.setForeground(new Color(0, 204, 255));
		lbmediumrequest7.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbmediumrequest7.setBounds(0, 166, 379, 23);
		panelmedium7.add(lbmediumrequest7);
		
		JLabel lbmediumanswer7 = new JLabel("Queens Park Rangers");
		lbmediumanswer7.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumanswer7.setForeground(new Color(255, 0, 102));
		lbmediumanswer7.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbmediumanswer7.setBounds(0, 291, 379, 33);
		panelmedium7.add(lbmediumanswer7);
		lbmediumanswer7.setVisible(false);
		
		JButton btnmediumdone7 = new JButton("DONE");
		btnmediumdone7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelmedium(rbmedium7option1, rbmedium7option4, lbmediumimage7, "/Images/MEDIUM/Queens-Park-Rangers 130x130.png", btnmedium7, "/Images/MEDIUM/Queens-Park-Rangers 100x100.png", panelmedium7, panelmedium8, bgmedium71, bgmedium72, btnmediumdone7, btnhard, lbmediumrequest7, lbmediumanswer7);
			}
		});
		btnmediumdone7.setForeground(Color.WHITE);
		btnmediumdone7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumdone7.setBackground(new Color(255, 0, 102));
		btnmediumdone7.setBounds(141, 291, 100, 33);
		panelmedium7.add(btnmediumdone7);
		
		JButton btnmediumprevious7 = new JButton("PREV");
		btnmediumprevious7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium7, panelmedium6);
			}
		});
		btnmediumprevious7.setForeground(Color.WHITE);
		btnmediumprevious7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumprevious7.setBackground(new Color(255, 0, 102));
		btnmediumprevious7.setBounds(141, 345, 100, 43);
		panelmedium7.add(btnmediumprevious7);
		//MEDIUM 7 END
		
		//MEDIUM 8 START
		JButton btnmediumnext8 = new JButton("NEXT");
		btnmediumnext8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium8, panelmedium9);
			}
		});
		btnmediumnext8.setForeground(Color.WHITE);
		btnmediumnext8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumnext8.setBackground(new Color(255, 0, 102));
		btnmediumnext8.setBounds(279, 345, 100, 43);
		panelmedium8.add(btnmediumnext8);
		
		JButton btnmediumback8 = new JButton("BACK");
		btnmediumback8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium8, panelmedium);
			}
		});
		btnmediumback8.setForeground(Color.WHITE);
		btnmediumback8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumback8.setBackground(new Color(255, 0, 102));
		btnmediumback8.setBounds(0, 345, 100, 43);
		panelmedium8.add(btnmediumback8);
		
		JLabel lbmediumtitle8 = new JLabel("8/9");
		lbmediumtitle8.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumtitle8.setForeground(new Color(0, 204, 255));
		lbmediumtitle8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbmediumtitle8.setBounds(141, 0, 100, 43);
		panelmedium8.add(lbmediumtitle8);
		
		JLabel lbmediumimage8 = new JLabel("");
		lbmediumimage8.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Stoke-City Edited 130x130.png")));
		lbmediumimage8.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumimage8.setForeground(new Color(0, 204, 255));
		lbmediumimage8.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbmediumimage8.setBounds(128, 40, 130, 130);
		panelmedium8.add(lbmediumimage8);
		
		JRadioButton rbmedium8option1 = new JRadioButton("Stoke");
		rbmedium8option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium8option1.setBackground(new Color(0, 204, 255));
		rbmedium8option1.setBounds(23, 196, 109, 23);
		panelmedium8.add(rbmedium8option1);
		
		JRadioButton rbmedium8option3 = new JRadioButton("Swansea");
		rbmedium8option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium8option3.setBackground(new Color(0, 204, 255));
		rbmedium8option3.setBounds(23, 242, 109, 23);
		panelmedium8.add(rbmedium8option3);
		
		ButtonGroup bgmedium81 = new ButtonGroup();
		bgmedium81.add(rbmedium8option1);
		bgmedium81.add(rbmedium8option3);
		
		JRadioButton rbmedium8option2 = new JRadioButton("City");
		rbmedium8option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium8option2.setBackground(new Color(0, 204, 255));
		rbmedium8option2.setBounds(251, 196, 109, 23);
		panelmedium8.add(rbmedium8option2);
		
		JRadioButton rbmedium8option4 = new JRadioButton("Utd");
		rbmedium8option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium8option4.setBackground(new Color(0, 204, 255));
		rbmedium8option4.setBounds(251, 242, 109, 23);
		panelmedium8.add(rbmedium8option4);
		
		ButtonGroup bgmedium82 = new ButtonGroup();
		bgmedium82.add(rbmedium8option2);
		bgmedium82.add(rbmedium8option4);
		
		JLabel lbmediumrequest8 = new JLabel("Merge the club name.");
		lbmediumrequest8.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumrequest8.setForeground(new Color(0, 204, 255));
		lbmediumrequest8.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbmediumrequest8.setBounds(0, 166, 379, 23);
		panelmedium8.add(lbmediumrequest8);
		
		JLabel lbmediumanswer8 = new JLabel("Stoke City");
		lbmediumanswer8.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumanswer8.setForeground(new Color(255, 0, 102));
		lbmediumanswer8.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbmediumanswer8.setBounds(0, 291, 379, 33);
		panelmedium8.add(lbmediumanswer8);
		lbmediumanswer8.setVisible(false);
		
		JButton btnmediumdone8 = new JButton("DONE");
		btnmediumdone8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelmedium(rbmedium8option1, rbmedium8option2, lbmediumimage8, "/Images/MEDIUM/Stoke-City 130x130.png", btnmedium8, "/Images/MEDIUM/Stoke-City 100x100.png", panelmedium8, panelmedium9, bgmedium81, bgmedium82, btnmediumdone8, btnhard, lbmediumrequest8, lbmediumanswer8);
			}
		});
		btnmediumdone8.setForeground(Color.WHITE);
		btnmediumdone8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumdone8.setBackground(new Color(255, 0, 102));
		btnmediumdone8.setBounds(141, 291, 100, 33);
		panelmedium8.add(btnmediumdone8);
		
		JButton btnmediumprevious8 = new JButton("PREV");
		btnmediumprevious8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium8, panelmedium7);
			}
		});
		btnmediumprevious8.setForeground(Color.WHITE);
		btnmediumprevious8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumprevious8.setBackground(new Color(255, 0, 102));
		btnmediumprevious8.setBounds(141, 345, 100, 43);
		panelmedium8.add(btnmediumprevious8);
		//MEDIUM 8 END
		
		//MEDIUM 9 START
		JButton btnmediumback9 = new JButton("BACK");
		btnmediumback9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium9, panelmedium);
			}
		});
		btnmediumback9.setForeground(Color.WHITE);
		btnmediumback9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumback9.setBackground(new Color(255, 0, 102));
		btnmediumback9.setBounds(0, 345, 100, 43);
		panelmedium9.add(btnmediumback9);
		
		JLabel lbmediumtitle9 = new JLabel("9/9");
		lbmediumtitle9.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumtitle9.setForeground(new Color(0, 204, 255));
		lbmediumtitle9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbmediumtitle9.setBounds(141, 0, 100, 43);
		panelmedium9.add(lbmediumtitle9);
		
		JLabel lbmediumimage9 = new JLabel("");
		lbmediumimage9.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/MEDIUM/Wigan-Athletic Edited 130x130.png")));
		lbmediumimage9.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumimage9.setForeground(new Color(0, 204, 255));
		lbmediumimage9.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbmediumimage9.setBounds(128, 40, 130, 130);
		panelmedium9.add(lbmediumimage9);
		
		JRadioButton rbmedium9option1 = new JRadioButton("Watford");
		rbmedium9option1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium9option1.setBackground(new Color(0, 204, 255));
		rbmedium9option1.setBounds(23, 196, 109, 23);
		panelmedium9.add(rbmedium9option1);
		
		JRadioButton rbmedium9option3 = new JRadioButton("Wigan");
		rbmedium9option3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium9option3.setBackground(new Color(0, 204, 255));
		rbmedium9option3.setBounds(23, 242, 109, 23);
		panelmedium9.add(rbmedium9option3);
		
		ButtonGroup bgmedium91 = new ButtonGroup();
		bgmedium91.add(rbmedium9option1);
		bgmedium91.add(rbmedium9option3);
		
		JRadioButton rbmedium9option2 = new JRadioButton("Rangers");
		rbmedium9option2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium9option2.setBackground(new Color(0, 204, 255));
		rbmedium9option2.setBounds(251, 196, 109, 23);
		panelmedium9.add(rbmedium9option2);
		
		JRadioButton rbmedium9option4 = new JRadioButton("Athletic");
		rbmedium9option4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		rbmedium9option4.setBackground(new Color(0, 204, 255));
		rbmedium9option4.setBounds(251, 242, 109, 23);
		panelmedium9.add(rbmedium9option4);
		
		ButtonGroup bgmedium92 = new ButtonGroup();
		bgmedium92.add(rbmedium9option2);
		bgmedium92.add(rbmedium9option4);
		
		JLabel lbmediumrequest9 = new JLabel("Merge the club name.");
		lbmediumrequest9.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumrequest9.setForeground(new Color(0, 204, 255));
		lbmediumrequest9.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbmediumrequest9.setBounds(0, 166, 379, 23);
		panelmedium9.add(lbmediumrequest9);
		
		JLabel lbmediumanswer9 = new JLabel("Wigan Athletic");
		lbmediumanswer9.setHorizontalAlignment(SwingConstants.CENTER);
		lbmediumanswer9.setForeground(new Color(255, 0, 102));
		lbmediumanswer9.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbmediumanswer9.setBounds(0, 291, 379, 33);
		panelmedium9.add(lbmediumanswer9);
		lbmediumanswer9.setVisible(false);
		
		JButton btnmediumdone9 = new JButton("DONE");
		btnmediumdone9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelmedium(rbmedium9option3, rbmedium9option4, lbmediumimage9, "/Images/MEDIUM/Wigan-Athletic 130x130.png", btnmedium9, "/Images/MEDIUM/Wigan-Athletic 100x100.png", panelmedium9, panelmedium, bgmedium91, bgmedium92, btnmediumdone9, btnhard, lbmediumrequest9, lbmediumanswer9);
			}
		});
		btnmediumdone9.setForeground(Color.WHITE);
		btnmediumdone9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumdone9.setBackground(new Color(255, 0, 102));
		btnmediumdone9.setBounds(141, 291, 100, 33);
		panelmedium9.add(btnmediumdone9);
		
		JButton btnmediumprevious9 = new JButton("PREV");
		btnmediumprevious9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Panels.paneltransition(panelmedium9, panelmedium8);
			}
		});
		btnmediumprevious9.setForeground(Color.WHITE);
		btnmediumprevious9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnmediumprevious9.setBackground(new Color(255, 0, 102));
		btnmediumprevious9.setBounds(141, 345, 100, 43);
		panelmedium9.add(btnmediumprevious9);
		//MEDIUM 9 END
		
		//HARD 1 START
		JButton btnhardnext1 = new JButton("NEXT");
		btnhardnext1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard1, panelhard2);
			}
		});
		btnhardnext1.setForeground(Color.WHITE);
		btnhardnext1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardnext1.setBackground(new Color(255, 0, 102));
		btnhardnext1.setBounds(279, 345, 100, 43);
		panelhard1.add(btnhardnext1);
		
		JButton btnhardback1 = new JButton("BACK");
		btnhardback1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard1, panelhard);
			}
		});
		btnhardback1.setForeground(Color.WHITE);
		btnhardback1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardback1.setBackground(new Color(255, 0, 102));
		btnhardback1.setBounds(0, 345, 100, 43);
		panelhard1.add(btnhardback1);
		
		JLabel lbhardtitle1 = new JLabel("1/9");
		lbhardtitle1.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardtitle1.setForeground(new Color(0, 204, 255));
		lbhardtitle1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbhardtitle1.setBounds(141, 0, 100, 43);
		panelhard1.add(lbhardtitle1);
		
		JLabel lbhardimage1 = new JLabel("");
		lbhardimage1.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Coventry-City Edited 130x130.png")));
		lbhardimage1.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardimage1.setForeground(new Color(0, 204, 255));
		lbhardimage1.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbhardimage1.setBounds(128, 40, 130, 130);
		panelhard1.add(lbhardimage1);
		
		JLabel lbhardrequest1 = new JLabel("Type the name of the club.");
		lbhardrequest1.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardrequest1.setForeground(new Color(0, 204, 255));
		lbhardrequest1.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbhardrequest1.setBounds(0, 166, 379, 23);
		panelhard1.add(lbhardrequest1);
		
		JLabel lbhardanswer1 = new JLabel("Coventry City");
		lbhardanswer1.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardanswer1.setForeground(new Color(255, 0, 102));
		lbhardanswer1.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbhardanswer1.setBounds(0, 291, 379, 33);
		panelhard1.add(lbhardanswer1);
		lbhardanswer1.setVisible(false);
		
		JTextField tfanswer1 = new JTextField();
		tfanswer1.setHorizontalAlignment(SwingConstants.CENTER);
		tfanswer1.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		tfanswer1.setBackground(new Color(0, 204, 255));
		tfanswer1.setBounds(23, 230, 337, 33);
		panelhard1.add(tfanswer1);
		tfanswer1.setColumns(10);
		
		JButton btnharddone1 = new JButton("DONE");
		btnharddone1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelhard(tfanswer1, "coventry city", "coventry", lbhardimage1, "/Images/HARD/Coventry-City 130x130.png", btnhard1, "/Images/HARD/Coventry-City 100x100.png", panelhard1, panelhard2, btnharddone1, lbhardrequest1, lbhardanswer1);
			}
		});
		btnharddone1.setForeground(Color.WHITE);
		btnharddone1.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnharddone1.setBackground(new Color(255, 0, 102));
		btnharddone1.setBounds(141, 291, 100, 33);
		panelhard1.add(btnharddone1);
		//HARD 1 END
		
		//HARD 2 START
		JButton btnhardnext2 = new JButton("NEXT");
		btnhardnext2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard2, panelhard3);
			}
		});
		btnhardnext2.setForeground(Color.WHITE);
		btnhardnext2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardnext2.setBackground(new Color(255, 0, 102));
		btnhardnext2.setBounds(279, 345, 100, 43);
		panelhard2.add(btnhardnext2);
		
		JButton btnhardback2 = new JButton("BACK");
		btnhardback2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard2, panelhard);
			}
		});
		btnhardback2.setForeground(Color.WHITE);
		btnhardback2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardback2.setBackground(new Color(255, 0, 102));
		btnhardback2.setBounds(0, 345, 100, 43);
		panelhard2.add(btnhardback2);
		
		JLabel lbhardtitle2 = new JLabel("2/9");
		lbhardtitle2.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardtitle2.setForeground(new Color(0, 204, 255));
		lbhardtitle2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbhardtitle2.setBounds(141, 0, 100, 43);
		panelhard2.add(lbhardtitle2);
		
		JLabel lbhardimage2 = new JLabel("");
		lbhardimage2.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Ipswich-Town Edited 130x130.png")));
		lbhardimage2.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardimage2.setForeground(new Color(0, 204, 255));
		lbhardimage2.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbhardimage2.setBounds(128, 40, 130, 130);
		panelhard2.add(lbhardimage2);
		
		JLabel lbhardrequest2 = new JLabel("Type the name of the club.");
		lbhardrequest2.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardrequest2.setForeground(new Color(0, 204, 255));
		lbhardrequest2.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbhardrequest2.setBounds(0, 166, 379, 23);
		panelhard2.add(lbhardrequest2);
		
		JLabel lbhardanswer2 = new JLabel("Ipswich Town");
		lbhardanswer2.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardanswer2.setForeground(new Color(255, 0, 102));
		lbhardanswer2.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbhardanswer2.setBounds(0, 291, 379, 33);
		panelhard2.add(lbhardanswer2);
		lbhardanswer2.setVisible(false);
		
		JTextField tfanswer2 = new JTextField();
		tfanswer2.setHorizontalAlignment(SwingConstants.CENTER);
		tfanswer2.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		tfanswer2.setColumns(10);
		tfanswer2.setBackground(new Color(0, 204, 255));
		tfanswer2.setBounds(23, 230, 337, 33);
		panelhard2.add(tfanswer2);
		
		JButton btnharddone2 = new JButton("DONE");
		btnharddone2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelhard(tfanswer2, "ipswich town", "ipswich", lbhardimage2, "/Images/HARD/Ipswich-Town 130x130.png", btnhard2, "/Images/HARD/Ipswich-Town 100x100.png", panelhard2, panelhard3, btnharddone2, lbhardrequest2, lbhardanswer2);
			}
		});
		btnharddone2.setForeground(Color.WHITE);
		btnharddone2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnharddone2.setBackground(new Color(255, 0, 102));
		btnharddone2.setBounds(141, 291, 100, 33);
		panelhard2.add(btnharddone2);
		
		JButton btnhardprevious2 = new JButton("PREV");
		btnhardprevious2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard2, panelhard1);
			}
		});
		btnhardprevious2.setForeground(Color.WHITE);
		btnhardprevious2.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardprevious2.setBackground(new Color(255, 0, 102));
		btnhardprevious2.setBounds(141, 345, 100, 43);
		panelhard2.add(btnhardprevious2);
		//HARD 2 END
		
		//HARD 3 START
		JButton btnhardnext3 = new JButton("NEXT");
		btnhardnext3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard3, panelhard4);
			}
		});
		btnhardnext3.setForeground(Color.WHITE);
		btnhardnext3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardnext3.setBackground(new Color(255, 0, 102));
		btnhardnext3.setBounds(279, 345, 100, 43);
		panelhard3.add(btnhardnext3);
		
		JButton btnhardback3 = new JButton("BACK");
		btnhardback3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard3, panelhard);
			}
		});
		btnhardback3.setForeground(Color.WHITE);
		btnhardback3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardback3.setBackground(new Color(255, 0, 102));
		btnhardback3.setBounds(0, 345, 100, 43);
		panelhard3.add(btnhardback3);
		
		JLabel lbhardtitle3 = new JLabel("3/9");
		lbhardtitle3.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardtitle3.setForeground(new Color(0, 204, 255));
		lbhardtitle3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbhardtitle3.setBounds(141, 0, 100, 43);
		panelhard3.add(lbhardtitle3);
		
		JLabel lbhardimage3 = new JLabel("");
		lbhardimage3.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Derby-County Edited 130x130.png")));
		lbhardimage3.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardimage3.setForeground(new Color(0, 204, 255));
		lbhardimage3.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbhardimage3.setBounds(128, 40, 130, 130);
		panelhard3.add(lbhardimage3);
		
		JLabel lbhardrequest3 = new JLabel("Type the name of the club.");
		lbhardrequest3.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardrequest3.setForeground(new Color(0, 204, 255));
		lbhardrequest3.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbhardrequest3.setBounds(0, 166, 379, 23);
		panelhard3.add(lbhardrequest3);
		
		JLabel lbhardanswer3 = new JLabel("Derby County");
		lbhardanswer3.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardanswer3.setForeground(new Color(255, 0, 102));
		lbhardanswer3.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbhardanswer3.setBounds(0, 291, 379, 33);
		panelhard3.add(lbhardanswer3);
		lbhardanswer3.setVisible(false);
		
		JTextField tfanswer3 = new JTextField();
		tfanswer3.setHorizontalAlignment(SwingConstants.CENTER);
		tfanswer3.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		tfanswer3.setColumns(10);
		tfanswer3.setBackground(new Color(0, 204, 255));
		tfanswer3.setBounds(23, 230, 337, 33);
		panelhard3.add(tfanswer3);
		
		JButton btnharddone3 = new JButton("DONE");
		btnharddone3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelhard(tfanswer3, "derby county", "derby", lbhardimage3, "/Images/HARD/Derby-County 130x130.png", btnhard3, "/Images/HARD/Derby-County 100x100.png", panelhard3, panelhard4, btnharddone3, lbhardrequest3, lbhardanswer3);
			}
		});
		btnharddone3.setForeground(Color.WHITE);
		btnharddone3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnharddone3.setBackground(new Color(255, 0, 102));
		btnharddone3.setBounds(141, 291, 100, 33);
		panelhard3.add(btnharddone3);
		
		JButton btnhardprevious3 = new JButton("PREV");
		btnhardprevious3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard3, panelhard2);
			}
		});
		btnhardprevious3.setForeground(Color.WHITE);
		btnhardprevious3.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardprevious3.setBackground(new Color(255, 0, 102));
		btnhardprevious3.setBounds(141, 345, 100, 43);
		panelhard3.add(btnhardprevious3);
		//HARD 3 END
		
		//HARD 4 START
		JButton btnhardnext4 = new JButton("NEXT");
		btnhardnext4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard4, panelhard5);
			}
		});
		btnhardnext4.setForeground(Color.WHITE);
		btnhardnext4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardnext4.setBackground(new Color(255, 0, 102));
		btnhardnext4.setBounds(279, 345, 100, 43);
		panelhard4.add(btnhardnext4);
		
		JButton btnhardback4 = new JButton("BACK");
		btnhardback4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard4, panelhard);
			}
		});
		btnhardback4.setForeground(Color.WHITE);
		btnhardback4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardback4.setBackground(new Color(255, 0, 102));
		btnhardback4.setBounds(0, 345, 100, 43);
		panelhard4.add(btnhardback4);
		
		JLabel lbhardtitle4 = new JLabel("4/9");
		lbhardtitle4.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardtitle4.setForeground(new Color(0, 204, 255));
		lbhardtitle4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbhardtitle4.setBounds(141, 0, 100, 43);
		panelhard4.add(lbhardtitle4);
		
		JLabel lbhardimage4 = new JLabel("");
		lbhardimage4.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Leeds-United Edited 130x130.png")));
		lbhardimage4.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardimage4.setForeground(new Color(0, 204, 255));
		lbhardimage4.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbhardimage4.setBounds(128, 40, 130, 130);
		panelhard4.add(lbhardimage4);
		
		JLabel lbhardrequest4 = new JLabel("Type the name of the club.");
		lbhardrequest4.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardrequest4.setForeground(new Color(0, 204, 255));
		lbhardrequest4.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbhardrequest4.setBounds(0, 166, 379, 23);
		panelhard4.add(lbhardrequest4);
		
		JLabel lbhardanswer4 = new JLabel("Leeds United");
		lbhardanswer4.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardanswer4.setForeground(new Color(255, 0, 102));
		lbhardanswer4.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbhardanswer4.setBounds(0, 291, 379, 33);
		panelhard4.add(lbhardanswer4);
		lbhardanswer4.setVisible(false);
		
		JTextField tfanswer4 = new JTextField();
		tfanswer4.setHorizontalAlignment(SwingConstants.CENTER);
		tfanswer4.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		tfanswer4.setColumns(10);
		tfanswer4.setBackground(new Color(0, 204, 255));
		tfanswer4.setBounds(23, 230, 337, 33);
		panelhard4.add(tfanswer4);
		
		JButton btnharddone4 = new JButton("DONE");
		btnharddone4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelhard(tfanswer4, "leeds united", "leeds utd", "leeds", lbhardimage4, "/Images/HARD/Leeds-United 130x130.png", btnhard4, "/Images/HARD/Leeds-United 100x100.png", panelhard4, panelhard5, btnharddone4, lbhardrequest4, lbhardanswer4);
			}
		});
		btnharddone4.setForeground(Color.WHITE);
		btnharddone4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnharddone4.setBackground(new Color(255, 0, 102));
		btnharddone4.setBounds(141, 291, 100, 33);
		panelhard4.add(btnharddone4);
		
		JButton btnhardprevious4 = new JButton("PREV");
		btnhardprevious4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard4, panelhard3);
			}
		});
		btnhardprevious4.setForeground(Color.WHITE);
		btnhardprevious4.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardprevious4.setBackground(new Color(255, 0, 102));
		btnhardprevious4.setBounds(141, 345, 100, 43);
		panelhard4.add(btnhardprevious4);
		//HARD 4 END
		
		//HARD 5 START
		JButton btnhardnext5 = new JButton("NEXT");
		btnhardnext5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard5, panelhard6);
			}
		});
		btnhardnext5.setForeground(Color.WHITE);
		btnhardnext5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardnext5.setBackground(new Color(255, 0, 102));
		btnhardnext5.setBounds(279, 345, 100, 43);
		panelhard5.add(btnhardnext5);
		
		JButton btnhardback5 = new JButton("BACK");
		btnhardback5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard5, panelhard);
			}
		});
		btnhardback5.setForeground(Color.WHITE);
		btnhardback5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardback5.setBackground(new Color(255, 0, 102));
		btnhardback5.setBounds(0, 345, 100, 43);
		panelhard5.add(btnhardback5);
		
		JLabel lbhardtitle5 = new JLabel("5/9");
		lbhardtitle5.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardtitle5.setForeground(new Color(0, 204, 255));
		lbhardtitle5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbhardtitle5.setBounds(141, 0, 100, 43);
		panelhard5.add(lbhardtitle5);
		
		JLabel lbhardimage5 = new JLabel("");
		lbhardimage5.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Portsmouth-FC Edited 130x130.png")));
		lbhardimage5.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardimage5.setForeground(new Color(0, 204, 255));
		lbhardimage5.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbhardimage5.setBounds(128, 40, 130, 130);
		panelhard5.add(lbhardimage5);
		
		JLabel lbhardrequest5 = new JLabel("Type the name of the club.");
		lbhardrequest5.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardrequest5.setForeground(new Color(0, 204, 255));
		lbhardrequest5.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbhardrequest5.setBounds(0, 166, 379, 23);
		panelhard5.add(lbhardrequest5);
		
		JLabel lbhardanswer5 = new JLabel("Portsmouth FC");
		lbhardanswer5.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardanswer5.setForeground(new Color(255, 0, 102));
		lbhardanswer5.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbhardanswer5.setBounds(0, 291, 379, 33);
		panelhard5.add(lbhardanswer5);
		lbhardanswer5.setVisible(false);
		
		JTextField tfanswer5 = new JTextField();
		tfanswer5.setHorizontalAlignment(SwingConstants.CENTER);
		tfanswer5.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		tfanswer5.setColumns(10);
		tfanswer5.setBackground(new Color(0, 204, 255));
		tfanswer5.setBounds(23, 230, 337, 33);
		panelhard5.add(tfanswer5);
		
		JButton btnharddone5 = new JButton("DONE");
		btnharddone5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelhard(tfanswer5, "portsmouth", "portsmouth fc", lbhardimage5, "/Images/HARD/Portsmouth-FC 130x130.png", btnhard5, "/Images/HARD/Portsmouth-FC 100x100.png", panelhard5, panelhard6, btnharddone5, lbhardrequest5, lbhardanswer5);
			}
		});
		btnharddone5.setForeground(Color.WHITE);
		btnharddone5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnharddone5.setBackground(new Color(255, 0, 102));
		btnharddone5.setBounds(141, 291, 100, 33);
		panelhard5.add(btnharddone5);
		
		JButton btnhardprevious5 = new JButton("PREV");
		btnhardprevious5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard5, panelhard4);
			}
		});
		btnhardprevious5.setForeground(Color.WHITE);
		btnhardprevious5.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardprevious5.setBackground(new Color(255, 0, 102));
		btnhardprevious5.setBounds(141, 345, 100, 43);
		panelhard5.add(btnhardprevious5);
		//HARD 5 END
		
		//HARD 6 START
		JButton btnhardnext6 = new JButton("NEXT");
		btnhardnext6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard6, panelhard7);
			}
		});
		btnhardnext6.setForeground(Color.WHITE);
		btnhardnext6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardnext6.setBackground(new Color(255, 0, 102));
		btnhardnext6.setBounds(279, 345, 100, 43);
		panelhard6.add(btnhardnext6);
		
		JButton btnhardback6 = new JButton("BACK");
		btnhardback6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard6, panelhard);
			}
		});
		btnhardback6.setForeground(Color.WHITE);
		btnhardback6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardback6.setBackground(new Color(255, 0, 102));
		btnhardback6.setBounds(0, 345, 100, 43);
		panelhard6.add(btnhardback6);
		
		JLabel lbhardtitle6 = new JLabel("6/9");
		lbhardtitle6.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardtitle6.setForeground(new Color(0, 204, 255));
		lbhardtitle6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbhardtitle6.setBounds(141, 0, 100, 43);
		panelhard6.add(lbhardtitle6);
		
		JLabel lbhardimage6 = new JLabel("");
		lbhardimage6.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Sunderland-AFC Edited 130x130.png")));
		lbhardimage6.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardimage6.setForeground(new Color(0, 204, 255));
		lbhardimage6.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbhardimage6.setBounds(128, 40, 130, 130);
		panelhard6.add(lbhardimage6);
		
		JLabel lbhardrequest6 = new JLabel("Type the name of the club.");
		lbhardrequest6.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardrequest6.setForeground(new Color(0, 204, 255));
		lbhardrequest6.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbhardrequest6.setBounds(0, 166, 379, 23);
		panelhard6.add(lbhardrequest6);
		
		JLabel lbhardanswer6 = new JLabel("Sunderland AFC");
		lbhardanswer6.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardanswer6.setForeground(new Color(255, 0, 102));
		lbhardanswer6.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbhardanswer6.setBounds(0, 291, 379, 33);
		panelhard6.add(lbhardanswer6);
		lbhardanswer6.setVisible(false);
		
		JTextField tfanswer6 = new JTextField();
		tfanswer6.setHorizontalAlignment(SwingConstants.CENTER);
		tfanswer6.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		tfanswer6.setColumns(10);
		tfanswer6.setBackground(new Color(0, 204, 255));
		tfanswer6.setBounds(23, 230, 337, 33);
		panelhard6.add(tfanswer6);
		
		JButton btnharddone6 = new JButton("DONE");
		btnharddone6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelhard(tfanswer6, "sunderland afc", "sunderland", lbhardimage6, "/Images/HARD/Sunderland-AFC 130x130.png", btnhard6, "/Images/HARD/Sunderland-AFC 100x100.png", panelhard6, panelhard7, btnharddone6, lbhardrequest6, lbhardanswer6);
			}
		});
		btnharddone6.setForeground(Color.WHITE);
		btnharddone6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnharddone6.setBackground(new Color(255, 0, 102));
		btnharddone6.setBounds(141, 291, 100, 33);
		panelhard6.add(btnharddone6);
		
		JButton btnhardprevious6 = new JButton("PREV");
		btnhardprevious6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard6, panelhard5);
			}
		});
		btnhardprevious6.setForeground(Color.WHITE);
		btnhardprevious6.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardprevious6.setBackground(new Color(255, 0, 102));
		btnhardprevious6.setBounds(141, 345, 100, 43);
		panelhard6.add(btnhardprevious6);
		//HARD 6 END
		
		//HARD 7 START
		JButton btnhardnext7 = new JButton("NEXT");
		btnhardnext7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard7, panelhard8);
			}
		});
		btnhardnext7.setForeground(Color.WHITE);
		btnhardnext7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardnext7.setBackground(new Color(255, 0, 102));
		btnhardnext7.setBounds(279, 345, 100, 43);
		panelhard7.add(btnhardnext7);
		
		JButton btnhardback7 = new JButton("BACK");
		btnhardback7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard7, panelhard);
			}
		});
		btnhardback7.setForeground(Color.WHITE);
		btnhardback7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardback7.setBackground(new Color(255, 0, 102));
		btnhardback7.setBounds(0, 345, 100, 43);
		panelhard7.add(btnhardback7);
		
		JLabel lbhardtitle7 = new JLabel("7/9");
		lbhardtitle7.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardtitle7.setForeground(new Color(0, 204, 255));
		lbhardtitle7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbhardtitle7.setBounds(141, 0, 100, 43);
		panelhard7.add(lbhardtitle7);
		
		JLabel lbhardimage7 = new JLabel("");
		lbhardimage7.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Swansea-City Edited 130x130.png")));
		lbhardimage7.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardimage7.setForeground(new Color(0, 204, 255));
		lbhardimage7.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbhardimage7.setBounds(128, 40, 130, 130);
		panelhard7.add(lbhardimage7);
		
		JLabel lbhardrequest7 = new JLabel("Type the name of the club.");
		lbhardrequest7.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardrequest7.setForeground(new Color(0, 204, 255));
		lbhardrequest7.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbhardrequest7.setBounds(0, 166, 379, 23);
		panelhard7.add(lbhardrequest7);
		
		JLabel lbhardanswer7 = new JLabel("Swansea City");
		lbhardanswer7.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardanswer7.setForeground(new Color(255, 0, 102));
		lbhardanswer7.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbhardanswer7.setBounds(0, 291, 379, 33);
		panelhard7.add(lbhardanswer7);
		lbhardanswer7.setVisible(false);
		
		JTextField tfanswer7 = new JTextField();
		tfanswer7.setHorizontalAlignment(SwingConstants.CENTER);
		tfanswer7.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		tfanswer7.setColumns(10);
		tfanswer7.setBackground(new Color(0, 204, 255));
		tfanswer7.setBounds(23, 230, 337, 33);
		panelhard7.add(tfanswer7);
		
		JButton btnharddone7 = new JButton("DONE");
		btnharddone7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelhard(tfanswer7, "swansea city", "swansea", lbhardimage7, "/Images/HARD/Swansea-City 130x130.png", btnhard7, "/Images/HARD/Swansea-City 100x100.png", panelhard7, panelhard8, btnharddone7, lbhardrequest7, lbhardanswer7);
			}
		});
		btnharddone7.setForeground(Color.WHITE);
		btnharddone7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnharddone7.setBackground(new Color(255, 0, 102));
		btnharddone7.setBounds(141, 291, 100, 33);
		panelhard7.add(btnharddone7);
		
		JButton btnhardprevious7 = new JButton("PREV");
		btnhardprevious7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard7, panelhard6);
			}
		});
		btnhardprevious7.setForeground(Color.WHITE);
		btnhardprevious7.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardprevious7.setBackground(new Color(255, 0, 102));
		btnhardprevious7.setBounds(141, 345, 100, 43);
		panelhard7.add(btnhardprevious7);
		//HARD 7 END
		
		//HARD 8 START
		JButton btnhardnext8 = new JButton("NEXT");
		btnhardnext8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard8, panelhard9);
			}
		});
		btnhardnext8.setForeground(Color.WHITE);
		btnhardnext8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardnext8.setBackground(new Color(255, 0, 102));
		btnhardnext8.setBounds(279, 345, 100, 43);
		panelhard8.add(btnhardnext8);
		
		JButton btnhardback8 = new JButton("BACK");
		btnhardback8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard8, panelhard);
			}
		});
		btnhardback8.setForeground(Color.WHITE);
		btnhardback8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardback8.setBackground(new Color(255, 0, 102));
		btnhardback8.setBounds(0, 345, 100, 43);
		panelhard8.add(btnhardback8);
		
		JLabel lbhardtitle8 = new JLabel("8/9");
		lbhardtitle8.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardtitle8.setForeground(new Color(0, 204, 255));
		lbhardtitle8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbhardtitle8.setBounds(141, 0, 100, 43);
		panelhard8.add(lbhardtitle8);
		
		JLabel lbhardimage8 = new JLabel("");
		lbhardimage8.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/Watford-FC Edited 130x130.png")));
		lbhardimage8.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardimage8.setForeground(new Color(0, 204, 255));
		lbhardimage8.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbhardimage8.setBounds(128, 40, 130, 130);
		panelhard8.add(lbhardimage8);
		
		JLabel lbhardrequest8 = new JLabel("Type the name of the club.");
		lbhardrequest8.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardrequest8.setForeground(new Color(0, 204, 255));
		lbhardrequest8.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbhardrequest8.setBounds(0, 166, 379, 23);
		panelhard8.add(lbhardrequest8);
		
		JLabel lbhardanswer8 = new JLabel("Watford FC");
		lbhardanswer8.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardanswer8.setForeground(new Color(255, 0, 102));
		lbhardanswer8.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbhardanswer8.setBounds(0, 291, 379, 33);
		panelhard8.add(lbhardanswer8);
		lbhardanswer8.setVisible(false);
		
		JTextField tfanswer8 = new JTextField();
		tfanswer8.setHorizontalAlignment(SwingConstants.CENTER);
		tfanswer8.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		tfanswer8.setColumns(10);
		tfanswer8.setBackground(new Color(0, 204, 255));
		tfanswer8.setBounds(23, 230, 337, 33);
		panelhard8.add(tfanswer8);
		
		JButton btnharddone8 = new JButton("DONE");
		btnharddone8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelhard(tfanswer8, "watford fc", "watford", lbhardimage8, "/Images/HARD/Watford-FC 130x130.png", btnhard8, "/Images/HARD/Watford-FC 100x100.png", panelhard8, panelhard9, btnharddone8, lbhardrequest8, lbhardanswer8);
			}
		});
		btnharddone8.setForeground(Color.WHITE);
		btnharddone8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnharddone8.setBackground(new Color(255, 0, 102));
		btnharddone8.setBounds(141, 291, 100, 33);
		panelhard8.add(btnharddone8);
		
		JButton btnhardprevious8 = new JButton("PREV");
		btnhardprevious8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard8, panelhard7);
			}
		});
		btnhardprevious8.setForeground(Color.WHITE);
		btnhardprevious8.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardprevious8.setBackground(new Color(255, 0, 102));
		btnhardprevious8.setBounds(141, 345, 100, 43);
		panelhard8.add(btnhardprevious8);
		//HARD 8 END
		
		//HARD 9 START
		JButton btnhardback9 = new JButton("BACK");
		btnhardback9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard9, panelhard);
			}
		});
		btnhardback9.setForeground(Color.WHITE);
		btnhardback9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardback9.setBackground(new Color(255, 0, 102));
		btnhardback9.setBounds(0, 345, 100, 43);
		panelhard9.add(btnhardback9);
		
		JLabel lbhardtitle9 = new JLabel("9/9");
		lbhardtitle9.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardtitle9.setForeground(new Color(0, 204, 255));
		lbhardtitle9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		lbhardtitle9.setBounds(141, 0, 100, 43);
		panelhard9.add(lbhardtitle9);
		
		JLabel lbhardimage9 = new JLabel("");
		lbhardimage9.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/HARD/West-Bromwich-Albion Edited 130x130.png")));
		lbhardimage9.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardimage9.setForeground(new Color(0, 204, 255));
		lbhardimage9.setFont(new Font("Bookman Old Style", Font.BOLD, 11));
		lbhardimage9.setBounds(128, 40, 130, 130);
		panelhard9.add(lbhardimage9);
		
		JLabel lbhardrequest9 = new JLabel("Type the name of the club.");
		lbhardrequest9.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardrequest9.setForeground(new Color(0, 204, 255));
		lbhardrequest9.setFont(new Font("Bookman Old Style", Font.BOLD, 14));
		lbhardrequest9.setBounds(0, 166, 379, 23);
		panelhard9.add(lbhardrequest9);
		
		JLabel lbhardanswer9 = new JLabel("West Bromwich Albion");
		lbhardanswer9.setHorizontalAlignment(SwingConstants.CENTER);
		lbhardanswer9.setForeground(new Color(255, 0, 102));
		lbhardanswer9.setFont(new Font("Bookman Old Style", Font.BOLD, 30));
		lbhardanswer9.setBounds(0, 291, 379, 33);
		panelhard9.add(lbhardanswer9);
		lbhardanswer9.setVisible(false);
		
		JTextField tfanswer9 = new JTextField();
		tfanswer9.setHorizontalAlignment(SwingConstants.CENTER);
		tfanswer9.setFont(new Font("Bookman Old Style", Font.BOLD, 24));
		tfanswer9.setColumns(10);
		tfanswer9.setBackground(new Color(0, 204, 255));
		tfanswer9.setBounds(23, 230, 337, 33);
		panelhard9.add(tfanswer9);
		
		JButton btnharddone9 = new JButton("DONE");
		btnharddone9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Levels.levelhard(tfanswer9, "west bromwich albion", "west brom", "wba", lbhardimage9, "/Images/HARD/West-Bromwich-Albion 130x130.png", btnhard9, "/Images/HARD/West-Bromwich-Albion 100x100.png", panelhard9, panelhard, btnharddone9, lbhardrequest9, lbhardanswer9);
			}
		});
		btnharddone9.setForeground(Color.WHITE);
		btnharddone9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnharddone9.setBackground(new Color(255, 0, 102));
		btnharddone9.setBounds(141, 291, 100, 33);
		panelhard9.add(btnharddone9);
		
		JButton btnhardprevious9 = new JButton("PREV");
		btnhardprevious9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Panels.paneltransition(panelhard9, panelhard8);
			}
		});
		btnhardprevious9.setForeground(Color.WHITE);
		btnhardprevious9.setFont(new Font("Bookman Old Style", Font.BOLD, 20));
		btnhardprevious9.setBackground(new Color(255, 0, 102));
		btnhardprevious9.setBounds(141, 345, 100, 43);
		panelhard9.add(btnhardprevious9);
		//HARD 9 END
		
		//HAND CURSOR START
		Cursor handcursor = new Cursor(Cursor.HAND_CURSOR);
		btnregister.setCursor(handcursor);
		btnstart.setCursor(handcursor);
		btneasy.setCursor(handcursor);
		btneasy1.setCursor(handcursor);
		btneasynext1.setCursor(handcursor);
		btneasyback1.setCursor(handcursor);
		btneasydone1.setCursor(handcursor);
		btneasy2.setCursor(handcursor);
		btneasynext2.setCursor(handcursor);
		btneasyback2.setCursor(handcursor);
		btneasyprevious2.setCursor(handcursor);
		btneasydone2.setCursor(handcursor);
		btneasy3.setCursor(handcursor);
		btneasynext3.setCursor(handcursor);
		btneasyback3.setCursor(handcursor);
		btneasyprevious3.setCursor(handcursor);
		btneasydone3.setCursor(handcursor);
		btneasy4.setCursor(handcursor);
		btneasynext4.setCursor(handcursor);
		btneasyback4.setCursor(handcursor);
		btneasyprevious4.setCursor(handcursor);
		btneasydone4.setCursor(handcursor);
		btneasy5.setCursor(handcursor);
		btneasynext5.setCursor(handcursor);
		btneasyback5.setCursor(handcursor);
		btneasyprevious5.setCursor(handcursor);
		btneasydone5.setCursor(handcursor);
		btneasy6.setCursor(handcursor);
		btneasynext6.setCursor(handcursor);
		btneasyback6.setCursor(handcursor);
		btneasyprevious6.setCursor(handcursor);
		btneasydone6.setCursor(handcursor);
		btneasy7.setCursor(handcursor);
		btneasynext7.setCursor(handcursor);
		btneasyback7.setCursor(handcursor);
		btneasyprevious7.setCursor(handcursor);
		btneasydone7.setCursor(handcursor);
		btneasy8.setCursor(handcursor);
		btneasynext8.setCursor(handcursor);
		btneasyback8.setCursor(handcursor);
		btneasydone8.setCursor(handcursor);
		btneasy9.setCursor(handcursor);
		btneasyback9.setCursor(handcursor);
		btneasyprevious9.setCursor(handcursor);
		btneasydone9.setCursor(handcursor);
		btneasyback.setCursor(handcursor);
		btnmedium.setCursor(handcursor);
		btnmedium1.setCursor(handcursor);
		btnmediumnext1.setCursor(handcursor);
		btnmediumback1.setCursor(handcursor);
		btnmediumdone1.setCursor(handcursor);
		btnmedium2.setCursor(handcursor);
		btnmediumnext2.setCursor(handcursor);
		btnmediumback2.setCursor(handcursor);
		btnmediumprevious2.setCursor(handcursor);
		btnmediumdone2.setCursor(handcursor);
		btnmedium3.setCursor(handcursor);
		btnmediumnext3.setCursor(handcursor);
		btnmediumback3.setCursor(handcursor);
		btnmediumprevious3.setCursor(handcursor);
		btnmediumdone3.setCursor(handcursor);
		btnmedium4.setCursor(handcursor);
		btnmediumnext4.setCursor(handcursor);
		btnmediumback4.setCursor(handcursor);
		btnmediumprevious4.setCursor(handcursor);
		btnmediumdone4.setCursor(handcursor);
		btnmedium5.setCursor(handcursor);
		btnmediumnext5.setCursor(handcursor);
		btnmediumback5.setCursor(handcursor);
		btnmediumprevious5.setCursor(handcursor);
		btnmediumdone5.setCursor(handcursor);
		btnmedium6.setCursor(handcursor);
		btnmediumnext6.setCursor(handcursor);
		btnmediumback6.setCursor(handcursor);
		btnmediumprevious6.setCursor(handcursor);
		btnmediumdone6.setCursor(handcursor);
		btnmedium7.setCursor(handcursor);
		btnmediumnext7.setCursor(handcursor);
		btnmediumback7.setCursor(handcursor);
		btnmediumprevious7.setCursor(handcursor);
		btnmediumdone7.setCursor(handcursor);
		btnmedium8.setCursor(handcursor);
		btnmediumnext8.setCursor(handcursor);
		btnmediumback8.setCursor(handcursor);
		btnmediumprevious8.setCursor(handcursor);
		btnmediumdone8.setCursor(handcursor);
		btnmedium9.setCursor(handcursor);
		btnmediumback9.setCursor(handcursor);
		btnmediumprevious9.setCursor(handcursor);
		btnmediumdone9.setCursor(handcursor);
		btnmediumback.setCursor(handcursor);
		btnhard.setCursor(handcursor);
		btnhard1.setCursor(handcursor);
		btnhardnext1.setCursor(handcursor);
		btnhardback1.setCursor(handcursor);
		btnharddone1.setCursor(handcursor);
		btnhard2.setCursor(handcursor);
		btnhardnext2.setCursor(handcursor);
		btnhardback2.setCursor(handcursor);
		btnhardprevious2.setCursor(handcursor);
		btnharddone2.setCursor(handcursor);
		btnhard3.setCursor(handcursor);
		btnhardnext3.setCursor(handcursor);
		btnhardback3.setCursor(handcursor);
		btnhardprevious3.setCursor(handcursor);
		btnharddone3.setCursor(handcursor);
		btnhard4.setCursor(handcursor);
		btnhardnext4.setCursor(handcursor);
		btnhardback4.setCursor(handcursor);
		btnhardprevious4.setCursor(handcursor);
		btnharddone4.setCursor(handcursor);
		btnhard5.setCursor(handcursor);
		btnhardnext5.setCursor(handcursor);
		btnhardback5.setCursor(handcursor);
		btnhardprevious5.setCursor(handcursor);
		btnharddone5.setCursor(handcursor);
		btnhard6.setCursor(handcursor);
		btnhardnext6.setCursor(handcursor);
		btnhardback6.setCursor(handcursor);
		btnhardprevious6.setCursor(handcursor);
		btnharddone6.setCursor(handcursor);
		btnhard7.setCursor(handcursor);
		btnhardnext7.setCursor(handcursor);
		btnhardback7.setCursor(handcursor);
		btnhardprevious7.setCursor(handcursor);
		btnharddone7.setCursor(handcursor);
		btnhard8.setCursor(handcursor);
		btnhardnext8.setCursor(handcursor);
		btnhardback8.setCursor(handcursor);
		btnhardprevious8.setCursor(handcursor);
		btnharddone8.setCursor(handcursor);
		btnhard9.setCursor(handcursor);
		btnhardback9.setCursor(handcursor);
		btnhardprevious9.setCursor(handcursor);
		btnharddone9.setCursor(handcursor);
		btnhardback.setCursor(handcursor);
		btnstartback.setCursor(handcursor);
		btninfo.setCursor(handcursor);
		btninfoprint.setCursor(handcursor);
		btninfoback.setCursor(handcursor);
		btnoptions.setCursor(handcursor);
		btnsoundon.setCursor(handcursor);
		btnsoundoff.setCursor(handcursor);
		btnoptionsback.setCursor(handcursor);
		
		JLabel lbsoundicon = new JLabel("");
		lbsoundicon.setIcon(new ImageIcon(JPremierLeagueLogoQuiz.class.getResource("/Images/ICON/SoundIcon.png")));
		lbsoundicon.setHorizontalAlignment(SwingConstants.CENTER);
		lbsoundicon.setBounds(0, 132, 379, 188);
		paneloptions.add(lbsoundicon);
		btnexit.setCursor(handcursor);
		//HAND CURSOR END
	}
}
