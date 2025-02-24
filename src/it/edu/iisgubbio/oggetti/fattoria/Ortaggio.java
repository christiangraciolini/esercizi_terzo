package it.edu.iisgubbio.oggetti.fattoria;

public class Ortaggio extends Prodotto{
	protected boolean biologico;
	public Ortaggio(String nome, double prezzoAlKg,boolean biologico ) {
		super(nome,prezzoAlKg);
		this.biologico = biologico
	}
	public boolean isBiologico() {
		return biologico;
	}
	
	
	@Override
	public String toString() {
		return "Ortaggio [biologico=" + biologico + "]";
	}
	
	
}
