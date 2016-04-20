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
@Table(name = "adm_confidencialidad")
public class Confidencialidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aco_id")
	private Integer idConfidencialidad;
	
	@ManyToOne
	@JoinColumn(name="aco_afi_id")
	private Filial filial;
	
	@Column(name="aco_nombre")
	private String nombre;
	
	@Column(name="aco_descripcion")
	private String descripcion;

	@Column(name="aco_estado")
	private String estado;

	public Integer getIdConfidencialidad() {
		return idConfidencialidad;
	}

	public void setIdConfidencialidad(Integer idConfidencialidad) {
		this.idConfidencialidad = idConfidencialidad;
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
