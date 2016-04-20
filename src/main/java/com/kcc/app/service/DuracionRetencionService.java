package com.kcc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.DuracionRetencion;
import com.kcc.app.repository.DuracionRetencionRepository;

@Service
@Transactional
public class DuracionRetencionService {
	
	@Autowired
	private DuracionRetencionRepository repo;

    @Transactional(readOnly = true)
    public List<DuracionRetencion> listar()
    {
    	return repo.findByEstado(estados.activo.toStr());
    }
	
}
