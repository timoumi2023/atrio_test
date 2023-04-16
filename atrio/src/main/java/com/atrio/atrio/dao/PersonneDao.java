package com.atrio.atrio.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.atrio.atrio.entities.PersonneEntity;

@Repository
public interface PersonneDao extends CrudRepository<PersonneEntity, Integer> {

}
