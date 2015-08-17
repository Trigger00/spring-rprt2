package unalm.startbootstrapSbAdmin.controller.test;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
// @RequestMapping(value = {"/", "pruebas", "test"})
@RequestMapping(value = { "test" })
public class TestController {

	@RequestMapping(method = RequestMethod.GET)
	public String index(Model model) {

		model.addAttribute("titulo", "BIENVENIDOS");
		model.addAttribute("contenido", "El curso de Java avanzado");
		return "test/index";
	}

	@RequestMapping("informacion")
	public ModelAndView alternativo() {
		Map<String, Object> retorno = new HashMap<String, Object>();
		retorno.put("titulo", "Hola TECSUP");
		retorno.put("contenido", "Bienvenidos al curso Spring Framework");
		return new ModelAndView("test/informacion", retorno);
	}

	@RequestMapping(value = { "info", "prueba" })
	public String pruebas() {
		return "test/pruebas";
	}

	@ModelAttribute
	public void atributosGenerales(Model model) {

		model.addAttribute("empresa", "Luis B");
		model.addAttribute("marca", "App Demostracion");
	}

	@RequestMapping("parametros")
	public String parametros(String nombres, String apellidos, Model model) {
		model.addAttribute("nombreCompleto", nombres + " " + apellidos);
		return "test/parametros";
	}

	@RequestMapping("parametros2")
	public String parametros2(@RequestParam("nombres") String nombres,
			@RequestParam("apellidos") String apellidos, Model model) {
		model.addAttribute("nombreCompleto", nombres + " " + apellidos);
		return "test/parametros";
	}

}
