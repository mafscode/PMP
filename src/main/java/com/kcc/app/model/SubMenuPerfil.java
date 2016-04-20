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
@Table(name = "adm_submenuperfil")
public class SubMenuPerfil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "asp_id")
	private Integer idSubMenuPerfil;
	
	@ManyToOne
	@JoinColumn(name="asp_asm_id")
	private SubMenu subMenu;
	
	@Column(name="asp_ape_id")
	private Integer perfil;
	
	@Column(name="asp_acceso")
	private String acceso;

	public Integer getIdSubMenuPerfil() {
		return idSubMenuPerfil;
	}

	public void setIdSubMenuPerfil(Integer idSubMenuPerfil) {
		this.idSubMenuPerfil = idSubMenuPerfil;
	}

	public SubMenu getSubMenu() {
		return subMenu;
	}

	public void setSubMenu(SubMenu subMenu) {
		this.subMenu = subMenu;
	}

	public Integer getPerfil() {
		return perfil;
	}

	public void setPerfil(Integer perfil) {
		this.perfil = perfil;
	}

	public String getAcceso() {
		return acceso;
	}

	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}
	
}
