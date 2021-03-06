package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import it.polito.tdp.lab04.model.Corso;
import it.polito.tdp.lab04.model.Studente;

public class CorsoDAO {

	/*
	 * Ottengo tutti i corsi salvati nel Db
	 */
	public List<Corso> getTuttiICorsi() {

		final String sql = "SELECT * FROM corso";

		List<Corso> corsi = new LinkedList<Corso>();

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);

			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				
				String codins = rs.getString("codins");
				int numeroCrediti = rs.getInt("crediti");
				String nome = rs.getString("nome");
				int periodoDidattico = rs.getInt("pd");
				

				System.out.println(codins + " " + numeroCrediti + " " + nome + " " + periodoDidattico);

				// Crea un nuovo JAVA Bean Corso
				Corso c=new Corso(codins, numeroCrediti, nome, periodoDidattico);
				// Aggiungi il nuovo oggetto Corso alla lista corsi
				corsi.add(c);
			}
			conn.close();
			return corsi;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
	}

	/*
	 * Dato un codice insegnamento, ottengo il corso
	 */
	public void getCorso(Corso corso) {
		// TODO
		
		
		
		
		
	}

	/*
	 * Ottengo tutti gli studenti iscritti al Corso
	 */
	public List<Studente> getStudentiIscrittiAlCorso(Corso corso) {
		
		
		
		/*
		 * Ottengo tutti gli studenti iscriti al corso corso
		 */
		

			final String sql = "SELECT matricola,cognome,nome " + 
					"FROM iscrizione natural INNER JOIN STUDENTE " + 
					"where codins=?";

			List<Studente> studenti = new LinkedList<Studente>();

			try {
				Connection conn = ConnectDB.getConnection();
				PreparedStatement st = conn.prepareStatement(sql);
				st.setString(1, corso.getCodins());

				ResultSet rs = st.executeQuery();

				while (rs.next()) {
					
					String matricola= rs.getString("matricola");
					String nome = rs.getString("nome");
					String cognome=rs.getString("cognome");
					Studente stu=new Studente(Integer.parseInt(matricola),nome,cognome);
					System.out.println(matricola +  " " + nome + " " + cognome);
					studenti.add(stu);
					

					
				}
				conn.close();
				return studenti;

			} catch (SQLException e) {
				// e.printStackTrace();
				throw new RuntimeException("Errore Db");
			}
		}
		
		
		
		// TODO
	

	/*
	 * Data una matricola ed il codice insegnamento, iscrivi lo studente al corso.
	 */
	public boolean inscriviStudenteACorso(Studente studente, Corso corso) {
		
		// TODO
		// ritorna true se l'iscrizione e' avvenuta con successo
		return false;
	}
	public boolean controllaIscrizione(int id,Corso corso) {

		final String sql = "SELECT matricola,codins,crediti,nome,pd " + 
				"FROM iscrizione natural INNER JOIN corso " + 
				"WHERE matricola=? AND codins=? ";

		try {
			Connection conn = ConnectDB.getConnection();
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(2, corso.getCodins());
			st.setInt(1, id);

			ResultSet rs = st.executeQuery();
           boolean check=false;
           // se entra nel ciclo while vuol dire che la uery non � nulla quindi lo studente � iscritto al corso
			while (rs.next()) {
				int matricola=rs.getInt("matricola");
				String codice=rs.getString("codins");
				if(rs.getInt("matricola")==0 || rs.getString("codins").equals(null)==true){
					check=false;
					
				}
					
				check=true;

				
			}
			conn.close();
			return check;

		} catch (SQLException e) {
			// e.printStackTrace();
			throw new RuntimeException("Errore Db");
		}
		
		
		
		
		
		
		
	}
	
	
	
	
}
