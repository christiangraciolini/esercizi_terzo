package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ScambioPosizione extends Application{
	
	Label eNumeri = new Label("numeri");
	TextField cNumeri = new TextField();
	Button pInverti = new Button("inverti");
	Label eInvertito = new Label();
	TextField cInvertito = new TextField();

	public void start(Stage finestra) throws Exception {
		
		GridPane griglia = new GridPane();
		griglia.add(eNumeri, 0, 0);
		griglia.add(cNumeri, 1, 0);
		griglia.add(pInverti, 1, 1);
		griglia.add(eInvertito, 0, 2);
		griglia.add(cInvertito, 1, 2);
	

		Scene scene = new Scene(griglia);
		scene.getStylesheets().add("it/edu/iisgubbio/vettori/stile.css");
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		pInverti.setOnAction( e -> eseguiInverti());
		
		
	}
	
	int[] testoNumeri (String testo) {
		String parti[];
		int numeri[];
		parti = testo.split(" ");
		numeri = new int[parti.length];
		for (int i = 0; i < parti.length; i++) {
			numeri[i] = Integer.parseInt(parti[i]);
		}

		return numeri;
	}

	private void eseguiInverti() {
		
		String x, risultato = ""; 
		int numeri[], numeriInvertiti[],contatore=0;
		
		x = cNumeri.getText();
		numeri = testoNumeri(x);
		contatore = numeri.length-1;
		numeriInvertiti = new int[numeri.length];
		
		for(int i=0;i<numeri.length;i++) {
			numeriInvertiti[contatore]=numeri[i];
			contatore--;
		}
		for (int i = 0; i < numeri.length; i++) {
			if(risultato == "") {
				risultato+= " " + numeri[i];
			} else {
				risultato+= "; " + numeri[i];

			}
		cInvertito.setText(numeriInvertiti+"");
	}
	public static void main(String[] args) {
		launch(args);
	}

}
