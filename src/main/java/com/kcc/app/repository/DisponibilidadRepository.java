package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Disponibilidad;

public interface DisponibilidadRepository extends CrudRepository<Disponibilidad, Integer>{
	
	List<Disponibilidad> findByEstado(String estado);
}
