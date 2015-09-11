package unalm.startbootstrapSbAdmin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import unalm.startbootstrapSbAdmin.bean.Employee;
import unalm.startbootstrapSbAdmin.controller.alumnos.AlumnosService;
import unalm.startbootstrapSbAdmin.model.RgBachAlumno;



@Controller
@RequestMapping("/employee/add")
public class EmployeeController {
	@Autowired
	AlumnosService service;

	
	/*
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody Employee add(HttpServletRequest request, HttpServletResponse response)
			throws Exception {

		Employee employee = new Employee();

		String firstName = "nombreee "+request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");

		employee.setEmail(email);
		employee.setFirstName(firstName);
		employee.setLastName(lastName);

		return employee;
	}
	*/
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	RgBachAlumno add2(HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		System.out.println("entro al EmployeeController2");
		Employee employee = new Employee();

		String id = request.getParameter("id");
		System.out.println("el id es: "+ id);
		RgBachAlumno rgBachAlumno = service.findRegistro(Long.valueOf(id));

		return rgBachAlumno;
	}
}
