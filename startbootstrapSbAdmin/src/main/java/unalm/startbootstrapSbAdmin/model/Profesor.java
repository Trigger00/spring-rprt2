package unalm.startbootstrapSbAdmin.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "profesor", catalog = "elbernab")
public class Profesor implements Serializable {

	@Id
	@Column(name = "PRO_CODIGO")
	private String proCodigo;
	@Column(name = "PRO_PATERNO")
	private String proPaterno;
	@Column(name = "PRO_MATERNO")
	private String proMaterno;
	@Column(name = "PRO_NOM")
	private String proNom;
	@Column(name = "PRO_NOMBRE")
	private String proNombre;
	@Column(name = "SEXO")
	private String proSexo;
	@Column(name = "DEP_CODIGO")
	private String depCodigo;
	@Column(name = "UBIGEO")
	private String ubigeo;
	@Column(name = "DIRECCION")
	private String direccion;
	@Column(name = "TELEFONO")
	private String telefono;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "ACTIVO")
	private String activo;
	@Column(name = "EMAIL_UNALM")
	private String emailUnalm;
	@Column(name = "PERSO")
	private Long perso;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "alumnosProfesor")
	private Set<Alumnos> alumnos = new HashSet<Alumnos>(0);

	public Profesor() {
		super();
	}

	public Profesor(String proCodigo, String proPaterno, String proMaterno,
			String proNom, String proNombre, String proSexo, String depCodigo,
			String ubigeo, String direccion, String telefono, String email,
			String activo, String emailUnalm, Long perso, Set<Alumnos> alumnos) {
		super();
		this.proCodigo = proCodigo;
		this.proPaterno = proPaterno;
		this.proMaterno = proMaterno;
		this.proNom = proNom;
		this.proNombre = proNombre;
		this.proSexo = proSexo;
		this.depCodigo = depCodigo;
		this.ubigeo = ubigeo;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
		this.activo = activo;
		this.emailUnalm = emailUnalm;
		this.perso = perso;
		this.alumnos = alumnos;
	}

	public String getProCodigo() {
		return proCodigo;
	}

	public void setProCodigo(String proCodigo) {
		this.proCodigo = proCodigo;
	}

	public String getProPaterno() {
		return proPaterno;
	}

	public void setProPaterno(String proPaterno) {
		this.proPaterno = proPaterno;
	}

	public String getProMaterno() {
		return proMaterno;
	}

	public void setProMaterno(String proMaterno) {
		this.proMaterno = proMaterno;
	}

	public String getProNom() {
		return proNom;
	}

	public void setProNom(String proNom) {
		this.proNom = proNom;
	}

	public String getProNombre() {
		return proNombre;
	}

	public void setProNombre(String proNombre) {
		this.proNombre = proNombre;
	}

	public String getProSexo() {
		return proSexo;
	}

	public void setProSexo(String proSexo) {
		this.proSexo = proSexo;
	}

	public String getDepCodigo() {
		return depCodigo;
	}

	public void setDepCodigo(String depCodigo) {
		this.depCodigo = depCodigo;
	}

	public String getUbigeo() {
		return ubigeo;
	}

	public void setUbigeo(String ubigeo) {
		this.ubigeo = ubigeo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getActivo() {
		return activo;
	}

	public void setActivo(String activo) {
		this.activo = activo;
	}

	public String getEmailUnalm() {
		return emailUnalm;
	}

	public void setEmailUnalm(String emailUnalm) {
		this.emailUnalm = emailUnalm;
	}

	public Long getPerso() {
		return perso;
	}

	public void setPerso(Long perso) {
		this.perso = perso;
	}

	public Set<Alumnos> getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Set<Alumnos> alumnos) {
		this.alumnos = alumnos;
	}

}
