package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class MinimoMassimo extends Application{
	
	TextField cNumero = new TextField();
	Button pMax = new Button("massimo");
	Button pMin = new Button("minimo");
	Label eMax = new Label();
	Label eMin = new Label();

	@Override
	public void start(Stage finestra) throws Exception {
		
		GridPane griglia = new GridPane();
		griglia.add(cNumero, 0, 0, 2, 1);
		griglia.add(pMax, 0, 1 );
		griglia.add(pMin, 1, 1);
		griglia.add(eMax, 0, 2);
		griglia.add(eMin, 1, 2);
		
		
		Scene scene = new Scene(griglia);
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		pMin.setOnAction( e -> eseguiMinimo());
		pMax.setOnAction( e -> eseguiMassimo());

	}

	private void eseguiMassimo() {
		String parti[], testo;
	    int numeri[], minimo=0;
	    
	    testo=cNumero.getText();
	    parti = testo.split(" ");
	    numeri = new int[parti.length];
	    for (int i = 0;)
	}

	private void eseguiMinimo() {
		
		String parti[], testo;
	    int numeri[], minimo=0;
	    
	    testo=cNumero.getText();
	    parti = testo.split(" ");
	    numeri = new int[parti.length];
		for(int pos = 0;pos < parti.length;pos++) {
			if(numeri[pos]<minimo) {
				minimo=numeri[pos];
			}
		}
		eMin.setText(""+minimo);
	}
	public static void main(String[] args) {
		launch(args);
		}

}
