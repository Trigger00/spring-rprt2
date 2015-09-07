package unalm.startbootstrapSbAdmin.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.enterprise.inject.Model;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import unalm.startbootstrapSbAdmin.controller.alumnos.AlumnosService;

@Controller
@RequestMapping(value = { "/report3/" })
public class ReportController3 {
	@Autowired
	AlumnosService service;
	
	
	@RequestMapping("index")
	public String index2() {

		return "test/reportHistoPreEsp";
	}

	@RequestMapping("pdf")
	public void getReportPDF(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		try {
			
			File jasperReport = ResourceUtils
					.getFile("classpath:unalm/startbootstrapSbAdmin/controller/HistoPre.jrxml");
			Map parameter = new HashMap();
			//parameter.put("P_MATRICULA", "19900084");
			parameter.put("P_MATRICULA", request.getParameter("matricula"));
			Report report = new Report();
			report.setJasperReport(jasperReport);
			report.setParameter(parameter);

			report.setConnection(service.getConnection());
			report.PDF(request, response);
		} catch (Exception e) {

		}
	}
}
