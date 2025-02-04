package it.edu.iisgubbio.verifica;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ChristianGraciolini extends Application{
	
	Label eNum = new Label("numeri:");
	TextField cNumeri = new TextField();
	TextField cMassimo = new TextField();
	TextField cMedia = new TextField();
	Button pMassimo = new Button("massimo");
	Button pMedia = new Button("Sopra la media");

	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(eNum, 0, 0);
		g.add(cNumeri, 1, 0);
		g.add(pMassimo, 0, 1);
		g.add(pMedia, 1, 1);
		g.add(cMassimo, 0, 2);
		g.add(cMedia, 1, 2);

		Scene scene = new Scene(g);
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		pMassimo.setOnAction( e -> eseguiMassimo());
		pMedia.setOnAction( e -> eseguiMedia());
		
	}
	private void eseguiMedia() {
		
		String x;
	    int numeri[],risultato=0;
	    double  media, somma=0;  
	    
	    x=cNumeri.getText();
	    numeri=testoNumeri(x);
	    
	    
	    for(int i = 0;i < numeri.length;i++) {
	    	somma=somma+numeri[i];
	    }
	    media=somma/numeri.length;
		for(int i=0;i<numeri.length;i++) {	
			if(numeri[i]>media) {
				risultato++;
			}
		}
		cMedia.setText(media+">"+risultato+"");
		
		
		
	}
	int[] testoNumeri (String testo) {
		String parti[];
		int numeri[];
		parti = testo.split(" ");
		numeri = new int[parti.length];
		for (int i = 0; i < parti.length; i++) {
			numeri[i] = Integer.parseInt(parti[i]);
		}

		return numeri;
	}

	private void eseguiMassimo() {
		
		String x,risultato="";
		int numeri[],massimo1=0,massimo2=0;
		
	    x=cNumeri.getText();
	    numeri=testoNumeri(x);
	    
	    massimo1=numeri[0];
	    for(int i=1;i<numeri.length;i++) {
	    	if(numeri[i] > massimo1) {
	    		massimo1=numeri[i];	
	    	} else {
	    		if(numeri[i]>massimo2) {
	    			massimo2=numeri[i];
	    		}
	    	}
	    }
		cMassimo.setText(massimo1+","+massimo2+"");
		for (int i = 0;i<numeri.length;i++) {
			if (risultato == "") {
				risultato+=" "+numeri[i];
			} else {
				risultato+="; "+numeri[i];
			}
		}
	}
	public static void main(String[] args) {
		launch(args);
	}
}
	


