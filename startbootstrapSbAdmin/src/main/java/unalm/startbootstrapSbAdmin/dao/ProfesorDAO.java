package unalm.startbootstrapSbAdmin.dao;

import unalm.startbootstrapSbAdmin.model.Profesor;

public interface ProfesorDAO extends GenericDAO<Profesor> {
	Profesor findByCodigo(String codigo);
   Profesor get1(String codigo);
   }
