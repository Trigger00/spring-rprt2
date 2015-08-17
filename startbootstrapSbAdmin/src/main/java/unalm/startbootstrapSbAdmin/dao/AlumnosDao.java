package unalm.startbootstrapSbAdmin.dao;

import unalm.startbootstrapSbAdmin.model.Alumnos;
import unalm.startbootstrapSbAdmin.model.PromCiclos;


public interface AlumnosDao extends GenericDAO<Alumnos>{
	   Alumnos findByAlumno(String codigo);
	   PromCiclos get1(Long id);
}
