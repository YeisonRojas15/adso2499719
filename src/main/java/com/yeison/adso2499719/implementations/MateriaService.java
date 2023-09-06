package com.casanova.adso2499719.implementations;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casanova.adso2499719.entities.Materia;
import com.casanova.adso2499719.interfaces.IntMateriaService;
import com.casanova.adso2499719.repositories.MateriaRepository;

@Service
public class MateriaService implements IntMateriaService {

	@Autowired
	private MateriaRepository repository;
	
	@Override
	public List<Materia> getAll() {
		return null;
	}

	@Override
	public Materia getById(Long id) throws Exception {
		Optional<Materia> materiaOptional = repository.findById(id);
		if (materiaOptional.isEmpty()) {
			throw new Exception("No se encontro el registro");
		}
		return materiaOptional.get(); 
	}

	@Override
	public Materia save(Materia materia) {
		
		materia.setCreatedAt(LocalDateTime.now());
		return repository.save(materia);
		
	}

	@Override
	public void updated(Long id, Materia materia) {
		
	Optional<Materia> materiaBDOpt = repository.findById(id);
		if (materiaBDOpt.isEmpty()) {
			return;
		}
		 Materia materiaBD = materiaBDOpt.get();
		 materiaBD.setNombre(materia.getNombre());
		 materiaBD.setUpdatedAt(LocalDateTime.now());
		 
		 repository.save(materiaBD);
	}
	

	@Override
	public void deleted(Long id) {
	
		repository.deleteById(id);
		
	}
	
}
