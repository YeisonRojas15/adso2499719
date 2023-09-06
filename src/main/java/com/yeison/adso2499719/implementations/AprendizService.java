package com.casanova.adso2499719.implementations;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.casanova.adso2499719.entities.Aprendiz;
import com.casanova.adso2499719.interfaces.IntAprendizService;
import com.casanova.adso2499719.repositories.AprendizRepository;

@Service
public class AprendizService implements IntAprendizService{
	
	@Autowired
	private AprendizRepository repository;
	
	@Override
	public List<Aprendiz> getAll() {
		return null;
	}

	@Override
	public Aprendiz getById(Long id) throws Exception {
		Optional<Aprendiz> aprendizOptional = repository.findById(id);
		if (aprendizOptional.isEmpty()) {
			throw new Exception("No se encontro el registro"); 
		}
		return aprendizOptional.get(); 
	}

	@Override
	public Aprendiz save(Aprendiz aprendiz) {
		
		aprendiz.setCreatedAt(LocalDateTime.now());
		return repository.save(aprendiz);
	
	}

	@Override
	public void updated(Long id, Aprendiz aprendiz) {
		
		Optional<Aprendiz> aprendizBDOpt = repository.findById(id);
			if (aprendizBDOpt.isEmpty()) {
				return;
			}
		
			Aprendiz aprendizBD = aprendizBDOpt.get();
			aprendizBD.setNombre(aprendiz.getNombre());
			aprendizBD.setApellido(aprendiz.getApellido());
			aprendizBD.setGrado(aprendiz.getGrado());
			aprendizBD.setUpdatedAt(LocalDateTime.now());
			
			repository.save(aprendiz);
	}

	@Override
	public void deleted(Long id) {
		
		repository.deleteById(id);
		
	}

}
