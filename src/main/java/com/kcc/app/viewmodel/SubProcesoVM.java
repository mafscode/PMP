package com.kcc.app.viewmodel;

import com.kcc.app.model.SubProceso;

public class SubProcesoVM {
	public SubProcesoVM(SubProceso subproceso)
	{
		this.setIdSubProceso(subproceso.getIdSubProceso());
		this.setNombre(subproceso.getNombre());
		this.setProceso(new ProcesoVM(subproceso.getProceso()));
	}
	public ProcesoVM getProceso() {
		return proceso;
	}
	public void setProceso(ProcesoVM subproceso) {
		this.proceso = subproceso;
	}
	public Integer getIdSubProceso() {
		return idSubProceso;
	}
	public void setIdSubProceso(Integer idSubProceso) {
		this.idSubProceso = idSubProceso;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private Integer idSubProceso;
	private String nombre;
	private ProcesoVM proceso;
}
