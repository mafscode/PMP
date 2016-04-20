package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Confidencialidad;

public interface ConfidencialidadRepository extends CrudRepository<Confidencialidad, Integer> {

	List<Confidencialidad> findByEstado(String estado);
}
