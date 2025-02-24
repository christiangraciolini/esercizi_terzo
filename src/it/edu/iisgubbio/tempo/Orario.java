package it.edu.iisgubbio.tempo;

public class Orario {
	
	private int ore;
	private int minuto;
	private int secondo;

	public Orario(int ore, int minuto, int secondo) {
		super();
		this.ore = ore;
		this.minuto = minuto;
		this.secondo = secondo;
		
	}
	@Override
	public String toString() {
		return ore + ":" + minuto + ":" + secondo;
	}
	public void aggiungiOre(int ore) {
		this.ore=this.ore + ore;
	}
	@Override
	public void aggiungiMinuti(int minuto, int z) {
		this.minuto=this.minuto + minuto;
		while (this.minuto>=24) {
			this.minuto=this.minuto-24;
			z++;
		}
		this.ore=this.ore+z;
	}
	public void aggiungiSecondi(int secondo, int x) {
		this.secondo=this.secondo + secondo;
		while (this.secondo>=60) {
			this.secondo=this.secondo-60;
			x++;
		}
		this.minuto=this.minuto+x;
			
	}
	public void aggiungiOrario(Orario x) {
		aggiungiOre(x.ore);
		aggiungiMinuti(x.minuto);
		aggiungiSecondi(x.se)
		
	}
}