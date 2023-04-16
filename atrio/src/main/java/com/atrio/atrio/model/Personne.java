package com.atrio.atrio.model;

import java.time.LocalDate;

public class Personne {
	
	private Integer id;
	private String nom;
	private String prenom;
	private LocalDate dateDeNaissance;
	private long agePersonne; 
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public long getAgePersonne() {
		return agePersonne;
	}
	public void setAgePersonne(long agePersonne) {
		this.agePersonne = agePersonne;
	}
	

	
}
