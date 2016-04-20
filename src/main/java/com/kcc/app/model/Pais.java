package com.kcc.app.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "adm_pais")
public class Pais {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "apa_id")
	private Integer idPais;
	
	@Column(name="apa_nombre")
	private String nombre;
	
	@Column(name="apa_estado")
	private String estado;
	
	@Column(name="apa_icono")
	private String icono;

	
	@OneToMany(mappedBy="pais", cascade=CascadeType.ALL)
	private List<Filial> filiales = new ArrayList<Filial>();
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public List<Filial> getFiliales() {
		return filiales;
	}

	public void setFiliales(List<Filial> filiales) {
		this.filiales = filiales;
	}	
	
}
