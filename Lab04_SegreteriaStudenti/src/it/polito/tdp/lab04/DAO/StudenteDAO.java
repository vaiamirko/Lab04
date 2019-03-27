package it.polito.tdp.lab04.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import it.polito.tdp.lab04.model.Studente;

public class StudenteDAO {

	
	public Studente getStudente(int id) {
//		String ids=String.valueOf(id).toString();
		final String sql ="SELECT nome,cognome FROM studente WHERE matricola=?"; 
		Studente stu = null;
		
		try {
			Connection conn=ConnectDB.getConnection();
			PreparedStatement st=conn.prepareStatement(sql);
			st.setInt(1, id);
			ResultSet rs=st.executeQuery();
			
			while(rs.next()) {
				String nome=rs.getString("nome");
				String cognome=rs.getString("cognome");
				stu=new Studente(id,nome,cognome);
				System.out.println(id +  " " + nome + " " + cognome);
			
			}
			conn.close();
			 return stu;
		} 
		
		
		catch (SQLException e) {
			// TODO Auto-generated catch block
			throw new RuntimeException("Errore Db");
			
			
		}
		
		
		
		
		
		
	}
}
