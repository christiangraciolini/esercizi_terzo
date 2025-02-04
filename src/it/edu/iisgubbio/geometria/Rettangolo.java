package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Rettangolo extends Application{
	
	TextField cBase = new TextField();
	TextField cAltezza = new TextField();
	Label eBase = new Label("Base");
	Label eAltezza = new Label("Altezza");
	Label ePerimetro = new Label("Perimetro");
	Label eArea = new Label("area");
	Button pArea = new Button("calcolo dell'area");
	Button pPerimetro = new Button("calcolo del perimetro");
	
	public void start (Stage finestra){
		GridPane principale = new GridPane();
		principale.add(eBase, 0, 0);
		principale.add(eAltezza, 0, 1);
		principale.add(eArea, 1, 3);
		principale.add(cBase, 1, 1);
		principale.add(cAltezza, 1, 0);
		principale.add(pPerimetro, 0, 2);
		principale.add(pArea, 1, 2);
		
		Scene scena = new Scene(principale);
		finestra.setTitle("Rettangolo");
		finestra.setScene(scena);
		finestra.show();
		
		pArea.setOnAction(e -> eseguiArea());
		
		
		}
     private void eseguiArea() {
		String Base,Altezza,Perimetro;
		int baseI,altezzaI,perimetroI;
		
		
	
	
	



	  private Object eseguiArea() {
		// TODO Auto-generated method stub
		return null;
	}






	public static void main(String[] args) {
		    launch(args);
		  }
}