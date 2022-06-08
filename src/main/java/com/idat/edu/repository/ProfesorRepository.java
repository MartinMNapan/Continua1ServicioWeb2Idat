package com.idat.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.edu.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer>{

}
