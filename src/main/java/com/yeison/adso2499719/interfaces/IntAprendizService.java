package com.casanova.adso2499719.interfaces;

import java.util.List;
import java.util.Optional;

import com.casanova.adso2499719.entities.Aprendiz;

public interface IntAprendizService {
	
	List<Aprendiz> getAll();
	
	Aprendiz getById(Long id) throws Exception;
	
	Aprendiz save(Aprendiz aprendiz);
	
	void updated(Long id, Aprendiz aprendiz) throws Exception;
	
	void deleted(Long id) throws Exception; 
	
}
