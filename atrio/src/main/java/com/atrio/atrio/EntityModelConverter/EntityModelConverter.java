package com.atrio.atrio.EntityModelConverter;

import com.atrio.atrio.entities.PersonneEntity;
import com.atrio.atrio.model.Personne;

public class EntityModelConverter {
	
	private EntityModelConverter(){
		super();
	}
	
	public static Personne entityToModel(PersonneEntity personneEntity) {
		Personne per = new Personne();
		per.setDateDeNaissance(personneEntity.getDateDeNaissance());
		per.setId(personneEntity.getId());
		per.setNom(personneEntity.getNom());
		per.setPrenom(personneEntity.getPrenom());
		return per;
	}

}
