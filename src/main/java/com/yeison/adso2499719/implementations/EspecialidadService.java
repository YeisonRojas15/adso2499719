package com.casanova.adso2499719.implementations;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casanova.adso2499719.entities.Especialidad;
import com.casanova.adso2499719.interfaces.IntEspecialidadService;
import com.casanova.adso2499719.repositories.EspecialidadRespository;

//EL implements es para llamar a la interface
@Service
public class EspecialidadService implements IntEspecialidadService {

	// Override: Sobre escribe el metodo que hice en la inferface
	@Autowired
	private EspecialidadRespository repository;

	@Override
	public List<Especialidad> getAll() {
		return null;
	}

	@Override
	public Especialidad getById(Long id) throws Exception {
		Optional<Especialidad> especialidadOptional = repository.findById(id);
		if (especialidadOptional.isEmpty()) {
			throw new Exception("No se encontro el registro"); 
		}
		return especialidadOptional.get(); 
	}

	@Override
	public Especialidad save(Especialidad especialidad) {
		
		especialidad.setCreatedAt(LocalDateTime.now());
		return repository.save(especialidad);
		
	}

	@Override
	public void updated(Long id, Especialidad especialidad) throws Exception {
		/**
		 * 1.Tener en cuenta que existen dos especialidades 
		 * 		1.Especialidad que tenga en mi BD 
		 * 		2.Especialidad con los datos que voy a modificar 
		 * 2.Validar que la especialidad exista con el ID que estoy actualizando 
		 * 3.Reemplazar los datos donde se requiera 4.Actualizar los datos
		 */

		// 2.Valida si existe la especialidad con el ID que estoy actualizando
		Optional<Especialidad> especialidadBDOpt = repository.findById(id);
		if (especialidadBDOpt.isEmpty()) {
			throw new Exception("No se encontro el registro"); 
		}
		// Reemplaza los datos donde re requiera
		Especialidad especialidadBD = especialidadBDOpt.get();
		especialidadBD.setNombre(especialidad.getNombre());
		especialidadBD.setUpdatedAt(LocalDateTime.now());

		// Guarda / Actualiza los datos
		repository.save(especialidadBD);

	}

	@Override
	public void deleted(Long id) {
		repository.deleteById(id);
	}
}
