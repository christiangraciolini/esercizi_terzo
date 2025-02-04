package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Tabellina extends Application{
	Label eTabellina = new 	Label("??");
	TextField cTesto = new TextField("");
	Button pRisultato = new Button("esegui");

	
	public void start(Stage finestra) throws Exception {
		GridPane g = new GridPane();
		g.add(eTabellina ,0 , 0);
		g.add(cTesto, 0, 1);
		g.add(pRisultato, 0, 2);
		
		 Scene scena = new Scene(g);
		 finestra.setTitle("AgenziaViaggi");
		 finestra.setScene(scena);
		 finestra.show();
		 
		 pRisultato.setOnAction( e -> eseguiRisultato());
		 
		
		
	}


	private void eseguiRisultato() {
		int tabellina = 2;  
		string sequenza;
		pRisultato=Integer.parseInt(eTabellina.getText());

		for (int i = 1; i < 11; i++) { 
		}
			
		
			
       
		}
    public static void main(String[] args) {
		    launch(args);
	}
	
}
