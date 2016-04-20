package com.kcc.app.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity  
@Table(name="adm_menu") 
public class Menu {
	 @Id  
	 @GeneratedValue(strategy=GenerationType.IDENTITY)  
	 @Column(name = "ame_id")  
	 private Integer idMenu;
	 
	 @Column(name="ame_nombre")
	 private String nombre;
	 
	 @Column(name="ame_url")
	 private String url;
	 
	 @Column(name="ame_estado")
	 private String estado;
	 
	 @Column(name="ame_orden")
	 private Integer orden;
	 
	 @Column(name="ame_icono")
	 private String icono;
	 
	 @OneToMany(mappedBy="menu", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	 private List<SubMenu> subMenus = new ArrayList<SubMenu>();

	 //@OneToMany(mappedBy="menu", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	 //private List<MenuPerfil> menuperfiles = new ArrayList<MenuPerfil>();

	public Integer getIdMenu() {
		return idMenu;
	}

	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getOrden() {
		return orden;
	}

	public void setOrden(Integer orden) {
		this.orden = orden;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public List<SubMenu> getSubMenus() {
		return subMenus;
	}

	public void setSubMenus(List<SubMenu> subMenus) {
		this.subMenus = subMenus;
	}

	/*public List<MenuPerfil> getMenuperfiles() {
		return menuperfiles;
	}

	public void setMenuperfiles(List<MenuPerfil> menuperfiles) {
		this.menuperfiles = menuperfiles;
	}*/
	 
}
