package com.kcc.app.repository;

import java.util.*;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Proceso;


public interface ProcesoRepository extends CrudRepository <Proceso, Integer> {
	List<Proceso> findAllByEstado(String Estado);
}
