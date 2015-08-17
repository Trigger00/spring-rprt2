package unalm.startbootstrapSbAdmin.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "especial")
public class Especial implements Serializable {

	@Id
	@Column(name = "ESP_CODIGO")
	private String espCodigo;

	@Column(name = "FAC_CODIGO")
	private String facCodigo;

	@Column(name = "ESP_NOMBRE")
	private String espNombre;
	@Column(name = "ESP_NINGLE")
	private String espNingle;
	@Column(name = "NO_ACT")
	private String noAct;
	@Column(name = "ANR_E")
	private String anrE;
	@Column(name = "CANAL")
	private String canal;
	@Column(name = "SIMBOLO")
	private String simbolo;
	@Column(name = "FLAG_PRCSO_ADMSION")
	private String flagPrcsoAdmision;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "especial")
	private Set<Alumnos> Alumnos = new HashSet<Alumnos>(0);

	public Especial() {
		super();
	}






	public Especial(String espCodigo, String facCodigo, String espNombre,
			String espNingle, String noAct, String anrE, String canal,
			String simbolo, String flagPrcsoAdmision,
			Set<unalm.startbootstrapSbAdmin.model.Alumnos> alumnos) {
		super();
		this.espCodigo = espCodigo;
		this.facCodigo = facCodigo;
		this.espNombre = espNombre;
		this.espNingle = espNingle;
		this.noAct = noAct;
		this.anrE = anrE;
		this.canal = canal;
		this.simbolo = simbolo;
		this.flagPrcsoAdmision = flagPrcsoAdmision;
		Alumnos = alumnos;
	}






	public String getEspCodigo() {
		return espCodigo;
	}

	public void setEspCodigo(String espCodigo) {
		this.espCodigo = espCodigo;
	}

	public String getFacCodigo() {
		return facCodigo;
	}

	public void setFacCodigo(String facCodigo) {
		this.facCodigo = facCodigo;
	}

	public String getEspNombre() {
		return espNombre;
	}

	public void setEspNombre(String espNombre) {
		this.espNombre = espNombre;
	}

	public String getEspNingle() {
		return espNingle;
	}

	public void setEspNingle(String espNingle) {
		this.espNingle = espNingle;
	}

	public String getNoAct() {
		return noAct;
	}

	public void setNoAct(String noAct) {
		this.noAct = noAct;
	}

	public String getAnrE() {
		return anrE;
	}

	public void setAnrE(String anrE) {
		this.anrE = anrE;
	}

	public String getCanal() {
		return canal;
	}

	public void setCanal(String canal) {
		this.canal = canal;
	}

	public String getSimbolo() {
		return simbolo;
	}

	public void setSimbolo(String simbolo) {
		this.simbolo = simbolo;
	}

	public String getFlagPrcsoAdmision() {
		return flagPrcsoAdmision;
	}

	public void setFlagPrcsoAdmision(String flagPrcsoAdmision) {
		this.flagPrcsoAdmision = flagPrcsoAdmision;
	}

	public Set<Alumnos> getAlumnos() {
		return Alumnos;
	}

	public void setAlumnos(Set<Alumnos> alumnos) {
		Alumnos = alumnos;
	}

}