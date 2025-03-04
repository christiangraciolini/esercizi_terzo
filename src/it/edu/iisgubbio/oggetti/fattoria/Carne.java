package it.edu.iisgubbio.oggetti.fattoria;

public class Carne extends Prodotto{

	private boolean kosher;
	private boolean carneBianca;
	public Carne(String nome, double prezzoAlKg, boolean kosher, boolean carneBianca) {

		super(nome, prezzoAlKg);
		this.kosher = kosher;
		this.carneBianca = carneBianca;

	}

	@Override
	public String toString() {

		String carne = new String(nome + prezzoAlKg);
		if(!kosher) {
			carne = carne + " NON Kosher ";
		}else {
			carne = carne + " Kosher ";

		}
		if(!carneBianca) {
			carne = carne + " [carne rossa] ";
		}else {
			carne = carne + " [carne bianca] ";
		}
		return carne;
	}

	

	

	public boolean isKosher() {
		return kosher;

	}
	public boolean isCarneBianca() {
		return carneBianca;

	}

	

	

	

	



}

