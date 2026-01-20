package com.ejrv.matriculas.servicio;

import java.util.List;

import com.ejrv.matriculas.modelo.entidad.Curso;

public interface ICursoServicio {

	public Curso insertarCURSO(Curso nuevoCurso);
	public Curso editarCurso(int idCurso);
	public void eliminarcurso(int idCurso);
	public List<Curso>listarCurso();
	
}
