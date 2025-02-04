package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class PariDispari extends Application{
	
	TextField cNumeri = new TextField();
	Button pVerifica = new Button("verifica");
	Label eDispari = new Label();
	Label ePari = new Label();

	@Override
	public void start(Stage finestra) throws Exception {
	
		GridPane g = new GridPane();
		g.add(cNumeri, 0, 0, 2, 1);
		g.add(pVerifica, 0, 1, 2, 1);
		g.add(eDispari, 1, 2);
		g.add(ePari, 0, 2);
		cNumeri.setPrefWidth(200);
		pVerifica.setPrefWidth(200);
		eDispari.setPrefWidth(100);
		ePari.setPrefWidth(100);

		Scene scena = new Scene(g);
	    finestra.setTitle("Griglia");
	    finestra.setScene(scena);
	    finestra.show();
		
	    pVerifica.setOnAction( e -> eseguiverifica());
	}
	private void eseguiverifica() {
		
		String testo,parti[];
		int  numeri[], pari=0, dispari=0 ;
		
		testo=cNumeri.getText();
		parti=testo.split(" ");
		numeri = new int[parti.length];
		for (int i = 0; i<numeri.length; i++) {
			numeri[i] = Integer.parseInt(parti[i]);
		}
		for (int i = 0; i<numeri.length; i++) {
			if(numeri[i]%2==0) {
				pari++;
			} else {
				dispari++;
			}
		}
		ePari.setText(pari + "");
		eDispari.setText(dispari + "");
	}
	public static void main(String[] args) {
	    launch(args);
	}

}
