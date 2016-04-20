package com.kcc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.Pais;
import com.kcc.app.repository.PaisRepository;
import com.kcc.app.viewmodel.PaisVM;

@Service
@Transactional
public class PaisService {

    @Autowired
	private PaisRepository paisRepo;
    
    @Transactional(readOnly = true)
    public List<PaisVM> listar()
    {
    	List<PaisVM> rst = new ArrayList<PaisVM>();
    	for(Pais pPais : paisRepo.findByEstado(estados.activo.toStr()))
    		rst.add(new PaisVM (pPais));
    	return rst;
    }
    
    public void guardar(Pais obj) {
    	paisRepo.save(obj);
    }
    public PaisVM buscarVM(Integer id) {
    	return new PaisVM(paisRepo.findOne(id));
    }
    public Pais buscar(Integer id) {
    	return paisRepo.findOne(id);
    }
}
