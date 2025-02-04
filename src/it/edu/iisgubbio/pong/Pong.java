package it.edu.iisgubbio.pong;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;

import javafx.application.Application;

import javafx.geometry.Bounds;

import javafx.scene.Scene;

import javafx.scene.input.KeyCode;

import javafx.scene.input.KeyEvent;

import javafx.scene.layout.Pane;

import javafx.scene.paint.Color;

import javafx.scene.shape.Circle;

import javafx.scene.shape.Rectangle;

import javafx.scene.text.Text;

import javafx.stage.Stage;

import javafx.util.Duration;



public class Pong extends Application {



	double raggio = 10;

	static final double DIMENSIONE_X = 600;
	static final double DIMENSIONE_Y = 400;
	static final double DIMENSIONE_RACCHETTA_X = 20;
	static final double DIMENSIONE_RACCHETTA_Y = 100;
	Pane areaDiGioco = new Pane();
	Circle cerchio = new Circle(raggio);
	Text utenteUno = new Text();
	Text utenteDue = new Text();
	Rectangle racchettaSinistra = new Rectangle(DIMENSIONE_RACCHETTA_X, DIMENSIONE_RACCHETTA_Y );
	Rectangle racchettaDestra = new Rectangle(DIMENSIONE_RACCHETTA_X, DIMENSIONE_RACCHETTA_Y);
	Bounds b1 = cerchio.getBoundsInParent();
    Bounds b2 = racchettaSinistra.getBoundsInParent();
    Bounds b3 = racchettaDestra.getBoundsInParent();
	double posizioneSinistraX = 0;
	double posizioneSinstraY = 40;
	double posizioneDestraX = 580;
	double posizioneDestraY = 40;
	double incrementoDue = 2;
	double incremento = 2;
	int punteggioUno = 0;
	int punteggioDue = 0;
	





	public void start(Stage finestra) throws Exception {



		areaDiGioco.setPrefSize(DIMENSIONE_X, DIMENSIONE_Y);
		areaDiGioco.getChildren().add(racchettaSinistra);
		racchettaSinistra.setX(posizioneSinistraX);
		racchettaSinistra.setY(posizioneSinstraY);
		areaDiGioco.getChildren().add(racchettaDestra);
		racchettaDestra.setX(posizioneDestraX);
		racchettaDestra.setY(posizioneDestraY);
		areaDiGioco.getChildren().add(cerchio);
		cerchio.setCenterX(200);
		cerchio.setCenterY(150);
		cerchio.setFill(Color.WHITE );
		areaDiGioco.getChildren().add(utenteUno);
		utenteUno.setX(175);
		utenteUno.setY(20);
		utenteUno.setText(punteggioUno+"");
		areaDiGioco.getChildren().add(utenteDue);
		utenteDue.setX(195);
		utenteDue.setY(20);
		utenteDue.setText(punteggioDue+"");
		racchettaSinistra.setId("racchetta1");
		racchettaDestra.setId("racchetta2");
		areaDiGioco.setId("background");

		Scene scena = new Scene(areaDiGioco);
		scena.getStylesheets().add("it/edu/iisgubbio/pong/notte.css");
		finestra.setTitle("Racchette"); 
		finestra.setScene(scena);
		finestra.show();
		scena.setOnKeyPressed( e -> tastoPremuto(e));



		Timeline timeline = new Timeline(new KeyFrame(
				Duration.seconds(0.02), 
				x -> aggiornaPallina()));
		timeline.setCycleCount(-1);
		timeline.play();



	}



	private void tastoPremuto(KeyEvent e) {

		if(e.getText().equals("s") || e.getText().equals("S")) {
			posizioneSinstraY+= 10;
		}

		

		if(e.getText().equals("w") || e.getText().equals("W")) {
			posizioneSinstraY-= 10;
		}

		

		if(e.getCode()==KeyCode.DOWN) {
			posizioneDestraY+= 10;
		}

		

		if(e.getCode()==KeyCode.UP) {
			posizioneDestraY-= 10;
		}

		

		if(posizioneSinstraY>DIMENSIONE_Y-DIMENSIONE_RACCHETTA_Y) {
			posizioneSinstraY = DIMENSIONE_Y-DIMENSIONE_RACCHETTA_Y;
		}

		if(posizioneSinstraY<0) {
			posizioneSinstraY = 0;
		}
	

		if(posizioneDestraY>DIMENSIONE_Y-DIMENSIONE_RACCHETTA_Y) {
			posizioneDestraY = DIMENSIONE_Y-DIMENSIONE_RACCHETTA_Y;
		}
		
		if(posizioneDestraY<0) {
			posizioneDestraY = 0;
		}

		racchettaSinistra.setY(posizioneSinstraY);
		racchettaDestra.setY(posizioneDestraY);
	}
	private void aggiornaPallina() {

		

		Bounds b1 = cerchio.getBoundsInParent();
        Bounds b2 = racchettaSinistra.getBoundsInParent();
        Bounds b3 = racchettaDestra.getBoundsInParent();
		cerchio.setCenterX(cerchio.getCenterX()+incremento);
		cerchio.setCenterY(cerchio.getCenterY()+incrementoDue);



		if(cerchio.getCenterX() >= DIMENSIONE_X-raggio) {

			incremento = -2;
			punteggioDue++;
			utenteDue.setText(punteggioDue+"");
			cerchio.setCenterX(200);
			cerchio.setCenterY(200);



		}



		if(cerchio.getCenterX() <= raggio) {

			incremento = 2;
			punteggioUno++;
			utenteUno.setText(punteggioUno+"");
			cerchio.setCenterX(200);
			cerchio.setCenterY(200);

		}



		if(cerchio.getCenterY() >= DIMENSIONE_Y-raggio) {
			incrementoDue = -2;
		}

		if(cerchio.getCenterY() <= raggio) {
			incrementoDue = 2;
		}

		if(b1.intersects(b2)) {
			incremento = 2;
		}

		if(b1.intersects(b3)) {
			incremento = -2;
		}
	}



	public static void main(String[] args) {
		launch(args);
	}
}

