package it.edu.iisgubbio.vivaio;

public class Fiore extends Pianta{
	
	private String colore;
	private int stagioneFioritura;
	public Fiore(String nome, double costo, String colore, String stagioneFioritura2) {
		super(nome, costo);
		this.colore = colore;
		this.stagioneFioritura = stagioneFioritura2;
	}
	public void setStagioneFioritura(String s) {
		if(s.equals("primavera")) {
			stagioneFioritura = 1;
		} else {
			if(s.equals("estate")) {
				stagioneFioritura=2;
			} else {
				if(s.equals("autunno")) {
					stagioneFioritura=3;
				} else {
					if(s.equals("inverno")) {
						stagioneFioritura=4;
					} else {
						stagioneFioritura=0;
					}
				}
			}
		}
	}
	public String getNome() {
		return colore;
	}
	public void setNome(String colore) {
		this.colore = colore;
	}
	public String getStagioneFioritura() {
		String x = null;
		switch (stagioneFioritura=1) {
		case 1:
			x="primavera";
			break;
		case 2:
			x="estate";
			break;
		case 3:
			x="autunno";
			break;
		case 4:
			x="inverno";
			break;
		default:
			x="nessuna stagione";
		} 
		return x;
	}
	
}
