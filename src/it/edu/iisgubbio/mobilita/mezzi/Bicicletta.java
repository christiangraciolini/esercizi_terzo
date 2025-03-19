package it.edu.iisgubbio.mobilita.mezzi;

public class Bicicletta extends MezzoDiTrasporto{
	
	public int numeroDiRapporti;
	public double peso;
	public Bicicletta(double costo, double peso) {
		super();
		this.peso = peso;
		this.costo = costo;
	}
	@Override
	public String toString() {
		String bici ="bicicletta: "+"pesa "+peso+"kg "+"(leggera) "+"costa "+costo+"€"+"( ha "+numeroDiRapporti+ "rapporti)";
		if(leggera()) {
				bici = bici + "";
			}else {
				bici = "bicicletta: "+"pesa "+peso+"kg "+"(pesante) "+"costa "+costo+"€"+"( ha "+numeroDiRapporti+ "rapporti)";
			}
		return bici;

		}
	
	public boolean leggera() {
		boolean leggera = true;
		if(peso<10) {
			return leggera;
		}else {
			return leggera=false;
		}
	}
	public int getNumeroDiRapporti() {
		return numeroDiRapporti;
	}
	public void setNumeroDiRapporti(int numeroDiRapporti) {
		this.numeroDiRapporti = numeroDiRapporti;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	
}
