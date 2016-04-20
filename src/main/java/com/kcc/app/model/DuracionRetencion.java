package com.kcc.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "adm_duracionretencion")
public class DuracionRetencion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="adr_id")
	private Integer idDuracionRetencion;
	
	@ManyToOne
	@JoinColumn(name="adr_afi_id")
	private Filial filial;
	
	@Column(name="adr_nombre")
	private String nombre;
	
	@Column(name="adr_descripcion")
	private String descripcion;

	@Column(name="adr_estado")
	private String estado;
	
	public Integer getIdDuracionRetencion() {
		return idDuracionRetencion;
	}

	public void setIdDuracionRetencion(Integer idDuracionRetencion) {
		this.idDuracionRetencion = idDuracionRetencion;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setIdFilial(Filial filial) {
		this.filial = filial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

}
