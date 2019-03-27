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
		
		return cdao.getTuttiICorsi();
		
	}
	public Studente getStudenteinfo(int id) {
		StudenteDAO stuDAO=new StudenteDAO();
		
		
		return stuDAO.getStudente(id);
		
	}
	public List<Studente> listastudentipercorso(Corso corso){
		CorsoDAO cdao=new CorsoDAO();
		return cdao.getStudentiIscrittiAlCorso(corso);
		
	}
	public String studenti(List<Studente> listastudenti) {
		String s="";
		for(Studente stu:listastudenti)
			s+=stu.toString()+"\n";
		return s;
		
		
		
	}
	
}
