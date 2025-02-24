package it.edu.iisgubbio.tempo;

public class Test {

	public static void main(String[] args) {
		
		Orario fineLezione = new Orario(13,20,00);
		
		System.out.println(fineLezione.toString());
		fineLezione.aggiungiMinuti(8, 0);
		System.out.println(fineLezione.toString());
		fineLezione.aggiungiSecondi(30, 0);
		System.out.println(fineLezione.toString());
		fineLezione.aggiungiSecondi(40, 0);
		System.out.println(fineLezione.toString());
		
		Orario inPiù = new Orario(1,50,30);
		fineLezione.aggiungiOrario(inPiù);
	}

}
