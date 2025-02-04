package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Primi extends Application{
	

	Label eNumero = new Label("numero");
	Button pDivisori = new Button("è primo?");
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
	    
	    pDivisori.setOnAction( e -> eseguiPrimi());
		
	}

	private void eseguiPrimi() {		

			int numero ,num;
	
			numero = Integer.parseInt(cNumero.getText());
			for (num=1;num<numero;num++) {
				if (numero%num==0) {
					if(num==1) {
					    eRisultato.setText("è primo");
					} else {
						eRisultato.setText("non è primo");	
					}
				}
			}	
	}
			
			
			
	public static void main(String[] args) {
	    launch(args);
	}
			
	}

