package com.kcc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.ActivoInformacion;
import com.kcc.app.model.SubProceso;
import com.kcc.app.repository.ActivoInformacionRepository;

@Service
@Transactional
public class ActivoInformacionService {
	
	@Autowired
	private ActivoInformacionRepository repo;

    @Transactional(readOnly = true)
    public List<ActivoInformacion> listar(Integer idSubProceso)
    {
    	SubProceso oSubProceso = new SubProceso();
    	oSubProceso.setIdSubProceso(idSubProceso);
    	return repo.findByEstadoAndSubProceso(estados.activo.toStr(), oSubProceso);
    }
    public ActivoInformacion guardar(ActivoInformacion obj) {
    	return repo.save(obj);
    }
}
