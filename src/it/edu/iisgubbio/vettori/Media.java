package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Media extends Application{
	
	TextField cMedia = new TextField();
	Button pMedia = new Button("media");
	Label eMedia = new Label();

	@Override
	public void start(Stage finestra) throws Exception {
		
		
		
		GridPane g = new GridPane();
		g.add(eMedia, 3, 2);
		g.add(pMedia, 3, 1);
		g.add(cMedia, 3, 0);
		
		Scene scena = new Scene(g);
	    finestra.setTitle("Griglia");
	    finestra.setScene(scena);
	    finestra.show();
	    
	    pMedia.setOnAction( e -> eseguiMedia());
	
	}

	private void eseguiMedia() {
		
		double somma=0,media=0;
		String testo;
		String parti[];
		
		testo = cMedia.getText();
		parti=testo.split(" ");
		int[] numeri = new int[parti.length];
		for (int i = 0; i>parti.length; i++) {
			numeri[i]=Integer.parseInt(parti[i]);
			somma=somma+numeri[i];
		}
		media=somma/numeri.length;
		eMedia.setText(media+"");
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
