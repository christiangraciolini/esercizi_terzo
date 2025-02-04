package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Push extends Application{
	
	int numerocaselle = 16;
	TextField caselle[] = new TextField[numerocaselle];
	Button pPush = new Button("push");

	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		for (int i = 0;i < numerocaselle;i++) {
			caselle[i] = new TextField();
			g.add(caselle[i], 0 , i);
		}
		g.add(pPush, 1, numerocaselle-1);
		g.setId("sfondo");
		
		
		Scene scene = new Scene(g);
		scene.getStylesheets().add("it/edu/iisgubbio/vettori/stile.css");
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		
		pPush.setOnAction( e -> eseguiPush());
	
	}
	
	private void eseguiPush() {
		
		String testo="",cambioposto = "";
		int contatore = numerocaselle;
		
		testo=caselle[caselle.length-1].getText();
		System.out.print(testo);
		for (int i = numerocaselle;i < caselle.length;i--) {
			contatore--;
			cambioposto=caselle[i].getText();
			caselle[contatore].setText(cambioposto);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

}
