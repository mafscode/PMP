package com.kcc.app.repository;

import java.util.*;
import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Pais;

public interface PaisRepository extends CrudRepository<Pais, Integer>{
	List<Pais> findAll();
	List<Pais> findByEstado(String estado);
}
