package it.edu.iisgubbio.mobilita.mezzi;

public class Skateboard extends MezzoDiTrasporto{
	public int lunghezza;

	public Skateboard(double costo, String nome) {
		super();
		this.costo = costo;
		this.nome = nome;
	}

	public Skateboard(int lunghezza,double costo, String nome) {
		super();
		this.costo = costo;
		this.nome = nome;
		this.lunghezza = lunghezza;
	}

	

}
