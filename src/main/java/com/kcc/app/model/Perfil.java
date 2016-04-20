package com.kcc.app.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "adm_perfil")
public class Perfil {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ape_id")
	private Integer idPerfil;
	
	@Column(name="ape_nombre")
	private String nombre;
	
	@Column(name="ape_desc")
	private String descripcion;
	
	@Column(name="ape_estado")
	private String estado;
	
	//@OneToMany(mappedBy="perfil", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	//private List<SubMenuPerfil> submenusperfil = new ArrayList<SubMenuPerfil>();

	//@OneToMany(mappedBy="perfil", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	//private List<MenuPerfil> menusperfil = new ArrayList<MenuPerfil>();
	
	public Integer getIdPerfil() {
		return idPerfil;
	}

	public void setIdPerfil(Integer idPerfil) {
		this.idPerfil = idPerfil;
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
