package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Divisori extends Application {
	
	Label eNumero = new Label("numero");
	Button pDivisori = new Button("calcola");
	TextField cNumero = new TextField();
	Label eRisultato = new Label();
	
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane(); 
		g.add(eNumero, 0, 0);
		g.add(eRisultato, 0, 1 , 3 ,1);
		eRisultato.setMaxHeight(Integer.MAX_VALUE);
		g.add(cNumero , 1, 0 );
		g.add(pDivisori, 2, 0);
		
		Scene scena = new Scene(g);
	    finestra.setTitle("Bisestile");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    pDivisori.setOnAction( e -> eseguiDivisorii());
		
		
		
	}

	private void eseguiDivisorii() {
		int numero;
		String divisori; boolean primoNumero;
		
		primoNumero = true;
		divisori = ("i divisori sono = ");
		numero = Integer.parseInt(cNumero.getText());
		for (int n = 2; numero-1>=n;n++) {
			if (numero%n==0) {
				if (primoNumero) {
					divisori = (divisori +n);
					primoNumero = false;
				} else {
					divisori = (divisori + ","+n);
				}
			}
		}
		eRisultato.setText(divisori);
			
	}
	 public static void main(String[] args) {
		    launch(args);
	}

	
		
		
		
		
		
		
		
	}


