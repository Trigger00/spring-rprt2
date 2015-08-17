package unalm.startbootstrapSbAdmin.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import unalm.startbootstrapSbAdmin.dao.ProgramaDAO;
import unalm.startbootstrapSbAdmin.model.Programa;

@Controller
@RequestMapping("/report/")
public class ReportController {

	@Autowired
	ProgramaDAO programaDAO;

	@RequestMapping(method = RequestMethod.GET, value = "pdf")
	public ModelAndView generatePdfReport(ModelAndView modelAndView) {
		System.out.println("Entra la String generatePdfReport");
		Map<String, Object> parameterMap = new HashMap<String, Object>();

		List<Programa> usersList = programaDAO.list();

		JRDataSource JRdataSource = new JRBeanCollectionDataSource(usersList);
		System.out.println("valores de parameterMap001 " + " " + JRdataSource);
		
		parameterMap.put("P_EXITO", "DATAAAA");
		parameterMap.put("datasource", JRdataSource);

		// pdfReport bean has ben declared in the jasper-views.xml file
		modelAndView = new ModelAndView("pdfReport", parameterMap);

		return modelAndView;

	}// generatePdfReport

	@RequestMapping(value = "pdf2", method = RequestMethod.GET)
	public ModelAndView pdf(ModelAndView modelAndView) {
		System.out.println("entra al pdf2");
		//Map<String, Object> parameterMap = new HashMap<String, Object>();
		 Map parameterMap = new HashMap();
		parameterMap.put("message", "Thor");

		System.out.println("valores de parameterMap " + " " + parameterMap);
		// pdfReport bean has ben declared in the jasper-views.xml file
		modelAndView = new ModelAndView("helloReport", parameterMap);

		return modelAndView;
	}

}// ReportController