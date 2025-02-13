package it.edu.iisgubbio.oggetti.animali.cani;

public class Cuccia {
	
	private boolean interno;
	private int prezzo;
	private int numeroDeiPosti;
	private String colore;
	public boolean isInterno() {
		return interno;
	}
	public void setInterno(boolean interno) {
		this.interno = interno;
	}
	public int getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(int prezzo) {
		this.prezzo = prezzo;
	}
	public int getNumerodeiposti() {
		return numeroDeiPosti;
	}
	public void setNumerodeiposti(int numerodeiposti) {
		this.numeroDeiPosti = numerodeiposti;
	}
	public String getColore() {
		return colore;
	}
	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String toString() {
		
		if (colore == null) {
			if (interno == true) {
				return "il prezzo è:"+prezzo+"il numero dei posti è:"+ numeroDeiPosti + "ed è da interno"; 
			} else {
				return "il prezzo è:"+prezzo+"il numero dei posti è:"+ numeroDeiPosti + "ed è da esterno";
			}
				
			
		} else {
			if (colore) {
				return "il prezzo è:"+prezzo+"il numero dei posti è:"+ numeroDeiPosti + "ed è da esterno"+ "il colore è:"+colore;
			} else {
				return "il prezzo è:"+prezzo+"il numero dei posti è:"+ numeroDeiPosti + "ed è da interno"; 
			}
	
	}
	

}
