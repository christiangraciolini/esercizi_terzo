package it.edu.iisgubbio.giochi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class IndovinaNumero extends Application {
	
	Label eConsiglio = new Label("prova a indovinare");
	Button pProva = new Button("prova");
	TextField cNumero = new TextField();
	int numero=(int)(Math.random()*100)+1;

	
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(eConsiglio, 0, 2);
		g.add(pProva, 0, 1);
		g.add(cNumero, 0, 0);
		
		g.getStyleClass().add("spazio");
	    cNumero.getStyleClass().add("textfield");
	    eConsiglio.getStyleClass().add("testo");
	    pProva.getStyleClass().add("bottone");
	   
		
		
		 Scene scena = new Scene(g);
		 finestra.setTitle("IndovinaNumero");
		 scena.getStylesheets().add("it/edu/iisgubbio/giochi/stile.css");
		 finestra.setScene(scena);
		 finestra.show();
		 
		 pProva.setOnAction( e -> eseguiProva());
		 System.out.println(numero);
	
		
	}

	
	private void eseguiProva() {
		
		
		
		
		int nInserito=Integer.parseInt(cNumero.getText());
		if (nInserito!=numero) {
			if (nInserito>numero) {
				eConsiglio.setText("più piccolo");
			} else {
				eConsiglio.setText("più grande");
				
			}
			
		}	else {
			eConsiglio.setText("giusto");
		}
		
		
	}
	

	public static void main(String[] args) {
		   launch(args);
	}
}
