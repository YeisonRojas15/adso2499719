package com.casanova.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;

import com.casanova.adso2499719.entities.Materia;

public interface IntMateriaService {

	List<Materia> getAll();

	Materia getById(Long id) throws Exception;

	Materia save(Materia materia);

	void updated(Long id, Materia materia) throws Exception;

	void deleted(Long id) throws Exception; 

}
