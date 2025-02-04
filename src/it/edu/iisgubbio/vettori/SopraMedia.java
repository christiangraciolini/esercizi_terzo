package it.edu.iisgubbio.vettori;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class SopraMedia extends Application{
	
	TextField cNumero = new TextField();
	Button pMedia = new Button("sopra la media");
	Label eRis = new Label();

	@Override
	public void start(Stage finestra) throws Exception {
		
		GridPane griglia = new GridPane();
		griglia.add(cNumero, 0, 0, 2, 1);
		griglia.add(pMedia, 0, 1 );
		griglia.add(eRis, 0, 2);
		
		Scene scene = new Scene(griglia);
		finestra.setTitle("Griglia");
		finestra.setScene(scene);
		finestra.show();
		pMedia.setOnAction( e -> eseguimedia());
	}
		int[] testoNumeri (String testo) {

			String parti[];
			int vettoreNumeri[];

			parti= testo.split(" ");
			vettoreNumeri= new int[parti.length];
			for(int i=0;i<parti.length;i++) {
				vettoreNumeri[i]= Integer.parseInt(parti[i]);
			}

			return vettoreNumeri;
				
	}
	private void eseguimedia() {
		
		String x;
	    int vettoreNumeri[] ;
	    double  media, somma=0;  
	    
	    x=cNumero.getText();
	    vettoreNumeri=testoNumeri(x);
	    
	    
	    for(int i = 0;i < vettoreNumeri.length;i++) {
	    	somma=vettoreNumeri[i];
	    }
	    media=somma/vettoreNumeri.length;
	    System.out.println(media);
		String s="";
		for(int i=0;i<vettoreNumeri.length;i++) {	
			if(vettoreNumeri[i]>media) {
				s+=","+(vettoreNumeri[i]);
			}
		}
		eRis.setText(s+"");
		
	}
	public static void main(String[] args) {
		launch(args);
	}


}
