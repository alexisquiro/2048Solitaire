package ventanas;
import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.Dialog.ModalityType;
import java.awt.event.ActionEvent;

public class Ventanapause extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			Ventanapause dialog = new Ventanapause();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	
	public Ventanapause() {
		setAlwaysOnTop(true);
		setResizable(false);
		setModalityType(ModalityType.APPLICATION_MODAL);
		setBounds(100, 100, 190, 237);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			/*Este boton permite abandonar el juego, guardando además la partida*/
			JButton btnSalir = new JButton("Salir");
			btnSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					System.exit(0);
				}
			});
			btnSalir.setBounds(48, 128, 89, 23);
			contentPanel.add(btnSalir);
		}
		{
			/*Este boton permite crear una nueva partida*/
			JButton btnReiniciar = new JButton("Reiniciar");
			btnReiniciar.setBounds(48, 94, 89, 23);
			contentPanel.add(btnReiniciar);
		}
		{
			/*Este boton solo cierra la ventana de pause para continuar la partida*/
			JButton btnContinuar = new JButton("Continuar");
			btnContinuar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dispose();
				}
			});
			btnContinuar.setBounds(48, 60, 89, 23);
			contentPanel.add(btnContinuar);
		}
		{
			JLabel lblPause = new JLabel("PAUSE");
			lblPause.setFont(new Font("Times New Roman", Font.BOLD, 26));
			lblPause.setBounds(48, 11, 89, 29);
			contentPanel.add(lblPause);
		}
		{
			JLabel labelFondo = new JLabel("");
			labelFondo.setIcon(new ImageIcon(Ventanapause.class.getResource("/imagenesdeljuego/Fondo blanco.jpg")));
			labelFondo.setBounds(0, 0, 184, 208);
			contentPanel.add(labelFondo);
		}
	}


	

}
