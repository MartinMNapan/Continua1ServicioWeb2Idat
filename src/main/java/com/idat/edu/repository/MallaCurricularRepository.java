package com.idat.edu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.edu.model.MallaCurricular;

@Repository
public interface MallaCurricularRepository extends JpaRepository<MallaCurricular, Integer>{

}
