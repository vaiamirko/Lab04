
	package it.polito.tdp.lab04.controller;

	import java.net.URL;
	import java.util.ResourceBundle;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Model;
import it.polito.tdp.lab04.model.Studente;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
	import javafx.fxml.FXML;
	import javafx.scene.control.Button;
	import javafx.scene.control.CheckBox;
	import javafx.scene.control.ChoiceBox;
	import javafx.scene.control.TextArea;
	import javafx.scene.control.TextField;

	public class SegreteriaStudentiController {
		  private Model model=new Model();
		ObservableList<Corso> corsiBoxList = FXCollections.observableArrayList(model.listacorsipermenu()); 
		
	    @FXML
	    private ResourceBundle resources;

	    @FXML
	    private URL location;

	    @FXML
	    private ChoiceBox<Corso> ChoiceBox;

	    @FXML
	    private Button btnCercaiscritticorso;

	   
	    
	    @FXML
	    private TextField txtId;

	    @FXML
	    private TextField txtNome;

	    @FXML
	    private Button btnCompletamento;

	    @FXML
	    private TextField txtCognome;

	    @FXML
	    private Button btnCercacorsi;

	    @FXML
	    private Button btnIscrivi;

	    @FXML
	    private TextArea txtResult;

	    @FXML
	    private Button btnReset;

	    @FXML
	    void CercaCorsi(ActionEvent event) {

	    }

	    @FXML
	    void Cercaiscriticorso(ActionEvent event) {
	    	Corso cor;
	    	cor=ChoiceBox.getValue();
	    	txtResult.appendText(model.studenti(model.listastudentipercorso(cor)));

	    }

	    @FXML
	    void Completacampi(ActionEvent event) {
	    	 	String ids=txtId.getText();
	    	 	int id;
	    	 	try{
	    	 		id=Integer.parseInt(ids);
	    	 	}catch(NumberFormatException e) {
	    	 		txtResult.appendText("inserita matricola con formato errato");
	    	 		return;
	    	 	}
	    	 	
	    		Studente stu;
	    		stu=this.model.getStudenteinfo(id);	
	    		txtNome.appendText(stu.getNome());
	    		txtCognome.appendText(stu.getCognome());
	    	
	    	}
	    	 		    	


	  

	    @FXML
	    void Iscrivistudente(ActionEvent event) {

	    }

	    @FXML
	    void nuovaricerca(ActionEvent event) {

	    }

	    @FXML
	    void initialize() {
	        assert ChoiceBox != null : "fx:id=\"ChoiceBox\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
	        assert btnCercaiscritticorso != null : "fx:id=\"btnCercaiscritticorso\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
	        assert txtId != null : "fx:id=\"txtId\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
	        assert txtNome != null : "fx:id=\"txtNome\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
	        assert btnCompletamento != null : "fx:id=\"btnCompletamento\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
	        assert txtCognome != null : "fx:id=\"txtCognome\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
	        assert btnCercacorsi != null : "fx:id=\"btnCercacorsi\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
	        assert btnIscrivi != null : "fx:id=\"btnIscrivi\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
	        assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
	        assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'SegreteriaStudenti.fxml'.";
	        ChoiceBox.setItems(corsiBoxList);
	        txtNome.setDisable(true);
	        txtCognome.setDisable(true);
	    }

	    public void setModel(Model model) {
			this.model=model;
			// TODO Auto-generated method stub
			
		}
	    
	}



