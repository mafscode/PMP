package com.kcc.app.viewmodel;

import com.kcc.app.model.Proceso;

public class ProcesoVM {
	private Integer idproceso;
	private String proceso;
	private Integer idsubproceso;
	private String subproceso;
	private String pais;
	private String filial;
	private Integer idactivo;
	private String activo;
	private String criticidad;
	private String propietario;
	private String correosponsor;
	
	public ProcesoVM()
	{
		
	}
	public ProcesoVM(Proceso proceso)
	{
		//this.setIdproceso(proceso.getIdProceso());
		//this.setproceso(proceso.getGlosa());
		
	}
	public Integer getIdproceso() {
		return idproceso;
	}
	public void setIdproceso(Integer idproceso) {
		this.idproceso = idproceso;
	}
	public String getProceso() {
		return proceso;
	}
	public void setProceso(String proceso) {
		this.proceso = proceso;
	}
	public Integer getIdsubproceso() {
		return idsubproceso;
	}
	public void setIdsubproceso(Integer idsubproceso) {
		this.idsubproceso = idsubproceso;
	}
	public String getSubproceso() {
		return subproceso;
	}
	public void setSubproceso(String subproceso) {
		this.subproceso = subproceso;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public String getFilial() {
		return filial;
	}
	public void setFilial(String filial) {
		this.filial = filial;
	}
	public Integer getIdactivo() {
		return idactivo;
	}
	public void setIdactivo(Integer idactivo) {
		this.idactivo = idactivo;
	}
	public String getActivo() {
		return activo;
	}
	public void setActivo(String activo) {
		this.activo = activo;
	}
	public String getCriticidad() {
		return criticidad;
	}
	public void setCriticidad(String criticidad) {
		this.criticidad = criticidad;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getCorreosponsor() {
		return correosponsor;
	}
	public void setCorreosponsor(String correosponsor) {
		this.correosponsor = correosponsor;
	}
	
}
