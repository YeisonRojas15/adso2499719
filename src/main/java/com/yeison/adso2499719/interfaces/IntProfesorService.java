package com.casanova.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;

import com.casanova.adso2499719.entities.Profesor;

public interface IntProfesorService {

	List<Profesor> getAll();
	
	Profesor getById(Long id) throws Exception;
	
	Profesor save(Profesor profesor);
	
	void updated(Long id, Profesor profesor) throws Exception;
	
	void deleted(Long id) throws Exception; 
	
}
