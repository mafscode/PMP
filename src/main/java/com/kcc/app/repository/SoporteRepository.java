package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Soporte;

public interface SoporteRepository extends CrudRepository<Soporte, Integer> {

	List<Soporte> findByEstado(String estado);
}
