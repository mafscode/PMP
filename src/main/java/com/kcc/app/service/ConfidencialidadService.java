package com.kcc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.Confidencialidad;
import com.kcc.app.repository.ConfidencialidadRepository;

@Service
@Transactional
public class ConfidencialidadService {
	
	@Autowired
	private ConfidencialidadRepository confiRepo;

    @Transactional(readOnly = true)
    public List<Confidencialidad> listar()
    {
    	return confiRepo.findByEstado(estados.activo.toStr());
    }
	
}
