package com.kcc.app.service;

import java.util.List;  

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.kcc.app.model.Usuario;
import com.kcc.app.repository.UsuarioRepository;

@Service
@Transactional
public class UsuarioService {
	
    @Autowired
    private UsuarioRepository usuarioRepo;

    @Transactional(readOnly = true)
    public List<Usuario> listar() {
        return usuarioRepo.findAll();
    }
    
    public void save(Usuario usu) {
    	usuarioRepo.save(usu);
    }
}
