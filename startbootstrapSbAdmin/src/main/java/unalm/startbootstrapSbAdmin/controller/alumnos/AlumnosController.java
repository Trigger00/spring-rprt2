package unalm.startbootstrapSbAdmin.controller.alumnos;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import unalm.startbootstrapSbAdmin.controller.profesor.ProfesorService;
import unalm.startbootstrapSbAdmin.controller.rgBachAlumno.RgBachAlumnoService;
import unalm.startbootstrapSbAdmin.dao.ProgramaDAO;
import unalm.startbootstrapSbAdmin.model.Alumnos;
import unalm.startbootstrapSbAdmin.model.Especial;
import unalm.startbootstrapSbAdmin.model.Facultad;
import unalm.startbootstrapSbAdmin.model.Profesor;
import unalm.startbootstrapSbAdmin.model.Programa;
import unalm.startbootstrapSbAdmin.model.PromCiclos;
import unalm.startbootstrapSbAdmin.model.RgBachAlumno;
import unalm.startbootstrapSbAdmin.model.TramitesDoc;

@Controller
@RequestMapping(value = { "/" })
public class AlumnosController {

	@Autowired
	AlumnosService service;

	@Autowired
	ProgramaDAO programaDAO;

	@Autowired
	RgBachAlumnoService serviceRegistro;

	@Autowired
	ProfesorService serviceProfesor;

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		List<Alumnos> alumnos = service.allAlumnos();
		model.addAttribute("alumnos2", alumnos);

		List<RgBachAlumno> registro = service.allRegistros();
		model.addAttribute("registros", registro);
		return "test/index";

	}

	@RequestMapping(value = "user/{id}/editar", method = RequestMethod.GET)
	public String editar(@PathVariable("id") Long id, Model model) {

		System.out.println("entro a editar");
		/*
		 * Alumnos alumnos = service.findAlumno(id); if (alumnos == null) {
		 * return "test/index"; }
		 */
		RgBachAlumno rgBachAlumno = service.findRegistro(id);
		

		Facultad facultad = new Facultad();
		facultad.setFacNombre(rgBachAlumno.getFacNombre());

		Especial especial = new Especial();
		especial.setEspNombre(rgBachAlumno.getEspNombre());

		Profesor profesor = new Profesor();
		profesor.setProNombre(rgBachAlumno.getProCodigo());

		Alumnos alumnos = new Alumnos();
		alumnos.setMatricula(rgBachAlumno.getMatricula());
		alumnos.setAlu_nombre(rgBachAlumno.getAluNombre());
		alumnos.setAlumnosFac(facultad);
		// alumnos.setPro_codigo(rgBachAlumno.getProCodigo());
		alumnos.setAlumnosProfesor(profesor);
		alumnos.setEspecial(especial);
	

		PromCiclos promCiclos = new PromCiclos();
		promCiclos.setPpg(Long.valueOf(rgBachAlumno.getPpg()));
		promCiclos.setCiclo(rgBachAlumno.getCiclo());
		Set<PromCiclos> promCiclos1 = new HashSet<PromCiclos>(0);

		promCiclos1.add(promCiclos);

		alumnos.setPromCiclos(promCiclos1);

		
		
		TramitesDoc tramitesDoc = new TramitesDoc();
		tramitesDoc.setAlumnosTramitesDoc(alumnos);
		
		model.addAttribute("id", rgBachAlumno.getId());

		List<RgBachAlumno> registro = service.allRegistros();
		model.addAttribute("registros", registro);
		model.addAttribute("alumnos", tramitesDoc);
		model.addAttribute("css", "success");
		model.addAttribute("msg", "El id es: " + rgBachAlumno.getId());
		return "test/bachillerEdit";
		//return "redirect:/";
	}

	@RequestMapping(value = "search", method = RequestMethod.GET)
	public String Search(@RequestParam("searchString") Long searchString,
			Model model) {
		System.out.println("El valo del searchString es " + searchString);

		System.out.println("salio del promCiclos");
		TramitesDoc tramitesDoc = service.findTramite(searchString);
		
		System.out.println("salio del tramite, el valor es de "+ "- " +tramitesDoc);
		if (tramitesDoc == null) {
			System.out.println("entro al if");
			List<RgBachAlumno> registro = service.allRegistros();
			model.addAttribute("registros", registro);
			model.addAttribute("css", "danger");
			model.addAttribute("msg",
					"No se encontro el alumno con la matricula: "
							+ searchString);
			return "test/index";
		}

		model.addAttribute("alumnos", tramitesDoc);
		List<RgBachAlumno> registro = service.allRegistros();
		model.addAttribute("registros", registro);

		return "test/index";
	}

	@RequestMapping(value = "guardar", method = RequestMethod.POST)
	public String guardar(RgBachAlumno alumnos, RgBachAlumno id, Model model,
			final RedirectAttributes redirectAttributes) {
		System.out.println("el valor de alumnos es: " + alumnos);
		System.out.println("el valor de alumnos es: " + alumnos.getMatricula());
		if (alumnos.getMatricula().length() == 0) {
			return "redirect:/";
		}

		System.out.println("entro a guardar 2");

		/*
		 * Profesor profesor =
		 * serviceProfesor.findProfesor(alumnos.getProCodigo());
		 * System.out.println("Nombre del profesor: " +
		 * profesor.getProNombre()); RgBachAlumno rgBachAlumnoDato = new
		 * RgBachAlumno(); rgBachAlumnoDato.setId(alumnos.getId());
		 * rgBachAlumnoDato.setAluNombre(alumnos.getAluNombre());
		 * rgBachAlumnoDato.setCiclo(alumnos.getCiclo());
		 * rgBachAlumnoDato.setEspNombre(alumnos.getEspNombre());
		 * rgBachAlumnoDato.setFacNombre(alumnos.getFacNombre());
		 * rgBachAlumnoDato.setMatricula(alumnos.getMatricula());
		 * rgBachAlumnoDato.setPpg(alumnos.getPpg());
		 * rgBachAlumnoDato.setProCodigo(profesor.getProNombre());
		 */
		service.guardAlumno(alumnos);

		redirectAttributes.addFlashAttribute("css", "success");
		redirectAttributes.addFlashAttribute("msg",
				"Registro agregado exitosamente");
		return "redirect:/";
	}

	@RequestMapping(value = "{id}/eliminar")
	public String eliminar(@PathVariable("id") Long id, Model model) {
		System.out.println("entro a eliminar");
		serviceRegistro.deleteRegistro(id);

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
		parameterMap.put("P_EXITO", "GRADO DE BACHILLER");
		parameterMap.put("P_MATRICULA", rgBachAlumno.getMatricula());
		parameterMap.put("P_ALUNOMBRE", rgBachAlumno.getAluNombre());
		parameterMap.put("P_FACNOMBRE", rgBachAlumno.getFacNombre());
		parameterMap.put("P_ESPNOMBRE", rgBachAlumno.getEspNombre());
		parameterMap.put("P_PROCODIGO", rgBachAlumno.getProCodigo());
		parameterMap.put("P_CICLO", rgBachAlumno.getCiclo());
		parameterMap.put("P_PPG", rgBachAlumno.getPpg());

		// parameterMap.put("P_EXITO", "datoooos");
		parameterMap.put("datasource", JRdataSource);

		// pdfReport bean has ben declared in the jasper-views.xml file
		modelAndView = new ModelAndView("pdfReport", parameterMap);

		return modelAndView;
		// return null;
	}

}
