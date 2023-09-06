package com.casanova.adso2499719.implementations;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casanova.adso2499719.entities.Profesor;
import com.casanova.adso2499719.interfaces.IntProfesorService;
import com.casanova.adso2499719.repositories.ProfesorRepository;

@Service
public class ProfesorService implements IntProfesorService {

	@Autowired
	private ProfesorRepository repository;

	@Override
	public List<Profesor> getAll() {
		return null;
	}

	@Override
	public Profesor getById(Long id) throws Exception {
		Optional<Profesor> profesorOptional = repository.findById(id);
		if (profesorOptional.isEmpty()) {
			throw new Exception("No se encontro el registro"); 
		}
		return profesorOptional.get();
	}	

	@Override
	public Profesor save(Profesor profesor) {
		profesor.setCreatedAt(LocalDateTime.now());
		return repository.save(profesor);
	}

	@Override
	public void updated(Long id, Profesor profesor) {

		Optional<Profesor> profesorBDOpt = repository.findById(id);
		if (profesorBDOpt.isEmpty()) {
			return;
		}

		Profesor profesorBD = profesorBDOpt.get();
		profesorBD.setNombre(profesor.getNombre());
		profesorBD.setApellido(profesor.getApellido());
		profesorBD.setEspecialidad(profesor.getEspecialidad());
		profesorBD.setUpdatedAt(LocalDateTime.now());

		repository.save(profesor);
	}

	@Override
	public void deleted(Long id) {

		repository.deleteById(id);

	}

}
