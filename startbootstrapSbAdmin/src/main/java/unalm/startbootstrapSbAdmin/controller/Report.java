package unalm.startbootstrapSbAdmin.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Serializable;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.export.JRHtmlExporter;
import net.sf.jasperreports.engine.export.JRHtmlExporterParameter;
import net.sf.jasperreports.engine.export.JRRtfExporter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.export.JRXmlExporter;
import net.sf.jasperreports.engine.export.JRXmlExporterParameter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class Report implements Serializable {

	private static final long serialVersionUID = 1L;
	private Connection connection = null;
	private JasperReport jasperReport = null;
	private JRDataSource dataSource = null;
	private Map parameters;
	private Log log = LogFactory.getLog(getClass());

	public void setConnection(Connection connection) {
		this.connection = connection;
	}

	public void setJasperReport(String jrxmlFile) throws Exception {
		try {
			File archivo = new File(jrxmlFile);
			setJasperReport(archivo);
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public void setJasperReport(File archivo) throws Exception {
		try {
			if (archivo.exists()) {
				jasperReport = JasperCompileManager.compileReport(archivo
						.getAbsolutePath());
			} else {
				log.error("[Report::setJasperReport] Error :: EL ARCHIVO = "
						+ archivo.getAbsolutePath() + " NO EXISTE");
			}
		} catch (Exception e) {
			throw new Exception(e);
		}
	}

	public void setParameter(Map parameters) {
		this.parameters = parameters;
	}

	public Connection getConnection() {
		return connection;
	}

	public JasperReport getJasperReport() {
		return jasperReport;
	}

	public Map getParameters() {
		return parameters;
	}

	public void PDF(HttpServletRequest request, HttpServletResponse response)
			throws JRException, IOException {
		PDF(request, response, dataSource, connection);
	}

	public void PDF(HttpServletRequest request, HttpServletResponse response,
			Connection connection) throws JRException, IOException {
		PDF(request, response, dataSource, connection);
	}

	public void PDF(HttpServletRequest request, HttpServletResponse response,
			JRDataSource dataSource) throws JRException, IOException {
		PDF(request, response, dataSource, connection);
	}

	public void PDF(HttpServletRequest request, HttpServletResponse response,
			JRDataSource dataSource, Connection connection) throws JRException,
			IOException {
		HttpSession session = (HttpSession) request.getSession(false);
		session.removeAttribute("IMAGES_MAP");

		byte[] bytes = null;

		try {

			if (dataSource != null) {
				System.out.println("Genera el reporte");
				bytes = JasperRunManager.runReportToPdf(jasperReport,
						parameters, dataSource);
			} else {
				bytes = JasperRunManager.runReportToPdf(jasperReport,
						parameters, connection);
			}
		} catch (JRException e) {
			
			System.out.println("excepcion: "+ e);
			throw new JRException(e);
		}

		if (bytes != null && bytes.length > 0) {
			response.setContentType("application/pdf");
			response.setContentLength(bytes.length);
			ServletOutputStream outputStream = response.getOutputStream();
			outputStream.write(bytes, 0, bytes.length);
			outputStream.flush();
			outputStream.close();
		}
	}

	public JRDataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(JRDataSource dataSource) {
		this.dataSource = dataSource;
	}

	public void XML(HttpServletRequest request, HttpServletResponse response)
			throws JRException, IOException {
		XML(request, response, dataSource, connection);
	}

	public void XML(HttpServletRequest request, HttpServletResponse response,
			Connection connection) throws JRException, IOException {
		XML(request, response, dataSource, connection);
	}

	public void XML(HttpServletRequest request, HttpServletResponse response,
			JRDataSource dataSource) throws JRException, IOException {
		XML(request, response, dataSource, connection);
	}

	public void XML(HttpServletRequest request, HttpServletResponse response,
			JRDataSource dataSource, Connection connection) throws JRException,
			IOException {
		response.setContentType("text/xml");
		PrintWriter out = response.getWriter();

		try {
			JasperPrint jasperPrint = null;

			if (dataSource != null) {
				jasperPrint = JasperFillManager.fillReport(jasperReport,
						parameters, dataSource);
			} else {
				jasperPrint = JasperFillManager.fillReport(jasperReport,
						parameters, connection);
			}

			JRXmlExporter exporter = new JRXmlExporter();

			exporter.setParameter(JRXmlExporterParameter.JASPER_PRINT,
					jasperPrint);
			exporter.setParameter(JRXmlExporterParameter.OUTPUT_WRITER, out);
			exporter.setParameter(JRXmlExporterParameter.CHARACTER_ENCODING,
					"ISO-8859-1");
			exporter.setParameter(JRXmlExporterParameter.IS_EMBEDDING_IMAGES,
					"true");

			exporter.exportReport();

		} catch (JRException e) {
			throw new JRException(e);
		} finally {
			out.flush();
			out.close();
		}
	}

	public void RTF(HttpServletRequest request, HttpServletResponse response)
			throws JRException, IOException {
		RTF(request, response, dataSource, connection);
	}

	public void RTF(HttpServletRequest request, HttpServletResponse response,
			Connection connection) throws JRException, IOException {
		RTF(request, response, dataSource, connection);
	}

	public void RTF(HttpServletRequest request, HttpServletResponse response,
			JRDataSource dataSource) throws JRException, IOException {
		RTF(request, response, dataSource, connection);
	}

	public void RTF(HttpServletRequest request, HttpServletResponse response,
			JRDataSource dataSource, Connection connection) throws JRException,
			IOException {
		response.setContentType("text/msword");
		ServletOutputStream outputStream = response.getOutputStream();

		try {
			JasperPrint jasperPrint = null;

			if (dataSource != null) {
				jasperPrint = JasperFillManager.fillReport(jasperReport,
						parameters, dataSource);
			} else {
				jasperPrint = JasperFillManager.fillReport(jasperReport,
						parameters, connection);
			}

			JRRtfExporter exporter = new JRRtfExporter();

			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_STREAM,
					outputStream);

			exporter.exportReport();

		} catch (JRException e) {
			throw new JRException(e);
		} finally {
			outputStream.flush();
			outputStream.close();
		}
	}

	public void XLS(HttpServletRequest request, HttpServletResponse response,
			Boolean IS_DETECT_CELL_TYPE) throws JRException, IOException {
		XLS(request, response, dataSource, connection, IS_DETECT_CELL_TYPE);
	}

	public void XLS(HttpServletRequest request, HttpServletResponse response,
			Connection connection, Boolean IS_DETECT_CELL_TYPE)
			throws JRException, IOException {
		XLS(request, response, dataSource, connection, IS_DETECT_CELL_TYPE);
	}

	public void XLS(HttpServletRequest request, HttpServletResponse response,
			JRDataSource dataSource, Boolean IS_DETECT_CELL_TYPE)
			throws JRException, IOException {
		XLS(request, response, dataSource, connection, IS_DETECT_CELL_TYPE);
	}

	public void XLS(HttpServletRequest request, HttpServletResponse response,
			JRDataSource dataSource, Connection connection,
			Boolean IS_DETECT_CELL_TYPE) throws JRException, IOException {
		response.setContentType("application/vnd.ms-excel");
		ServletOutputStream outputStream = response.getOutputStream();

		try {
			JasperPrint jasperPrint = null;

			if (dataSource != null) {
				jasperPrint = JasperFillManager.fillReport(jasperReport,
						parameters, dataSource);
				((ReportDataSource) dataSource).reset();
			} else {
				jasperPrint = JasperFillManager.fillReport(jasperReport,
						parameters, connection);
			}

			System.gc();
			JRXlsExporter exporter = new JRXlsExporter();

			exporter.setParameter(JRXlsExporterParameter.JASPER_PRINT,
					jasperPrint);
			exporter.setParameter(JRXlsExporterParameter.OUTPUT_STREAM,
					outputStream);
			exporter.setParameter(
					JRXlsExporterParameter.IS_FONT_SIZE_FIX_ENABLED,
					Boolean.TRUE);
			exporter.setParameter(JRXlsExporterParameter.IS_ONE_PAGE_PER_SHEET,
					Boolean.TRUE);
			exporter.setParameter(JRXlsExporterParameter.IS_DETECT_CELL_TYPE,
					IS_DETECT_CELL_TYPE);
			exporter.setParameter(
					JRXlsExporterParameter.IS_WHITE_PAGE_BACKGROUND,
					Boolean.TRUE);
			exporter.setParameter(
					JRXlsExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_ROWS,
					Boolean.TRUE);

			exporter.exportReport();

		} catch (JRException e) {
			throw new JRException(e);
		} finally {
			outputStream.flush();
			outputStream.close();
		}
	}

	public void HTML(HttpServletRequest request, HttpServletResponse response)
			throws JRException, IOException {
		HTML(request, response, dataSource, connection);
	}

	public void HTML(HttpServletRequest request, HttpServletResponse response,
			Connection connection) throws JRException, IOException {
		HTML(request, response, dataSource, connection);
	}

	public void HTML(HttpServletRequest request, HttpServletResponse response,
			JRDataSource dataSource) throws JRException, IOException {
		HTML(request, response, dataSource, connection);
	}

	public void HTML(HttpServletRequest request, HttpServletResponse response,
			JRDataSource dataSource, Connection connection) throws JRException,
			IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		try {
			JasperPrint jasperPrint = null;

			if (dataSource != null) {
				jasperPrint = JasperFillManager.fillReport(jasperReport,
						parameters, dataSource);
			} else {
				jasperPrint = JasperFillManager.fillReport(jasperReport,
						parameters, connection);
			}

			JRHtmlExporter exporter = new JRHtmlExporter();

			Map imagesMap = new HashMap();
			request.getSession().setAttribute("IMAGES_MAP", imagesMap);

			exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
			exporter.setParameter(JRExporterParameter.OUTPUT_WRITER, out);
			exporter.setParameter(JRHtmlExporterParameter.HTML_HEADER, "");
			exporter.setParameter(JRHtmlExporterParameter.BETWEEN_PAGES_HTML,
					"");
			exporter.setParameter(JRHtmlExporterParameter.HTML_FOOTER, "");
			exporter.setParameter(JRHtmlExporterParameter.IMAGES_MAP, imagesMap);
			exporter.setParameter(JRHtmlExporterParameter.IMAGES_URI,
					((String) request.getAttribute("actionReport"))
							+ "?method=image&image=");

			exporter.exportReport();

		} catch (JRException e) {
			throw new JRException(e);
		} finally {
			out.flush();
			out.close();
		}
	}
}