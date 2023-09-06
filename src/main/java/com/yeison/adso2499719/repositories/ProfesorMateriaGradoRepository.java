package com.casanova.adso2499719.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.casanova.adso2499719.entities.ProfesorMateriaGrado;

@Repository
public interface ProfesorMateriaGradoRepository extends JpaRepository<ProfesorMateriaGrado, Long>{

}
