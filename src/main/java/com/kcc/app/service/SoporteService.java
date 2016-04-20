package com.kcc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.Soporte;
import com.kcc.app.repository.SoporteRepository;

@Service
@Transactional
public class SoporteService {
	
	@Autowired
	private SoporteRepository repo;

    @Transactional(readOnly = true)
    public List<Soporte> listar()
    {
    	return repo.findByEstado(estados.activo.toStr());
    }
	
}