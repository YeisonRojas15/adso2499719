package com.casanova.adso2499719.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casanova.adso2499719.entities.Especialidad;

@Repository
public interface EspecialidadRespository extends JpaRepository<Especialidad, Long>{

	
	
}
