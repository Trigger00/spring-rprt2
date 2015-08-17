package unalm.startbootstrapSbAdmin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Entity
@Table(name = "rg_bach_alumno")
public class RgBachAlumno implements Serializable {
	@SequenceGenerator(name = "LOG_ID_SEQ", sequenceName = "LOG_ID_SEQ")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LOG_ID_SEQ")
	@Column(name = "ID")
	private Long id;

	@Column(name = "MATRICULA")
	private String matricula;

	@Column(name = "ALU_NOMBRE")
	private String aluNombre;

	@Column(name = "ppg")
	private String ppg;
	
	@Column(name = "fac_nombre")
	private String facNombre;

	@Column(name = "esp_nombre")
	private String espNombre;
	@Column(name = "pro_codigo")
	private String proCodigo;
	@Column(name = "ciclo")
	private String ciclo;
	@Column(name = "usuario")
	private String usuario;

	public RgBachAlumno() {
		super();
	}

	public RgBachAlumno(Long id) {
		super();
		this.id = id;
	}



	public RgBachAlumno(Long id, String matricula, String aluNombre,
			String ppg, String facNombre, String espNombre, String proCodigo,
			String ciclo, String usuario) {
		super();
		this.id = id;
		this.matricula = matricula;
		this.aluNombre = aluNombre;
		this.ppg = ppg;
		this.facNombre = facNombre;
		this.espNombre = espNombre;
		this.proCodigo = proCodigo;
		this.ciclo = ciclo;
		this.usuario = usuario;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getAluNombre() {
		return aluNombre;
	}

	public void setAluNombre(String aluNombre) {
		this.aluNombre = aluNombre;
	}

	public String getPpg() {
		return ppg;
	}

	public void setPpg(String ppg) {
		this.ppg = ppg;
	}

	public String getFacNombre() {
		return facNombre;
	}

	public void setFacNombre(String facNombre) {
		this.facNombre = facNombre;
	}

	public String getEspNombre() {
		return espNombre;
	}

	public void setEspNombre(String espNombre) {
		this.espNombre = espNombre;
	}

	public String getProCodigo() {
		return proCodigo;
	}

	public void setProCodigo(String proCodigo) {
		this.proCodigo = proCodigo;
	}

	public String getCiclo() {
		return ciclo;
	}

	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	
	

}
