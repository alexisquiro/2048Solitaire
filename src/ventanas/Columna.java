package ventanas;

import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Columna {

	Carta[] c= {null,null,null,null,null,null,null,null,null};
	private int x=0;
	private  int score=0;
	private int veces=1;
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	public int getScore() {
		int ax=this.score;
	      this.score=0;			
		return ax;


	}
	
	public void setScore(int score) {
		this.score = score;
		
	}
	
/*cuenta las cartas en una columna*/
	public int Contar(){
		int cont=0,i=0;
		while(this.c[i]!=null) {
		     cont++;
		     i++;
	}
	return(cont);
   }
	
	/*suma las cartas exponente ultima y penultima*/
	public void Sumar() {
		 int pos=(Contar()-1);
		if(pos>0){
			
		 if(this.c[pos-1].getExponente()==this.c[pos].getExponente()){
			 this.x++;
			  this.c[pos-1].setExponente(this.c[pos-1].getExponente()+1);
			   this.score+=(this.c[pos-1].Numero())*(this.x)*(this.veces);
			   this.c[pos]=null;
			   Sumar();
		 }
		 this.x=0;
	   }
	}
	//poner la ultima carta
public void Put(int expo) {
		int pos=Contar();
		if(pos==0){
			this.c[pos]=new Carta(expo);
		}
		else if (pos<8){
			this.c[pos]=new Carta(expo);
		   Sumar();
		}
		
	}


public void Aleatorio(){
	 Random ram=new Random();
    if(Contar()>0) {
    	this.c[1]= new Carta(ram.nextInt(6)+1);
	//this.c[1].setExponente(ram.nextInt(6)+1);
    }else {
    	this.c[0]= new Carta(ram.nextInt(6)+1);
    	//this.c[0].setExponente(ram.nextInt(6)+1);
    	this.c[1]= new Carta(ram.nextInt(6)+1);
    	//this.c[1].setExponente(ram.nextInt(6)+1);
    	
    }
	


}


public void Imagen(Carta expo,JLabel vista) {
    if(expo!=null) { 
	if(expo.getExponente()==1){
		
		vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 1.png")));
		
	}
	else if(expo.getExponente()==2){
		
		vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 2.png")));
	
	}
	else if(expo.getExponente()==3) {
		
		vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 3.png")));
		
	}else if(expo.getExponente()==4) {
		
		vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 4.png")));
		
	}
	else if(expo.getExponente()==5) {
			
			vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 5.png")));
			
			
		}
	else  if(expo.getExponente()==6) {
				
				vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 6.png")));
				
				
			}
	
	else if(expo.getExponente()==7) {
					
					vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 7.png")));
					
				}
	else if(expo.getExponente()==8) {
						
						vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 8.png")));
						
						
					}
	else if(expo.getExponente()==9) {
							
							vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 9.png")));
							
							
						}
	else if(expo.getExponente()==10) {
								
								vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 10.png")));
								
								
							}
	else if(expo.getExponente()==11) {
									
									vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("/imagenesdeljuego/Carta 11.png")));
									
								}
    }else {
    	
    	vista.setIcon(new ImageIcon(Interfazdejuego.class.getResource("")));
    	
    	
    	
    }						
										

}


public void verificar() {
	int i=0;
	while(this.c[i]!=null) {
		if(this.c[i].getExponente()==11) {
			this.c[0]=null;
			this.c[1]=null;
			this.c[2]=null;
			this.c[3]=null;
			this.c[4]=null;
			this.c[5]=null;
			this.c[6]=null;
			this.c[7]=null;
			this.veces++;
		}
		
		
		
	}
	
	
	
}



}