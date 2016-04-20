package com.kcc.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.Proceso;
import com.kcc.app.repository.ProcesoRepository;

@Service
@Transactional
public class ProcesoService {
	
	@Autowired
	private ProcesoRepository repo;	
	
	public List<Proceso> listar()
	{
		return repo.findAllByEstado(estados.activo.toStr());
	}
    public Proceso guardar(Proceso obj) {
    	return repo.save(obj);
    }
}
