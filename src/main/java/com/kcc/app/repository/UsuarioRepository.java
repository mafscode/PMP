package com.kcc.app.repository;

import java.util.*;
import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    List<Usuario> findAll();
    
}