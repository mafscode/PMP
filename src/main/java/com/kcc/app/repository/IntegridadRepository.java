package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.Integridad;

public interface IntegridadRepository extends CrudRepository<Integridad, Integer> {

	List<Integridad> findByEstado(String estado);
}
