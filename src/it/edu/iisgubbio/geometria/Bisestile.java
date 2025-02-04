package it.edu.iisgubbio.geometria;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Bisestile  extends Application {

	Label eControlla = new Label("???");
	Label eAnno = new Label("anno");
	TextField cAnno = new TextField("");
	Button pControlla = new Button("controlla");
	
	public void start(Stage finestra) throws Exception {
		
		GridPane griglia= new GridPane();
		griglia.add(eAnno , 0, 0);
		griglia.add(cAnno , 1, 0,1,1);
		griglia.add(pControlla , 0 , 1,2,1);
		griglia.add(eControlla, 0, 2,2,1);
		cAnno.setMaxWidth(Integer.MAX_VALUE);
		pControlla.setMaxWidth(Integer.MAX_VALUE);
		eControlla.setMaxWidth(Integer.MAX_VALUE);
		
		griglia.setHgap(10);
		griglia.setVgap(10);
		griglia.setPadding(new Insets(10));

		
		
		Scene scena = new Scene(griglia);
		finestra.setTitle("Bisestile");
		finestra.setScene(scena);
		finestra.show();
		
		pControlla.setOnAction(e -> eseguiControlla());
		
		
		
	}

	private void eseguiControlla() {
		int anno;
		anno=Integer.parseInt(cAnno.getText());
		if(anno%400==0 && anno%100==0 || anno%4==0) {
			eControlla.setText("bisestile");
		} else {
			eControlla.setText("non è bisestile");
			
			
			
		}
		
	}

	 public static void main(String[] args) {
		    launch(args);
		  }
	
	
	
	

	
	
}
