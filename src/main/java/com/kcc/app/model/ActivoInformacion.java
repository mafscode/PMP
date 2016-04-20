package com.kcc.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonBackReference;


@Entity
@Table(name = "act_activo")
public class ActivoInformacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "aac_id")
	private Integer idActivo;
	
	@ManyToOne
	@JoinColumn(name = "aac_csp_id")
	@JsonBackReference
	private SubProceso subProceso;
	
	@Column(name="aac_nombre")
	private String nombre;
	
	@Column(name="aac_ati_id")
	private Integer idTipoActivo;
	
	@Column(name="aac_ubicacion")
	private String ubicacion;
	
	@Column(name="aac_propietario")
	private String propietario;
	
	@Column(name="aac_correosponsor")
	private String correoSponsor;
	
	@Column(name="aac_aso_id")
	private String idSoporte;
	
	@Column(name="aac_autorizado")
	private String autorizado;
	
	@Column(name="aac_ata_id")
	private Integer idTag;
	
	@Column(name="aac_ard_id")
	private Integer idTipoRetencion;
	
	@Column(name="aac_valorretencion")
	private Integer valorRetencion;
	
	@Column(name="aac_adr_id")
	private Integer idDuracionRetencion;
	
	@Column(name="aac_aco_id")
	private Integer idConfidencialidad;
	
	@Column(name="aac_ain_id")
	private Integer idIntegridad;
	
	@Column(name="aac_adi_id")
	private Integer idDisponibilidad;
	
	@Column(name="aac_criticidad")
	private String criticidad;
	
	@Column(name="aac_medio")
	private String medio;
	
	@Column(name="aac_estado")
	private String estado;

	public Integer getIdActivo() {
		return idActivo;
	}

	public void setIdActivo(Integer idActivo) {
		this.idActivo = idActivo;
	}

	/*public Integer getIdSubProceso() {
		return idSubProceso;
	}

	public void setIdSubProceso(Integer idSubProceso) {
		this.idSubProceso = idSubProceso;
	}*/
	

	public String getNombre() {
		return nombre;
	}

	public SubProceso getSubProceso() {
		return subProceso;
	}

	public void setSubProceso(SubProceso subProceso) {
		this.subProceso = subProceso;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdTipoActivo() {
		return idTipoActivo;
	}

	public void setIdTipoActivo(Integer idTipoActivo) {
		this.idTipoActivo = idTipoActivo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getCorreoSponsor() {
		return correoSponsor;
	}

	public void setCorreoSponsor(String correoSponsor) {
		this.correoSponsor = correoSponsor;
	}

	public String getIdSoporte() {
		return idSoporte;
	}

	public void setIdSoporte(String idSoporte) {
		this.idSoporte = idSoporte;
	}

	public String getAutorizado() {
		return autorizado;
	}

	public void setAutorizado(String autorizado) {
		this.autorizado = autorizado;
	}

	public Integer getIdTag() {
		return idTag;
	}

	public void setIdTag(Integer idTag) {
		this.idTag = idTag;
	}

	public Integer getIdTipoRetencion() {
		return idTipoRetencion;
	}

	public void setIdTipoRetencion(Integer idTipoRentencion) {
		this.idTipoRetencion = idTipoRentencion;
	}

	public Integer getIdDuracionRetencion() {
		return idDuracionRetencion;
	}

	public void setIdDuracionRetencion(Integer idDuracionRetencion) {
		this.idDuracionRetencion = idDuracionRetencion;
	}

	public Integer getIdConfidencialidad() {
		return idConfidencialidad;
	}

	public void setIdConfidencialidad(Integer idConfidencialidad) {
		this.idConfidencialidad = idConfidencialidad;
	}

	public Integer getIdIntegridad() {
		return idIntegridad;
	}

	public void setIdIntegridad(Integer idIntegridad) {
		this.idIntegridad = idIntegridad;
	}

	public Integer getIdDisponibilidad() {
		return idDisponibilidad;
	}

	public void setIdDisponibilidad(Integer idDisponibilidad) {
		this.idDisponibilidad = idDisponibilidad;
	}

	public String getCriticidad() {
		return criticidad;
	}

	public void setCriticidad(String criticidad) {
		this.criticidad = criticidad;
	}

	public String getMedio() {
		return medio;
	}

	public void setMedio(String medio) {
		this.medio = medio;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getValorRetencion() {
		return valorRetencion;
	}

	public void setValorRetencion(Integer valorRetencion) {
		this.valorRetencion = valorRetencion;
	}
	
	
}
