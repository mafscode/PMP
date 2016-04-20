package com.kcc.app.viewmodel;

import java.util.List;

import com.kcc.app.model.Menu;
import com.kcc.app.model.SubMenu;

/*
 * CLASE CREADA CON EL PROPOSITO DE FACILITAR LA INTERACCION CON LA CAPA DE VISTA
 * */
public class MenuVM {
	private Integer idMenu;
	private String glosa;
	private String url;
	private String estado;
	private Integer orden;
	private List<SubMenuVM> subMenus;
	
	public MenuVM(Menu oMenu)
	{
		this.setEstado(oMenu.getEstado());
		this.setGlosa(oMenu.getNombre());
		this.setIdMenu(oMenu.getIdMenu());
		this.setOrden(oMenu.getOrden());
		this.setUrl(oMenu.getUrl());
		for(SubMenu oSubMenu : oMenu.getSubMenus())
			this.getSubmenu().add(new SubMenuVM(oSubMenu));
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
	public String getGlosa() {
		return glosa;
	}
	public void setGlosa(String glosa) {
		this.glosa = glosa;
	}
	public Integer getIdMenu() {
		return idMenu;
	}
	public void setIdMenu(Integer idMenu) {
		this.idMenu = idMenu;
	}
	public List<SubMenuVM> getSubmenu() {
		return this.subMenus;
	}
	public void setSubmenu(List<SubMenuVM> submenu) {
		this.subMenus = submenu;
	}
	public Boolean isEmpty()
	{
		return this.getSubmenu().isEmpty();
	}
}
