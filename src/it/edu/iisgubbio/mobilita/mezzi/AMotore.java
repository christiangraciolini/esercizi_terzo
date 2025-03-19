package it.edu.iisgubbio.mobilita.mezzi;

public class AMotore extends MezzoDiTrasporto{
	
	private double rumorosita;
	private String carburante;
	public AMotore() {
		super();
	}
	public AMotore(String nome,double costo,  double rumorosita, String carburante) {
		super(nome, costo);
		this.rumorosita = rumorosita;
		this.carburante = carburante;
	}
	@Override
	public String toString() {
		return "mezzo motorizzato:"+nome+"("+costo+"€)"+"che emette"+rumorosita+"db di rumore, consuma "+carburante;
	}
	public boolean possibileCemtriAbitati() {
		
		boolean possibile=true;
		if (rumorosita<=68) {//verifico se la rumorosita del mezzo è adatta ai centri abitati
			possibile =true;
		}else {
			possibile =false;
		}
		return possibile;
	}
	
	public double getRumorosita() {
		return rumorosita;
	}
	public void setRumorosita(double rumorosita) {
		this.rumorosita = rumorosita;
	}
	public String getCarburante() {
		return carburante;
	}
	public void setCarburante(String carburante) {
		this.carburante = carburante;
	}
}
	
