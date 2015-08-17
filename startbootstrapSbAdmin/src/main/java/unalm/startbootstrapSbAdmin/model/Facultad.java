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
@Table(name = "facultad", catalog = "elbernab")
public class Facultad implements Serializable {

	@Id
	@Column(name = "fac_codigo")
	private String facCodigo;

	@Column(name = "fac_nombre")
	private String facNombre;
	
	@Column(name = "fac_ningle")
	private String facNingle;
	
	@Column(name = "anrf")
	private String anrf;
	
	@Column(name = "fac_ingles")
	private String facIngles;
	
	@Column(name = "pro_codigo")
	private String proCodigo;
	
	@Column(name = "simbolo")
	private String simbolo;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "alumnosFac")
	private Set<Alumnos> Alumnos = new HashSet<Alumnos>(0);

	public Facultad() {
		super();
	}

	public Facultad(String facCodigo, String facNombre, String facNingle,
			String anrf, String facIngles, String proCodigo, String simbolo,
			Set<unalm.startbootstrapSbAdmin.model.Alumnos> alumnos) {
		super();
		this.facCodigo = facCodigo;
		this.facNombre = facNombre;
		this.facNingle = facNingle;
		this.anrf = anrf;
		this.facIngles = facIngles;
		this.proCodigo = proCodigo;
		this.simbolo = simbolo;
		Alumnos = alumnos;
	}

	public String getFacCodigo() {
		return facCodigo;
	}

	public void setFacCodigo(String facCodigo) {
		this.facCodigo = facCodigo;
	}

	public String getFacNombre() {
		return facNombre;
	}

	public void setFacNombre(String facNombre) {
		this.facNombre = facNombre;
	}

	public String getFacNingle() {
		return facNingle;
	}

	public void setFacNingle(String facNingle) {
		this.facNingle = facNingle;
	}

	public String getAnrf() {
		return anrf;
	}

	public void setAnrf(String anrf) {
		this.anrf = anrf;
	}

	public String getFacIngles() {
		return facIngles;
	}

	public void setFacIngles(String facIngles) {
		this.facIngles = facIngles;
	}

	public String getProCodigo() {
		return proCodigo;
	}

	public void setProCodigo(String proCodigo) {
		this.proCodigo = proCodigo;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public Set<Alumnos> getAlumnos() {
		return Alumnos;
	}

	public void setAlumnos(Set<Alumnos> alumnos) {
		Alumnos = alumnos;
	}

}
