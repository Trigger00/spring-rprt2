package unalm.startbootstrapSbAdmin.model;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "alumnos", catalog = "elbernab")
public class Alumnos implements Serializable {

	@Id
	@Column(name = "matricula")
	private String matricula;

	@Column(name = "pro_codigo")
	private String pro_codigo;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fac_codigo")
	private Facultad alumnosFac;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "esp_codigo")
	private Especial especial;

	@Column(name = "situacion")
	private String situacion;

	@Column(name = "alu_nombre")
	private String alu_nombre;

	@Column(name = "esp_grad")
	private String esp_grad;

	@Column(name = "ciclo_ult")
	private String ciclo_ult;

	@Column(name = "ciclo_r")
	private String ciclo_r;

	@Column(name = "email")
	private String email;

	@Column(name = "curricula")
	private String curricula;

	@Column(name = "perso")
	private String perso;

	@Column(name = "usuario")
	private String usuario;

	@Column(name = "fecha")
	private String fecha;

	@Column(name = "cambio_curricula")
	private String cambio_curricula;

	@Column(name = "fl_no_censado")
	private String fl_no_censado;

	@Column(name = "convenio")
	private String convenio;

	@OneToMany(fetch=FetchType.LAZY,mappedBy="alumnosPromCiclos")
	private Set<PromCiclos> promCiclos = new HashSet<PromCiclos>(0);
	
	
	public Alumnos() {
		super();
	}
	
	

	public Alumnos(String matricula) {
		super();
		this.matricula = matricula;
	}







	public Alumnos(String matricula, String pro_codigo, Facultad alumnosFac,
			Especial especial, String situacion, String alu_nombre,
			String esp_grad, String ciclo_ult, String ciclo_r, String email,
			String curricula, String perso, String usuario, String fecha,
			String cambio_curricula, String fl_no_censado, String convenio,
			Set<PromCiclos> promCiclos) {
		super();
		this.matricula = matricula;
		this.pro_codigo = pro_codigo;
		this.alumnosFac = alumnosFac;
		this.especial = especial;
		this.situacion = situacion;
		this.alu_nombre = alu_nombre;
		this.esp_grad = esp_grad;
		this.ciclo_ult = ciclo_ult;
		this.ciclo_r = ciclo_r;
		this.email = email;
		this.curricula = curricula;
		this.perso = perso;
		this.usuario = usuario;
		this.fecha = fecha;
		this.cambio_curricula = cambio_curricula;
		this.fl_no_censado = fl_no_censado;
		this.convenio = convenio;
		this.promCiclos = promCiclos;
	}



	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getPro_codigo() {
		return pro_codigo;
	}

	public void setPro_codigo(String pro_codigo) {
		this.pro_codigo = pro_codigo;
	}

	public Facultad getAlumnosFac() {
		return alumnosFac;
	}

	public void setAlumnosFac(Facultad alumnosFac) {
		this.alumnosFac = alumnosFac;
	}


	public Especial getEspecial() {
		return especial;
	}



	public void setEspecial(Especial especial) {
		this.especial = especial;
	}



	public String getSituacion() {
		return situacion;
	}

	public void setSituacion(String situacion) {
		this.situacion = situacion;
	}

	public String getAlu_nombre() {
		return alu_nombre;
	}

	public void setAlu_nombre(String alu_nombre) {
		this.alu_nombre = alu_nombre;
	}

	public String getEsp_grad() {
		return esp_grad;
	}

	public void setEsp_grad(String esp_grad) {
		this.esp_grad = esp_grad;
	}

	public String getCiclo_ult() {
		return ciclo_ult;
	}

	public void setCiclo_ult(String ciclo_ult) {
		this.ciclo_ult = ciclo_ult;
	}

	public String getCiclo_r() {
		return ciclo_r;
	}

	public void setCiclo_r(String ciclo_r) {
		this.ciclo_r = ciclo_r;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCurricula() {
		return curricula;
	}

	public void setCurricula(String curricula) {
		this.curricula = curricula;
	}

	public String getPerso() {
		return perso;
	}

	public void setPerso(String perso) {
		this.perso = perso;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCambio_curricula() {
		return cambio_curricula;
	}

	public void setCambio_curricula(String cambio_curricula) {
		this.cambio_curricula = cambio_curricula;
	}

	public String getFl_no_censado() {
		return fl_no_censado;
	}

	public void setFl_no_censado(String fl_no_censado) {
		this.fl_no_censado = fl_no_censado;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}



	public Set<PromCiclos> getPromCiclos() {
		return promCiclos;
	}



	public void setPromCiclos(Set<PromCiclos> promCiclos) {
		this.promCiclos = promCiclos;
	}

}