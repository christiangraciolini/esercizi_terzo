package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Cerca extends Application{
	
	TextField cNumeri = new TextField();
	TextField cNumeroDaTrovare = new TextField();
	Button pCerca = new Button("cerca");
	Label eNumero = new Label("numero");
	Label eRisultato = new Label();

	@Override
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(cNumeri, 0, 0, 3, 1);
		g.add(cNumeroDaTrovare, 1, 1);
		g.add(pCerca, 0, 1);
		g.add(eNumero, 2, 1);
		g.add(eRisultato, 0, 2, 3, 1);
		cNumeri.setPrefWidth(300);
		eRisultato.setPrefWidth(300);
		
		Scene scena = new Scene(g);
	    finestra.setTitle("Griglia");
	    finestra.setScene(scena);
	    finestra.show();
		
	    pCerca.setOnAction( e -> eseguicerca());
	}

	private void eseguicerca() {
		String testo,parti[];
		int numero, numeri[], contatore=0;
		
		numero = Integer.parseInt(cNumeroDaTrovare.getText());
		testo=cNumeri.getText();
		parti=testo.split(" ");
		numeri = new int[parti.length];
		for (int i = 0; i<parti.length; i++) {
			
		}
		for (int i = 0; i<parti.length; i++) {
			if (numeri[i]==numero) {
				contatore++;
				System.out.println(contatore);
			}
		}
		if(contatore==0) {
			eRisultato.setText(numero + "non è presente");
		} else {
			eRisultato.setText(numero + "è presente");
		}
	
	}
	public static void main(String[] args) {
		launch(args);
	}

}
