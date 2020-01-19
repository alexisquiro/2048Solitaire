package ventanas;

public class Carta {
 
	private int exponente;

	
	
	/*constructor*/
	public Carta (int exponente ) {
		this.exponente=exponente;
		
	}
	
	/*get and set*/
	public int getExponente() {
		return exponente;
	}

	
	public void setExponente(int ram) {
		this.exponente = ram;
	}
   /*end. */
	
	
	public int Numero() {
		int valor=2;
		for(int i=1;i<this.exponente;i++) {
					valor*=2;
		}
		
		return valor;
	}
	
	
	
	
	
	
}
