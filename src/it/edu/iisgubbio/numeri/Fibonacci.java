package it.edu.iisgubbio.numeri;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Fibonacci extends Application{
	
	TextField cNumero = new TextField();
	TextField cRisultato = new TextField();
	Button pCalcola= new Button("calcola");
	Label eNumero = new Label("n:");
	Label eRisultato = new Label("fib(n):");
	
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(eNumero, 0, 0);
		g.add(eRisultato, 0, 2);
		g.add(pCalcola, 1, 1);
		g.add(cNumero, 1, 0);
		g.add(cRisultato, 1, 2);
		g.setId("sfondo");
		
		Scene scene = new Scene(g);
		scene.getStylesheets().add("it/edu/iisgubbio/numeri/stile.css");
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		
		pCalcola.setOnAction( e -> eseguiCalcola());	
	}
	
	int fib(int x) {
		if(x==0) {
			return 0;
		}else if(x==1){
			return 1;
		} else {
			return fib(x-2)+fib(x-1);
		}
	}

	private void eseguiCalcola() {
		int n = Integer.parseInt(cNumero.getText());
		int f = fib(n);
		cRisultato.setText(f+"");
	}
	
	
	
	public static void main(String[] args) {
	    launch(args);
	}
}