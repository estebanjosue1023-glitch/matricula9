package com.ejrv.matriculas.servicio.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.ejrv.matriculas.modelo.entidad.Curso;
import com.ejrv.matriculas.modelo.entidad.Estudiantes;
import com.ejrv.matriculas.repositorio.IEstudiantesRepositorio;
import com.ejrv.matriculas.servicio.IEstudiantesServicio;

@Service
@Component
public class EstudiantesServicioImpl implements IEstudiantesServicio{

	@Autowired
    public IEstudiantesRepositorio repositorioEstudiantes;

	@Override
	public Estudiantes insertarEstudiantes(Curso nuevoEstudiantes) {
		// TODO Auto-generated method stub
		return repositorioEstudiantes.save(nuevoEstudiantes);
	}

	@Override
	public Curso editarEstudiantes(int idEstudiantes) {
		// TODO Auto-generated method stub
		return repositorioEstudiantes.findBy(id, null);
	}

	@Override
	public void eliminarEstudiantes(int idEstuduantes) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Estudiantes> listarEstudiantes() {
		// TODO Auto-generated method stub
		return null;
	}
	


	
}
