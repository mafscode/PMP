package com.kcc.app.viewmodel;
import com.kcc.app.model.Confidencialidad;
import com.kcc.app.model.Filial;

public class ConfidencialidadVM {
	private Integer idConfidencialidad;
	
	private FilialVM filial;
	
	private String nombre;
	
	private String descripcion;

	private String estado;
	
	public ConfidencialidadVM(Confidencialidad conf)
	{
		this.setIdConfidencialidad(conf.getIdConfidencialidad());
		this.setDescripcion(conf.getDescripcion());
		this.setEstado(conf.getEstado());
		this.setFilial(conf.getFilial());
	}

	public Integer getIdConfidencialidad() {
		return idConfidencialidad;
	}

	public void setIdConfidencialidad(Integer idConfidencialidad) {
		this.idConfidencialidad = idConfidencialidad;
	}

	public FilialVM getFilial() {
		return filial;
	}

	public void setFilial(Filial filial) {
		this.filial = new FilialVM(filial);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
}
