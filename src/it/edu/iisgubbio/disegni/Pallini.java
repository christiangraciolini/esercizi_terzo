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

public class Pallini extends Application{
	
	Label eNumero = new Label("numero");
	TextField cNumero = new TextField();
	Button pVai = new Button("vai");
	Canvas tela = new Canvas(300, 300);
	GraphicsContext gc = tela.getGraphicsContext2D();
	
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(eNumero, 0, 0);
		g.add(cNumero, 1, 0);
		g.add(pVai, 2, 0);
		g.add(tela, 0, 1 ,3 ,1);
		
		Scene scena = new Scene(g);
	    finestra.setTitle("Griglia");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    pVai.setOnAction( e -> eseguiVai());
		
		
	}

	private void eseguiVai() {
		
		int numero, dim, distanza;
		
		numero = Integer.parseInt(cNumero.getText());
		int costanteP = numero;
		gc.setFill(Color.BLACK);
		dim = 10;
		distanza = 20;
		for( int y = 0; y < costanteP ; y ++) {
			for( int x = 0; x < numero;  x ++) {
				gc.fillOval(x*distanza, y*distanza, dim, dim);
			}
			numero--;
		}
	}
	public static void main(String[] args) {
	    launch(args);
	}

}
