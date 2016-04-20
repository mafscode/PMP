package com.kcc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.RetencionDocumento;
import com.kcc.app.repository.RetencionDocumentoRepository;

@Service
@Transactional
public class RetencionDocumentoService {
	
	@Autowired
	private RetencionDocumentoRepository repo;

    @Transactional(readOnly = true)
    public List<RetencionDocumento> listar()
    {
    	return repo.findByEstado(estados.activo.toStr());
    }
	
}