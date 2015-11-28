package projects;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MenüFenster extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenüFenster frame = new MenüFenster();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MenüFenster() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 270);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn_spiel = new JButton("Zum Spiel");
		btn_spiel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new TicTacToeFrame().setVisible(true);
				setVisible(false);
			}
		});
		btn_spiel.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_spiel.setBounds(185, 42, 140, 39);
		contentPane.add(btn_spiel);
		
		JButton btn_einstellungen = new JButton("Einstellungen");
		btn_einstellungen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Informationen().setVisible(true);
				setVisible(false);
			}
		});
		btn_einstellungen.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_einstellungen.setBounds(185, 107, 140, 39);
		contentPane.add(btn_einstellungen);
		
		JButton btn_informationen = new JButton("Informationen");
		btn_informationen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Einstellungen().setVisible(true);
				setVisible(false);
			}
		});
		btn_informationen.setFont(new Font("Lucida Grande", Font.PLAIN, 16));
		btn_informationen.setBounds(185, 172, 140, 39);
		contentPane.add(btn_informationen);
	}
}
