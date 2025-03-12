package it.edu.iisgubbio.mobilita.mezzi;

public class AMotore extends MezzoDiTrasporto{
	
	private double rumorosita;
	private String carburante;
	public AMotore() {
		super();
	}
	public AMotore(double costo, String nome, double rumorosita, String carburante) {
		super(costo, nome);
		this.rumorosita = rumorosita;
		this.carburante = carburante;
	}
	@Override
	public String toString() {
		return "AMotore [rumorosita=" + rumorosita + ", carburante=" + carburante + "]";
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
	
