package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.TipoActivo;

public interface TipoActivoRepository extends CrudRepository<TipoActivo, Integer> {

	List<TipoActivo> findByEstado(String estado);
}
