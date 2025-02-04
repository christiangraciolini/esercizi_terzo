package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Doppie extends Application{
	
	TextField cTesto = new TextField();
	TextField cDoppie = new TextField();
	Button pConta = new Button("conta");
	Label eTesto = new Label("testo");
	Label eDoppie = new Label("n.doppie");
	
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(eTesto, 0, 0);
		g.add(eDoppie, 0, 2);
		g.add(pConta, 1, 1);
		g.add(cTesto, 1, 0);
		g.add(cDoppie, 1, 2);
		
		Scene scene = new Scene(g);
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		pConta.setOnAction( e -> eseguiConta());
		
	}
	private void eseguiConta() {
		
		String parola;
		char vettore[];
		int contatore=0;
		
		parola=cTesto.getText();
		vettore = parola.toCharArray();
		for(int i=0;i<vettore.length-1;i++) {
			if (vettore[i]==vettore[i+1]) {
				contatore++;
				vettore[i]='#';
				vettore[i+1]='#';
			}	
		}
		
		cDoppie.setText(contatore+"");
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
