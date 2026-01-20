package com.ejrv.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ejrv.matriculas.modelo.entidad.Curso;
import com.ejrv.matriculas.repositorio.ICursoRepositorio;
import com.ejrv.matriculas.servicio.ICursoServicio;

@Service
@Component
public class CursoServicioImpl implements ICursoServicio{

	@Autowired
	public ICursoRepositorio repositorioCurso;
	
	@Override
	public Curso insertarCURSO(Curso nuevoCurso) {
		// TODO Auto-generated method stub
		return repositorioCurso.save(nuevoCurso);
	}

	@Override
	public Curso editarCurso(int idCurso) {
		// TODO Auto-generated method stub
		return repositorioCurso.findById(idCurso).get();
	}

	@Override
	public void eliminarcurso(int idCurso) {
		// TODO Auto-generated method stub
		repositorioCurso.delete(editarCurso(idCurso));
	}

	@Override
	public List<Curso> listarCurso() {
		// TODO Auto-generated method stub
		return repositorioCurso.findAll();
	}

}
