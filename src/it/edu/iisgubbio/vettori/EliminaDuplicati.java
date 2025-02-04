package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EliminaDuplicati extends Application{
	
	TextField cNumero = new TextField();
	Button pConta = new Button("conta duplicati");
	Button pElimina = new Button("elimina duplicati");
	Label eNum = new Label("numeri:");
	Label eRisp = new Label("risposta:");
	Label eRis = new Label("");
	
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(eNum, 0, 0);
		g.add(cNumero, 1, 0);
		g.add(pElimina, 1, 1);
		g.add(pConta, 1, 2);
		g.add(eRisp, 0, 3);
		g.add(eRis, 1, 3);
		
		Scene scene = new Scene(g);
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		pConta.setOnAction( e -> eseguiConta());
		pElimina.setOnAction( e -> eseguiElimina());
		
	}
	private void eseguiElimina() {
		
		String x, risultato = "";
		int numeri[],vettoreSenzaDuplicati[], puntoInserito = 0;
		boolean p=false;

		x=cNumero.getText();
		numeri=testoNumeri(x);
		vettoreSenzaDuplicati = new int[numeri.length];
		for (int i = 0;i<numeri.length;i++) {
			p = false;
			for (int a= i+1; a < vettoreSenzaDuplicati.length;a++) {
				if(numeri[i]==numeri[a]) {
					p = true;
				}
			}
			if (p == false) {
				vettoreSenzaDuplicati[puntoInserito] = numeri[i];
				puntoInserito++;
			}
		}
		for (int i = 0;i<numeri.length;i++) {
			if (vettoreSenzaDuplicati[i]!=0) {
				if (risultato=="") {
					risultato+= " "+vettoreSenzaDuplicati[i]; 
				} else {
					risultato+= ","+vettoreSenzaDuplicati[i]; 
				}
			}
		}
		eRis.setText(risultato);
	}
	int[] testoNumeri (String testo) {

		String parti[];
		int Numeri[];

		parti= testo.split(" ");
		Numeri= new int[parti.length];
		for(int i=0;i<parti.length;i++) {
			Numeri[i]= Integer.parseInt(parti[i]);
		}

		return Numeri;
	}

	private void eseguiConta() {
		
		String x;
		int numeri[],duplicati=0,contatore=0,finale=0;
		
	    x=cNumero.getText();
	    numeri=testoNumeri(x);
	    for(int i=0;i<numeri.length;i++) {
	    	contatore = 0;
	    	duplicati = 0;
	    	for(int z=i;z<numeri.length;z++) {
	    		if(numeri[i]==numeri[z]) {
	    			contatore++;
	    			if(contatore==2) {
	    				System.out.println(numeri[i]);
	    				duplicati++;
	    				finale+=duplicati;
	    			}
	    		}
	    	}
	    }
	    eRis.setText("il numero di duplicati è "+finale);
	}
	public static void main(String[] args) {
		launch(args);
	}


}
