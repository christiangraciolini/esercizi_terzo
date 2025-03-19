package it.edu.iisgubbio.battaglianavale;

public class Nave{
		private Pezzo pezzi[];
		private String nome;



		public Nave(String nome, int x,int y, int lunghezza,boolean direzione) {

			super();
			this.nome=nome;
			pezzi=new Pezzo[lunghezza];
			for(int i=0; i<lunghezza; i++) {
				pezzi[i]=new Pezzo(x+i,y);	
			}
		}

		public boolean colpo(int x, int y) {
			boolean preso=false;
			for(int i=0; i<pezzi.length; i++) {
				if(pezzi[i].colpo(x, y)) {
					preso=true;
				}
			}
			return preso;
		}

		public String toString() {
			String risposta="nave:"+nome;
			for(int i=0; i<pezzi.length; i++) {
				risposta +="\n"+i+":"+pezzi[i].toString();
			}
			return risposta;

		}
		

		public String getNome() {
			return nome;
		}


		public boolean affondata() {
			boolean affondata=false;
			for(int i=0; i<pezzi.length; i++) {
				if(pezzi[i].isColpito()==true) {
					affondata = true;
				} else {
					affondata = false;
				}

			}
			return affondata;

		}
		public boolean sovrappone(Nave altra) {
			
			for(int i=0; i<pezzi.length; i++) {
				for (int iAltra=0;iAltra<altra.pezzi.length;iAltra++) {
					if(pezzi[i].x==altra.pezzi[iAltra].x && pezzi[i].y==altra.pezzi[iAltra].y) {
						return true;
					}
				}
			}
			return false;
			
		}
}


