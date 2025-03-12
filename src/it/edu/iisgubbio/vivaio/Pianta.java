package it.edu.iisgubbio.vivaio;

public class Pianta {
	
	private String nome;
	private double costo;
	public Pianta(String nome, double costo) {
		super();
		this.nome = nome;
		this.costo = costo;
	}
	public String getNome() {
		return nome;
	}
	public double getCosto() {
		return costo;
	}
	public Pianta() {
		super();
	}
	
	@Override
	public String toString() {
		return "Pianta [nome=" + nome + ", costo=" + costo + "]";
	}
	

}

