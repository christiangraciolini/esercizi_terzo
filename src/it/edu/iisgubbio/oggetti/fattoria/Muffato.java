package it.edu.iisgubbio.oggetti.fattoria;

public class Muffato extends Formaggio{

	protected String nomeMuffa;
	protected boolean interno;
	public Muffato(String nome, double prezzoAlKg,   String nomeMuffa) {
		super(nome, prezzoAlKg, 0, false);
		this.nomeMuffa = nomeMuffa;
		this.interno = true;

	}

	public void setInterno(boolean interno) {
		this.interno = interno;
	}
	
}


