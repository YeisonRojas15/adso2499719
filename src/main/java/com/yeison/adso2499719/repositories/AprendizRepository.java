package com.casanova.adso2499719.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casanova.adso2499719.entities.Aprendiz;

//Anotaciones
//El extends Jpa es para llamar la entidad y el tipo de dato de la llave primaria
@Repository
public interface AprendizRepository  extends JpaRepository<Aprendiz, Long> {
	
	
	
}
