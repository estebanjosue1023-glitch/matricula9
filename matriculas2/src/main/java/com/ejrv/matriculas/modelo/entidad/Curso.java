package com.ejrv.matriculas.modelo.entidad;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
@Entity
@Data
public class Curso implements Serializable {
private static final long serialVersionUID = 1l;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int idCurso;
private String nombreCurso;
private String descripcionCurso;
private String estadoCurso;
}
