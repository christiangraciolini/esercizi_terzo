package it.edu.iisgubbio.negozi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Interessi extends Application{
	Label eCapitale = new Label ("capitale iniziale");
	Label eAnni = new Label ("anni");
	Label eInteressi = new Label ("interessi");
	Label eRisultato = new Label ("??");
	Button pCalcola = new Button("calcola");
	TextField cCapitale = new TextField();
	TextField cAnni = new TextField();
	TextField cInteressi = new TextField();
	
	public void start(Stage finestra) throws Exception {
		GridPane g = new GridPane();
		g.add(eCapitale, 0, 0);
		g.add(eAnni, 0, 1);
		g.add(eInteressi, 0, 2);
		g.add(pCalcola, 0, 3);
		g.add(cCapitale, 1, 0);
		g.add(cAnni, 1, 1);
		g.add(cInteressi, 1, 2);
		g.add(eRisultato, 1, 3);
		
		g.getStyleClass().add("spazio");
		g.getStyleClass().add("sfondo");
	    cCapitale.getStyleClass().add("clr");

		
		Scene scena = new Scene(g);
	    finestra.setTitle("Bisestile");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    pCalcola.setOnAction( e -> eseguiCalcolaInteressi());
		
	
		
	}

	private void eseguiCalcolaInteressi() {
		double capitale, anni , interessi,risultato;
		capitale=Double.parseDouble(cCapitale.getText());
		anni=Double.parseDouble(cAnni.getText());
		interessi=Double.parseDouble(cInteressi.getText());
		risultato=capitale;
		for(int n = 1; n<= anni; n++) {
			risultato= (risultato/100*interessi)+risultato;
			System.out.println(risultato);
			
		}
		eRisultato.setText(""+risultato);
		
	}
	    public static void main(String[] args) {
	        launch(args);
    }

}
