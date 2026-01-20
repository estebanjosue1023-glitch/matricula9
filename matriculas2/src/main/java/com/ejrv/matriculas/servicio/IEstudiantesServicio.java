package com.ejrv.matriculas.servicio;
import java.util.List;

import com.ejrv.matriculas.modelo.entidad.Curso;
import com.ejrv.matriculas.modelo.entidad.Estudiantes;

public interface IEstudiantesServicio {


		public Estudiantes  insertarEstudiantes(Curso nuevoEstudiantes);
		public Curso editarEstudiantes(int idEstudiantes);
		public void eliminarEstudiantes(int idEstuduantes);
		public List<Estudiantes>listarEstudiantes();
}
