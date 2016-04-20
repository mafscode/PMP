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
@Table(name = "adm_retenciondocumento")
public class RetencionDocumento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ard_id")
	private Integer idRetencionDocumento;

	@ManyToOne
	@JoinColumn(name="ard_afi_id")
	private Filial filial;
	
	@Column(name="ard_nombre")
	private String nombre;
	
	@Column(name="ard_descripcion")
	private String descripcion;
	
	@Column(name="ard_estado")
	private String estado;

	public Integer getIdRetencionDocumento() {
		return idRetencionDocumento;
	}

	public void setIdRetencionDocumento(Integer idRetencionDocumento) {
		this.idRetencionDocumento = idRetencionDocumento;
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
