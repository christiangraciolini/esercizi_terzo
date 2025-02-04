package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.util.Duration;

public class TelaPallina extends Application{
	
	Canvas tela = new Canvas(300, 300);
	GraphicsContext gc = tela.getGraphicsContext2D();
	int x = 0;
	
	
	public void start(Stage finestra) throws Exception {
		
		GridPane griglia = new GridPane();
		griglia.add(tela, 0, 0);
		
		Scene scena = new Scene(griglia);
		finestra.setTitle("timer");
		finestra.setScene(scena);
		finestra.show();
		Timeline timeline = new Timeline(new KeyFrame(
	    Duration.seconds(0.5),
		x -> aggiornaTimer()));
	    timeline.setCycleCount(100);
		timeline.play();
	}

	private void aggiornaTimer() {
		
		gc.setFill(Color.WHITE);
		gc.fillOval(x-2.5, 0-2.5, 25, 25);
		
		x=x+10;
		gc.setFill(Color.PINK);
		gc.fillOval(x, 0, 20, 20);
		
		
	}

		
	public static void main(String[] args) {
	    launch(args);
	}
		
}


