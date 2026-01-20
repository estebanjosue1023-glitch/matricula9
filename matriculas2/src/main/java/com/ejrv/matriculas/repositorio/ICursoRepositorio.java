package com.ejrv.matriculas.repositorio;

import org.hibernate.annotations.SecondaryRow;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.support.JpaRepositoryConfigurationAware;
import org.springframework.stereotype.Repository;

import com.ejrv.matriculas.modelo.entidad.Curso;

@Repository
@SecondaryRow
public interface ICursoRepositorio extends JpaRepository<Curso, Integer>{

}
