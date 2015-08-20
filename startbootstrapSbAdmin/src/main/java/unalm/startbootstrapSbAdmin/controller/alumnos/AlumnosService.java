package unalm.startbootstrapSbAdmin.controller.alumnos;

import java.util.List;

import unalm.startbootstrapSbAdmin.model.Alumnos;
import unalm.startbootstrapSbAdmin.model.PromCiclos;
import unalm.startbootstrapSbAdmin.model.RgBachAlumno;
import unalm.startbootstrapSbAdmin.model.TramitesDoc;

public interface AlumnosService {

	List<Alumnos> allAlumnos();
	List<RgBachAlumno> allRegistros();
	Alumnos findAlumno (Long codigo);
	PromCiclos findAlumno2 (Long codigo);
	RgBachAlumno findRegistro(Long codigo);
	TramitesDoc findTramite(Long codigo);
	//void guardAlumno(Alumnos alumno);
	void guardAlumno(RgBachAlumno rgBachAlumnoDao);
	
}
