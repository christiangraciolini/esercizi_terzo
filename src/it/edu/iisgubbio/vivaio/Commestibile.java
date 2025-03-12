package it.edu.iisgubbio.vivaio;



public class Commestibile extends Pianta implements Imballabile{
	private int quantità;
	private int stagioneProduzione;
	
	public Commestibile(String nome, double costo) {
		super(nome, costo);
		this.quantità = quantità;
		this.stagioneProduzione = stagioneProduzione;
	}



	public int getQuantità() {
		return quantità;
	}



	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}



	public String getStagioneProduzione() {
		String x;
		switch (stagioneProduzione) {
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
			x=" ";
		}
		return x;

	}



	public void setStagioneProduzione(String s) {
		switch (s) {
		case "primavera":
			stagioneProduzione=1;
			break;
		case "estate":
			stagioneProduzione=2;
			break;
		case "autunno":
			stagioneProduzione=3;
			break;
		case "inverno":
			stagioneProduzione=4;
			default:
				stagioneProduzione=0;
		}

	}



	@Override
	public String toString() {
		return "Nome"+getNome()+"costo"+getCosto()+"quantita"+quantità+"kg"+"la stagione di produzione è"+getStagioneProduzione();
	}



	public double getVolumeImballo() {
		return 16;
	}

	public int getUnitaPerImballo() {
		return 20;
	}

}


