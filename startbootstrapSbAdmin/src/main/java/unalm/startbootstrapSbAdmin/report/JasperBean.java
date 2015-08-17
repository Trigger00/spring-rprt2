package unalm.startbootstrapSbAdmin.report;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import unalm.startbootstrapSbAdmin.dao.ProgramaDAO;
import unalm.startbootstrapSbAdmin.datasource.StudentDataSource;
import unalm.startbootstrapSbAdmin.model.Programa;

@Controller
public class JasperBean {

	private JRDataSource jrDatasource;


	public JasperBean() throws JRException {
		StudentDataSource dsStudent = new StudentDataSource();
		jrDatasource = dsStudent.create(null);
	}

	@RequestMapping(value = "/jrreport", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("datasource", jrDatasource);
		
		model.addAttribute("format", "pdf");
		return "multiViewReport";
	}





}
