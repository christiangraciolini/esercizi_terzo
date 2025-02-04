package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Palindromo extends Application{
	
	Label eTesto = new Label("testo");
	TextField cParola = new TextField();
	TextField cRisultato = new TextField();
	Button pControlla = new Button("controlla");

	@Override
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(eTesto, 0, 0);
		g.add(cParola, 1, 0);
		g.add(pControlla, 0, 1, 2, 1);
		g.add(cRisultato, 0, 2, 2, 1);
		
		Scene scene = new Scene(g);
		scene.getStylesheets().add("it/edu/iisgubbio/numeri/stile.css");
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		
		pControlla.setOnAction( e -> eseguiControlla());	
	}

	private void eseguiControlla() {
		
		String parola;
		char car[] ,carContrario[];
		
		parola = cParola.getText();
		car = parola.toCharArray();
		carContrario = new char[car.length];
		int contatore=car.length-1;
		for(int i = 0; i < car.length; i++) {
			carContrario[contatore]=car[i];
			contatore--;
		}
		int controllo=0;
		for (int i = 0;i<car.length;i++) {
			if (carContrario[i]==car[i]) {
				controllo++;
			}
		}
		if(controllo  == car.length) {
			cRisultato.setText("si");
		} else {
			cRisultato.setText("no");
		}
	}

	public static void main(String[] args) {
	    launch(args);
	}
}
