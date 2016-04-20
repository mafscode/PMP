package com.kcc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.ActivoInformacion;
import com.kcc.app.model.Proceso;
import com.kcc.app.model.SubProceso;
import com.kcc.app.repository.SubProcesoRepository;
import com.kcc.app.viewmodel.ProcesoVM;

@Service
@Transactional
public class SubProcesoService {

	@Autowired
	private SubProcesoRepository repo;	
	
	public List<SubProceso> listar(Proceso proceso)
	{
		return repo.findAllByProcesoAndEstado(proceso,estados.activo.toStr());
	}
	
    public SubProceso guardar(SubProceso obj) {
    	return repo.save(obj);
    }
    
    public List<ProcesoVM> listarVM()
	{
    	List<ProcesoVM> lst = new ArrayList<ProcesoVM>();
    	for(SubProceso obj: repo.findAllByEstado(estados.activo.toStr()))
    	{
    		boolean vacio = obj.getActivos().size() == 0;
    		if(!vacio)
    		{
	    		for(ActivoInformacion oActivo : obj.getActivos())
	    		{
	        		ProcesoVM objVM = new ProcesoVM();
	        		if(obj.getProceso() != null)
	        		{
	        			objVM.setIdproceso(obj.getProceso().getIdProceso());
	        			objVM.setProceso(obj.getProceso().getGlosa());
	        		}
	        		objVM.setIdsubproceso(obj.getIdSubProceso());
	        		objVM.setSubproceso(obj.getNombre());
	        		objVM.setIdactivo(oActivo.getIdActivo());
	        		objVM.setActivo(oActivo.getNombre());
	        		objVM.setCriticidad(oActivo.getCriticidad());
	        		objVM.setPropietario(oActivo.getPropietario());
	        		objVM.setCorreosponsor(oActivo.getCorreoSponsor());
	        		
	        		lst.add(objVM);
	    		}
    		}
    		else
    		{
    			ProcesoVM objVM = new ProcesoVM();
        		if(obj.getProceso() != null)
        		{
        			objVM.setIdproceso(obj.getProceso().getIdProceso());
        			objVM.setProceso(obj.getProceso().getGlosa());
        		}
        		objVM.setIdsubproceso(obj.getIdSubProceso());
        		objVM.setSubproceso(obj.getNombre());
        		
        		lst.add(objVM);
    		}
    	}
		return lst;
	}
    public List<SubProceso> listar()
	{
    	
		return repo.findAllByEstado(estados.activo.toStr());
	}
}
