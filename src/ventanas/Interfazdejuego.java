package ventanas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Window.Type;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


import java.util.Random;
import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Window;

public class Interfazdejuego extends JFrame {

	private JPanel contentPane;

	  Columna c1=new Columna();
	  Columna c2=new Columna();
	  Columna c3=new Columna();
	  Columna c4=new Columna();
	  Columna mazo=new Columna();
	  Columna discar=new Columna();  
	  //Puntaje score=new Puntaje();
	private   int pt=0;
	private int cont=0;
	private int max=0;
	  private JTextField Score;
	  private JTextField txtRecord;
	  
	  public void Zar(){
			 mazo.Aleatorio();
		 }
	  /**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interfazdejuego frame = new Interfazdejuego();
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
	
	public void imprimir(int pt,int max) {
		if (pt <= 999) Score.setText("" + pt);
		else if (pt > 999999) Score.setText(""+ (String.format("%.2f",(float) pt/100000)) + "M");
		else if (pt> 999) Score.setText(""+ (String.format("%.2f",(float) pt/100)) + "K");
		if (pt > max){
			if (max <= 9999) txtRecord.setText("" + max);
			else if (max > 999999) txtRecord.setText(""+ (String.format("%.2f",(float) max/100000)) + "M");
			else if (max > 9999) txtRecord.setText(""+ (String.format("%.2f",(float) max/1000)) + "K");
		}
		
		
		
		
	}
	
	

	
	
	
	public Interfazdejuego() {
		
		Zar();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource("../imagenesdeljuego/2048logo.png")).getImage());
		setFont(new Font("Constantia", Font.BOLD, 16));
		setTitle("                                        2048 Solitaire");
		setAlwaysOnTop(true);
		setResizable(false);
		setBounds(100, 100, 432, 550);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtRecord = new JTextField(""+ max);
		txtRecord.setBackground(new Color(255, 255, 240));
		txtRecord.setBounds(20, 19, 86, 20);
		txtRecord.setFont(new Font("Times New Roman", Font.BOLD, 14));
		txtRecord.setHorizontalAlignment(SwingConstants.CENTER);
		txtRecord.setBorder(null);
		txtRecord.setFocusable(false);
		txtRecord.setEditable(false);
		contentPane.add(txtRecord);
		txtRecord.setColumns(10);
		
		JLabel labeldis1 = new JLabel("");
		labeldis1.setBounds(320, 394, 86, 115);
		contentPane.add(labeldis1);
		
		Score = new JTextField();
		//Score.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Fondo blanco.png")));
		Score.setBackground(new Color(255, 255, 240));
		Score.setForeground(Color.BLACK);
		Score.setFont(new Font("Times New Roman", Font.BOLD, 14));
		Score.setHorizontalAlignment(SwingConstants.CENTER);
		Score.setText(""+ pt);
		Score.setBorder(null);
		Score.setFocusable(false);
		Score.setEditable(false);
		Score.setBounds(157, 19, 87, 20);
		contentPane.add(Score);
		Score.setColumns(10);
		
		JLabel labelc48 = new JLabel("");
		labelc48.setBounds(311, 255, 87, 115);
		contentPane.add(labelc48);
		
		JLabel labelc47 = new JLabel("");
		labelc47.setBounds(311, 226, 87, 115);
		contentPane.add(labelc47);
		
		JLabel labelc46 = new JLabel("");
		labelc46.setBounds(311, 197, 87, 115);
		contentPane.add(labelc46);
		
		JLabel labelc45 = new JLabel("");
		labelc45.setBounds(311, 172, 87, 115);
		contentPane.add(labelc45);
		
		JLabel labelc44 = new JLabel("");
		labelc44.setBounds(311, 146, 87, 115);
		contentPane.add(labelc44);
		
		JLabel labelc43 = new JLabel("");
		labelc43.setBounds(311, 114, 87, 115);
		contentPane.add(labelc43);
		
		JLabel labelc42 = new JLabel("");
		labelc42.setBounds(311, 86, 87, 115);
		contentPane.add(labelc42);
		
		JLabel labelc41 = new JLabel("");
		//labelc41.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 8.png")));
		labelc41.setBounds(311, 60, 87, 115);
		contentPane.add(labelc41);
		
		JLabel labelc38 = new JLabel("");
		labelc38.setBounds(214, 255, 87, 115);
		contentPane.add(labelc38);
		
		JLabel labelc37 = new JLabel("");
		labelc37.setBounds(214, 226, 87, 115);
		contentPane.add(labelc37);
		
		JLabel labelc36 = new JLabel("");
		labelc36.setBounds(214, 203, 87, 115);
		contentPane.add(labelc36);
		
		JLabel labelc35 = new JLabel("");
		labelc35.setBounds(214, 172, 87, 115);
		contentPane.add(labelc35);
		
		JLabel labelc34 = new JLabel("");
		labelc34.setBounds(214, 146, 87, 115);
		contentPane.add(labelc34);
		
		JLabel labelc33 = new JLabel("");
		labelc33.setBounds(214, 114, 87, 115);
		contentPane.add(labelc33);
		
		JLabel labelc32 = new JLabel("");
		labelc32.setBounds(214, 86, 87, 115);
		contentPane.add(labelc32);
		
		JLabel labelc31 = new JLabel("");
		//labelc31.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 9.png")));
		labelc31.setBounds(214, 60, 87, 115);
		contentPane.add(labelc31);
		
		JLabel labelc28 = new JLabel("");
		labelc28.setBounds(117, 255, 87, 115);
		contentPane.add(labelc28);
		
		JLabel labelc27 = new JLabel("");
		labelc27.setBackground(new Color(255, 250, 250));
		labelc27.setBounds(117, 226, 87, 115);
		contentPane.add(labelc27);
		
		JLabel labelc26 = new JLabel("");
		labelc26.setBounds(117, 203, 87, 115);
		contentPane.add(labelc26);
		
		JLabel labelc25 = new JLabel("");
		labelc25.setBounds(117, 178, 87, 115);
		contentPane.add(labelc25);
		
		JLabel labelc24 = new JLabel("");
		labelc24.setBounds(117, 146, 87, 115);
		contentPane.add(labelc24);
		
		JLabel labelc23 = new JLabel("");
		labelc23.setBounds(117, 114, 87, 115);
		contentPane.add(labelc23);
		
		JLabel labelc22 = new JLabel("");
		labelc22.setBounds(117, 86, 87, 115);
		contentPane.add(labelc22);
		
		JLabel labelc21 = new JLabel("");
		//labelc21.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 4.png")));
		labelc21.setBounds(117, 60, 87, 115);
		contentPane.add(labelc21);
		
		JLabel labelc18 = new JLabel("");
		labelc18.setBounds(20, 255, 87, 115);
		contentPane.add(labelc18);
		
		JLabel labelc17 = new JLabel("");
		labelc17.setBounds(20, 226, 87, 115);
		contentPane.add(labelc17);
		
		JLabel labelc16 = new JLabel("");
		labelc16.setBounds(20, 203, 87, 115);
		contentPane.add(labelc16);
		
		JLabel labelc15 = new JLabel("");
		//labelc15.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 3.png")));
		labelc15.setBounds(20, 178, 87, 115);
		contentPane.add(labelc15);
		
		JLabel labelc14 = new JLabel("");
		//labelc14.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 7.png")));
		labelc14.setBounds(20, 146, 87, 115);
		contentPane.add(labelc14);
		
		JLabel labelc13 = new JLabel("");
		//labelc13.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 6.png")));
		labelc13.setBounds(20, 114, 87, 115);
		contentPane.add(labelc13);
		
		JLabel labelc12 = new JLabel("");
		//labelc12.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 5.png")));
		labelc12.setBounds(20, 86, 87, 115);
		contentPane.add(labelc12);
		
		JLabel labelc11 = new JLabel("");
		//labelc11.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 10.png")));
		labelc11.setBounds(20, 60, 87, 115);
		contentPane.add(labelc11);
		
		JLabel labelram1 = new JLabel("");
		//labelram1.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 2.png")));
		labelram1.setBounds(196, 394, 87, 115);
		contentPane.add(labelram1);
		
		JLabel labelram2 = new JLabel("");
	//	labelram2.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 6.png")));
		labelram2.setBounds(157, 394, 87, 115);
		contentPane.add(labelram2);
		
		JLabel lblRecord = new JLabel("Record");
		lblRecord.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblRecord.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecord.setBorder(null);
		lblRecord.setFocusable(false);
		//lblRecord.setEditable(false);
		lblRecord.setBounds(28, 20, 87, 14);
		contentPane.add(lblRecord);
		
		JLabel lblScore = new JLabel("nhny");
		lblScore.setHorizontalAlignment(SwingConstants.CENTER);
		lblScore.setFont(new Font("Times New Roman", Font.BOLD, 16));
		lblScore.setBounds(156, 20, 104, 14);
		contentPane.add(lblScore);
		
		JLabel labeldiscard = new JLabel("");
		labeldiscard.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/CartaDescarte.png")));
		labeldiscard.setBounds(319, 394, 87, 115);
		contentPane.add(labeldiscard);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Punteada.jpg")));
		label.setBounds(10, 381, 409, 14);
		contentPane.add(label);
		
		JButton volver = new JButton("");
		volver.setBorderPainted(false);
		volver.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Atras.png")));
		volver.setBounds(28, 429, 40, 36);
		contentPane.add(volver);
		
		JButton pause = new JButton("");
		pause.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				new Ventanapause().setVisible(true);
				
				
		
			}
		});
		pause.setBorderPainted(false);
		pause.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/BotonPause.png")));
		pause.setBounds(377, 11, 29, 23);
		contentPane.add(pause);
		
		JLabel labelx = new JLabel("X2");
		labelx.setHorizontalAlignment(SwingConstants.CENTER);
		labelx.setFont(new Font("Verdana", Font.BOLD, 12));
		labelx.setForeground(Color.BLACK);
		labelx.setBounds(289, 20, 29, 14);
		labelx.setOpaque(true);
		labelx.setBackground(Color.ORANGE);
		contentPane.add(labelx);
		
		JLabel labelFondo = new JLabel("");
		labelFondo.setBackground(new Color(255, 255, 240));
		labelFondo.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Fondo blanco.jpg")));
		labelFondo.setBounds(0, 0, 419, 511);
		contentPane.add(labelFondo);
		Zar();
		 mazo.Imagen(mazo.c[0],labelram1);
		 mazo.Imagen(mazo.c[1],labelram2);
		 
		JButton bc1 = new JButton("");
		bc1.setOpaque(false);
		bc1.setBorderPainted(false);
		bc1.setContentAreaFilled(true);
		 
		bc1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			c1.Put(mazo.c[0].getExponente());
			
		if (c1.c[7]==null){
			
			mazo.c[0].setExponente(mazo.c[1].getExponente());
			Zar();
			 mazo.Imagen(mazo.c[0],labelram1);
			 mazo.Imagen(mazo.c[1],labelram2);
			 c1.Imagen(c1.c[0],labelc11);	
			 c1.Imagen(c1.c[1],labelc12);	
			 c1.Imagen(c1.c[2],labelc13);	
			 c1.Imagen(c1.c[3],labelc14);
			 c1.Imagen(c1.c[4],labelc15);	
			 c1.Imagen(c1.c[5],labelc16);	
			 c1.Imagen(c1.c[6],labelc17);
			 c1.Imagen(c1.c[7],labelc18);
			// score.Sumar(c1.getScore());
			 pt+=c1.getScore();
			System.out.println(""+pt);
			//Score.setText("" + pt);
			cont++;
			 System.out.println(""+ cont);
			imprimir(pt,max);
			 
		}else{
			if (c1.c[7].getExponente()== mazo.c[0].getExponente()){
				c1.c[7].setExponente(c1.c[7].getExponente()+1);
				mazo.c[0].setExponente(mazo.c[1].getExponente());
				Zar();
				c1.Sumar();
				 pt+=c1.getScore();
				//Score.setText("" + pt);
				mazo.Imagen(mazo.c[0],labelram1);
				mazo.Imagen(mazo.c[1],labelram2);
				c1.Imagen(c1.c[0],labelc11);	
				c1.Imagen(c1.c[1],labelc12);	
				c1.Imagen(c1.c[2],labelc13);	
				c1.Imagen(c1.c[3],labelc14);
				c1.Imagen(c1.c[4],labelc15);	
				c1.Imagen(c1.c[5],labelc16);	
				c1.Imagen(c1.c[6],labelc17);
				c1.Imagen(c1.c[7],labelc18);
				cont++;
				 System.out.println(""+ cont);
				 imprimir(pt,max);
				
			}
		}
		}

		
		
		});
		bc1.setBounds(18, 52, 89, 318);
		contentPane.add(bc1);
//------------------------------------------------------------------------------		
		JButton bc3 = new JButton("");		
		bc3.setOpaque(false);
		bc3.setBorderPainted(false);
		bc3.setContentAreaFilled(true);
		bc3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c3.Put(mazo.c[0].getExponente());
				
				if (c3.c[7]==null){
				
				mazo.c[0].setExponente(mazo.c[1].getExponente());
				mazo.c[1]=null;
				Zar();
				
				mazo.Imagen(mazo.c[0],labelram1);
				mazo.Imagen(mazo.c[1],labelram2);
				c3.Imagen(c3.c[0],labelc31);	
				c3.Imagen(c3.c[1],labelc32);	
				c3.Imagen(c3.c[2],labelc33);	
				c3.Imagen(c3.c[3],labelc34);
				c3.Imagen(c3.c[4],labelc35);	
				c3.Imagen(c3.c[5],labelc36);	
				c3.Imagen(c3.c[6],labelc37);
				c3.Imagen(c3.c[7],labelc38);
				pt+=c3.getScore();
				//Score.setText("" + pt);
				cont++;
				 System.out.println(""+ cont);
				 imprimir(pt,max);
				 
				}else{
					if (c3.c[7].getExponente()== mazo.c[0].getExponente()){
						c3.c[7].setExponente(c3.c[7].getExponente()+1);
						mazo.c[0].setExponente(mazo.c[1].getExponente());
						Zar();
						c3.Sumar();
						 pt+=c3.getScore();
						//Score.setText("" + pt);
						mazo.Imagen(mazo.c[0],labelram1);
						mazo.Imagen(mazo.c[1],labelram2);
						c3.Imagen(c3.c[0],labelc31);	
						c3.Imagen(c3.c[1],labelc32);	
						c3.Imagen(c3.c[2],labelc33);	
						c3.Imagen(c3.c[3],labelc34);
						c3.Imagen(c3.c[4],labelc35);	
						c3.Imagen(c3.c[5],labelc36);	
						c3.Imagen(c3.c[6],labelc37);
						c3.Imagen(c3.c[7],labelc38);
						cont++;
						 System.out.println(""+ cont);
						 imprimir(pt,max);
						 
						 
					}
				}
				
			}
		});
		bc3.setBounds(212, 60, 89, 310);
		contentPane.add(bc3);
//-------------------------------------------------------------------------------------------
		JButton bc2 = new JButton("");
		bc2.setOpaque(false);
		bc2.setBorderPainted(false);
		bc2.setContentAreaFilled(true);
		bc2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c2.Put(mazo.c[0].getExponente());
				
				if (c2.c[7]==null){
				
				mazo.c[0].setExponente(mazo.c[1].getExponente());
				mazo.c[1]=null;
				Zar();
				 mazo.Imagen(mazo.c[0],labelram1);
				 mazo.Imagen(mazo.c[1],labelram2);
				 c2.Imagen(c2.c[0],labelc21);	
				 c2.Imagen(c2.c[1],labelc22);	
				 c2.Imagen(c2.c[2],labelc23);	
				 c2.Imagen(c2.c[3],labelc24);
				 c2.Imagen(c2.c[4],labelc25);	
				 c2.Imagen(c2.c[5],labelc26);	
				 c2.Imagen(c2.c[6],labelc27);
				 c2.Imagen(c2.c[7],labelc28);
				 pt+=c2.getScore();
				// Score.setText("" + pt);
				 cont++;
				 System.out.println(""+ cont);
				 imprimir(pt,max);
				}
				else{
					if (c2.c[7].getExponente()== mazo.c[0].getExponente()){
						c2.c[7].setExponente(c2.c[7].getExponente()+1);
						mazo.c[0].setExponente(mazo.c[1].getExponente());
						Zar();
						c2.Sumar();
						 pt+=c2.getScore();
						 cont++;
						//Score.setText("" + pt);
						mazo.Imagen(mazo.c[0],labelram1);
						mazo.Imagen(mazo.c[1],labelram2);
						c2.Imagen(c2.c[0],labelc21);	
						c2.Imagen(c2.c[1],labelc22);	
						c2.Imagen(c2.c[2],labelc23);	
						c2.Imagen(c2.c[3],labelc24);
						c2.Imagen(c2.c[4],labelc25);	
						c2.Imagen(c2.c[5],labelc26);	
						c2.Imagen(c2.c[6],labelc27);
						c2.Imagen(c2.c[7],labelc28);
						 System.out.println(""+ cont);
						 imprimir(pt,max);
					}
				}
				
			}
		});
		bc2.setBounds(117, 52, 89, 318);
		contentPane.add(bc2);
		/*if (pt <= 9999) textFieldScore.setText("" + pt);
				else if (pt > 999999) Score.setText(""+ (String.format("%.2f",(float) pt/100000)) + "M");
				else if (pt> 9999) Score.setText(""+ (String.format("%.2f",(float) pt/1000)) + "K");
				if (pt > max){
					if (max <= 9999) txtdRecordT.setText("" + max);
					else if (max > 999999) txtdRecordT.setText(""+ (String.format("%.2f",(float) max/100000)) + "M");
					else if (max > 9999) txtRecordT.setText(""+ (String.format("%.2f",(float) max/1000)) + "K");
				}*/
//----------------------------------------------------------------------------------
		JButton bc4 = new JButton("");
		bc4.setOpaque(false);
		bc4.setBorderPainted(false);
		bc4.setContentAreaFilled(true);
		bc4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				c4.Put(mazo.c[0].getExponente());
				
				if (c4.c[7]==null){
				
				mazo.c[0].setExponente(mazo.c[1].getExponente());
				mazo.c[1]=null;
				Zar();
				 mazo.Imagen(mazo.c[0],labelram1);
				 mazo.Imagen(mazo.c[1],labelram2);
				 c4.Imagen(c4.c[0],labelc41);	
				 c4.Imagen(c4.c[1],labelc42);	
				 c4.Imagen(c4.c[2],labelc43);	
				 c4.Imagen(c4.c[3],labelc44);
				 c4.Imagen(c4.c[4],labelc45);	
				 c4.Imagen(c4.c[5],labelc46);	
				 c4.Imagen(c4.c[6],labelc47);
				 c4.Imagen(c4.c[7],labelc48);
				 pt+=c4.getScore();
				//Score.setText("" + pt);
				cont++;
				imprimir(pt,max);
				 System.out.println(""+ cont);
				}else{
					if (c4.c[7].getExponente()== mazo.c[0].getExponente()){
						c4.c[7].setExponente(c4.c[7].getExponente()+1);
						mazo.c[0].setExponente(mazo.c[1].getExponente());
						mazo.c[1]=null;
						Zar();
						c4.Sumar();
						 pt+=c4.getScore();
						 cont++;
					//	Score.setText("" + pt);
						mazo.Imagen(mazo.c[0],labelram1);
						mazo.Imagen(mazo.c[1],labelram2);
						c4.Imagen(c4.c[0],labelc41);	
						c4.Imagen(c4.c[1],labelc42);	
						c4.Imagen(c4.c[2],labelc43);	
						c4.Imagen(c4.c[3],labelc44);
						c4.Imagen(c4.c[4],labelc45);	
						c4.Imagen(c4.c[5],labelc46);	
						c4.Imagen(c4.c[6],labelc47);
						c4.Imagen(c4.c[7],labelc48);
						 System.out.println(""+ cont);
						 imprimir(pt,max);
						
					}
				}
			
			}
		});
		bc4.setBounds(311, 60, 89, 310);
		contentPane.add(bc4);
		
		JButton bdiscard = new JButton("");
		bdiscard.setOpaque(false);
		bdiscard.setBorderPainted(false);
		bdiscard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(cont>=40) {
				  if(discar.c[0]!=null) {
					  
					mazo.c[0].setExponente(discar.c[0].getExponente());  
					  discar.c[0]=null;
					  mazo.Imagen(mazo.c[0],labelram1);
					  discar.Imagen(discar.c[0], labeldis1);
					cont=0;
					  
				  }

				}else {
					
					if(discar.c[0]==null) {
						discar.Put(mazo.c[0].getExponente());
						mazo.c[0].setExponente(mazo.c[1].getExponente());
						mazo.c[1]=null;
						Zar();
						discar.Imagen(discar.c[0],labeldis1);
						mazo.Imagen(mazo.c[0],labelram1);
						mazo.Imagen(mazo.c[1],labelram2);
				
					  }
					
					
					
					
					
					
				}
				
				
		
			}
		});
		bdiscard.setBounds(319, 394, 87, 115);
		contentPane.add(bdiscard);
	}
}
