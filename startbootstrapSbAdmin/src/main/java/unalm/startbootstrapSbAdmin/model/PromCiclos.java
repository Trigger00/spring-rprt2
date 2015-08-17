package unalm.startbootstrapSbAdmin.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "prom_ciclos", catalog = "elbernab")
public class PromCiclos implements Serializable {
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "matricula")
	private Alumnos alumnosPromCiclos;
	
	 
	
	@Id
	@Column(name = "id")
	private String id;

	@Column(name = "ciclo")
	private String ciclo;
	
	@Column(name = "fac_codigo")
	private String facCodigo;
	
	@Column(name = "esp_codigo")
	private String espCodigo;
	
	@Column(name = "ppg")
	private Long ppg;
	
	public PromCiclos() {
		super();
	}



	public PromCiclos(Alumnos alumnosPromCiclos, String id, String ciclo,
			String facCodigo, String espCodigo, Long ppg) {
		super();
		this.alumnosPromCiclos = alumnosPromCiclos;
		this.id = id;
		this.ciclo = ciclo;
		this.facCodigo = facCodigo;
		this.espCodigo = espCodigo;
		this.ppg = ppg;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public Alumnos getAlumnosPromCiclos() {
		return alumnosPromCiclos;
	}


	public void setAlumnosPromCiclos(Alumnos alumnosPromCiclos) {
		this.alumnosPromCiclos = alumnosPromCiclos;
	}


	public String getCiclo() {
		return ciclo;
	}


	public void setCiclo(String ciclo) {
		this.ciclo = ciclo;
	}

	public String getFacCodigo() {
		return facCodigo;
	}

	public void setFacCodigo(String facCodigo) {
		this.facCodigo = facCodigo;
	}

	public String getEspCodigo() {
		return espCodigo;
	}

	public void setEspCodigo(String espCodigo) {
		this.espCodigo = espCodigo;
	}

	public Long getPpg() {
		return ppg;
	}

	public void setPpg(Long ppg) {
		this.ppg = ppg;
	}

}