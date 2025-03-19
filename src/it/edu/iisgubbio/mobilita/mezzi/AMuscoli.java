package it.edu.iisgubbio.mobilita.mezzi;

public class AMuscoli extends MezzoDiTrasporto{
	public  String muscoliCoinvolti;

	public AMuscoli() {
		super();	
	}

	public AMuscoli(String nome, double costo, String muscoliCoinvolti) {
		super(nome, costo);
		this.muscoliCoinvolti = muscoliCoinvolti;
	} 

	public boolean parteAlta () {
		boolean parteAlta=true;
		switch(muscoliCoinvolti) {
		case "bicipiti":
			parteAlta=true;
			break;
		case "tricipiti":
			parteAlta=true;
			break;	
		case "quadricipiti":
			parteAlta=false;
			break;
		case "polpacci":
			parteAlta=false;
			break;
			default:
				parteAlta=false;
		}
		return parteAlta;
	}
	@Override
	public String toString() {
		String descrizione = "veicolo a muscoli: "+ nome+ ", "+costo+"€";
		if (parteAlta()) {
			descrizione=descrizione+"(usa "+muscoliCoinvolti+")";
		} else {
			descrizione=descrizione+"(usa "+muscoliCoinvolti+")";
		}
		return descrizione;
	}

	public String getMuscoliCoinvolti() {
		return muscoliCoinvolti;
	}



	public void setMuscoliCoinvolti(String muscoliCoinvolti) {
		this.muscoliCoinvolti = muscoliCoinvolti;
	}

}


