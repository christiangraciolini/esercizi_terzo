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

public class PannelloPallina extends Application{
	
	 Pane areaDiGioco = new Pane();
	 Circle cerchio = new Circle(30); 
	 double grandezza = 30;
	 double x;
	 
	public void start(Stage primaryStage) throws Exception {
		
		areaDiGioco.setPrefSize(300, 300);
        cerchio.setCenterX(30);
        cerchio.setCenterY(30);
        cerchio.setFill( Color.BLACK );
        x=10;
        areaDiGioco.getChildren().add(cerchio);
        
        Scene scena = new Scene(areaDiGioco);
        primaryStage.setScene(scena);
        primaryStage.setTitle("PannelloPallina");
        primaryStage.show();
        
        Timeline timeline = new Timeline(new KeyFrame(
                Duration.seconds(0.1),
                x -> aggiornaTimer()));
                timeline.setCycleCount(100);
        		timeline.play();
		
	}
	private void aggiornaTimer() {
		x++;
		grandezza--;
		cerchio.setCenterX(x);
		cerchio.setRadius(grandezza);
		
	}
	public static void main(String[] args) {
	    launch(args);
	}
}
