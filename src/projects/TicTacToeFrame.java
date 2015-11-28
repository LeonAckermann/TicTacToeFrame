package projects;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Frame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TicTacToeFrame extends JFrame {

	private JPanel contentPane;
	private int zs = 0;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JTextField txt_1;
	private String [] bt = {"","","","","","","","",""};
	public TicTacToeFrame frame;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToeFrame frame = new TicTacToeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public TicTacToeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 270);
		contentPane = new JPanel();
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn_1 = new JButton("");
		btn_1.setOpaque(true);
		btn_1.setForeground(new Color(238, 238, 238));
		btn_1.setEnabled(false);
		btn_1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (zs == 0) {
					btn_1.setText("X");
					btn_1.setBackground(Color.DARK_GRAY);
					bt[0]="X";
					zs = 1;
				}
				else if (zs == 1){
					btn_1.setText("O");
					btn_1.setBackground(Color.LIGHT_GRAY);
					bt[0]="O";
					zs = 0;
				}
				btn_1.setEnabled(false);
				checkSieger ();
			}
		});

		btn_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_1.setBounds(60, 20, 70, 70);
		contentPane.add(btn_1);

		JButton btn_2 = new JButton("");
		btn_2.setOpaque(true);
		btn_2.setForeground(new Color(238, 238, 238));
		btn_2.setEnabled(false);
		btn_2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (zs == 0) {
					btn_2.setText("X");
					btn_2.setBackground(Color.DARK_GRAY);
					bt[1]="X";
					zs = 1;
				}
				else if (zs == 1){
					btn_2.setText("O");
					btn_2.setBackground(Color.LIGHT_GRAY);
					bt[1]="O";
					zs = 0;
				}
				btn_2.setEnabled(false);
				//	 checkSieger ();
			}
		});

		btn_2.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_2.setBounds(130, 20, 70, 70);
		contentPane.add(btn_2);

		JButton btn_3 = new JButton("");
		btn_3.setOpaque(true);
		btn_3.setForeground(new Color(238, 238, 238));
		btn_3.setEnabled(false);
		btn_3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (zs == 0) {
					btn_3.setText("X");
					btn_3.setBackground(Color.DARK_GRAY);
					bt[2]="X";
					zs = 1;
				}
				else if (zs == 1){
					btn_3.setText("O");
					btn_3.setBackground(Color.LIGHT_GRAY);
					bt[2]="O";
					zs = 0;
				}
				btn_3.setEnabled(false);
				checkSieger ();
			}
		});

		btn_3.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_3.setBounds(200, 20, 70, 70);
		contentPane.add(btn_3);

		JButton btn_4 = new JButton("");
		btn_4.setOpaque(true);
		btn_4.setForeground(new Color(238, 238, 238));
		btn_4.setEnabled(false);
		btn_4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (zs == 0) {
					btn_4.setText("X");
					btn_4.setBackground(Color.DARK_GRAY);
					bt[3]="X";
					zs = 1;
				}
				else if (zs == 1){
					btn_4.setText("O");
					btn_4.setBackground(Color.LIGHT_GRAY);
					bt[3]="O";
					zs = 0;
				}
				btn_4.setEnabled(false);
				checkSieger ();
			}
		});

		btn_4.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_4.setBounds(60, 90, 70, 70);
		contentPane.add(btn_4);

		JButton btn_5 = new JButton("");
		btn_5.setOpaque(true);
		btn_5.setForeground(new Color(238, 238, 238));
		btn_5.setEnabled(false);
		btn_5.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (zs == 0) {
					btn_5.setText("X");
					btn_5.setBackground(Color.DARK_GRAY);
					bt[4]="X";
					zs = 1;
				}
				else if (zs == 1){
					btn_5.setText("O");
					btn_5.setBackground(Color.LIGHT_GRAY);
					bt[4]="O";
					zs = 0;
				}
				btn_5.setEnabled(false);
				checkSieger ();
			}
		});

		btn_5.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_5.setBounds(130, 90, 70, 70);
		contentPane.add(btn_5);

		JButton btn_6 = new JButton("");
		btn_6.setOpaque(true);
		btn_6.setForeground(new Color(238, 238, 238));
		btn_6.setEnabled(false);
		btn_6.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (zs == 0) {
					btn_6.setText("X");
					btn_6.setBackground(Color.DARK_GRAY);
					bt[5]="X";
					zs = 1;
				}
				else if (zs == 1){
					btn_6.setText("O");
					btn_6.setBackground(Color.LIGHT_GRAY);
					bt[5]="O";
					zs = 0;
				}
				btn_6.setEnabled(false);
				checkSieger ();
			}
		});

		btn_6.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_6.setBounds(200, 90, 70, 70);
		contentPane.add(btn_6);

		JButton btn_7 = new JButton("");
		btn_7.setOpaque(true);
		btn_7.setForeground(new Color(238, 238, 238));
		btn_7.setEnabled(false);
		btn_7.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (zs == 0) {
					btn_7.setText("X");
					btn_7.setBackground(Color.DARK_GRAY);
					bt[6]="X";
					zs = 1;
				}
				else if (zs == 1){
					btn_7.setText("O");
					btn_7.setBackground(Color.LIGHT_GRAY);
					bt[6]="O";
					zs = 0;
				}
				btn_7.setEnabled(false);
				checkSieger ();
			}
		});

		btn_7.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_7.setBounds(60, 160, 70, 70);
		contentPane.add(btn_7);

		JButton btn_8 = new JButton("");
		btn_8.setOpaque(true);
		btn_8.setForeground(new Color(238, 238, 238));
		btn_8.setEnabled(false);
		btn_8.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (zs == 0) {
					btn_8.setText("X");
					btn_8.setBackground(Color.DARK_GRAY);
					bt[7]="X";
					zs = 1;
				}
				else if (zs == 1){
					btn_8.setText("O");
					btn_8.setBackground(Color.LIGHT_GRAY);
					bt[7]="O";
					zs = 0;
				}
				btn_8.setEnabled(false);
				checkSieger ();
			}
		});

		btn_8.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_8.setBounds(130, 160, 70, 70);
		contentPane.add(btn_8);

		JButton btn_9 = new JButton("");
		btn_9.setOpaque(true);
		btn_9.setForeground(new Color(238, 238, 238));
		btn_9.setEnabled(false);
		btn_9.setBackground(new Color(238, 238, 238));
		btn_9.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				if (zs == 0) {
					btn_9.setText("X");
					btn_9.setBackground(Color.DARK_GRAY);
					bt[8]="X";
					zs = 1;
				}
				else if (zs == 1){
					btn_9.setText("O");
					btn_9.setBackground(Color.LIGHT_GRAY);
					bt[8]="O";
					zs = 0;
				}
				btn_9.setEnabled(false);
				checkSieger ();
			}
		});

		btn_9.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_9.setBounds(200, 160, 70, 70);
		contentPane.add(btn_9);
			
		JButton btn_neuesSpiel = new JButton("Neues Spiel");
		btn_neuesSpiel.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				System.out.println("actionPerformed");
				btn_1.setText("");
				btn_1.setBackground(new Color(238, 238, 238));
				btn_1.setEnabled(true);
				btn_2.setText("");
				btn_2.setBackground(new Color(238, 238, 238));
				btn_2.setEnabled(true);
				btn_3.setText("");
				btn_3.setBackground(new Color(238, 238, 238));
				btn_3.setEnabled(true);
				btn_4.setText("");
				btn_4.setBackground(new Color(238, 238, 238));
				btn_4.setEnabled(true);
				btn_5.setText("");
				btn_5.setBackground(new Color(238, 238, 238));
				btn_5.setEnabled(true);
				btn_6.setText("");
				btn_6.setBackground(new Color(238, 238, 238));
				btn_6.setEnabled(true);
				btn_7.setText("");
				btn_7.setBackground(new Color(238, 238, 238));
				btn_7.setEnabled(true);
				btn_8.setText("");
				btn_8.setBackground(new Color(238, 238, 238));
				btn_8.setEnabled(true);
				btn_9.setText("");
				btn_9.setBackground(new Color(238, 238, 238));
				btn_9.setEnabled(true);
				txt_1.setText("");
				for (int i = 0; i<9; i++) {
					bt[i] = "?";
				}
				zs = 0;
			}
		});


		btn_neuesSpiel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_neuesSpiel.setBounds(310, 22, 140, 70);
		contentPane.add(btn_neuesSpiel);

		txt_1 = new JTextField("");
		txt_1.setHorizontalAlignment(SwingConstants.CENTER);
		txt_1.setEditable(false);
		txt_1.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		txt_1.setBounds(280, 160, 213, 70);
		contentPane.add(txt_1);
		txt_1.setColumns(10);
		
		JButton btn_zurück = new JButton("<<<");
		btn_zurück.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MenüFenster().setVisible(true);
				setVisible(false);
			}
		});
		btn_zurück.setBounds(6, 20, 51, 70);
		contentPane.add(btn_zurück);

	}


	/*	public void sieg(){
		String ol = btn_1.getText();
		String om = btn_2.getText();
		String or = btn_3.getText();
		String ml = btn_4.getText();
		String mm = btn_5.getText();
		String mr = btn_6.getText();
		String ul = btn_7.getText();
		String um = btn_8.getText();
		String ur = btn_9.getText();

		if (ol == om && om == or){
			txt_1.setText("Spieler hat gewonnen!");
		}
		if (ml == mm && mm == mr){
			txt_1.setText("Spieler hat gewonnen!");
		}
		if (ul == um && um == ur){
			txt_1.setText("Spieler hat gewonnen!");
		}
		if (ol == ml && ml == ul){
			txt_1.setText("Spieler hat gewonnen!");
		}
		if (om == mm && mm == um){
			txt_1.setText("Spieler hat gewonnen!");
		}
		if (or == mr && mr == ur){
			txt_1.setText("Spieler hat gewonnen!");
		}
		if (ol == mm && mm == ur){
			txt_1.setText("Spieler hat gewonnen!");
		}
		if (ul == mm && mm == or){
			txt_1.setText("Spieler hat gewonnen!");
		}

	}*/

	public void checkSieger( ){
		System.out.println("Begin check sieger");

		if (( bt[0].equals("X") || bt[0].equals("O")) && (bt[0] == bt[1]) && (bt[1] == bt[2]) ){
			txt_1.setText("Spieler " + bt[0] + " hat gewonnen!");
		}
		if (( bt[3].equals("X") || bt[3].equals("O")) && (bt[3] == bt[4]) && (bt[4] == bt[5]) ){
				txt_1.setText("Spieler " + bt[3] + " hat gewonnen!");
			}
		if (( bt[6].equals("X") || bt[6].equals("O")) && (bt[6] == bt[7]) && (bt[7] == bt[8]) ){
				txt_1.setText("Spieler " + bt[6] + " hat gewonnen!");
			}
		if (( bt[6].equals("X") || bt[6].equals("O")) &&  (bt[0] == bt[3]) && (bt[3] == bt[6]) ){
				txt_1.setText("Spieler " + bt[6] + " hat gewonnen!");
			}
		if (( bt[7].equals("X") || bt[7].equals("O")) &&  (bt[1] == bt[4]) && (bt[4] == bt[7]) ){
				txt_1.setText("Spieler " + bt[7] + " hat gewonnen!");
			}
		if (( bt[8].equals("X") || bt[8].equals("O")) &&  (bt[2] == bt[5]) && (bt[5] == bt[8]) ){
				txt_1.setText("Spieler " + bt[8] + " hat gewonnen!");
			}
		if (( bt[8].equals("X") || bt[8].equals("O")) && (bt[0] == bt[4]) && (bt[4] == bt[8]) ){
				txt_1.setText("Spieler " + bt[8] + " hat gewonnen!");
			}
		if (( bt[6].equals("X") || bt[6].equals("O")) &&  (bt[2] == bt[4]) && (bt[4] == bt[6]) ){
				txt_1.setText("Spieler " + bt[6] + " hat gewonnen!");
			}

	}	
	}
