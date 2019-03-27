package it.polito.tdp.lab04.DAO;

import it.polito.tdp.lab04.model.Studente;

public class TestDB {

	public static void main(String[] args) {
		
		/*
		 * 	This is a main to check the DB connection
		 */
		
		CorsoDAO cdao = new CorsoDAO();
		cdao.getTuttiICorsi();
		Studente stud;
		StudenteDAO studao=new StudenteDAO();
		stud=studao.getStudente(146101);
		System.out.println(stud.getNome());
		System.out.println(stud.getCognome());
		cdao.getStudentiIscrittiAlCorso(cdao.getTuttiICorsi().get(2));
	}

}
