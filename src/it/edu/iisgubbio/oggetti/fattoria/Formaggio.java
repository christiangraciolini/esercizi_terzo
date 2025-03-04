package it.edu.iisgubbio.oggetti.fattoria;



public class Formaggio extends Prodotto {
	protected int tempoStagionatura;
	protected boolean dop;
	public Formaggio(String nome, double prezzoAlKg, int tempoStagionatura, boolean dop) {
		super(nome, prezzoAlKg);
		this.tempoStagionatura = tempoStagionatura;
		this.dop = dop;
	}
	public Formaggio(String nome, double prezzoAlKg, int tempoStagionatura ) {
		super(nome, prezzoAlKg);
		this.tempoStagionatura = tempoStagionatura;
		dop=false;
	}

	public String toString() {
	String descrizione = "il formaggio è " +  nome + " il prezzo al chilo è " + prezzoAlKg;
	if (dop) {
		descrizione=descrizione +" dop";	
	}else {
		descrizione = descrizione + " Non Dop";
	}

	if(tempoStagionatura>0) {
		descrizione = descrizione + "stagiona " + tempoStagionatura + " mesi ";

	}

	return descrizione;
	}
	public void setTempoStagionatura(int tempoStagionatura) {
		this.tempoStagionatura = tempoStagionatura;
	}
	public void setDop(boolean dop) {
		this.dop = dop;
	}
	
}