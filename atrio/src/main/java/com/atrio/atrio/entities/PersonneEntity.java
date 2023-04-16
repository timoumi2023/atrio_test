package com.atrio.atrio.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "personne")
public class PersonneEntity {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer id;
		
		@Column(name="nom")
		private String nom;
		
		@Column(name="prenom")
		private String prenom;
		
		@Column(name="dateDeNaissance")
		private LocalDate dateDeNaissance;

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

		

}
