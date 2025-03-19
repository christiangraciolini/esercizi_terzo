package it.edu.iisgubbio.battaglianavale;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class BattagliaNavale extends Application{
	ImageView[][]q;
	Image acqua = new Image(getClass().getResourceAsStream("acqua.png"));
    Image affondato = new Image(getClass().getResourceAsStream("affondato.png"));
    Image colpito= new Image(getClass().getResourceAsStream("colpito.png"));

	@Override
	public void start(Stage finestra) throws Exception {
		q=new ImageView[10][10];
		GridPane g = new GridPane();
		for (int x = 0;x<q.length; x++) {
			for (int y = 0;y<q.length;y++) {
				q[x][y]=new ImageView(acqua);
				g.add(q[x][y],x,y);
			}
		
		}
		
		Scene scena = new Scene(g);
		finestra.setTitle("IndovinaNumero");
		finestra.setScene(scena);
		finestra.show();
		 
		
	}
	public static void main(String[] args) {
		launch(args);
	}

}
