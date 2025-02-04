package it.edu.iisgubbio.disegni;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Griglia extends Application{
	
	Label eDistanza = new Label("distanza");
	TextField cDistanza = new TextField("");
	Button pDisegna = new Button("disegna");
	Button pPulisci = new Button("pulisci");
	Canvas tela = new Canvas(300, 300);
	GraphicsContext gc = tela.getGraphicsContext2D();
	
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(eDistanza, 0, 0);
		g.add(cDistanza, 1, 0);
		g.add(pDisegna, 2, 0);
		g.add(pPulisci, 3, 0);
		g.add(tela, 0, 1 ,4 ,1);
		
		eDistanza.getStyleClass().add("a");
		pDisegna.getStyleClass().add("a");
		pPulisci.getStyleClass().add("a");
		pDisegna.getStyleClass().add("b");
		pPulisci.getStyleClass().add("b");
	
	
		Scene scena = new Scene(g);
	    finestra.setTitle("Griglia");
	    scena.getStylesheets().add("it/edu/iisgubbio/disegni/stileTre.css");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    pDisegna.setOnAction( e -> eseguiDisegno());
	    pPulisci.setOnAction( e -> eseguiPulisci());
	}

	private void eseguiPulisci() {
		
		gc.setFill(Color.WHITE);
		gc.fillRect(0 , 0 ,300 , 300);
	}

	private void eseguiDisegno() {
		
		double distanza;
		gc.setStroke(Color.GREEN);
		gc.setLineWidth(5);
		
		distanza = Double.parseDouble(cDistanza.getText());
		for ( int n = 0; n<=300;n += distanza) {
			
			gc.strokeLine(n, 0, n, 300);
			gc.strokeLine(0, n, 300, n);
			
		}
	
	}
	public static void main(String[] args) {
	    launch(args);
    }

}
