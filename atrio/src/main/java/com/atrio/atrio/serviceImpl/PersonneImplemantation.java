package com.atrio.atrio.serviceImpl;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atrio.atrio.EntityModelConverter.EntityModelConverter;
import com.atrio.atrio.dao.PersonneDao;
import com.atrio.atrio.entities.PersonneEntity;
import com.atrio.atrio.model.Personne;
import com.atrio.atrio.service.PersonneInterface;

@Service
public class PersonneImplemantation implements PersonneInterface{
	
	@Autowired
	PersonneDao personneDao;

	@Override
	public PersonneEntity addPersonne(PersonneEntity personne) throws Exception {
		try {
			if(isUpperThan(personne.getDateDeNaissance()))
				 return personneDao.save(personne);
				
		} catch (Exception e) {
			 e.getMessage();
		}
		return null;
		
	}

	@Override
	public List<Personne> getPersonneList() {
		List<Personne> personne = new ArrayList<>();
		Iterable<PersonneEntity> entities = personneDao.findAll();
		for(PersonneEntity et :entities) {
			personne.add(EntityModelConverter.entityToModel(et));
		}
		
		for(Personne per :personne) {
			per.setAgePersonne(getAge(per.getDateDeNaissance()));
		}
		Collections.sort(personne, 
                (o1, o2) -> o1.getNom().compareTo(o2.getNom()));
		return personne;
	}

	@Override
	public boolean isUpperThan(LocalDate date) {
		long daysBetween = ChronoUnit.DAYS.between(LocalDate.now(), date);
		if(daysBetween<150)    
		return true;
		else return false;
	}

	@Override
	public long getAge(LocalDate date) {
		return  ChronoUnit.DAYS.between(LocalDate.now(), date);
	}
	
	

}
