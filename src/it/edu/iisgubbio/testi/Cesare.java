package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Cesare extends Application{
	
	Button pCifra = new Button("cifra");
	Button pDecifra = new Button("decifra");
	TextField cSopra = new TextField();
	TextField cSotto = new TextField();

	@Override
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(pCifra, 0, 1);
		g.add(pDecifra, 1, 1);
		g.add(cSopra, 0, 0, 2, 1);
		g.add(cSotto, 0, 2, 2, 1);

		Scene scene = new Scene(g);
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		pCifra.setOnAction( e -> eseguiCifra());
		pDecifra.setOnAction( e -> eseguiDecifra());

		
	}

	private void eseguiDecifra() {
		
		char parolaDue[] = cSotto.getText().toCharArray();
		
		for (int i = 0;i<parolaDue.length;i++) {
			parolaDue[i]=((char)(parolaDue[i]-3));
		}
		String testo = new String(parolaDue);
		cSopra.setText(testo);
		
	}

	private void eseguiCifra() {
		
		char parolaUno[] = cSopra.getText().toCharArray();
		
		for (int i = 0;i<parolaUno.length;i++) {
			parolaUno[i]=((char)(parolaUno[i]+3));
		}
		String testo = new String(parolaUno);
		cSotto.setText(testo);
		
	
	}
	public static void main(String[] args) {
		launch(args);
	}

}
