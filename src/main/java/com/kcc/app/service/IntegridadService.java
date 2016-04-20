package com.kcc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.Integridad;
import com.kcc.app.repository.IntegridadRepository;

@Service
@Transactional
public class IntegridadService {
	
	@Autowired
	private IntegridadRepository repo;

    @Transactional(readOnly = true)
    public List<Integridad> listar()
    {
    	return repo.findByEstado(estados.activo.toStr());
    }
	
}
