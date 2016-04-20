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
@Table(name = "adm_disponibilidad")
public class Disponibilidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aid_id")
	private Integer idDisponibilidad;
	
	@ManyToOne
	@JoinColumn(name="aid_afi_id")
	private Filial filial;
	
	@Column(name="aid_nombre")
	private String nombre;
	
	@Column(name="aid_descripcion")
	private String descripcion;

	@Column(name="aid_estado")
	private String estado;

	public Integer getIdDisponibilidad() {
		return idDisponibilidad;
	}

	public void setIdDisponibilidad(Integer idDisponibilidad) {
		this.idDisponibilidad = idDisponibilidad;
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
