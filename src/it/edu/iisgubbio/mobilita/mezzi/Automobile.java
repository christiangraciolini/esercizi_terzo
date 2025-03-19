package it.edu.iisgubbio.mobilita.mezzi;

public class Automobile extends Terrestre{
	
	private String targa;
	private int numeroPorte;
	
	public Automobile(String nome, double costo,int numeroPorte) {
		super();
		this.numeroPorte = numeroPorte;
		this.nome=nome;

	}

	@Override
	public String toString() {
		return "Automobile: "+nome+" ["+targa+"]";

	}

	public String getTarga() {
		return targa;

	}
	
	public void setTarga(String targa) {
		this.targa = targa;

	}

	public int getNumeroPorte() {
		return numeroPorte;

	}

	public void setNumeroPorte(int numeroPorte) {
		this.numeroPorte = numeroPorte;

	}

}
