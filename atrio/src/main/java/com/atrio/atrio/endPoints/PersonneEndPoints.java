package com.atrio.atrio.endPoints;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.atrio.atrio.entities.PersonneEntity;
import com.atrio.atrio.model.Personne;
import com.atrio.atrio.service.PersonneInterface;

@RestController
@RequestMapping("/personne")
public class PersonneEndPoints {

	 @Autowired
	 public PersonneInterface personneInterface;

	 
	    @PostMapping("/addPersonne")
	    public PersonneEntity addPersonne(PersonneEntity personne) throws Exception {
	    	return personneInterface.addPersonne(personne);
	    }
	    
	    @GetMapping("/ListPersonne")
	    public List<Personne> listPersonne(PersonneEntity personne) {
	    	return personneInterface.getPersonneList();
	    }
}
