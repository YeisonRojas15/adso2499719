package com.casanova.adso2499719.implementations;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casanova.adso2499719.entities.Grado;
import com.casanova.adso2499719.interfaces.IntGradoService;
import com.casanova.adso2499719.repositories.GradoRepository;

@Service
public class GradoService implements IntGradoService {

	@Autowired
	private GradoRepository repository;
	
	@Override
	public List<Grado> getAll() {
		return null;
	}

	@Override
	public Grado getById(Long id) throws Exception {
		Optional<Grado> gradoOptional = repository.findById(id);
		if (gradoOptional.isEmpty()) {
			throw new Exception("No se encontro el registro"); 
		}
		return gradoOptional.get(); 
	}

	@Override
	public Grado save(Grado grado) {
		
		grado.setCreatedAt(LocalDateTime.now());
		return repository.save(grado);
	}

	@Override
	public void updated(Long id, Grado grado) {
	
		Optional<Grado> gradoBDOpt = repository.findById(id);
			if (gradoBDOpt.isEmpty()) {
				return;
			}
			Grado gradoBD = gradoBDOpt.get();
			gradoBD.setNombre(grado.getNombre());
			gradoBD.setJornada(grado.getJornada());
			gradoBD.setSalon(grado.getSalon());
			gradoBD.setUpdatedAt(LocalDateTime.now());
			
			repository.save(gradoBD);
	}

	@Override
	public void deleted(Long id) {
	
		repository.deleteById(id);
	
	}
	

}
