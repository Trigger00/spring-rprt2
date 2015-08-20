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
@Table(name = "tramites_doc", catalog = "elbernab")
public class TramitesDoc implements Serializable {

	@Id
	@Column(name = "TRAMITE")
	private String tramite;
	@Column(name = "ANUAL")
	private String anual;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MATRICULA")
	private Alumnos alumnosTramitesDoc;
	@Column(name = "SOLICITANTE")
	private String solicitante;
	@Column(name = "SOLICITA_CODIGO")
	private String solicitaCodigo;
	@Column(name = "IDIOMA")
	private String idioma;
	@Column(name = "DOCUMENTO")
	private String documento;
	@Column(name = "CICLOS")
	private String ciclos;
	@Column(name = "DESTINATARIO")
	private String destinatario;
	@Column(name = "DESTI_CODIGO")
	private String destiCodigo;
	@Column(name = "SOLICITUD")
	private String solicitud;

	@Column(name = "EMISOR")
	private String emisor;
	@Column(name = "OFICIO")
	private Long oficio;
	@Column(name = "OFICIO_TEXTO")
	private String oficioTexto;
	@Column(name = "LISTO")
	private String listo;
	@Column(name = "DEBE")
	private String debe;
	@Column(name = "ANULAR")
	private String anular;
	@Column(name = "ANUAL_OFICIO")
	private String anualOficio;
	@Column(name = "USUARIO")
	private String usuario;
	@Column(name = "FIRMA_RECEPCION")
	private String firmaRecepcion;
	@Column(name = "RECEPCION_USER")
	private String recepcionUser;
	@Column(name = "USUARIO_ANULA_TRAMITE")
	private String usuarioAnulaTramite;
	@Column(name = "MOTIVO")
	private String motivo;
	@Column(name = "CONVENIO")
	private String convenio;

	public TramitesDoc() {
		super();
	}

	public TramitesDoc(String tramite, String anual,
			Alumnos alumnosTramitesDoc, String solicitante,
			String solicitaCodigo, String idioma, String documento,
			String ciclos, String destinatario, String destiCodigo,
			String solicitud, String emisor, Long oficio, String oficioTexto,
			String listo, String debe, String anular, String anualOficio,
			String usuario, String firmaRecepcion, String recepcionUser,
			String usuarioAnulaTramite, String motivo, String convenio) {
		super();
		this.tramite = tramite;
		this.anual = anual;
		this.alumnosTramitesDoc = alumnosTramitesDoc;
		this.solicitante = solicitante;
		this.solicitaCodigo = solicitaCodigo;
		this.idioma = idioma;
		this.documento = documento;
		this.ciclos = ciclos;
		this.destinatario = destinatario;
		this.destiCodigo = destiCodigo;
		this.solicitud = solicitud;
		this.emisor = emisor;
		this.oficio = oficio;
		this.oficioTexto = oficioTexto;
		this.listo = listo;
		this.debe = debe;
		this.anular = anular;
		this.anualOficio = anualOficio;
		this.usuario = usuario;
		this.firmaRecepcion = firmaRecepcion;
		this.recepcionUser = recepcionUser;
		this.usuarioAnulaTramite = usuarioAnulaTramite;
		this.motivo = motivo;
		this.convenio = convenio;
	}

	public String getTramite() {
		return tramite;
	}

	public void setTramite(String tramite) {
		this.tramite = tramite;
	}

	public String getAnual() {
		return anual;
	}

	public void setAnual(String anual) {
		this.anual = anual;
	}

	public Alumnos getAlumnosTramitesDoc() {
		return alumnosTramitesDoc;
	}

	public void setAlumnosTramitesDoc(Alumnos alumnosTramitesDoc) {
		this.alumnosTramitesDoc = alumnosTramitesDoc;
	}

	public String getSolicitante() {
		return solicitante;
	}

	public void setSolicitante(String solicitante) {
		this.solicitante = solicitante;
	}

	public String getSolicitaCodigo() {
		return solicitaCodigo;
	}

	public void setSolicitaCodigo(String solicitaCodigo) {
		this.solicitaCodigo = solicitaCodigo;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getCiclos() {
		return ciclos;
	}

	public void setCiclos(String ciclos) {
		this.ciclos = ciclos;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getDestiCodigo() {
		return destiCodigo;
	}

	public void setDestiCodigo(String destiCodigo) {
		this.destiCodigo = destiCodigo;
	}

	public String getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	public String getEmisor() {
		return emisor;
	}

	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}

	public Long getOficio() {
		return oficio;
	}

	public void setOficio(Long oficio) {
		this.oficio = oficio;
	}

	public String getOficioTexto() {
		return oficioTexto;
	}

	public void setOficioTexto(String oficioTexto) {
		this.oficioTexto = oficioTexto;
	}

	public String getListo() {
		return listo;
	}

	public void setListo(String listo) {
		this.listo = listo;
	}

	public String getDebe() {
		return debe;
	}

	public void setDebe(String debe) {
		this.debe = debe;
	}

	public String getAnular() {
		return anular;
	}

	public void setAnular(String anular) {
		this.anular = anular;
	}

	public String getAnualOficio() {
		return anualOficio;
	}

	public void setAnualOficio(String anualOficio) {
		this.anualOficio = anualOficio;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getFirmaRecepcion() {
		return firmaRecepcion;
	}

	public void setFirmaRecepcion(String firmaRecepcion) {
		this.firmaRecepcion = firmaRecepcion;
	}

	public String getRecepcionUser() {
		return recepcionUser;
	}

	public void setRecepcionUser(String recepcionUser) {
		this.recepcionUser = recepcionUser;
	}

	public String getUsuarioAnulaTramite() {
		return usuarioAnulaTramite;
	}

	public void setUsuarioAnulaTramite(String usuarioAnulaTramite) {
		this.usuarioAnulaTramite = usuarioAnulaTramite;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getConvenio() {
		return convenio;
	}

	public void setConvenio(String convenio) {
		this.convenio = convenio;
	}

}
