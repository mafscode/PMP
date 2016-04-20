package com.kcc.app.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonManagedReference;


@Entity
@Table(name = "act_subproceso")
public class SubProceso {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asu_id")
	private Integer idSubProceso;
	
	@Column(name = "asu_nombre")
	private String nombre;
	
	@Column(name = "asu_estado")
	private String estado;
	
	@ManyToOne
	@JoinColumn(name="asu_cpr_id")
	private Proceso proceso;
	
	@OneToMany(mappedBy = "subProceso", cascade = CascadeType.ALL)
	@JsonManagedReference
	private List<ActivoInformacion> activos;
	
	public Integer getIdSubProceso() {
		return idSubProceso;
	}
	public void setIdSubProceso(Integer idSubProceso) {
		this.idSubProceso = idSubProceso;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Proceso getProceso() {
		return proceso;
	}
	public void setIdProceso(Proceso proceso) {
		this.proceso = proceso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public List<ActivoInformacion> getActivos() {
		return activos;
	}
	public void setActivos(List<ActivoInformacion> activos) {
		this.activos = activos;
	}
	public void setProceso(Proceso proceso) {
		this.proceso = proceso;
	}
	
}
