package unalm.startbootstrapSbAdmin.controller.alumnos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import unalm.startbootstrapSbAdmin.controller.rgBachAlumno.RgBachAlumnoService;
import unalm.startbootstrapSbAdmin.dao.ProgramaDAO;
import unalm.startbootstrapSbAdmin.model.Alumnos;
import unalm.startbootstrapSbAdmin.model.Programa;
import unalm.startbootstrapSbAdmin.model.PromCiclos;
import unalm.startbootstrapSbAdmin.model.RgBachAlumno;

@Controller
@RequestMapping(value = { "/" })
public class AlumnosController {

	@Autowired
	AlumnosService service;

	@Autowired
	ProgramaDAO programaDAO;

	@Autowired
	RgBachAlumnoService serviceRegistro;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		List<Alumnos> alumnos = service.allAlumnos();
		model.addAttribute("alumnos2", alumnos);

		List<RgBachAlumno> registro = service.allRegistros();
		model.addAttribute("registros", registro);
		return "test/index";

	}

	@RequestMapping("{id}/editar")
	public String editar(@PathVariable("id") Long id, Model model) {

		System.out.println("entro a editar");

		Alumnos alumnos = service.findAlumno(id);
		if (alumnos == null) {
			return "test/index";
		}

		model.addAttribute("alumnos", alumnos);
		/*
		 * List<Alumnos> alumnos3 = service.allAlumnos();
		 * model.addAttribute("alumnos2", alumnos3);
		 * 
		 * List<RgBachAlumno> registro = service.allRegistros();
		 * model.addAttribute("registros", registro);
		 */
		System.out.println(alumnos.getAlu_nombre());
		System.out.println(alumnos.getMatricula());
		return "test/index";
	}

	@RequestMapping(value = "search", method = RequestMethod.GET)
	public String Search(@RequestParam("searchString") Long searchString,
			Model model) {

		System.out.println("entro al search");
		System.out.println("El valo del searchString es " + searchString);

		///Alumnos alumnos = service.findAlumno(searchString);
		PromCiclos promCiclos = service.findAlumno2(searchString);
		
		//if (alumnos == null) {
		  if (promCiclos == null) {
			List<RgBachAlumno> registro = service.allRegistros();
			model.addAttribute("registros", registro);

			return "test/index";

		}

	//	model.addAttribute("alumnos", alumnos);
		 	model.addAttribute("alumnos", promCiclos);
		/*
		 * List<Alumnos> alumnos3 = service.allAlumnos();
		 * model.addAttribute("alumnos2", alumnos3);
		 * 
		 * List<RgBachAlumno> registro = service.allRegistros();
		 * model.addAttribute("registros", registro);
		 */
/*
		 	System.out.println(alumnos.getAlu_nombre());
		System.out.println(alumnos.getMatricula());
		
		*/
		 	System.out.println(promCiclos.getAlumnosPromCiclos().getMatricula());
		 	System.out.println(promCiclos.getAlumnosPromCiclos().getEspecial().getEspCodigo());
		
		List<RgBachAlumno> registro = service.allRegistros();
		model.addAttribute("registros", registro);

		return "test/index";
		// return "redirect:";
	}

	@RequestMapping("guardar")
	public String guardar(RgBachAlumno alumnos) {
		System.out.println("entro a guardar 2");
		service.guardAlumno(alumnos);

		return "redirect:";
	}

	@RequestMapping(value="{id}/eliminar")
	public String eliminar(@PathVariable("id") Long id, Model model) {
		System.out.println("entro a eliminar");
		serviceRegistro.deleteRegistro(id);
		System.out.println("lo elimino");
		return "redirect:/";
	}

	@RequestMapping(method = RequestMethod.GET, value = "{id}/pdf")
	public ModelAndView generatePdfReport(@PathVariable("id") Long id,
			ModelAndView modelAndView) {
		System.out.println("Entra la String generatePdfReport");
		Map<String, Object> parameterMap = new HashMap<String, Object>();

		List<Programa> usersList = programaDAO.list();

		JRDataSource JRdataSource = new JRBeanCollectionDataSource(usersList);
		System.out.println("valores de parameterMap001 " + " " + JRdataSource);

		System.out.println("El id es :" + id);
		RgBachAlumno rgBachAlumno = service.findRegistro(id);
		System.out.println("datos del registro " + rgBachAlumno.getAluNombre());
		parameterMap.put("P_EXITO", rgBachAlumno.getAluNombre());
		// parameterMap.put("P_EXITO", "datoooos");
		parameterMap.put("datasource", JRdataSource);

		// pdfReport bean has ben declared in the jasper-views.xml file
		modelAndView = new ModelAndView("pdfReport", parameterMap);

		return modelAndView;

	}

}
