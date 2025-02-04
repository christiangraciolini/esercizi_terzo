package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Ricerca_max extends Application{

	TextField cValore = new TextField("1 3 6 10");
	TextField cMax = new TextField();
	TextField cPosizione = new TextField();
	TextField cElenco = new TextField();
	Button pRicerca = new Button("ricerca");
	Label eValore = new Label("valore");
	Label eMax = new Label("max");
	Label ePosizione = new Label("posizione");
	Label eElenco = new Label("elenco");


	public void start(Stage finestra) throws Exception {

		GridPane g = new GridPane();
		g.add(eValore, 0, 0);
		g.add(eMax, 0, 1);
		g.add(ePosizione, 0, 2);
		g.add(eElenco, 0, 3);
		g.add(cValore, 1, 0);
		g.add(cMax, 1, 1);
		g.add(cPosizione, 1, 2);
		g.add(cElenco, 1, 3);
		g.add(pRicerca, 1 ,4);

		Scene scene = new Scene(g);
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		pRicerca.setOnAction( e -> eseguiRicerca());
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

	private void eseguiRicerca () {
		
		String x,risultato="";
		int numeri[],posizione = 0,massimo=0;
		
	    x=cValore.getText();
	    numeri=testoNumeri(x);
	    
	    massimo=numeri[0];
	    for(int i=1;i<numeri.length;i++) {
	    	if(numeri[i] > massimo) {
	    		massimo=numeri[i];
	    		posizione = i;
	    	}
	    }
		cMax.setText(massimo+"");
		cPosizione.setText(posizione+"");
		for (int i = 0;i<numeri.length;i++) {
			if (risultato == "") {
				risultato+=" "+numeri[i];
			} else {
				risultato+="; "+numeri[i];
			}
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}


}

