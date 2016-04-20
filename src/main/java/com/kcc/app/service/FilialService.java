package com.kcc.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.helper.estados;
import com.kcc.app.model.Filial;
import com.kcc.app.repository.FilialRepository;
import com.kcc.app.viewmodel.FilialVM;

@Service
@Transactional
public class FilialService {
    @Autowired
    private FilialRepository filialRepo;

    @Transactional(readOnly = true)
    public List<FilialVM> listar() {
    	List<FilialVM> rst = new ArrayList<FilialVM>();
    	for(Filial obj : filialRepo.findByEstado(estados.activo.toStr()))
    	{
    		rst.add(new FilialVM (obj));
    	}
        return rst;
    }
    
    public void guardar(Filial obj) {
    	filialRepo.save(obj);
    }
    public FilialVM buscar(Integer id) {
    	return new FilialVM(filialRepo.findOne(id));
    }
}
