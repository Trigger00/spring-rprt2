package unalm.startbootstrapSbAdmin.controller;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RequestMapping;

import unalm.startbootstrapSbAdmin.controller.alumnos.AlumnosService;

@Controller
@RequestMapping("/report2/")
public class ReportController2 {
	@Autowired
	AlumnosService service;

	@RequestMapping("pdf")
	public void getReportPDF(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		try {
			File jasperReport = ResourceUtils
					.getFile("classpath:unalm/startbootstrapSbAdmin/controller/HistoPre.jrxml");
			Map parameter = new HashMap();
			parameter.put("P_MATRICULA", "19900084");
			Report report = new Report();
			report.setJasperReport(jasperReport);
			report.setParameter(parameter);

			report.setConnection(service.getConnection());
			report.PDF(request, response);
		} catch (Exception e) {

		}
	}
}
