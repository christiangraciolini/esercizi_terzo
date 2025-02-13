package it.edu.iisgubbio.oggetti.animali.testi;

import it.edu.iisgubbio.oggetti.animali.cani.Cane;
import it.edu.iisgubbio.oggetti.animali.cani.Cuccia;

public class ProvaAnimati {


	public static void main(String[] args) {
		
		Cane laky;
		Cane billy;
		Cuccia cuccia;
		
		laky = new Cane();
		billy = new Cane();
		cuccia = new Cuccia();
		cuccia.setInterno(false);
		cuccia.setPrezzo(87);
		cuccia.setNumerodeiposti(1);
		
		System.out.println(laky);
		System.out.println(billy);
		

	}

}
