package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.RetencionDocumento;

public interface RetencionDocumentoRepository extends CrudRepository<RetencionDocumento, Integer> {

	List<RetencionDocumento> findByEstado(String estado);
}
