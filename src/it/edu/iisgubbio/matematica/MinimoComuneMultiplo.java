package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MinimoComuneMultiplo extends Application {
	
	Label en1 = new Label("n1");
	Label en2 = new Label("n2");
	Button pMcm = new Button("MCM");
	TextField cn1 = new TextField();
	TextField cn2 = new TextField();
	Label eRisultato = new Label();
	
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(en1, 0, 0);
		g.add(en2, 0, 1);
		g.add(pMcm, 0, 2);
		g.add(cn1, 1, 0);
		g.add(cn2, 1, 1);
		g.add(eRisultato, 1, 2);
		
		cn1.getStyleClass().add("s");
		cn2.getStyleClass().add("s");
		cn1.getStyleClass().add("b");
		cn2.getStyleClass().add("b");
		g.getStyleClass().add("spazio");
		g.getStyleClass().add("p");
		
		
		Scene scena = new Scene(g);
	    scena.getStylesheets().add("it/edu/iisgubbio/matematica/stileDue.css");
	    finestra.setTitle("MCM");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    pMcm.setOnAction( e -> eseguiMCM());
		
	}

	private void eseguiMCM() {
		int numeroUno, numeroDue, Mcm;
		
		Mcm=0;
		numeroUno = Integer.parseInt(cn2.getText());
		numeroDue = Integer.parseInt(cn1.getText());
		for(int n = 2;n>=1; n--) {
			Mcm = numeroUno*n;
			System.out.println(""+Mcm);
			if (Mcm%numeroDue==0 && Mcm%numeroDue==0) {
				eRisultato.setText(""+Mcm);
				break;
			}
			
		}
	}
	public static void main(String[] args) {
	    launch(args);
	}

}
