package it.edu.iisgubbio.mobilita.mezzi;

public class Skateboard extends MezzoDiTrasporto{
	public int lunghezza;

	public Skateboard( String nome, double costo) {
		super();
		this.nome = nome;
		this.costo = costo;
		
	}

	public Skateboard(String nome, double costo,int lunghezza ) {
		super();
		this.costo = costo;
		this.nome = nome;
		this.lunghezza = lunghezza;
	}

	@Override
	public String toString() {
		String skate;
		if (longboard()) {
			skate = "Skateboard longboard:"+"lungo"+lunghezza+"cm"+ "costa"+costo+"€";
		} else {
			skate = "Skateboard:"+"lungo"+lunghezza+"cm"+ "costa"+costo+"€";
		}
		return skate;
	}

	public boolean longboard() {
		boolean longboard = false;
		if (lunghezza>80) {
			longboard = true;
		} else {
			longboard = false;
		}
		return longboard;
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}

}
