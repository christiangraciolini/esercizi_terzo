package it.edu.iisgubbio.battaglianavale;

public class Pezzo {
	
	protected int  x;
	protected int y;
	protected boolean colpito;
	
	public boolean colpo(int x,int y) {
		if(colpito) {
			return true;
		}else{
			return true;
		}
		
	}

	public Pezzo(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public boolean isColpito() {
		return colpito;
	}

	@Override
	public String toString() {
		return "Pezzo [x=" + x + ", y=" + y + ", colpito=" + colpito + "]";
	} 
	
	
	
}
