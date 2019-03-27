package it.polito.tdp.lab04.model;

import java.util.List;

import it.polito.tdp.lab04.DAO.CorsoDAO;
import it.polito.tdp.lab04.DAO.StudenteDAO;

public class Model {
	/**
	 * metodo per ottnere dal modello atraverso il dao tutti i corsi del database
	 * @return
	 */
	public List<Corso> listacorsipermenu(){
		CorsoDAO cdao=new CorsoDAO();
		Corso corso = null;
		List<Corso> corsimenu=cdao.getTuttiICorsi();
		corsimenu.add(corso);
		return cdao.getTuttiICorsi();
		
	}
	public Studente getStudenteinfo(int id) {
		StudenteDAO stuDAO=new StudenteDAO();
		
		
		return stuDAO.getStudente(id);
		
	}
	
}
