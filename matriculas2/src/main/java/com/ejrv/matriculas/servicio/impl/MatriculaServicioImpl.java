package com.ejrv.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ejrv.matriculas.modelo.entidad.Curso;
import com.ejrv.matriculas.repositorio.ICursoRepositorio;
import com.ejrv.matriculas.repositorio.IMatriculaRepositorio;
import com.ejrv.matriculas.servicio.ICursoServicio;

@Service
@Component
public class MatriculaServicioImpl implements ICursoServicio{

	@Autowired
	public IMatriculaRepositorio repositorioMatricula;

	@Override
	public Curso insertarCURSO(Curso nuevoCurso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Curso editarCurso(int idCurso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void eliminarcurso(int idCurso) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return null;
	}
	

}