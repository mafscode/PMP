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
@Table(name = "adm_tipoactivo")
public class TipoActivo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ati_id")
	private Integer idTipoActivo;
	
	@ManyToOne
	@JoinColumn(name="ati_afi_id")
	private Filial filial;
	
	@Column(name="ati_nombre")
	private String nombre;
	
	@Column(name="ati_descripcion")
	private String descripcion;
	
	@Column(name="ati_estado")
	private String estado;

	public Integer getIdTipoActivo() {
		return idTipoActivo;
	}

	public void setIdTipoActivo(Integer idTipoActivo) {
		this.idTipoActivo = idTipoActivo;
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
