package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.DuracionRetencion;

public interface DuracionRetencionRepository extends CrudRepository<DuracionRetencion, Integer> {

	List<DuracionRetencion> findByEstado(String estado);
}