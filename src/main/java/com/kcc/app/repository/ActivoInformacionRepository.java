package com.kcc.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kcc.app.model.ActivoInformacion;
import com.kcc.app.model.SubProceso;

public interface ActivoInformacionRepository extends CrudRepository<ActivoInformacion, Integer> {

	List<ActivoInformacion> findByEstadoAndSubProceso(String estado,SubProceso subProceso);
}
