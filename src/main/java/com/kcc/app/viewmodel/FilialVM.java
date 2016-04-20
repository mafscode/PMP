package com.kcc.app.viewmodel;


import com.kcc.app.model.Filial;

public class FilialVM {
	public FilialVM()
	{
		
	}
	public FilialVM(Filial filial)
	{
		this.setEstado(filial.getEstado());
		this.setGlosa(filial.getNombre());
		this.setIdFilial(filial.getIdFilial());
		this.setPais(filial.getPais().getNombre());
		this.setIdPais(filial.getPais().getIdPais());
	}
	private Integer idFilial;
	private String glosa;
	private String estado;
	private String pais;
	private Integer idPais;
	
	public Integer getIdFilial() {
		return idFilial;
	}
	public void setIdFilial(Integer idFilial) {
		this.idFilial = idFilial;
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
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public Integer getIdPais() {
		return idPais;
	}
	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}
}
