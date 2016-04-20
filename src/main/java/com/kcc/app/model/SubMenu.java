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
@Table(name = "adm_submenu")
public class SubMenu {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asm_id")
	private Integer idSubMenu;

	@Column(name = "asm_nombre")
	private String nombre;

	@Column(name = "asm_url")
	private String url;

	@Column(name = "asm_estado")
	private String estado;

	@Column(name = "asm_orden")
	private Integer orden;
	
	@Column(name="asm_icono")
	private String icono;
	
	@ManyToOne
	@JoinColumn(name="asm_ame_id")
	private Menu menu;
	
	//@OneToMany(mappedBy="subMenu", cascade=CascadeType.ALL, fetch=FetchType.EAGER)
	//private List<SubMenuPerfil> menuperfiles = new ArrayList<SubMenuPerfil>();

	public Integer getIdSubMenu() {
		return idSubMenu;
	}

	public void setIdSubMenu(Integer idSubMenu) {
		this.idSubMenu = idSubMenu;
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

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}
	/*
	public List<SubMenuPerfil> getMenuperfiles() {
		return menuperfiles;
	}

	public void setMenuperfiles(List<SubMenuPerfil> menuperfiles) {
		this.menuperfiles = menuperfiles;
	}*/
 
		
}
