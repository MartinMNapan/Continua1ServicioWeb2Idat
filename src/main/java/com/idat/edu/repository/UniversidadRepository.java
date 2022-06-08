package com.idat.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.edu.model.Universidad;

@Repository
public interface UniversidadRepository extends JpaRepository<Universidad, Integer> {

}
