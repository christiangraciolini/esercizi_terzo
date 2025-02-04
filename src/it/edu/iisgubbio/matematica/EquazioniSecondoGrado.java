package it.edu.iisgubbio.matematica;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class EquazioniSecondoGrado extends Application {
	
	Label eA = new Label("a=");
	Label eB = new Label("b=");
	Label eC = new Label("c=");
	Label eXDue = new Label("x2=");
	Label eXUno= new Label("x1=");
	Label eSoluzioneUno = new Label("??");
	Label eSoluzioneDue = new Label("??");
	TextField cA = new TextField();
	TextField cB = new TextField();
	TextField cC = new TextField();
	Button pRisolvi = new Button("risolvi");

	
public void start(Stage finestra) throws Exception {
	
	GridPane principale = new GridPane();
	principale.add(eA, 0, 0);
	principale.add(eB, 0, 1);
	principale.add(eC, 0, 2);
	principale.add(eXUno, 0, 3);
	principale.add(eSoluzioneUno, 1, 3);
	principale.add(eXDue, 2, 3);
	principale.add(eSoluzioneDue, 3, 3);
	principale.add(cA, 1, 0);
	principale.add(cB, 1, 1);
	principale.add(cC, 1, 2);
	principale.add(pRisolvi, 2, 0, 2, 3);
	pRisolvi.setMaxHeight(Integer.MAX_VALUE);
	pRisolvi.setMaxWidth(Integer.MAX_VALUE);
	

	principale.getStyleClass().add("spazio");
    cA.getStyleClass().add("textfield");
    cB.getStyleClass().add("textfield");
    cC.getStyleClass().add("textfield");
    eA.getStyleClass().add("testo");
    eB.getStyleClass().add("testo");
    eC.getStyleClass().add("testo");
    eXUno.getStyleClass().add("incognite");
    eXDue.getStyleClass().add("incognite");
    principale.getStyleClass().add("sfondo");
    


    Scene scena = new Scene(principale);
    scena.getStylesheets().add("it/edu/iisgubbio/matematica/stile.css");
    finestra.setTitle("Bisestile");
    finestra.setScene(scena);
    finestra.show();

    pRisolvi.setOnAction( e -> eseguiRisolvi());
    
	
}

private void eseguiRisolvi() {
	
	

    Double a, b, c, delta;
    double xCoincidente, x1, x2;

    a = Double.parseDouble(cA.getText());
    b = Double.parseDouble(cB.getText());
    c = Double.parseDouble(cC.getText());
    delta = ((b * b)-(4 * a * c));
    if(delta<0) {
        eSoluzioneUno.setText("non ha soluzioni");
        eSoluzioneDue.setText("non ha soluzioni");
    } else {
        if((b * b)-(4 * a * c)==0) {
            xCoincidente = ((b*-1) + Math.sqrt(delta)/(2*a));
            eSoluzioneUno.setText(xCoincidente + "");
            eSoluzioneDue.setText("Coincidente");
       } else {
             x1 = ((b*-1) + Math.sqrt(delta)/(2*a));
             x2 = ((b*-1) - Math.sqrt(delta)/(2*a));
             eSoluzioneUno.setText(x1 + "");
             eSoluzioneDue.setText(x2 + "");
}
	

}


}

public static void main(String[] args) {
   launch(args);

}

}

