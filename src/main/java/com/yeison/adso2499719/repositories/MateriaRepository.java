package com.casanova.adso2499719.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casanova.adso2499719.entities.Materia;

@Repository
public interface MateriaRepository extends JpaRepository<Materia, Long>{

}
