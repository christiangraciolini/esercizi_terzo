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

public class Scacchiera extends Application {
	
	Label eDimensione = new Label("distanza");
	TextField cDimensione = new TextField("");
	Button pDisegna = new Button("disegna");
	Canvas tela = new Canvas(300, 300);
	GraphicsContext gc = tela.getGraphicsContext2D();

	
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(eDimensione, 0, 0);
		g.add(cDimensione, 1, 0);
		g.add(pDisegna, 2, 0);
		g.add(tela, 0, 1 ,3 ,1);
		
		Scene scena = new Scene(g);
	    finestra.setTitle("Griglia");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    pDisegna.setOnAction( e -> eseguiDisegno());
		
	}
	private void eseguiDisegno() {
		double dimensione;
		
		dimensione = Integer.parseInt(cDimensione.getText());
		gc.setFill(Color.BLUE);
		for (double i = -1; i <= 400; i = i + dimensione+1) {
			for(double x = 0;x<=400;x+= dimensione + 1) {
			gc.fillRect(x , i , dimensione , dimensione);
			}
			
		}
		
	}
	public static void main(String[] args) {
	    launch(args);
	}
}


