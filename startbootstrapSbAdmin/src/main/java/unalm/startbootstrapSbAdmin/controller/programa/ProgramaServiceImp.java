/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unalm.startbootstrapSbAdmin.controller.programa;

import unalm.startbootstrapSbAdmin.dao.ProgramaDAO;
import unalm.startbootstrapSbAdmin.model.Programa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ProgramaServiceImp implements ProgramaService {

	@Autowired
	ProgramaDAO programaDAO;

	public List<Programa> allPrograma() {
		return programaDAO.list();
	}

	public Programa findPrograma(Long id) {
		return programaDAO.get(id);
	}

	public void guardarPrograma(Programa programa) {
		System.out.println("ID en el service es: "+programa.getId() );
		if (programa.getId() == null) {
			
			System.out.println("Entra a save");
		}
		
		if (programa.getId() == null) {
			programaDAO.save(programa);
		} else {
			programaDAO.update(programa);
		}

	}

	public void deletePrograma(Long id) {
		programaDAO.delete(id);
	}

}
