
package it.edu.iisgubbio.negozi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class AgenziaViaggi extends Application{
	
	Label eNpersone = new Label("numero persone");
	Label eCapienzaAutobus = new Label("capienza autobus");
	Label eCostoAutobus = new Label("costo autobus");
	Label eAutobusNecessari = new Label("autobus necessar:");
	Label eCostoPersona= new Label("costo a persona");
	TextField cNpersone = new TextField("");
	TextField cCapienzaAutobus = new TextField("");
	TextField cCostoAutobus = new TextField("");
	

	public void start(Stage finestra) throws Exception {
		GridPane g = new GridPane();
		g.add(eNpersone, 0, 0);
		g.add(eCapienzaAutobus, 0, 1);
		g.add(eCostoAutobus, 0, 2);
		g.add(eAutobusNecessari, 0, 3);
		g.add(eCostoAutobus, 0, 4);
		g.add(cNpersone, 1, 0);
		g.add(cCapienzaAutobus, 1, 1);
		g.add(cCostoAutobus, 1, 2);
		
		 Scene scena = new Scene(g);
		 finestra.setTitle("AgenziaViaggi");
		 finestra.setScene(scena);
		 finestra.show();
		 
		 cCostoAutobus.setOnAction( e -> eseguiCosto());
		
	}
	private void eseguiCosto() {
		
		
		
	}
	

}
