package com.ejrv.matriculas.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.ejrv.matriculas.modelo.entidad.Matricula;

@Repository
@Service
public interface IMatriculaRepositorio extends JpaRepository<Matricula, Integer>{

}
