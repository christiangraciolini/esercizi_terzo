package it.edu.iisgubbio.disegni;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Disco extends Application{
	
	Button pAggiungi = new Button("aggiungi");
	Canvas tela = new Canvas(300, 300);
	GraphicsContext gc = tela.getGraphicsContext2D();
	double dimensione = 20;
	int contatore = 0;
	int x=0;

	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(pAggiungi, 0, 0);
		g.add(tela, 0, 1 );
		
		Scene scena = new Scene(g);
	    finestra.setTitle("Griglia");
	    finestra.setScene(scena);
	    finestra.show();
		
	    pAggiungi.setOnAction( e -> eseguiAggiungi());
	
		
	}

	private void eseguiAggiungi() {
		
		int dim;
		dim = 0;
		
		gc.setFill(Color.RED);
		if(contatore<10) {
			gc.fillOval(dimensione*contatore, x++, dimensione, dimensione);
		} else {
			contatore = 0;
			gc.fillOval(dim*contatore, dimensione, dimensione, dimensione);
		}
		contatore++;
	
	}
	public static void main(String[] args) {
	    launch(args);
	}

}
