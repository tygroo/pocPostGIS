package com.apside.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.apside.model.Person;

/**
 * Person dao interface
 * 
 * @author bbonheur
 */
@Repository
public interface PersonDao extends CrudRepository<Person, Long> {
	
	public List<Person> findBySurname(String surname);
}
