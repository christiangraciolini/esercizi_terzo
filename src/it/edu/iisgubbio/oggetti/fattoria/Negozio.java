package it.edu.iisgubbio.oggetti.fattoria;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Negozio extends Application {
    TextField tfNome = new TextField();
    TextField tfPrezzo = new TextField();
    TextField tfStagionatura = new TextField();
    TextField tfNomeMuffa = new TextField();
    CheckBox cbBiologico = new CheckBox("biologico");
    CheckBox cbCarneBianca = new CheckBox("carne bianca");
    CheckBox cbKosher = new CheckBox("kosher");
    CheckBox cbInterna = new CheckBox("muffa interna");
    ToggleButton tbDOP = new ToggleButton("D O P");

    ListView<Prodotto> lvProdotti = new ListView<Prodotto>();

    @Override
    public void start(Stage primaryStage) {
        Label lNome = new Label("nome:");
        Label lPrezzo = new Label("prezzo:");
        Label lStagionatura = new Label("stagionatura:");
        Label lNomeMuffa = new Label("nome muffa:");

        Button bProdotto = new Button("crea prodotto");
        Button bOrtaggio = new Button("crea ortaggio");
        Button bFormaggio = new Button("crea formaggio");
        Button bMuffato = new Button("crea muffato");
        Button bCarne = new Button("crea carne");

        GridPane root = new GridPane();
        root.add(lvProdotti,     0,  0, 2, 14);
        root.add(lNome,          2,  0);
        root.add(tfNome,         3,  0);
        root.add(lPrezzo,        2,  1);
        root.add(tfPrezzo,       3,  1);
        root.add(lStagionatura,  2,  2);
        root.add(tfStagionatura, 3,  2);
        root.add(lNomeMuffa,     2,  3);
        root.add(tfNomeMuffa,    3,  3);
        root.add(cbBiologico,    3,  4);
        root.add(cbCarneBianca,  3,  5);
        root.add(cbKosher,       3  ,6);
        root.add(cbInterna,      3,  7);
        root.add(tbDOP,          3,  8);
        root.add(bProdotto,      2,  9, 2, 1);
        root.add(bOrtaggio,      2, 10, 2, 1);
        root.add(bFormaggio,     2, 11, 2, 1);
        root.add(bMuffato,       2, 12, 2, 1);
        root.add(bCarne,         2, 13, 2, 1);

        bProdotto.setMaxWidth(Integer.MAX_VALUE);
        bOrtaggio.setMaxWidth(Integer.MAX_VALUE);
        bFormaggio.setMaxWidth(Integer.MAX_VALUE);
        bMuffato.setMaxWidth(Integer.MAX_VALUE);
        bCarne.setMaxWidth(Integer.MAX_VALUE);

        root.setHgap(5);
        root.setVgap(5);
        root.setPadding(new Insets(5));

        Scene scene = new Scene(root);

        primaryStage.setTitle("Prodotti in vendita");
        primaryStage.setScene(scene);
        primaryStage.show();
        
        bProdotto.setOnAction( e -> creaProdotto() );
        bOrtaggio.setOnAction( e -> creaOrtaggio() );
        bFormaggio.setOnAction( e -> creaFormaggio() );
        bMuffato.setOnAction( e -> creaMuffato() );
        bCarne.setOnAction( e -> creaCarne() );
        
        lvProdotti.setPrefWidth(500);

        
    }
   


    private void creaProdotto() {
    	
    	String nomeProdotto;
    	double prezzo;
    	nomeProdotto=tfNome.getText();
    	prezzo=Double.parseDouble(tfPrezzo.getText());
    	Prodotto k = new Prodotto();
    	lvProdotti.getItems().add(k);

   	}

   	private void creaOrtaggio() {
   		
   		String nomeProdotto;
   		double prezzo;
    	nomeProdotto=tfNome.getText();
    	prezzo=Double.parseDouble(tfPrezzo.getText());
    	boolean biologico=cbBiologico.isSelected();
   		
    	Ortaggio s = new Ortaggio(nomeProdotto,prezzo,biologico);
    	lvProdotti.getItems().add(s);
    	
   	}

   	private void creaFormaggio() {
   		
   		String nome = tfNome.getText();
   		double prezzo = Double.parseDouble(tfPrezzo.getText());
   		boolean dop = tbDOP.isSelected();
   		int tempoDiStagionatura = Integer.parseInt(tfStagionatura.getText());
   		
   		Formaggio formaggio = new Formaggio(nome,prezzo,tempoDiStagionatura,dop);
   		lvProdotti.getItems().add(formaggio);

   	}

   	private void creaMuffato() {	
   		
   		String nome = tfNome.getText();
   		double prezzo = Double.parseDouble(tfPrezzo.getText());
   		String nomeMuffa = tfNomeMuffa.getText();
   		boolean interna = cbInterna.isSelected();
   		boolean dop = tbDOP.isSelected();
   		int tempoDiStagionatura = Integer.parseInt(tfStagionatura.getText());
   		
   		Muffato muffa = new Muffato(nome,prezzo,nomeMuffa);
   		muffa.setInterno(interna);
   		muffa.setTempoStagionatura(tempoDiStagionatura);
   		muffa.setDop(dop);
   		lvProdotti.getItems().add(muffa);

   	}

   	private void creaCarne() {
   		
   		String nome = tfNome.getText();
   		double prezzo = Double.parseDouble(tfPrezzo.getText());
   		boolean kosher = cbKosher.isSelected();
   		boolean carneBianca = cbCarneBianca.isSelected();
   		
   		Carne carne = new Carne(nome,prezzo,kosher,carneBianca);
   		lvProdotti.getItems().add(carne);
   		
  
   	}





	public static void main(String[] args) {
        launch(args);
    }

}