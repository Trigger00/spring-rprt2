package unalm.startbootstrapSbAdmin.dao;

import unalm.startbootstrapSbAdmin.model.RgBachAlumno;

public interface RgBachAlumnoDAO extends GenericDAO<RgBachAlumno>{

	RgBachAlumno findbyCodigo(Long Codigo);
}
