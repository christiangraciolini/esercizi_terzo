package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Duplicati extends Application{
	
	TextField cNumeri = new TextField();
	Button pTrova = new Button("trova duplicati");
	Label eRisultato = new Label();

	@Override
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(cNumeri, 0, 0, 3, 1);
		g.add(pTrova, 0, 1, 3, 1);
		g.add(eRisultato, 0, 2, 3, 1);
		cNumeri.setPrefWidth(300);
		eRisultato.setPrefWidth(300);
		
		Scene scena = new Scene(g);
	    finestra.setTitle("Griglia");
	    finestra.setScene(scena);
	    finestra.show();
		
	    pTrova.setOnAction( e -> eseguitrova());
		
	}

	private void eseguitrova() {
		
		String testo,parti[];
		int  numeri[] ;
		boolean controllo = false;
		
		testo=cNumeri.getText();
		parti=testo.split(" ");
		numeri = new int[parti.length];
		for (int i = 0; i<numeri.length; i++) {
			numeri[i] = Integer.parseInt(parti[i]);
		}
		for (int i = 0;i < parti.length-1;i++) {
			if (numeri[i]==numeri[i+1]) {
				controllo = true;
			}
		}
		if (controllo == true) {
			eRisultato.setText("ci sono dei duplicati");
		} else {
			eRisultato.setText("non ci sono dei duplicati");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}

}
