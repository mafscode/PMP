package com.kcc.app.viewmodel;
import java.util.ArrayList;
import java.util.List;

import com.kcc.app.model.*;

public class PaisVM {
	private Integer idPais;
	private String nombre;
	private String estado;
	private String icono;
	private List<FilialVM> filiales = new ArrayList<FilialVM>();
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getIdPais() {
		return idPais;
	}

	public void setIdPais(Integer idPais) {
		this.idPais = idPais;
	}

	public String getIcono() {
		return icono;
	}

	public void setIcono(String icono) {
		this.icono = icono;
	}

	public List<FilialVM> getFiliales() {
		return filiales;
	}

	public void setFiliales(List<FilialVM> filiales) {
		this.filiales = filiales;
	}
	public PaisVM(Pais pais)
	{
		this.idPais = pais.getIdPais();
		this.nombre = pais.getNombre();
		this.icono = pais.getIcono();
		this.estado = pais.getEstado();
		for(Filial ofilial : pais.getFiliales())
		{
			this.getFiliales().add(new FilialVM (ofilial));
		}
	}
	public PaisVM()
	{
		
	}
}
