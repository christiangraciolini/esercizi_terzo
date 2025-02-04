package it.edu.iisgubbio.animazioni;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Rimbalzo extends Application{

	 Pane areaDiGioco = new Pane();
	 Circle cerchio = new Circle(20); 
	 double incremento = 0;
	 
	 
	public void start(Stage primaryStage) throws Exception {
		
	   areaDiGioco.setPrefSize(400, 200);
       cerchio.setCenterX(20);
       cerchio.setCenterY(20);
       cerchio.setFill( Color.BLACK );
       areaDiGioco.getChildren().add(cerchio);
       
       Scene scena = new Scene(areaDiGioco);
       primaryStage.setScene(scena);
       primaryStage.setTitle("Rimbalzo");
       primaryStage.show();
       
       Timeline timeline = new Timeline(new KeyFrame(
       Duration.seconds(0.05),
       x -> aggiornaTimer()));
       timeline.setCycleCount(-1);
       timeline.play();
		
	}
	private void aggiornaTimer() {
	
		cerchio.setCenterX(cerchio.getCenterX()+incremento);
		if(cerchio.getCenterX() >= 300) {
			incremento = -10;
		} 
		if (cerchio.getCenterX()<=20) {
			incremento = 10;
		}
			

	}
	public static void main(String[] args) {
	    launch(args);
	}


		
		
	}


