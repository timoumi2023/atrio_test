package com.atrio.atrio.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.atrio.atrio.entities.PersonneEntity;
import com.atrio.atrio.model.Personne;


@Service
public interface PersonneInterface {
	
	public PersonneEntity addPersonne(PersonneEntity personne) throws Exception;

	public List<Personne> getPersonneList();
	
	public boolean isUpperThan(LocalDate date);
	
	public long getAge(LocalDate date);
}
