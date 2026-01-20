package com.ejrv.matriculas.modelo.entidad;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Matricula implements Serializable{
	
	private static final long serialVersionUID = 1l;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idMatricula;
	private String creditosMatricula;
	private Date fechaMatricula;
	private String estadoMatricula;
	private int idEstudiantes;
	private int idCursi;

}
