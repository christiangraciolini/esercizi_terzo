package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class IP extends Application{
	
	Label eIndirizzo = new Label("indirizzo");
	TextField cIndirizzo = new TextField();
	TextField cRisultato = new TextField();
	Button pVerifica = new Button("verifica");
	
	public void start(Stage finestra) throws Exception {
		
		GridPane griglia = new GridPane();
		griglia.add(eIndirizzo,0, 0);
		griglia.add(cIndirizzo, 1, 0 );
		griglia.add(cRisultato, 1, 1);
		griglia.add(pVerifica, 0, 1);
		
		
		Scene scene = new Scene(griglia);
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		pVerifica.setOnAction( e -> eseguiVerifica());

		
	}
	private void eseguiVerifica() {
		
		String parola;
		parola = cIndirizzo.getText();
		String[] parti;
		parti = parola.split("\\.");
		int ip[] = new int[parti.length];

		if(parti.length == 4) {
			for (int i = 0;i<parti.length;i++) {
				ip[0] = Integer.parseInt(parti[i]);
				if (ip[i]>=0 && ip[i]<=255) {
					cRisultato.setText("è un indirizzo ip");
				}
			}
		} else {
			cRisultato.setText("non è un indirizzo ip");
		}
	}
	public static void main(String[] args) {
		launch(args);
		}

}
