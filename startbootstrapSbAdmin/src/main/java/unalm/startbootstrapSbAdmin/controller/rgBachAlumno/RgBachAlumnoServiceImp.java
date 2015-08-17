package unalm.startbootstrapSbAdmin.controller.rgBachAlumno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import unalm.startbootstrapSbAdmin.dao.RgBachAlumnoDAO;

@Service
@Transactional
public class RgBachAlumnoServiceImp implements RgBachAlumnoService {
	@Autowired
	RgBachAlumnoDAO rgBachAlumnoDAO;

	public void deleteRegistro(Long id) {
		rgBachAlumnoDAO.delete(id);

	}
}
