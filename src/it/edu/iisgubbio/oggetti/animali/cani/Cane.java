package it.edu.iisgubbio.oggetti.animali.cani;

public class Cane{
	
	private String nome;
	private String razza;
	private int anno;
	private int grammiCibo;
	private String nomeProprietario;
	
	public Cane() {
		
		nome = "";
		razza = "";
		nomeProprietario="";
		anno = 0;
		grammiCibo = 0;
	}

	public Cane(String nome, String razza, int anno, int grammiCibo, String nomeProprietario) {
		super();
		this.nome = nome;
		this.razza = razza;
		this.anno = anno;
		this.grammiCibo = grammiCibo;
		this.nomeProprietario = nomeProprietario;
	}
	
	public String toString() {
		return "il nome del cane è:" + nome + "tipo di razza:" + razza;
	}
	
		
		
	
}
