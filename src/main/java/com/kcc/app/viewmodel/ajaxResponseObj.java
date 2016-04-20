package com.kcc.app.viewmodel;

public class ajaxResponseObj {
	public ajaxResponseObj(){}
	public ajaxResponseObj(String estado, String mensaje)
	{
		this.setEstado(estado);
		this.setMensaje(mensaje);
	}
	public ajaxResponseObj(String estado, String mensaje, Integer id)
	{
		this.setEstado(estado);
		this.setMensaje(mensaje);
		this.setIdObjeto(id);
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	private String mensaje;
	private String estado;
	private Integer idObjeto;
	
	public Integer getIdObjeto() {
		return idObjeto;
	}
	public void setIdObjeto(Integer idObjeto) {
		this.idObjeto = idObjeto;
	}
}
