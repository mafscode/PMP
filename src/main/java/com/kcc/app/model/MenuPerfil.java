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
@Table(name = "adm_menuperfil")
public class MenuPerfil {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "amp_id")
	private Integer idMenuPerfil;
	
	@ManyToOne
	@JoinColumn(name="amp_ame_id")
	private Menu menu; 
	
	@Column(name="amp_ape_id")
	private Integer perfil;
	
	@Column(name="amp_acceso")
	private String acceso;

	public Integer getIdMenuPerfil() {
		return idMenuPerfil;
	}

	public void setIdMenuPerfil(Integer idMenuPerfil) {
		this.idMenuPerfil = idMenuPerfil;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
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
