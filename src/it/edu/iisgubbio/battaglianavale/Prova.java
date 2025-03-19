package it.edu.iisgubbio.battaglianavale;

public class Prova {
	
	public static void main(String[] args) {
		
		System.out.println("------------NAVE------------");
		Nave nave = new Nave("nave",1,1,3,true);
		System.out.println(nave);
		boolean c = nave.colpo(1, 1);
		System.out.println("risultato colpo"+c);
		System.out.println(nave);
		System.out.println(nave.affondata());
		nave.colpo(2, 1);
		nave.colpo(3, 1);
		System.out.println(nave.affondata());
		System.out.println(nave);
	}
}