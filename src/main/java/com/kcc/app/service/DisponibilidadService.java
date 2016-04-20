package com.kcc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.Disponibilidad;
import com.kcc.app.repository.DisponibilidadRepository;

@Service
@Transactional
public class DisponibilidadService {
	
	@Autowired
	private DisponibilidadRepository repo;

    @Transactional(readOnly = true)
    public List<Disponibilidad> listar()
    {
    	return repo.findByEstado(estados.activo.toStr());
    }
	
}
