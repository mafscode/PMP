package com.kcc.app.viewmodel;

import com.kcc.app.model.SubMenu;

public class SubMenuVM {

	private Integer idSubMenu;
	private Integer idMenu;
	private String glosa;
	private String url;
	private String estado;
	private Integer orden;
	
	public SubMenuVM(SubMenu oSubmenu)
	{
		this.setIdSubMenu(oSubmenu.getIdSubMenu());
		this.setEstado(oSubmenu.getEstado());
		this.setGlosa(oSubmenu.getNombre());
		this.setIdMenu(oSubmenu.getMenu().getIdMenu());
		this.setOrden(oSubmenu.getOrden());
		this.setUrl(oSubmenu.getUrl());
	}
	public Integer getIdSubMenu() {
		return idSubMenu;
	}
	public void setIdSubMenu(Integer idSubMenu) {
		this.idSubMenu = idSubMenu;
	}
	public Integer getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}
	public String getGlosa() {
		return glosa;
	}
	public void setGlosa(String glosa) {
		this.glosa = glosa;
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
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
