package it.polito.tdp.lab04.model;

public class Studente {
	private int id;
	private String nome;
	private String cognome;
	public Studente(int id, String nome, String cognome) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studente other = (Studente) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return String.format("Studente [id=%s, nome=%s, cognome=%s]", id, nome, cognome);
	}
	
	
	
	
	
	
}
