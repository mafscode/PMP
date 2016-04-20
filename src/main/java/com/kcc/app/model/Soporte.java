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
@Table(name = "adm_soporte")
public class Soporte {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="aso_id")
	private Integer idSoporte;
	
	@ManyToOne
	@JoinColumn(name="aso_afi_id")
	private Filial filial;
	
	@Column(name="aso_nombre")
	private String nombre;
	
	@Column(name="aso_descripcion")
	private String descripcion;
	
	@Column(name="aso_estado")
	private String estado;
	
	
	public Integer getIdSoporte() {
		return idSoporte;
	}

	public void setIdSoporte(Integer idSoporte) {
		this.idSoporte = idSoporte;
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
