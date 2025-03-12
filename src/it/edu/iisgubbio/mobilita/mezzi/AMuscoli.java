package it.edu.iisgubbio.mobilita.mezzi;

public class AMuscoli extends MezzoDiTrasporto{
	
	public String muscoliCoinvolti;

	public AMuscoli() {
		super();
	}

	public AMuscoli(String muscoliCoinvolti) {
		super();
		this.muscoliCoinvolti = muscoliCoinvolti;
	}

	public AMuscoli(double costo, String nome, String muscoliCoinvolti) {
		super(costo, nome);
		this.muscoliCoinvolti = muscoliCoinvolti;
	}
	public boolean parteAlta() {
		boolean parteAlta = true;
		if (muscoliCoinvolti.equals("addome")) {
			return parteAlta;
		} else {
			if (muscoliCoinvolti.equals("bicipite")) {
				return parteAlta;
			}else {
				if (muscoliCoinvolti.equals("tricipite")) {
					return parteAlta;
				} else {
					if (muscoliCoinvolti.equals("pettorale")) {
						return parteAlta;
					} else {
						return parteAlta = false;
					}
				}
			}
		}
	}

	@Override
	public String toString() {
		String descrizione = "AMuscoliCoinvolti="+muscoliCoinvolti+"nome="+nome+"costo"+costo;
		if (parteAlta()) {
			descrizione=descrizione+"i muscoli fanno parte della parte alta";
		} else {
			descrizione=descrizione+"i muscoli non fanno parte della parte alta";
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
