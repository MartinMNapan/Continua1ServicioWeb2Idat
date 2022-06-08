package com.idat.edu.service;

import java.util.List;

import com.idat.edu.model.Curso;

public interface CursoService {
	
	void guardarCurso(Curso curso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(Integer id);
	List<Curso> listarCurso();
	Curso obtenerCursoId(Integer id);

}
