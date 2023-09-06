package com.casanova.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;
import com.casanova.adso2499719.entities.Especialidad;

//se define los metodos para hacer el CRUD
public interface IntEspecialidadService {

	// Para traer todas las especialidades
	List<Especialidad> getAll();

	// Para traer una especialidad en especifico
	Especialidad getById(Long id) throws Exception;

	// Metodos normales

	Especialidad save(Especialidad especialidad);

	// El void, para no retornar un valor
	void updated(Long id, Especialidad especialidad) throws Exception;

	void deleted(Long id) throws Exception; 

}
