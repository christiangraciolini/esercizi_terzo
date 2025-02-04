package it.edu.iisgubbio.testi;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Anagrammi extends Application{
	
	Label eParola1 = new Label("parola1");
	Label eParola2 = new Label("parola2");
	TextField cParola1 = new TextField();
	TextField cParola2 = new TextField();
	TextField cRisultato = new TextField();
	Button pAnagramma = new Button("anagramma?");
	
	public void start(Stage finestra) throws Exception {
		
		GridPane g = new GridPane();
		g.add(eParola1, 0, 0);
		g.add(eParola2, 1, 0);
		g.add(cParola1, 0, 1);
		g.add(cParola2, 1, 1);
		g.add(cRisultato, 0, 2);
		g.add(pAnagramma, 1, 2);

		Scene scene = new Scene(g);
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		pAnagramma.setOnAction( e -> eseguiAnagramma());
	}

	private void eseguiAnagramma() {
		
		char parolaUno[] = cParola1.getText().toCharArray();
		char parolaDue[] = cParola2.getText().toCharArray();
		
		if(parolaUno.length!=parolaDue.length) {
			cRisultato.setText("non è un anagramma");

		}
		int lettere = 0;
		boolean trovato = false;
		for(int i=0;i<parolaUno.length;i++) {
			trovato = false;
			for (int a = 0;a<parolaDue.length;a++) {
				if (parolaUno[i]==parolaDue[a] && trovato == false) {
					lettere++;
					trovato = true;
					parolaDue[a]='#';
				}
			}
		}
		if (lettere == parolaDue.length) {
			cRisultato.setText("è un agramma");
		} else {
			cRisultato.setText("non è un agramma");
		}
	}
	public static void main(String[] args) {
		launch(args);
	}


}
