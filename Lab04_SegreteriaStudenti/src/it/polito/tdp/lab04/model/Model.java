package it.polito.tdp.lab04.model;

import java.util.LinkedList;
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
		
		List<Corso> listacorsi=new LinkedList<Corso>();
		listacorsi.addAll(cdao.getTuttiICorsi());
		listacorsi.add(null);
		
		return listacorsi;
		
	}
	public Studente getStudenteinfo(int id) {
		StudenteDAO stuDAO=new StudenteDAO();
		
		
		return stuDAO.getStudente(id);
		
	}
	public List<Studente> listastudentipercorso(Corso corso){
		CorsoDAO cdao=new CorsoDAO();
		return cdao.getStudentiIscrittiAlCorso(corso);
		
	}
	/**
	 * trasformo la lista studenti in una stringa da mettere nell'appendtext
	 * @param listastudenti
	 * @return
	 */
	public String studenti(List<Studente> listastudenti) {
		String s="";
		for(Studente stu:listastudenti)
			s+=stu.toString()+"\n";
		return s;
		}
	
	public List<Corso> listacorsifreq(int id){
		StudenteDAO stuDAO=new StudenteDAO();
		return stuDAO.getcorsi(id);
		
		
	}
	/**
	 * trafosmo la lista corsi in una stringa da mettere nell'append txt
	 * @param listacorsi
	 * @return
	 */
	public String corsi(List<Corso> listacorsi) {
		String c="";
		for(Corso cors:listacorsi)
			c+=cors.toString()+"\n";
		return c;
		}
	public boolean isIscritto(int id,Corso corso) {
		CorsoDAO cdao=new CorsoDAO();
		return cdao.controllaIscrizione(id, corso);
		
		
	}
	
		
		
	
	
}
