package com.ejrv.matriculas.servicio;


	import java.util.List;

import com.ejrv.matriculas.modelo.entidad.Curso;
import com.ejrv.matriculas.modelo.entidad.Matricula;

	public interface IMatriculaServicio {

		public Matricula insertarmatricula(Curso nuevoMatricula);
		public Matricula editarMatricula(int idCurso);
		public void eliminarcurso(int idCurso);
		public List<Curso>listarCurso();
}
