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
@Table(name = "adm_integridad")
public class Integridad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ain_id")
	private Integer idIntegridad;
	
	@ManyToOne
	@JoinColumn(name="ain_afi_id")
	private Filial filial;
	
	@Column(name="ain_nombre")
	private String nombre;
	
	@Column(name="ain_descripcion")
	private String descripcion;

	@Column(name="ain_estado")
	private String estado;

	public Integer getIdIntegridad() {
		return idIntegridad;
	}

	public void setIdIntegridad(Integer idIntegridad) {
		this.idIntegridad = idIntegridad;
	}

	public Filial getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
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
