package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventanainicio extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventanainicio frame = new Ventanainicio();
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
	public Ventanainicio() {
		setResizable(false);
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 331, 353);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel labelLogo1 = new JLabel("");
		labelLogo1.setIcon(new ImageIcon(Ventanainicio.class.getResource("/imagenesdeljuego/Carta 4.png")));
		labelLogo1.setBounds(141, 50, 87, 115);
		contentPane.add(labelLogo1);
		
		JLabel labelLogo2 = new JLabel("");
		labelLogo2.setIcon(new ImageIcon(Ventanainicio.class.getResource("/imagenesdeljuego/Carta 5.png")));
		labelLogo2.setBounds(99, 27, 87, 115);
		contentPane.add(labelLogo2);
		
		JLabel labelLogo3 = new JLabel("");
		labelLogo3.setIcon(new ImageIcon(Ventanainicio.class.getResource("/imagenesdeljuego/Carta 9.png")));
		labelLogo3.setBounds(44, 65, 87, 115);
		contentPane.add(labelLogo3);
		
		JButton btnContinuar = new JButton("Continuar Partida");
		btnContinuar.setBounds(10, 263, 141, 23);
		contentPane.add(btnContinuar);
		
		JButton btnNuevaPartida = new JButton("Nueva Partida");
		btnNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new Interfazdejuego().setVisible(true);
				dispose();
			}
		});
		btnNuevaPartida.setBounds(177, 263, 138, 23);
		contentPane.add(btnNuevaPartida);
		
		JLabel lblTwenty = new JLabel("TWENTY 48");
		lblTwenty.setBackground(new Color(0, 0, 0));
		lblTwenty.setForeground(new Color(0, 0, 0));
		lblTwenty.setFont(new Font("Tw Cen MT", Font.BOLD, 30));
		lblTwenty.setHorizontalAlignment(SwingConstants.CENTER);
		lblTwenty.setBounds(69, 192, 184, 23);
		contentPane.add(lblTwenty);
	}
}
