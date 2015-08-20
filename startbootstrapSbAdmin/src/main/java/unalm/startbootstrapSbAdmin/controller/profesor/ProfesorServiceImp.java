package unalm.startbootstrapSbAdmin.controller.profesor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import unalm.startbootstrapSbAdmin.dao.ProfesorDAO;
import unalm.startbootstrapSbAdmin.model.Profesor;



@Service
@Transactional
public class ProfesorServiceImp implements ProfesorService{

	@Autowired
	ProfesorDAO profesorDAO;
	
	public Profesor findProfesor(String codigo) {
		return profesorDAO.get1(codigo);
	}

}
