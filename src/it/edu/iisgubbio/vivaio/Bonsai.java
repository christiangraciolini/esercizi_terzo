package it.edu.iisgubbio.vivaio;



public class Bonsai extends Pianta implements Imballabile{
	private int età;

	public Bonsai(String nome, double costo, int età) {
		super(nome, costo);
		this.età = età;
	}



	public int getEtà() {
		return età;
	}



	public void setEtà(int età) {
		this.età = età;

	}

	public boolean vecchio() {
		return età>20;
	}



	@Override

	public String toString() {
		String descrizione="il bonsai ha: "+età+"anni";
		if(this.vecchio()) {
			descrizione+= " ,il bonsai è vecchio";
		}else {
			descrizione+= " ,il bonsai è giovane";
		}
		return descrizione;
	}

	@Override

	public double getVolumeImballo() {
		return 8;
	}

	@Override

	public int getUnitaPerImballo() {
		return 1;
	}

	



}

