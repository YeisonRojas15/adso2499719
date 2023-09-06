package com.casanova.adso2499719.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.casanova.adso2499719.entities.Grado;

@Repository
public interface GradoRepository extends JpaRepository<Grado, Long> {

}
